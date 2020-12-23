package 过程故障管理系统;

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
    //发件人地址
    public static String senderAddress = "1574735267@qq.com";
    //收件人地址
    public static String recipientAddress = "1574735267@qq.com";
    //发件人账户名
    public static String senderAccount = "1574735267";
    //发件人账户密码
    public static String senderPassword = "ragqxeegirqyifad";
     
   public void mail() throws Exception {
        //1、连接邮件服务器的参数配置
        Properties props = new Properties();
        //设置用户的认证方式
        props.setProperty("mail.smtp.auth", "true");
        //设置传输协议
        props.setProperty("mail.transport.protocol", "smtp");
        //设置发件人的SMTP服务器地址
        props.setProperty("mail.smtp.host", "smtp.qq.com");
        //2、创建定义整个应用程序所需的环境信息的 Session 对象
        Session session = Session.getInstance(props);
        //设置调试信息在控制台打印出来
        session.setDebug(true);
        //3、创建邮件的实例对象
        Message msg = getMimeMessage(session);
        //4、根据session对象获取邮件传输对象Transport
        Transport transport = session.getTransport();
        //设置发件人的账户名和密码
        transport.connect(senderAccount, senderPassword);
        //发送邮件，并发送到所有收件人地址，message.getAllRecipients() 获取到的是在创建邮件对象时添加的所有收件人, 抄送人, 密送人
        transport.sendMessage(msg,msg.getAllRecipients());
         
        //5、关闭邮件连接
        transport.close();
    }
     
    /**
     * 获得创建一封邮件的实例对象
     * @param session
     * @return
     * @throws MessagingException
     * @throws AddressException
     */
    public static MimeMessage getMimeMessage(Session session) throws Exception{
        //1.创建一封邮件的实例对象
        MimeMessage msg = new MimeMessage(session);
        //2.设置发件人地址
        msg.setFrom(new InternetAddress(senderAddress));
        /**
         * 3.设置收件人地址（可以增加多个收件人、抄送、密送），即下面这一行代码书写多行
         * MimeMessage.RecipientType.TO:发送
         * MimeMessage.RecipientType.CC：抄送
         * MimeMessage.RecipientType.BCC：密送
         */
        msg.setRecipient(MimeMessage.RecipientType.TO,new InternetAddress(recipientAddress));
        //4.设置邮件主题
        msg.setSubject("故障记录","UTF-8");
         
       
         
        // 9. 创建附件"节点"
        MimeBodyPart attachment = new MimeBodyPart();
        MimeBodyPart attachment1 = new MimeBodyPart();
        MimeBodyPart attachment2 = new MimeBodyPart();
        MimeBodyPart attachment3 = new MimeBodyPart();
        
        // 读取本地文件
        DataHandler dh2 = new DataHandler(new FileDataSource("能源.txt"));
        // 将附件数据添加到"节点"
        attachment.setDataHandler(dh2);
        DataHandler dh3 = new DataHandler(new FileDataSource("设备.txt"));
   
        attachment1.setDataHandler(dh3);
        DataHandler dh4 = new DataHandler(new FileDataSource("质量.txt"));
  
        attachment2.setDataHandler(dh4);
        DataHandler dh5 = new DataHandler(new FileDataSource("物料.txt"));
    
        attachment3.setDataHandler(dh5);
        // 设置附件的文件名（需要编码）
        attachment.setFileName(MimeUtility.encodeText(dh2.getName()));       
        attachment1.setFileName(MimeUtility.encodeText(dh3.getName()));  
        attachment2.setFileName(MimeUtility.encodeText(dh4.getName()));  
        attachment3.setFileName(MimeUtility.encodeText(dh5.getName()));  
        // 10. 设置（文本+图片）和 附件 的关系（合成一个大的混合"节点" / Multipart ）
        MimeMultipart mm = new MimeMultipart();
       // mm.addBodyPart(text_image);
        mm.addBodyPart(attachment); 
        mm.addBodyPart(attachment1); 
        mm.addBodyPart(attachment2); 
        mm.addBodyPart(attachment3); 
        // 如果有多个附件，可以创建多个多次添加
        
        mm.setSubType("mixed");         // 混合关系
 
        // 11. 设置整个邮件的关系（将最终的混合"节点"作为邮件的内容添加到邮件对象）
        msg.setContent(mm);
        //设置邮件的发送时间,默认立即发送
        msg.setSentDate(new Date());
         
        return msg;
    }


 
}