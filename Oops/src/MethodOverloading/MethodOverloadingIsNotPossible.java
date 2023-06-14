/*
 method overloading is not possible by changing the return type of the method only because of ambiguity.
  Let's see how ambiguity may occur:
 */
package MethodOverloading;

class MethodOver{
	static int MethodOver(int a , int b ) {
		return a +b ;
	}
	//static int  MethodOver(int d ,int c ) {
	//	return d + c;
	//}
}


public class MethodOverloadingIsNotPossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Here, how can java determine which MethodOver() method should be called?
		System.out.print(MethodOver.MethodOver(10, 10)); //CTE 
		// System.out.print(MethodOver.MethodOver(, ));
		
		

	}

}
