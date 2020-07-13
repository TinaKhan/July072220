package hw6Q2Abstraction04;

public interface Hospital{
public default void morgue() {//default method can be inplemented
	System.out.println("This is default method from Hospital interface");
	}
public static void pharmacy() {//default method can be inplemented
	System.out.println("This is static method from Hospital interface");
}

}
