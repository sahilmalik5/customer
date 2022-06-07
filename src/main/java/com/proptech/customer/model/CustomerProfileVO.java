package com.proptech.customer.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.proptech.customer.enums.Gender;
import com.proptech.customer.enums.OccupationType;
import com.proptech.customer.model.CustomerKYCVo;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CustomerProfileVO {

    private Long id;

    private String salutation;

    private String firstName;

    private String middleName;

    private String lastName;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dob;

    private String email;

    private Long primaryNumber;
    private Long alternateNumber;

    private String fatherFirstName;
    private String fatherLastName;

    @JsonProperty("mothersFirstName")

    private String motherFirstName;

    @JsonProperty("mothersLastName")
    private String motherLastName;

    @JsonProperty("customerDetail")

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
