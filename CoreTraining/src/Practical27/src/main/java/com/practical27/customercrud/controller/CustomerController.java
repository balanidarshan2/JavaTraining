package com.practical27.customercrud.controller;

import com.practical27.customercrud.dto.CustomerDTO;
import com.practical27.customercrud.entity.Customer;
import com.practical27.customercrud.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public List<CustomerDTO> getAllCustomers() {
        return customerRepository.findAll()
                .stream()
                .map(item -> {
                    CustomerDTO customerDTO = new CustomerDTO();
                    customerDTO.setId(item.getId());
                    customerDTO.setName(item.getFirstName() +" " + item.getLastName());
                    customerDTO.setAddress(item.getAddress1());
                    customerDTO.setDateOfBirth(item.getDateOfBirth());
                    customerDTO.setGender(item.getGender());
                    customerDTO.setMobile(item.getMobile());
                    return customerDTO;
                })
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable long id) {
        return customerRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerRepository.save(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCustomer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable long id, @RequestBody Customer customerDetails) {
        return customerRepository.findById(id)
                .map(existingCustomer -> {
                    existingCustomer.setFirstName(customerDetails.getFirstName());
                    existingCustomer.setLastName(customerDetails.getLastName());
                    existingCustomer.setDateOfBirth(customerDetails.getDateOfBirth());
                    existingCustomer.setMobile(customerDetails.getMobile());
                    existingCustomer.setAddress1(customerDetails.getAddress1());
                    existingCustomer.setAddress2(customerDetails.getAddress2());
                    existingCustomer.setAge(customerDetails.getAge());
                    existingCustomer.setGender(customerDetails.getGender());
                    existingCustomer.setEmail(customerDetails.getEmail());
                    return ResponseEntity.ok(customerRepository.save(existingCustomer));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable long id) {
        if (!customerRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        customerRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
