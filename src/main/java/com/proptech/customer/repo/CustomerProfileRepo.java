package com.proptech.customer.repo;


import com.proptech.customer.mongoCollection.CustomerProfileDBO;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerProfileRepo extends MongoRepository<CustomerProfileDBO, String> {
    // List<CustomerCallbackRequestDBO> findByCustomerWorkEmailAndCustomerPhoneNumber(
    //          String customerWorkEmail, String customerPhoneNumber
    // );
}
