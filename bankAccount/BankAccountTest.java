package tdd;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount myAccount;

    @BeforeEach
    public void startWith(){
        myAccount = new BankAccount(1234);

    }
    @Test
    void testThatIHaveAccount_BalanceIsCheckedWithPin(){
        int pin = 1234;
        assertTrue(myAccount.enterPin());
        assertEquals(0,myAccount.checkBalance(pin));
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
        int pin = 1234;
        myAccount.deposit(3000);
        assertEquals(3000,myAccount.checkBalance(pin));
    }

    @Test
    void testIHaveAccount_ICanWithdrawFromIt(){
        int pin = 1234;
        myAccount.deposit(3000);
        myAccount.withdraw(1000);
        assertEquals(2000,myAccount.checkBalance(pin));

    }
    @Test
    void testThatIHaveAccount_ICantWithdrawMoreThanBalance(){
        int pin = 1234;
        myAccount.deposit(3000);
        assertTrue(myAccount.enterPin());
        myAccount.withdraw(1000);
        assertEquals(2000,myAccount.checkBalance(pin));



   }






}



