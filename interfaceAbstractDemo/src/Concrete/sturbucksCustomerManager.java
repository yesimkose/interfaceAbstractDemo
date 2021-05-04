package Concrete;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Abstract.baseCustomerManager;
import Entities.Customer;


public class sturbucksCustomerManager extends baseCustomerManager{

	private ICustomerCheckService customerCheckService;
	
	public sturbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	
	@Override
	public void save(Customer customer) throws RemoteException {
		if(customerCheckService.checkIfRealPerson(customer)) {
			this.save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
	}

}
