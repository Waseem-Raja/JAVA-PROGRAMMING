//ALL ABOUT USER DEFINED EXCEPTION
package com.company;

//EXCEPTION CLASS IS A PARENT CLASS OF ALL THE EXCEPTIONS SO WE MUST EXTEND
// IT INORDER TO CREATE OUR OWN EXCEPTIONS(user defined exceptions)
class  NegativNumberException extends Exception
{
    void display()
    {
        System.out.println("OOPS you have not entered the correct amount ");
    }
}
class BalanceBelowZeroException extends Exception
{
    double debitt;
    double Balance;
    BalanceBelowZeroException(double debit, double Bal)
    {
        this.Balance=Bal;
        this.debitt=debit;
    }

    void display()
    {

        System.out.println("INSUFFICIENT BALANCE FOR WITHDRAWAL ");
        System.out.println("Your Balance is: "+Balance+" and you are trying to withdraw an amount of : "+debitt );
    }

}
class Bank
{
    private  double DepositedAmount;
    double temp;
    Bank()
    {
        DepositedAmount=0;
        temp=0;
    }

    public int Deposit(double credidtedamount) throws NegativNumberException
    {
        if (credidtedamount<0)  //like if we are depositing amount digitally then a negative number is an invalid amount
            //so we must verify it first
        {
            NegativNumberException obj= new NegativNumberException();
            throw obj;
        }
        else if (credidtedamount>0)
            DepositedAmount += credidtedamount; //Depositing the amount
        else
            return -1;

        return 0;
    }
    public int Withdrawal(double debitedamount) throws BalanceBelowZeroException,NegativNumberException
    {
         if (debitedamount<=0)
         {
             NegativNumberException obj= new NegativNumberException();
             throw obj;
         }
         else {
              this.temp=DepositedAmount;
             this.temp -= debitedamount;     //Debiting the amount
             if (this.temp < 0) {
                 BalanceBelowZeroException objectt = new BalanceBelowZeroException(debitedamount,DepositedAmount);
                 throw objectt;

             }
             else {
                 DepositedAmount -= debitedamount;
                 return 0;
             }
         }
    }
    void displayAmount()
    {
        System.out.println("TOTAL BALANCE :"+DepositedAmount);

    }
}
public class Userdefinedexception {
    public static void main(String[] args) {
        Bank obj= new Bank(); //creating object of bank class

        double DepositAmountt=1000;
        double WithdrawallAmount=10000;


        try {

            if(obj.Deposit(DepositAmountt)==-1)                                  //if credit amount entered is a negative number
                System.out.println("Can't Deposit :"+DepositAmountt);
            else {
                System.out.println("Amount deposited successfully");
                obj.displayAmount();
            }



            if (obj.Withdrawal(WithdrawallAmount)==0) {//if debit entered is a negative number which is invalid then we will throw an exception
                System.out.println("Amount debited successfully");
                obj.displayAmount();
            }


        }
        catch (BalanceBelowZeroException e)     // this catch will handle the exception like if we are trying to debit from an account
                                               //having no balance or our debit amount is higher than the amount deposited in the account
        {
            e.display();
        }
        catch (NegativNumberException n)  //this catch will handle exception like  if we enter a negative amount for debit or credit
        {
            n.display();
        }

    }
}
