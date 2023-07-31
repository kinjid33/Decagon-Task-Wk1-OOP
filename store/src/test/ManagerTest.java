package test;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import storeapp.person.staff.Cashier;
import storeapp.person.staff.Manager;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;
    Cashier cashier;
    List<Cashier> cashierList = new ArrayList<>();


    //Hiring the cashiers above

    @Before
    public void createManager(){
         manager = new Manager();
         cashier = new Cashier();
    }
    @Test
    public void testManagerCanHireCashier(){
        Cashier betty = new Cashier("Betty", 2);
        Cashier john = new Cashier("John", 3);
        cashierList.add(betty);
        cashierList.add(john);
        manager.potentialHire(cashierList);

        assertEquals("Hired", manager.hireCashier(betty.getCashierName()));
    }
    @Test
    public void testManagerCanFireCashier(){
        Manager manager1 = new Manager();
        Cashier betty = new Cashier("Betty", 2);
        Cashier john = new Cashier("John", 3);
        cashierList.add(betty);
        cashierList.add(john);
        manager.potentialHire(cashierList);
        assertEquals("fired!", manager.fireCashier(betty.getCashierName()));
    }
}
