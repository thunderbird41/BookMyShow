package com.example.bookmyshow.controllers;

import com.example.bookmyshow.DTOs.CustomerDTO;
import com.example.bookmyshow.exceptions.InvalidCustomerException;
import com.example.bookmyshow.models.Customer;
import com.example.bookmyshow.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

//import static sun.security.util.KeyUtil.validate;

@RestController
@AllArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    private CustomerService customerService;

    //get customer from id
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id){
        return customerService.getCustomer(id);
    }

    // create customer
    @PostMapping("/customer")
    public Customer createCustomer(@RequestBody CustomerDTO customerDTO){
        validate(customerDTO);
        return customerService.createCustomer(customerDTO);
    }

    private void validate(CustomerDTO customerDTO) {
        if(customerDTO.getEmail() == null){
            throw new InvalidCustomerException();
        }
    }
}
