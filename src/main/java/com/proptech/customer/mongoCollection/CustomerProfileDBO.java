package com.proptech.customer.mongoCollection;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.proptech.customer.enums.Gender;
import com.proptech.customer.enums.OccupationType;
import com.proptech.customer.model.AddressVo;
import com.proptech.customer.model.CustomerKYCVo;

import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@Document(collection = "customer")
@Data
// @CompoundIndex(def = "{'customerPhoneNumber' : 1, 'customerWorkEmail' : 1}")
public class CustomerProfileDBO {
    @Id
    private String id;

    private String salutation;

    private String firstName;

    private String middleName;

    private String lastName;

    private Date dob;

    private String email;

    private Long primaryNumber;
    private Long alternateNumber;

    private String fatherFirstName;
    private String fatherLastName;
    private String motherFirstName;
    private String motherLastName;

    private Set<CustomerKYCVo> customerKYCs = new HashSet<CustomerKYCVo>();

    private Set<AddressVo> address = new HashSet<AddressVo>();

    private String nationality;

    private Gender gender;
    private OccupationType occupation;
    private String marritalStatus;
    private Date anniversary;
    private String profilePicUrl;

    private Date createdOn;

    private Date updatedOn;

    private Boolean status;
    
}


