package storeapp.person.staff;

import storeapp.product.Product;

public class Cashier {
    private String cashierName;
    private int cashierId;
    public Cashier(){}

    public Cashier(String cashierName, int cashierId) {
        this.cashierName = cashierName;
        this.cashierId = cashierId;
    }

    public String getCashierName() {
        return cashierName;
    }

    public String printReceipt(String productName, int productPrice, int customerBalance, int storeBal) {
        if(customerBalance < productPrice){
            return "Customer cannot afford product";
        } else {
            return "\n******************** RECEIPT *************************" +
                    "\nProduct: " + productName + "\nPrice: $" + productPrice
                    + "\nCustomer Paid in cash: $" + customerBalance
                    + "\nCustomer's change: $" + (customerBalance - productPrice)
                    + "\nNew Store Balance: $" + storeBal;
        }
    }
}
