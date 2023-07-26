package onetone_bio_dir.controller;

import java.util.Scanner;

public class MainContrroller {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		boolean condition = true ;
		while (condition) {
			System.out.println("1.Insret the Person : ");
			int key = scanner.nextInt();
			
			switch (key) {
			case 1 :{
				
				break;
			}

			default:
				condition = false ; 
				break;
			}
			
		}
	}

}
