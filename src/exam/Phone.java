package exam;
/*  Interface name starts with Uppercase
 * The methods which are created inside the interface are called abstract method.
 * An Interface can inherit more than one Interface
 * An Interface extends another Interface
 * An Interface can't inherit a regular class or an abstract class.
 * Methods are declared not implement inside the Interface.
 * Default and static methods can be implemented in Interface.
 * We can't create constructor inside the Interface
 */
public interface Phone {
	public int id=111;
public  abstract void  interfaceInfo();
public  abstract void  call();

public  abstract void  message();
public  abstract void  camera();
public default    void  battery() {
	System.out.println(" Battery is the method of Phone Interface ");
}
public static   void  wireless() {
	System.out.println(" Wireless is the method of Phone Interface ");
}

}
