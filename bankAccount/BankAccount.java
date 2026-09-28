package tdd;

public class BankAccount {
    private String name;
    private double balance;
    private int pin;

    public BankAccount(String name,double balance,int pin){
        this.name = name;
        this.balance = balance;
        this.pin = pin;
    }
    public double checkBalance() {
        return balance;
    }

    public boolean enterPin(int pin) {
        return this.pin == pin;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(this.balance < amount){
            throw new IllegalArgumentException("insufficient fund");
        }

        this.balance -= amount;
    }

    public String getName() {
        return  name;
    }

    public void changeName(String name) {
        this.name = name;
    }
}

