class BankAccountRunner{

public static void main(String []sbi){

BankAccount.credit(2000);
double getvalue = BankAccount.getBalance();
BankAccount.credit(8000);
getvalue = BankAccount.getBalance();
BankAccount.credit(10000);
getvalue = BankAccount.getBalance();
BankAccount.debit(7000);
getvalue = BankAccount.getBalance();
BankAccount.debit(3000);
getvalue = BankAccount.getBalance();
System.out.println("balance is:"+getvalue);


}

}