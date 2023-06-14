package MethodOverloading;

public class MethodOverloadingWithTypePromotion {
	
	void sum(long a ,int b) {
		//return a+b;
		System.out.println("hii");
	}
	void sum(int a ,short b ) {
		System.out.println("hello");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloadingWithTypePromotion obj= new MethodOverloadingWithTypePromotion();
		//System.out.println(obj.sum(10 ,20));
		obj.sum(10,20);

	}

}	

