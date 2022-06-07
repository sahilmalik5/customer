package com.proptech.customer.repo;

import com.proptech.customer.model.CustomerProfileVO;


public interface CustomerProfileDao {
    CustomerProfileVO createOrUpdateCustomer(CustomerProfileVO profile);
}
