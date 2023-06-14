package dout;

class accessPrivate{
	private int  a  ;
	
	private void setDate(int a ) {
		this.a=a;
		System.out.println(":hii");
		
	}
	public void acc(int b){
		setDate(b);
		System.out.println(a);
	}
}

public class accessPrivateMember {
	public static void main(String args[]) {
		accessPrivate p = new accessPrivate();
		p.acc(10);
	}

}
