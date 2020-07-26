package exam;

import java.nio.channels.Pipe;

public class TestPhone {

	public static void main(String[] args) {
		Iphone1 pi=new Iphone1();
		pi.abstractClassInfo();
		pi.appleWatchInfo();
		pi.battery();
		pi.call();
		pi.camera();
		pi.interfaceInfo();
		pi.message();
		pi.regularClassInfo();
		pi.setPrice(750);
		pi.setiNfo("I bought this phone in 2000");
		pi.setUser('F');
		pi.setMadeInUSA(false);
		System.out.println(pi.getiNfo()+", the price was "+pi.getPrice()+", grade is "+pi.getUser()+" and the boolean value is "
				+ ""+pi.isMadeInUSA());
		Iphone2 pi2=new Iphone2();
		pi2.abstractClassInfo();
		pi2.appleWatchInfo();
		pi2.battery();
		pi2.call();
		pi2.camera();
		pi2.interfaceInfo();
		pi2.message();
		Iphone3 pi3=new Iphone3();
		pi3.abstractClassInfo();
		pi3.appleWatchInfo();
		pi3.battery();
		pi3.call();
		pi3.camera();
		pi3.interfaceInfo();
		pi3.message();
		pi3.iphonInfo();
		Iphone4 pi4=new Iphone4();
		pi4.abstractClassInfo();
		pi4.appleWatchInfo();
		pi4.battery();
		pi4.call();
		pi4.camera();
		pi4.interfaceInfo();
		pi4.regularClassInfo();
		

	}

}
