package interfaceAbstractDemo;

import java.rmi.RemoteException;

import Abstract.baseCustomerManager;
import Concrete.neroCustomerManager;
import Concrete.sturbucksCustomerManager;
import Entities.Customer;
import adapters.mernisServiceAdapters;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws RemoteException{
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Yeþim");
		customer.setLastName("Köse");
		customer.setNationalyId("49360683560");
		customer.setDateOfBirthDay(2000);

		baseCustomerManager customerManager = new sturbucksCustomerManager(new mernisServiceAdapters());
		customerManager.save(customer);
	}

}
