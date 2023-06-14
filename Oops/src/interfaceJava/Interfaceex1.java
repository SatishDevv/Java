package interfaceJava;

interface print {
	void print() ;
}


class Interfaceex1 implements print {
	public void print() {
		System.out.println("hello words : ");
	}
	public static void main (String args[]) {
		Interfaceex1 obj = new Interfaceex1(); 
		obj.print();
	}
}
