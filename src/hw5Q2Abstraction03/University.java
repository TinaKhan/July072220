package hw5Q2Abstraction03;

public interface University extends Hospital,College{
	public default void gymnasium() {//default method can be inplemented
		System.out.println("This is default method from university interface");
	}
	public static void library() {//static method can be inplemented
		System.out.println("This is static method from university interface");
	}
}
