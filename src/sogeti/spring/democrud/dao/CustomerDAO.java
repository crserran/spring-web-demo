package sogeti.spring.democrud.dao;

import java.util.List;

import sogeti.spring.democrud.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();
	
}
