package Indiabank;
import java.util.*;

public class user {
   Scanner input=new Scanner(System.in);
	int Accountno;
	int n;
	int Pinno;
	int userno;
	float balance=100000; //Each new user has a balance of 100000 in his account
	float deposit=0;
	float withdraw=0;
	int OTP;
	static boolean s,t;
	user()
	{ s=false;t=false;
	  setuseraccountno();
	  setpinno();
	  System.out.println("Press a number to Select a transaction type: 1-Balance Enquiry , 2-Deposit Money , 3-Withdraw Money , 4-Exit");
	  n=input.nextInt();
	 while(n!=4)
	 {if(n==1) { 
	 balance();
	 System.out.println("Press a number 1-Balance Enquiry , 2-Deposit Money , 3-Withdraw Money to continue your transaction or 4 to Exit");
	 }
	 if(n==3) { 
	 s=true;
	 withdraw();
	 System.out.println("Press a number 1-Balance Enquiry , 2-Deposit Money , 3-Withdraw Money to continue your transaction or 4 to Exit");
	 }
	 if(n==2) {
	 t=true;
     deposit();
	 System.out.println("Press a number 1-Balance Enquiry , 2-Deposit Money , 3-Withdraw Money to continue your transaction or Exit");
	 }
	 n=input.nextInt();
	 }
	 if(n==4) {
		 System.out.println("Thankyou for visiting!!");
		 System.out.println();
		 }
	}
	public void setuseraccountno(){
	System.out.println("Please enter your Account Number : ");
	  Accountno=input.nextInt();
	}

    public void setpinno()
    { System.out.println("Enter your 4-digit Pin Number: ");
	  Pinno=input.nextInt();
	  System.out.println("press '1' if you have recieved OTP , press '0' if you haven't recieved"); 
	  OTP=input.nextInt(); //after entering accountno and pinno if anyone of them is wrong u will not get OTP
	  while(OTP!=1)
	  { System.out.println("You have entered wrong AccountNumber and PinNumber please try again");
	    setuseraccountno();
	    setpinno();
	  }
    }
    public void deposit()
    { 
      System.out.println("Enter the amount you want to deposit :");
      deposit=input.nextFloat();
      balance=balance+deposit;
    }
    public void withdraw()
    { System.out.println("Enter the amount you want to withdraw :");
      withdraw=input.nextFloat();
      if(withdraw>balance)
      { System.out.println("Sorry you dont have sufficient balance please try again :");
        withdraw();
      }
      else
      { balance=balance-withdraw;}
    }
	public void balance()
	{ System.out.println("Your current balance :" +balance);}
	public int getuserAccountno()
	{ return Accountno;}
	
	public int getuserpinno()
	{ return Pinno;}
	public float getuserdeposit()
	{ return deposit;}
	public float getuserwithdraw()
	{ return withdraw;}
	public float getuserbalance()
	{ return balance;}
}
