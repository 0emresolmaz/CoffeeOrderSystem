package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import MernisReference.OSQKPSPublicSoap;

public class MernisServiceAdapter implements ICustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        boolean result = false;
        OSQKPSPublicSoap client = new OSQKPSPublicSoap();
        try {
            result = client.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId), customer.firstName, customer.lastName, customer.DateOfBirth.getYear());
        } catch (Exception e) {
        }
        return result;
    }
}


