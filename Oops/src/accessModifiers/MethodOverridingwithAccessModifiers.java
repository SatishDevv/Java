package accessModifiers;

class A{  
	protected void msg(){
		System.out.println("Hello java");
		}  
}  
  
public class MethodOverridingwithAccessModifiers extends A{
	
	protected void msg(){
		System.out.println("Hello java");
	}//C.T.Error  
 public static void main(String args[]){  
	 MethodOverridingwithAccessModifiers obj=new MethodOverridingwithAccessModifiers();  
	 obj.msg();  
   }  
}  