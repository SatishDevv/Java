package encapsulation;

import java.util.Arrays;
import java.util.List;

public class Account {
	private int Acc_no;
	private String name,email;
	private float amount;
	private String add;
	
	void setInfo(int Acc_no, String name, String email , float amount, String add) {
		this.Acc_no = Acc_no;
		this.name=name;
		this.email=email;
		this.amount=amount;
		this.add=add;
	}
	
	 List<Object> getInfo(){
        return Arrays.asList(Acc_no, name, email,amount,add );
    }
	 
	 /*  
	  	
	  	
	  */
	
	
}
