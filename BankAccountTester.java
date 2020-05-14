/*
Lina Breunlin
November 16, 2019
CIS 163 AA Section 20460
This program will create two objects from the BankAccount Class. It will instantiate
the two BankAccount objects, process a withdrawl or deposit if desired  and display
the values of the object
 */

package bankaccounttester;
import java.util.Scanner;



public class BankAccountTester

{

    public static void main(String[] args) 
    {
        
      AccountForm acctForm = new AccountForm();
      acctForm.setTitle("Artichoke Banking App");
      acctForm.setVisible(true);
        

        
     BankAccount bankAccountObj1 = new BankAccount ("Breunlin", "Lina", "Checking", 400.00);
     BankAccount bankAccountObj2 = new BankAccount ("Scott", "Tom", "Savings", 560.00);
     
     

     
      
        
        //declare variables
        String accessAccount;
        double withdrawal = 0.00;
        double deposit = 0.00;
        
     
        System.out.println ();
        displayInfo (bankAccountObj1);
        System.out.println ();
        displayInfo (bankAccountObj2);
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Would you like to make a withdrawal or deposit? Enter W, D or Q to quit:");
        Scanner in = new Scanner(System.in);
        accessAccount = in.next();
        
        while (!accessAccount.equals ("Q"))
        {
           
                if (accessAccount.equals("W"))
                    {
        
                        withdrawal = acceptWithdrawal();
                        if (withdrawal > 0)
                        {
                           bankAccountObj1.updateWithdrawal(withdrawal);
                           displayInfo(bankAccountObj1);
                        }
                        else
                        {
                            System.out.println("Error. Invalid withdrawal amount entered");
                        }//end if
                    }//end if  
          else if (accessAccount.equals("D"))
                    {
        
                        deposit = acceptDeposit();
                        if (deposit > 0)
                        {
                           bankAccountObj1.updateDeposit(deposit);
                           displayInfo(bankAccountObj1);
                        }
                        else
                        {
                            System.out.println("Error. Invalid deposit amount entered");
                        }//end if
                    }
          else   
          {
              displayInfo(bankAccountObj1);
          }//if they don't want to do anything just show them the current status
           
        System.out.println ();
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Would you like to process additional transactions? Enter W, D or Q to quit:"); 
        accessAccount = in.next();
        }
        
        System.out.println ("Thank you for using the Artichoke Banking System!");
        System.out.println("-----------------------------------------------------------------------------------"); 
    }
     
    /**
     Display the current bank account holder's information
     @param obj
     */
    
    public static void displayInfo (BankAccount obj)
    {
     //declare variables
      int acctID;
      String acctLast;
      String acctFirst;
      String acctTypeOf;
      double acctbalance;
      
      //call the the objeect methods to get object state
       acctID = obj.getAcctID();
       acctLast = obj.getLastName();
       acctFirst = obj.getFirstName();
       acctTypeOf = obj.getAcctType();
       acctbalance = obj.getAcctBalance();
       
       //display account information
       System.out.println("-----------------------------------------------------------------------------------");
       System.out.println("                         --| Account Sumamry |--                       ");
       System.out.println("------------------------------------------------------------------------------------");
       System.out.println("AccountID:" + acctID);
       System.out.println("Account Holder Name: " + acctFirst + " " + acctLast);
       System.out.println("Account Type:" + acctTypeOf);
       System.out.printf("Current Balance:" + " " +  "$%,7.2f",acctbalance);   
    }
    
           /**
     Retrieves withdrawal amount from the user
     @return withdrawalAmt
     */
     public static double acceptWithdrawal ()
    {
        double withdrawalAmt;
        
        
        
        Scanner in = new Scanner (System.in);
        //prompt the user from the amount they wish to withdrawal
        
        System.out.println("Please enter the withdrawal amount:");
            if (in.hasNextDouble())
            {
                withdrawalAmt = in.nextDouble(); 
      
            }
            else
            {
                withdrawalAmt = 0;
            }
            
        return withdrawalAmt;
    }
     
    /**
     Retrieves deposit amount from the user
     @return depositAmt
     */
     public static double acceptDeposit()
    {
        double depositAmt;
        Scanner in = new Scanner (System.in);
        //prompt the user from the amount they wish to withdrawal
        
        System.out.println("Please enter the deposit amount:");
            if (in.hasNextDouble())
            {
                depositAmt = in.nextDouble(); 
            }
            else
            {
                depositAmt = 0;
            }
            
        return depositAmt;
    }
    
 
   
    
}
