import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//Bank class containes all the methods for each services
public class Bank {
	int acc_no;  
	String name;  
	float amount;
	int age;
	String num;
	String branch;
	static String bank;
	public Bank(float f, String ba) {
		amount=f;
		bank=ba;
	}
	//CreateAccount will ask for the required details and will create the new account
	void CreateAccount(){
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter Account Holder Name: ");
		name=ss.next();
		System.out.println("Enter Account Holder Age: ");
		age=ss.nextInt();
		while(age<18) {
			System.out.println("Age can not be less than 18!!...Please refill the details");
			System.out.println("Enter Account Holder Name: ");
			name=ss.next();
			System.out.println("Enter Account Holder Age: ");
			age=ss.nextInt();
		}
		System.out.println("Enter Account Holder's Contact Number to link with account: ");
		num=ss.next();
		while(num.length()!=10) {
			System.out.println("Please enter a valid contact number");
			System.out.println("Enter Account Holder Contact Number to link with account: ");
			num=ss.next();
		}
		System.out.println("Enter Branch where you want to begin your account: ");
		branch=ss.next();
		long min=11234534;
		long max=456764337;
		acc_no=(int) (Math.random()*(max-min+1)+min);
		System.out.println("Created Your New Account....\nPlease note your Account Number: " + acc_no);
		System.out.println("\nMinimum balance required is 1000....Please Deposite the Amount...");
		Deposit();
		}
	//CheckBalance will return the balance amount left 
	void CheckBalance() {
		System.out.println("Balance Amount : " + amount);
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Deposit will ask for the amount to deposit and add it to the balance amount
	void Deposit() {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter Amount to Deposit: ");
		int da=ss.nextInt();
		amount=amount+da;
		System.out.println("Deposited " + da + " into account number "+ acc_no);
		System.out.println("Do you want to see the details??\n1.Yes\n2.No");
		int m=ss.nextInt();
		if(m==1) {
			PrintReceipt();
		}
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Deposit will ask for the amount to withdraw and minimize it from the balance amount
	void Withdraw() {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter Amount to withdraw: ");
		float wd=ss.nextFloat();
		if((amount - wd) >= 1000) {
		System.out.println("Withdrawn " + wd + " amount from account number "+ acc_no);
		amount=amount-wd;
		System.out.println("Do you want to see the details??\n1.Yes\n2.No");
		int m=ss.nextInt();
		if(m==1) {
			PrintReceipt();
		}
		}
		else {
			System.out.println("Not enough balance to withdraw " + wd + " from your account");
			System.out.println("Do you want to see the details??\n1.Yes\n2.No");
			int m=ss.nextInt();
			if(m==1) {
				PrintReceipt();
			}
		}
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//PrintReceipt is getting invoked after deposit and withdraw..it will print date, brnach, acc.no and balance
	void PrintReceipt() {
		System.out.println("***RECEIPT***");
		Date date=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yy");
		String str=formatter.format(date);
		System.out.println("Date : " + str);
		System.out.println("Branch : " + branch);
		System.out.println("Account No: " + acc_no);
		System.out.println("Balance : " + amount);
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Details method will print all the details abount the account holder
	void Details() {
		System.out.println("Bank Name : " + bank);
		System.out.println("Account Holder name : " + name);
		System.out.println("Account No: " + acc_no);
		System.out.println("Branch : " + branch);
		System.out.println("Linked phone number : " + num);
		System.out.println("Balance Amount : " + amount);
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
