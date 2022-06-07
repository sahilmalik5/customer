package com.proptech.customer.service;
import com.proptech.customer.model.CustomerProfileVO;
import com.proptech.customer.mongoCollection.CustomerProfileDBO;

public interface CustomerService {
    CustomerProfileVO fetchCustomer(String mobileNumber);
    CustomerProfileDBO createOrUpdateCustomer(CustomerProfileVO customerProfileVO) throws Exception;
}