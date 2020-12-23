package ���̹��Ϲ���ϵͳ;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Properties;
 
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;
 
public class Javamail {
    //�����˵�ַ
    public static String senderAddress = "1574735267@qq.com";
    //�ռ��˵�ַ
    public static String recipientAddress = "1574735267@qq.com";
    //�������˻���
    public static String senderAccount = "1574735267";
    //�������˻�����
    public static String senderPassword = "ragqxeegirqyifad";
     
   public void mail() throws Exception {
        //1�������ʼ��������Ĳ�������
        Properties props = new Properties();
        //�����û�����֤��ʽ
        props.setProperty("mail.smtp.auth", "true");
        //���ô���Э��
        props.setProperty("mail.transport.protocol", "smtp");
        //���÷����˵�SMTP��������ַ
        props.setProperty("mail.smtp.host", "smtp.qq.com");
        //2��������������Ӧ�ó�������Ļ�����Ϣ�� Session ����
        Session session = Session.getInstance(props);
        //���õ�����Ϣ�ڿ���̨��ӡ����
        session.setDebug(true);
        //3�������ʼ���ʵ������
        Message msg = getMimeMessage(session);
        //4������session�����ȡ�ʼ��������Transport
        Transport transport = session.getTransport();
        //���÷����˵��˻���������
        transport.connect(senderAccount, senderPassword);
        //�����ʼ��������͵������ռ��˵�ַ��message.getAllRecipients() ��ȡ�������ڴ����ʼ�����ʱ��ӵ������ռ���, ������, ������
        transport.sendMessage(msg,msg.getAllRecipients());
         
        //5���ر��ʼ�����
        transport.close();
    }
     
    /**
     * ��ô���һ���ʼ���ʵ������
     * @param session
     * @return
     * @throws MessagingException
     * @throws AddressException
     */
    public static MimeMessage getMimeMessage(Session session) throws Exception{
        //1.����һ���ʼ���ʵ������
        MimeMessage msg = new MimeMessage(session);
        //2.���÷����˵�ַ
        msg.setFrom(new InternetAddress(senderAddress));
        /**
         * 3.�����ռ��˵�ַ���������Ӷ���ռ��ˡ����͡����ͣ�����������һ�д�����д����
         * MimeMessage.RecipientType.TO:����
         * MimeMessage.RecipientType.CC������
         * MimeMessage.RecipientType.BCC������
         */
        msg.setRecipient(MimeMessage.RecipientType.TO,new InternetAddress(recipientAddress));
        //4.�����ʼ�����
        msg.setSubject("���ϼ�¼","UTF-8");
         
       
         
        // 9. ��������"�ڵ�"
        MimeBodyPart attachment = new MimeBodyPart();
        MimeBodyPart attachment1 = new MimeBodyPart();
        MimeBodyPart attachment2 = new MimeBodyPart();
        MimeBodyPart attachment3 = new MimeBodyPart();
        
        // ��ȡ�����ļ�
        DataHandler dh2 = new DataHandler(new FileDataSource("��Դ.txt"));
        // ������������ӵ�"�ڵ�"
        attachment.setDataHandler(dh2);
        DataHandler dh3 = new DataHandler(new FileDataSource("�豸.txt"));
   
        attachment1.setDataHandler(dh3);
        DataHandler dh4 = new DataHandler(new FileDataSource("����.txt"));
  
        attachment2.setDataHandler(dh4);
        DataHandler dh5 = new DataHandler(new FileDataSource("����.txt"));
    
        attachment3.setDataHandler(dh5);
        // ���ø������ļ�������Ҫ���룩
        attachment.setFileName(MimeUtility.encodeText(dh2.getName()));       
        attachment1.setFileName(MimeUtility.encodeText(dh3.getName()));  
        attachment2.setFileName(MimeUtility.encodeText(dh4.getName()));  
        attachment3.setFileName(MimeUtility.encodeText(dh5.getName()));  
        // 10. ���ã��ı�+ͼƬ���� ���� �Ĺ�ϵ���ϳ�һ����Ļ��"�ڵ�" / Multipart ��
        MimeMultipart mm = new MimeMultipart();
       // mm.addBodyPart(text_image);
        mm.addBodyPart(attachment); 
        mm.addBodyPart(attachment1); 
        mm.addBodyPart(attachment2); 
        mm.addBodyPart(attachment3); 
        // ����ж�����������Դ������������
        
        mm.setSubType("mixed");         // ��Ϲ�ϵ
 
        // 11. ���������ʼ��Ĺ�ϵ�������յĻ��"�ڵ�"��Ϊ�ʼ���������ӵ��ʼ�����
        msg.setContent(mm);
        //�����ʼ��ķ���ʱ��,Ĭ����������
        msg.setSentDate(new Date());
         
        return msg;
    }


 
}