package basicassignment;

import java.util.Scanner;

public class UserValidation {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String userName;
		String password;
		String matchUserName;
		String matchPassword;
		System.out.println("Enter you user name");
		userName = input.next();
		System.out.println("Enter you password");
		password = input.next();

		int i = 0;
		while (i<3) {
			System.out.println("Enter you user name");
    		matchUserName=input.next();
    		System.out.println("Enter you user name");
    		matchPassword=input.next();
		int matchUser=userName.compareTo(matchUserName);
		int matchPass=password.compareTo(matchPassword);
			if(matchUser==0 && matchPass==0){
				System.out.println("Welcome "+userName);
				System.exit(0);
			}
				
				else
				{
					i++;
				}
				if(i>3){
					System.out.println("Contact Admit");
				System.exit(0);

				}
			}

		}
}

