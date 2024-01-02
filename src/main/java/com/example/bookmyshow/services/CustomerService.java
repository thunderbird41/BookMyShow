package com.example.bookmyshow.services;

import com.example.bookmyshow.DTOs.CustomerDTO;
import com.example.bookmyshow.exceptions.CustomerNotFoundException;
import com.example.bookmyshow.exceptions.EmailAlreadyExistsException;
import com.example.bookmyshow.models.Customer;
import com.example.bookmyshow.models.User;
import com.example.bookmyshow.repository.CustomerRepository;
import com.example.bookmyshow.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor

public class CustomerService {
    private CustomerRepository customerRepository;
    private UserService user;
    public Customer getCustomer(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new CustomerNotFoundException(id));
    }


    public Customer createCustomer(CustomerDTO customerDTO) {
        //check if customer already exists
        String email = customerDTO.getEmail();
        Optional<Customer> existingCustomer = customerRepository.findCustomerByEmail(email);
        if(existingCustomer.isPresent()){
            throw new EmailAlreadyExistsException(email);
        }

        //create a user
        User user1 = user.createUser(customerDTO.getUsername(), customerDTO.getPassword());

        //create a customer
        Customer customer = Customer.builder()
                .city(customerDTO.getCity())
                .phoneNumber(customerDTO.getPhoneNumber())
                .email(customerDTO.getEmail())
                .fullName(customerDTO.getFullName())
                .user(user1)
                .build();

        return customerRepository.save(customer);
    }
}
