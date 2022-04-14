package a74_generic_classes;

public class MyGenericClass <Thing, Thing2, Thing3 extends Number> {
	
	Thing x;
	Thing2 y;
	Thing3 n;
	
	MyGenericClass(Thing x, Thing2 y, Thing3 n){
		
		this.x = x;
		this.y = y;
		this.n = n;
	}
	
	public Thing2 getValue() {
		
		return y;
	}
	
}
