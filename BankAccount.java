/*
Lina Breunlin
November 16, 2019
CIS 166AA Section 20460
This is the BankAccount class with the instance variables and methods to create BankAccount objects.
This class can be tested using the BankAccountTester class.
 */

package bankaccounttester;

import java.util.Scanner;

/**
    This class will be the template for creating bank accounts in our banking system
 */
public class BankAccount 
{
    //declare istance variables
    private int acctID;
    private String lastName;
    private String firstName;
    private String acctType;
    private double acctBalance;
    
    //declare class variable with initial value
    private static int lastID = 0;
    
    /**
       Constructor method for bank account with no params
    */
    
    public BankAccount ()
    {
        lastID = lastID + 1;
        acctID = lastID;
        lastName = "";
        firstName = "";
        acctType = "";
        acctBalance = 100.00;   
    }
    
     /**
       Overloaded constructor method w four params
       @param lName = account holder's last name
       @param fName = acct holder's first name
       @param type = checking or savings
       @param balance = balance of the acct
    */
    
    public BankAccount (String lName, String fName, String type, double balance)
    {
       lastID = lastID + 1;
       acctID = lastID; 
       lastName = lName;
       firstName = fName;
       acctType = type;
       acctBalance = balance;
    }
    
     /**
      gets current value of acctID
      @return acctID
    */
    public int getAcctID()
    {
        return acctID;
    }
    
     /**
      gets last name of acct holder
      @return lastName
    */
    public String getLastName()
    {
        return lastName;
    }
    
      /**
      gets first name of acct holder
      @return firstName
    */
    public String getFirstName()
    {
        return firstName;
    }
    
       /**
      gets the type of acct
      @return acctType
    */
    public String getAcctType()
    {
        return acctType;
    }
    
       /**
      gets the balance of acct
      @return acctBalance
    */
    public double getAcctBalance()
    {
        return acctBalance;
    }
    
     /**
      sets the acct holder's last name to new value
      @param lName
    */
    public void setLastName(String lName)
    {
        lastName = lName;
    }
    
    /**
      sets the acct holder's first name to new value
      @param fName
    */
    public void setFirstName(String fName)
    {
        firstName = fName;
    }
    
     /**
      sets the acct holder's acct type to new value
      @param type
    */
    public void setAcctType(String type)
    {
        acctType = type;
    }
    
    
     /**
     updated acct balance after a withdrawal
     @param withdrawal
    */
    public void updateWithdrawal (double withdrawal)
    {
        if (withdrawal <= acctBalance)
        {
            acctBalance = acctBalance - withdrawal;
        }
        else
        {
            System.out.println ("Error. Insufficent funds. Withdrawal cannot be processed.");
        }//end if
   
    }
     
     /**
    updated acct balance after deposit
     @param deposit
    */
    public void updateDeposit (double deposit)
    {
        acctBalance = acctBalance - deposit;   
    }
    

    
    
    
    
    
}
