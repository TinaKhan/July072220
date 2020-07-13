package hw6Q2Abstraction04;

public interface College {
	public default void dorme() {//default method can be inplemented
		System.out.println("This is default method from college interface");
		}
	public static void studyRoom() {//static method can be inplemented
		System.out.println("This is static method from college interface");
	}
}
