package interfaceUnderstanding;
//Here the defaullt method is present.interface can contain any number of default interfaces.this is useful in cases hwere all classes which implements the interface have the same functionality.
public interface Arithmetic {
	default void output(){
		System.out.println("default method of the interface");
	}
	
	//this interface has only one abstract method ,so it is a functional interface
	int add(int x, int y);
}
