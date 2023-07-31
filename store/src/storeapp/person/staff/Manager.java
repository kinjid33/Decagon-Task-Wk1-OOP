package storeapp.person.staff;

import java.util.*;

public class Manager {
    private String managerName;
    private int managerStaffId;
    List<Cashier> potentialCashier = new ArrayList<>();
    List<Cashier> chosenForEmployment = new ArrayList<>();
    private int sizeOfCashierList = 0;
    private int initialSizeOfCashierList = 0;

    /**
     * @param managerName name of the manager. will not change
     * @param managerStaffId id of the manager. will not change once set*/

    public Manager(String managerName, int managerStaffId) {
        this.managerName = managerName;
        this.managerStaffId = managerStaffId;
    }
    public Manager(){}
    public void potentialHire(List<Cashier> potentialCashiers){
        for(Cashier cashier : potentialCashiers){
            potentialCashier.add(cashier);
            sizeOfCashierList++;
        }
        initialSizeOfCashierList = sizeOfCashierList;
    }
    public String hireCashier(String chosen) {
        for(Cashier applicant : potentialCashier){
            if (applicant.getCashierName().equals(chosen)){
                chosenForEmployment.add(applicant);
            }
        }
        if(chosenForEmployment.size() > 0){
            return "Hired";
        }
        else
            return "Not hired";
    }
    public String fireCashier(String toFire) {
        for(Cashier cash : chosenForEmployment){
            if(cash.getCashierName().equals(toFire)){
                System.out.println(cash.getCashierName() + " fired");
                chosenForEmployment.remove(toFire);
                sizeOfCashierList--;
            }
        }
        if(sizeOfCashierList < initialSizeOfCashierList){
            return "fired!";
        }
        else
            return "not fired!";
    }
}
