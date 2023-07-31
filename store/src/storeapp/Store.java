package storeapp;

import storeapp.person.customer.Customer;
import storeapp.person.staff.Cashier;
import storeapp.person.staff.Manager;
import java.util.*;

public class Store {
    private List<Manager> managers;
    private List<Cashier> cashiers;
    private List<Customer> customers;
    private int storeBalance;
    private int qtyOfProductInStock;
    /**
     * new school object created
     * @param managers list of managers in the store
     * @param cashiers list of cashiers in the store
     * @param customers list of customers in the store*/
    public Store(List<Manager> managers, List<Cashier> cashiers, List<Customer> customers) {
        this.managers = managers;
        this.cashiers = cashiers;
        this.customers = customers;
        storeBalance = 0;
        qtyOfProductInStock = 0; //for now
    }
    /**
     * @return the list of managers in the store*/
    public List<Manager> getManagers() {
        return managers;
    }
    /** ADD manager to store
     * @param manager the manager to be added*/
    public void addManager(Manager manager) {
        managers.add(manager);
    }
    /**
     * @return the list of cashiers in the store*/
    public List<Cashier> getCashiers() {
        return cashiers;
    }
    /**ADD cashier
     * @param cashier the cashier to add*/
    public void addCashier(Cashier cashier) {
        cashiers.add(cashier);
    }
    /**
     * @return the list of customers in the store*/
    public List<Customer> getCustomers() {
        return customers;
    }
    /**ADD customer
     * @param customer the customer to add*/
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    /**
     * @return the money in the store's account*/
    public int getStoreBalance() {
        return storeBalance;
    }
    /**ADDS money earned from customer to the store's account balance
     * @param balance the money added to the store's account balance*/
    public void updateStoreBalance(int balance) {
        storeBalance += balance;
    }
    /**
     * @return the quantity of product in the inventory*/
    public int getQtyOfProductInStock() {
        return qtyOfProductInStock;
    }
    /**update the quantity of product left in stock
     * @param qtyOfProductInStock the qty of product left in stock*/
    public void updateQtyOfProductInStock(int qtyOfProductInStock) {
        this.qtyOfProductInStock -= qtyOfProductInStock;
    }
}
