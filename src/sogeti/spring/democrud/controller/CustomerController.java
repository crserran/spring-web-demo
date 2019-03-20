package sogeti.spring.democrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sogeti.spring.democrud.dao.CustomerDAO;
import sogeti.spring.democrud.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// inject the customer dao
	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("/list")
	public String listCustomers(Model model) {
		
		// get customers from the DAO
		List<Customer> theCustomers = customerDAO.getCustomers();
		
		// add the customers to the model
		model.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}

}
