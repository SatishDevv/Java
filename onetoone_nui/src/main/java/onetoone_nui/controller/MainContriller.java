package onetoone_nui.controller;

import onetoone_nui.dao.PersonDao;
import onetoone_nui.dto.AdarCard;
import onetoone_nui.dto.Person;

public class MainContriller {
	public static void main(String[] args) {
		
		PersonDao dao= new PersonDao();
		AdarCard adarCard = new AdarCard();
		adarCard.setId(101);
		adarCard.setName("satish");
		adarCard.setAddress("pune");
		
		Person person = new Person();
		person.setPid(1);
		person.setName("satish");
		person.setPhone(907541);
		person.setAddress("pune");
		person.setAdarCard(adarCard);
		
		dao.savaPerson(person);
		
		
	}

}
