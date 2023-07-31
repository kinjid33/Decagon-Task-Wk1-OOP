package storeapp.person.customer;

public class Customer {
    private String customerName;
    private int cashInHand;

    public Customer(String customerName, int cashInHand) {
        this.customerName = customerName;
        this.cashInHand = cashInHand;
    }


//    public void updateCashInHand(int feesPaid) {
//        cashInHand -= feesPaid;
//    }

    /**pays the provided amount as fees for product bought
     * @param fee the cost of the product*/
    public int payForProduct(int fee){
        if(cashInHand < fee){
            return -1;
        }else {
            cashInHand -= fee;
        }
        return fee;
    }
    /**
     * @return the balance of the customers cash in hand*/
    public int getCashInHand() {
        return cashInHand;
    }
}
