import javax.swing.*;
import java.io.*;
import java.util.*;

class Account extends AccountHolder{
  
class Account
{
  private string accountHolder;
  private double balance;
  private double withdraw;
  private double deposit;
  
  public Account()
  {
  }
  
  public void setAccountHolder (string ah)
  {
    accountHolder = ah;
  }
  
  public void setBalance (double b)
  {
    balance = b;
  }
  
  public void setWithdraw (double w)
  {
    withdraw = w;
  }
  
  public void setDeposit (double d)
  {
    deposit = d;
  }
  
  public string getAccountHolder()
  {
    return accountHolder;
  }
  
  public double getBalance()
  {
    return balance;
  }
  
  public double getWithdraw()
  {
    return withdraw;
  }
  
  public double getDeposit()
  {
    return deposit;
  }
}
  
