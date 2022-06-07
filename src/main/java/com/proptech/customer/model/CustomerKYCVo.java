package com.proptech.customer.model;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.proptech.customer.enums.KeyType;
import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CustomerKYCVo  {

	public static List<Field> auditFields = new ArrayList<>();

	
	private Long id;
	
	private KeyType keyType;
	
	private String keyValue;
	
	private Date createdOn;
	
	private Date updatedOn;
	
	
	private Boolean status=Boolean.TRUE;

}
