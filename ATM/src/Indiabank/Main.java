package Indiabank;
import java.util.Scanner;
import java.util.*;

public class Main extends Userstat {
	public static void welcome()
	  { System.out.println();
		System.out.println("       Welcome to Indiabank  ^_^    ");
	    System.out.println(" Please follow the process to complete trancsaction ");
	  }	
	public static void display(int i)
	{ System.out.println("Your Transaction details --->");
	  System.out.println();
	  System.out.println("         Your Accountno  : "+userlist.get(i).getuserAccountno());
	  System.out.println("             Your Pinno  : "+userlist.get(i).getuserpinno());
	  System.out.println("           Your Balance  : "+userlist.get(i).getuserbalance());
	  if(s) {System.out.println("         Your withdrawel : "+userlist.get(i).getuserwithdraw());}
	  if(t) {System.out.println("            Your Deposit : "+userlist.get(i).getuserdeposit());}
	}
	
	public static void main(String[] args) 
	{ int num;
	  Scanner input=new Scanner(System.in);
	  Main.userstat();
}
}
                               /* *******OUTPUT********* */
/* 
     Welcome to Indiabank  ^_^    
Please follow the process to complete trancsaction 
Press an option - 0-ExistingUser, 1-NewUser, 2-Exit 
1
Please enter your Account Number : 
12345
Enter your 4-digit Pin Number: 
2457
press '1' if you have recieved OTP , press '0' if you haven't recieved
1
Press a number to Select a transaction type: 1-Balance Enquiry , 2-Deposit Money , 3-Withdraw Money , 4-Exit
2
Enter the amount you want to deposit :
300
Press a number 1-Balance Enquiry , 2-Deposit Money , 3-Withdraw Money to continue your transaction or Exit
4
Thankyou for visiting!!

Your Transaction details --->

       Your Accountno  : 12345
           Your Pinno  : 2457
         Your Balance  : 100300.0
          Your Deposit : 300.0

Press 1-Toterminate 2-Nextuser
2

     Welcome to Indiabank  ^_^    
Please follow the process to complete trancsaction 
Press an option - 0-ExistingUser, 1-NewUser, 2-Exit 
1
Please enter your Account Number : 
35678
Enter your 4-digit Pin Number: 
9076
press '1' if you have recieved OTP , press '0' if you haven't recieved
0
You have entered wrong AccountNumber and PinNumber please try again
Please enter your Account Number : 
35678
Enter your 4-digit Pin Number: 
9067
press '1' if you have recieved OTP , press '0' if you haven't recieved
1
Press a number to Select a transaction type: 1-Balance Enquiry , 2-Deposit Money , 3-Withdraw Money , 4-Exit
2
Enter the amount you want to deposit :
4500
Press a number 1-Balance Enquiry , 2-Deposit Money , 3-Withdraw Money to continue your transaction or Exit
3
Enter the amount you want to withdraw :
500
Press a number 1-Balance Enquiry , 2-Deposit Money , 3-Withdraw Money to continue your transaction or 4 to Exit
4
Thankyou for visiting!!

Your Transaction details --->

       Your Accountno  : 35678
           Your Pinno  : 9067
         Your Balance  : 104000.0
       Your withdrawel : 500.0
          Your Deposit : 4500.0

Press 1-Toterminate 2-Nextuser
2

     Welcome to Indiabank  ^_^    
Please follow the process to complete trancsaction 
Press an option - 0-ExistingUser, 1-NewUser, 2-Exit 
1
Please enter your Account Number : 
67890
Enter your 4-digit Pin Number: 
5413
press '1' if you have recieved OTP , press '0' if you haven't recieved
1
Press a number to Select a transaction type: 1-Balance Enquiry , 2-Deposit Money , 3-Withdraw Money , 4-Exit
3
Enter the amount you want to withdraw :
1000000
Sorry you dont have sufficient balance please try again :
Enter the amount you want to withdraw :
5000
Press a number 1-Balance Enquiry , 2-Deposit Money , 3-Withdraw Money to continue your transaction or 4 to Exit
4
Thankyou for visiting!!

Your Transaction details --->

       Your Accountno  : 67890
           Your Pinno  : 5413
         Your Balance  : 95000.0
       Your withdrawel : 5000.0

Press 1-Toterminate 2-Nextuser
2

     Welcome to Indiabank  ^_^    
Please follow the process to complete trancsaction 
Press an option - 0-ExistingUser, 1-NewUser, 2-Exit 
0
Enter your account number for verification 
12345
Press a number to Select a transaction type: 1-Balance Enquiry , 2-Deposit Money , 3-Withdraw Money , 4-Exit
2
Enter the amount you want to deposit :
3500
Press a number to Select a transaction type: 1-Balance Enquiry , 2-Deposit Money , 3-Withdraw Money , 4-Exit
4
Your Transaction details --->

       Your Accountno  : 12345
           Your Pinno  : 2457
         Your Balance  : 103800.0
          Your Deposit : 3500.0
Thankyou for visiting!!

Press 1-Toterminate 2-Nextuser
2

     Welcome to Indiabank  ^_^    
Please follow the process to complete trancsaction 
Press an option - 0-ExistingUser, 1-NewUser, 2-Exit 
0
Enter your account number for verification 
12367
You are a NewUser 
Please enter your Account Number : 
12367
Enter your 4-digit Pin Number: 
5690
press '1' if you have recieved OTP , press '0' if you haven't recieved
1
Press a number to Select a transaction type: 1-Balance Enquiry , 2-Deposit Money , 3-Withdraw Money , 4-Exit
3
Enter the amount you want to withdraw :
4000
Press a number 1-Balance Enquiry , 2-Deposit Money , 3-Withdraw Money to continue your transaction or 4 to Exit
4
Thankyou for visiting!!

Your Transaction details --->

       Your Accountno  : 12367
           Your Pinno  : 5690
         Your Balance  : 96000.0
       Your withdrawel : 4000.0

Press 1-Toterminate 2-Nextuser
1
*/