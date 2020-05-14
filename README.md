# bankAccount
Program utilizes classes and objects for a bank account system

How It Works:

Each object instantiated from this class holds an account number (assigned by the Bank sequentially), the account holder's last name and first name, the account type (checking , savings, or other), and the account balance. 

Includes a default constructor with no parameter variables that sets the account number based on the last account number issued and sets the initial balance to $100.00. 

A second (overloaded) constructor is included that accepts last name, first name, account type, and initial account balance. 

Includes get and set methods

Includes a method to process a deposit where the deposit amount will be the parameter variable and the account's balance will be updated. 

Includes a method to process a withdrawal where the withdrawal amount will be the parameter variable and the account's balance will be updated.

BankAccount class is tested with BankAccountTester

BankAccountTester has a main() method that instantiates at least 2 BankAccount objects (one checking account type and one savings account type) and asks the user if he/she would like to make a deposit or a withdrawal. If a withdrawal is selected, program checks for sufficient funds before processing the withdrawal.  The user is allowed to process repeated transactions from the account as long as the funds are available.  

A method displays the current account summary information (Account number, name, type, and balance and another method accepts a valid transaction amount (for a deposit or withdraw) from the user.
