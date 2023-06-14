package accessModifiers;
		
// we can't access private data member in to another class 
class Member {
	 Member (){
		
	}
	
	 int a = 10 ;
}

public class PravateMember {
	public static void main(String args[]) {
		Member m = new Member();
		//System.out.println(m.a); // CTE 
	}
}
