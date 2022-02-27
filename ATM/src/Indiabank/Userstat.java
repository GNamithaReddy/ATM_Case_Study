package Indiabank;
import java.util.*;

public class Userstat extends user{
   static Scanner input=new Scanner(System.in);
    public static ArrayList<user> userlist=new ArrayList<>();
    static int n;
   public static void userstat()
   { Main.welcome();
	 System.out.println("Press an option - 0-ExistingUser, 1-NewUser, 2-Exit ");
     int choice=input.nextInt();
     if(choice==1)
     { Newuser();}
     else if(choice==0)
     { Existinguser();}
     else if(choice==2)
     { System.out.println("Thankyou for visiting!!");
	   userstat();
	 }
   }
   public static void Newuser()
   { user user=new user();
	 userlist.add(user); //Each new user will be added into arraylist
	 Main.display(userlist.size()-1);
	 System.out.println();
	 System.out.println("Press 1-Toterminate 2-Nextuser");
	 n=input.nextInt();
	 if(n==2) {userstat();}
	 else {System.exit(0);}
   }
public static void Existinguser()
   { System.out.println("Enter your account number for verification ");
     int Accountno=input.nextInt();
     int i,n,p;
     s=false;t=false;
     for( i=0;i<userlist.size();i++)
     { if(Accountno==userlist.get(i).getuserAccountno())
       { System.out.println("Press a number to Select a transaction type: 1-Balance Enquiry , 2-Deposit Money , 3-Withdraw Money , 4-Exit");
 	  n=input.nextInt();
 	  while(n!=4)
 	 {if(n==1) { userlist.get(i).balance();}
 	  if(n==3) { 
 		         s=true;
 	             userlist.get(i).withdraw();
 	           }
 	  if(n==2) {
 		         t=true;  
 		         userlist.get(i).deposit();
 		       }
 	  System.out.println("Press a number to Select a transaction type: 1-Balance Enquiry , 2-Deposit Money , 3-Withdraw Money , 4-Exit");
 	  n=input.nextInt();
 	 }
 	 if(n==4) { 
 		 Main.display(i);
 		 System.out.println("Thankyou for visiting!!");
 		 System.out.println();
 		 System.out.println("Press 1-Toterminate 2-Nextuser");
 		 p=input.nextInt();
 		 if(p==2) {userstat();}
 		 else {System.exit(0);}
 		      }
 	      break;
 	   }
     }
     if(i==userlist.size())
     { System.out.println("You are a NewUser ");
       Newuser();
     }
   }

	
}
