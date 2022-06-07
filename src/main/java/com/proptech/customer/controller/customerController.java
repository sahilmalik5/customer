package com.proptech.customer.controller;
import com.proptech.customer.model.CustomerProfileVO;
import com.proptech.customer.mongoCollection.CustomerProfileDBO;
import com.proptech.customer.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customer")
public class customerController {
    
    @Autowired
    private CustomerService customerService;

    // @RequestMapping(value = "/v1/fetch", method = RequestMethod.GET)
    // public String getCustomer(
    //     @RequestParam String mobileNumber
    // ) throws Exception {
        // CustomerProfileType type = CPMUtil.validateArguments(stringType, callerId);
        // logger.info(String.format("Fetching customer details for %s call by caller ID: %s", type.toString().toLowerCase(), callerId));
        // CustomerProfileVO customerProfile;
        // customerProfile = CPMService.fetchCustomerProfile(callerId, type);
        // logger.debug("Fetched customer profile: " + objectMapper.writeValueAsString(customerProfile));

        // return customerService.fetchCustomer(mobileNumber);
    // }

    @RequestMapping(value = "/v1/createOrUpdate", method = RequestMethod.POST)
    public CustomerProfileDBO createOrUpdateCustomer(
        @RequestBody CustomerProfileVO customerProfileVO  
    ) throws Exception {
        // CustomerProfileType type = CPMUtil.validateArguments(stringType, callerId);
        // logger.info(String.format("Fetching customer details for %s call by caller ID: %s", type.toString().toLowerCase(), callerId));
        // CustomerProfileVO customerProfile;
        // customerProfile = CPMService.fetchCustomerProfile(callerId, type);
        // logger.debug("Fetched customer profile: " + objectMapper.writeValueAsString(customerProfile));

        return customerService.createOrUpdateCustomer(customerProfileVO);
    }
}
