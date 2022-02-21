package week1.day2;

public class MyMobile {
String a= "makecall";
String b="sendmsg";

public void makeCall()
{
	System.out.println("makecall");
}
public void send_Msg()
{
	System.out.println("send_Msg");
}
private void payBills()
{
	System.out.println("payBills");
}
public static void main(String[]args){
	MyMobile p =new MyMobile();
	p.send_Msg();
	p.makeCall();//calling method
	p.payBills();
}
}
