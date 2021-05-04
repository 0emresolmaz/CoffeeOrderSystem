import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		Customer customer1 = new Customer();
		customer1.id = 1;
		customer1.DateOfBirth = LocalDate.of(1989, 5, 27);
		customer1.firstName = "Emre";
		customer1.lastName = "Solmaz";
		customer1.nationalityId = "20110008959";

		customerManager.save(customer1);
	}

}
