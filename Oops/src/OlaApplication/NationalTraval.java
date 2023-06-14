package OlaApplication;

public class NationalTraval extends ReadBus {
	
		double price = 10 ;

		public NationalTraval(String from, String to, String date, int km, double price) {
			super(from, to, date, km);
			this.price = price;
		}
			
}
