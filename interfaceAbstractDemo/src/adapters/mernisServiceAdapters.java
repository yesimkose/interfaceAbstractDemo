package adapters;

import tr.gov.nvi.tckimlik.WS.*;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class mernisServiceAdapters implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException{
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		boolean result=client.TCKimlikNoDogrula(
				
				Long.parseLong(customer.getNationalyId()), 
				customer.getFirstName().toUpperCase(), 
				customer.getLastName().toUpperCase(), 
				customer.getDateOfBirthDay()
				
				);
		
		
		return result;
	}

}
