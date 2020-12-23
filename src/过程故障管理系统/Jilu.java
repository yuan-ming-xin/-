package 过程故障管理系统;

public class Jilu {
String time;
String place;
String category;
String behave;
String method;
public Jilu(String time, String place, String category, String behave, String method) {
	super();
	this.time = time;
	this.place = place;
	this.category = category;
	this.behave = behave;
	this.method = method;
}
public Jilu() {
	// TODO 自动生成的构造函数存根
}
public String getMethod() {
	return method;
}
public void setMethod(String method) {
	this.method = method;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getBehave() {
	return behave;
}
public void setBehave(String behave) {
	this.behave = behave;
}
@Override
public String toString() {
	return time + ","+ place +","+  category +","+  behave +","+behave +" ";
}

}
