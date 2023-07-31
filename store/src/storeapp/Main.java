package storeapp;

import storeapp.person.customer.Customer;
import storeapp.person.staff.Cashier;
import storeapp.person.staff.Manager;
import storeapp.product.Product;

import javax.security.auth.callback.CallbackHandler;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Creating objects of type Manager, Cashier and Customer and Product
        Manager mrManager = new Manager("Akinjide A.", 1);
        Cashier betty = new Cashier("Betty", 2);
        Cashier john = new Cashier("John", 3);
        Customer karen = new Customer("Karen", 20_000);
        Product shoes = new Product("Nike Shoes", 200, 2_000);

        //Populating an ArrayList of type Manager with the manager object (mrManager) created above
        List<Manager> managerList = new ArrayList<>();
        managerList.add(mrManager);

        //Populating an ArrayList of type Cashier with the cashier object (betty) created above
        List<Cashier> cashierList = new ArrayList<>();
        cashierList.add(betty);
        cashierList.add(john);

        //Hiring the cashiers above
        mrManager.potentialHire(cashierList);
        System.out.println(betty.getCashierName() + " " + mrManager.hireCashier(betty.getCashierName()));
        System.out.println(john.getCashierName() + " " + mrManager.hireCashier(john.getCashierName()));

        //Populating an ArrayList of type Customer with the customer object (karen) created above initialised with
        // $20,000 cash in hand
        List<Customer> customerList = new ArrayList<>();
        customerList.add(karen);

        //Populating an ArrayList of type Product with the product object (shoes) created above initialised at a price
        //of $2,000
        List<Product> productList = new ArrayList<>();
        productList.add(shoes);

        //creating a Store object
        Store myShoeStore = new Store(managerList, cashierList, customerList);
        System.out.println("Store balance before purchase: $" + myShoeStore.getStoreBalance());
//        System.out.println("Customer had $" + karen.getCashInHand() + " before purchase");

        //Processing a transaction
//        myShoeStore.updateStoreBalance(karen.payForProduct(shoes.getProductPrice()));
//        myShoeStore.getStoreBalance();
//        System.out.println("Store balance after purchase: $" + myShoeStore.getStoreBalance());
//        System.out.println("Customer has $" + karen.getCashInHand() + " after purchase");
        System.out.println(betty.printReceipt(shoes.getProductName(), shoes.getProductPrice(), karen.getCashInHand(),
                myShoeStore.getStoreBalance()));

        //Firing cashier betty
        mrManager.fireCashier(betty.getCashierName());
    }
}