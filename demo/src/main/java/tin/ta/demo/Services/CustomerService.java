package tin.ta.demo.Services;

import java.util.List;
import org.springframework.stereotype.Service;
import tin.ta.demo.Models.Customer;;
@Service
public interface CustomerService {
	List<Customer> findAllCustomer();
	Customer findCustomerByID(int id);
    void addCustomer(Customer customer);
    void deleteCustomer(int id);
}