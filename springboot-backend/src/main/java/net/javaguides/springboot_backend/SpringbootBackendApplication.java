package net.javaguides.springboot_backend;

import net.javaguides.springboot_backend.model.Employee;
import net.javaguides.springboot_backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;


	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstname("Prashik");
		employee.setLastname("Sabale");
		employee.setEmailID("Sabaleprashik@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee.setFirstname("Shiv");
		employee.setLastname("Patil");
		employee.setEmailID("Shivpatil@gmail.com");
		employeeRepository.save(employee1);


	}
}
