package tdd;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount myAccount;

    @BeforeEach
    public void startWith(){
        myAccount = new BankAccount("ola",0.0,1234);

    }
    @Test
    void testThatIHaveAccount_BalanceIsCheckedWithPin(){
        assertTrue(myAccount.enterPin(1234));
        assertEquals(0,myAccount.checkBalance());
    }
    @Test
    void testThatIHaveAccount_ModifyAName(){
        myAccount = new BankAccount("ade",0.0,1234);
        String name = "ola";
        myAccount.changeName(name);
        assertEquals("ola",myAccount.getName());

    }
    @Test
    void testThatIHaveAccount_DepositIsMade(){
        myAccount.deposit(3000);
        assertEquals(3000,myAccount.checkBalance());
    }

    @Test
    void testIHaveAccount_ICanWithdrawFromIt(){
        myAccount.deposit(3000);
        assertTrue(myAccount.enterPin(1234));
        myAccount.withdraw(1000);
        assertEquals(2000,myAccount.checkBalance());

    }
    @Test
    void testThatIHaveAccount_ICantWithdrawMoreThanBalance(){
        myAccount.deposit(3000);
        assertTrue(myAccount.enterPin(1234));
        myAccount.withdraw(5000);
        assertEquals(3000,myAccount.checkBalance());



    }






}



