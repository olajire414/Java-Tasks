package tdd;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount myAccount;
     private final String pin = "1234";

    @BeforeEach
    public void startWith(){
        myAccount = new BankAccount("1234");

    }
    @Test
    void testThatIHaveAccount_BalanceIsCheckedWithPin(){

        assertTrue(myAccount.enterPin());
        assertEquals(0,myAccount.checkBalance("1234"));
    }
    @Test
    void testThatIHaveAccount_ModifyAName(){
        String oldName = "ola";
        String newName = "jire";
        myAccount.changeName(oldName);
        myAccount.changeName(newName);
        assertEquals(newName,myAccount.getName());

    }
    @Test
    void testThatIHaveAccount_DepositIsMade(){
        String pin = "1234";
        myAccount.deposit(3000);
        assertEquals(3000,myAccount.checkBalance(pin));
    }

    @Test
    void testIHaveAccount_ICanWithdrawFromIt(){
        myAccount.deposit(3000);
        myAccount.withdraw(1000);
        assertEquals(2000,myAccount.checkBalance(pin));

    }
    @Test
    void testThatIHaveAccount_ICantWithdrawMoreThanBalance(){
        myAccount.deposit(3000);
        assertTrue(myAccount.enterPin());
        myAccount.withdraw(1000);
        assertEquals(2000,myAccount.checkBalance(pin));



   }






}



