package design.asd.course.pattern.iterator.assigment.customers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CustomerCollection {
	List<Customer> customers = new ArrayList<Customer>();
	
	public void add(Customer customer) {
		customers.add(customer);
	}
	
	public void print() {
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}

	public Iterator<Customer> ageIterator() {
		return new AgeIterator<>(customers);
	}

	public Iterator<Customer> filterIterator(Predicate<Customer> predicate) {
		return new FilterIterator<>(customers, predicate);
	}

}
