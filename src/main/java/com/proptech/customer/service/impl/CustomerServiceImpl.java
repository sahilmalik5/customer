package com.proptech.customer.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proptech.customer.service.CustomerService;
import com.proptech.customer.model.CustomerProfileVO;
import com.proptech.customer.mongoCollection.CustomerProfileDBO;
import com.proptech.customer.repo.CustomerProfileDao;
import com.proptech.customer.repo.CustomerProfileRepo;
import com.proptech.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerProfileRepo customerProfileRepo;

    @Override
    public CustomerProfileDBO createOrUpdateCustomer(CustomerProfileVO profile) {
        CustomerProfileDBO customerProfileDBO = new CustomerProfileDBO();
        customerProfileDBO.setFirstName(profile.getFirstName());
        customerProfileDBO.setLastName(profile.getLastName());
        return customerProfileRepo.save(customerProfileDBO);
    }

    @Override
    public CustomerProfileVO fetchCustomer(String mobileNumber) {
        // TODO Auto-generated method stub
        return null;
    }
}