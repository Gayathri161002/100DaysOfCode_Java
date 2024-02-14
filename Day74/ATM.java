import java.util.*;

class ATM {
	public static void main(String[] args) {
		int pin=1234;
		int balance=10000;
		int deposit=0;
		int withdraw=0;
		char choice='\0';
		int i=0;
		Date currentDate = new Date();
        StringBuilder[] stringArray = new StringBuilder[5];

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Pin :");
		int upin=sc.nextInt();
		if(pin==upin) {
			do {
				System.out.println("a.Balance Enquiry \nb.Cash Deposit \nc. Cash Withdrawl \nd. Mini Statement\ne.exit");
				System.out.println("Enter Your Choice:(in terms of character only )");
				choice=sc.next().charAt(0);
				switch(choice) {
				case 'a':
					System.out.println("Your Balance is "+balance+"\n");
					break;
				case 'b':
					System.out.println("Enter Amount to Deposit :");
					deposit=sc.nextInt();
					System.out.println("Balance before deposit:"+balance);
					balance=balance+deposit;
					System.out.println("Current Balance :"+balance+"\n");
					stringArray[i] = new StringBuilder(currentDate+" Deposit "+Integer.toString(deposit));
					i++;
					break;
				case 'c':
					System.out.println("Enter Amount to Withdraw :");
					withdraw=sc.nextInt();
					System.out.println("Balance before Withdrawal:"+balance);
					balance=balance-withdraw;
					System.out.println("Current Balance :"+balance+"\n");
					stringArray[i] = new StringBuilder(currentDate+" Withdraw "+Integer.toString(withdraw));
					i++;
					break;
				case 'd':
					for(int j=0;j<i;j++) {
						System.out.println(stringArray[j]);
					}
					System.out.println("Your current balance is :"+balance);
					System.out.println("Have a nice day !!!\n");
					break;
				
				case 'e':
					continue;
				default:
					System.out.println("Enter Valid Option");
					break;
				}
			}while(choice!='e');
			System.out.println("Thank you !!! ");
			
		}else {
			System.out.print("Enter Proper Pin ");
		}
	}
}