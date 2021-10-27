package week3.day1;

public class MobileExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AndroidPhone andObj=new AndroidPhone();
andObj.saveContact();
andObj.sendMsg();
andObj.takeVideo();
andObj.makeCall();
System.out.println("********call for android*********");
SmartPhone smartObj=new SmartPhone();
smartObj.saveContact();
smartObj.makeCall();
smartObj.sendMsg();
smartObj.connectWatsapp();
smartObj.takeVideo();
System.out.println("********call for smart*********");
	}

}
