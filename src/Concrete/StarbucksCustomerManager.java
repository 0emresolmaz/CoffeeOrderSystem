package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    ICustomerCheckService _customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        _customerCheckService = customerCheckService;
    }

    public void save(Customer customer) {
        if (_customerCheckService.checkIfRealPerson(customer)) {
            System.out.println(customer.firstName + " saved to DB");
        } else {
            System.out.println("Not a valid person");
        }
    }
}

