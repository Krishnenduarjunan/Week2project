import java.util.Scanner;

public class BankCustomer {
	
	public static int printOptions(){
		System.out.println("***WELCOME TO SBI BANK SERVICES***");
		System.out.println("Select the services from below options!!");
		System.out.println("\t1 - Create New Account");
		System.out.println("\t2 - Delete Current Account");
		System.out.println("\t3 - Check balance");
		System.out.println("\t4 - Withdraw");
		System.out.println("\t5 - Deposit");
		System.out.println("\t6 - Display Details");
		System.out.println("\t7 - Quit");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Bank holder1=new Bank(0,"SBI");
		while(true) {
		choice=printOptions();
		if(choice==1) {
			holder1.CreateAccount();
			}
		else if(choice==2) {
			System.out.println("Are you sure that you want to delete this account\n1.yes\n2.No");
			Scanner sr=new Scanner(System.in);
			int b=sr.nextInt();
			if(b==1) {
			holder1=null;
			System.out.println("\n\n***Deleted the Account***\n\n");
			}
		}
		else if(choice==3) {
			if(holder1==null) {
				System.out.println("\n\n***This account not exist***\n\n");
				}
			else {
			holder1.CheckBalance();
			}
		}
		else if(choice==4) {
			if(holder1==null) {System.out.println("\n\n***This account not exist***\n\n");
			}
			else {
			holder1.Withdraw();
			}
		}
		else if(choice==5) {
			if(holder1==null) {System.out.println("\n\n***This account not exist***\n\n");
			}
			else {
			holder1.Deposit();
			}
		}
		else if(choice==6) {
			if(holder1==null) {System.out.println("\n\n***This account not exist***\n\n");
			}
			else {
			holder1.Details();
			}
		}
		else {
			System.out.println("\n\nThank You For Using our Service.....");
			break;
		}
		}
	}

}
