package com.proptech.customer.repo.impl;

import javax.management.Query;

import com.proptech.customer.model.CustomerProfileVO;
import com.proptech.customer.repo.CustomerProfileDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;

public class CustomerProfileDaoImpl implements CustomerProfileDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public CustomerProfileVO createOrUpdateCustomer(CustomerProfileVO profile) {
        // Query query = new Query();
        // query.addCriteria(Criteria.where("primaryNumber").is(mobile));
        return mongoTemplate.save(profile);
        // try {
		// 	Query query = new Query(Criteria.where("sessionId").is(sessionId));

		// 	Update update = new Update();
		// 	update.set("channelDetails." + channelId, channelDetailsDoc);
			
		// 	FindAndModifyOptions options = new FindAndModifyOptions();
		// 	options.returnNew(true);
		// 	log.debug(query.toString());
		// 	long start = System.currentTimeMillis();

		// 	log.info("sending add channel details , sessionId = "+sessionId);
		// 	SessionDetailsDoc sessionDetailsDoc = mongoTemplate.findAndModify(query, update, options,
		// 			SessionDetailsDoc.class);
		// 	long end = System.currentTimeMillis();		
		// 	log.info("time taken in add channel details = "+(end-start) + " , sessionId = "+sessionId);
		// 	return sessionDetailsDoc;
		// } catch (Exception e) {
		// 	log.error("error occured while adding channel details for session id :" + sessionId
		// 			+ " channelId : " + channelId + " channel details : "
		// 			+ mapper.writeValueAsString(channelDetailsDoc), e);
		// 	throw new AirtelException("error occured while adding channel details",
		// 			CallControlManagerError.REPOSITORY_OPERATION_ERROR, ResourceLayer.DAO);
		// }
    }
    
}
