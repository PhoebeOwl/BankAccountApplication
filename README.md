# BankAccountApplication
An application handling new cunstomer bank account request.
## The application should do the following:
1. Read a .csv file of names, social security numbers, account type, and initial deposit
2. Use a proper data structure to hold all these accounts
3. Both savings and checking accounts share the following properties:
	deposit(); withdraw(); transfer(); showinfo()
  11-Digit Account Number (generated with the following process:1 or 2 depending on Savings or Checking, last two digits of SSN, unique  5-digit number, and random 3-digit number)

4. Savings Account holders are given a Safety Deposit Box, identified by a 3-digit number and accessed with a 4-digit code
5. Checking Account holders are assigned a Debit Card with a 12-digit number and 4-digit PIN 
6. Both accounts will use an interface that determines the base interest rate.
     Savings accounts will use .25 points less than the base rate
     Checking accounts will use 15% of the base rate
7. The Showinfo method should reveal relevant account information as well as information specific to the Checking account or Savings account.
