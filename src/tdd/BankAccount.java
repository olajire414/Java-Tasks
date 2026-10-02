package tdd;

public class BankAccount {
    private String name;
    private double balance;
    private String pin = "1234";

    public BankAccount(){
        this.name = name;
        this.balance = balance;
        this.pin = pin;
    }
    public BankAccount(String pin){
        this.name = name;
        this.balance = balance;
        this.pin = pin;
    }




    public double checkBalance(String pin) {
        if(!this.pin.equals(pin)){
            throw new IllegalArgumentException("invalid pin");
        }
        return balance;
    }

    public boolean enterPin() {
        return true;
    }

    public void deposit(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("invalid amount");
        }
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

