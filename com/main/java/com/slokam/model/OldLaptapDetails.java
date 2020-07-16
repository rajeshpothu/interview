package com.slokam.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;


@javax.persistence.Entity
@Table(name="oldlaptapdetails" ,schema = "goodsservice")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class OldLaptapDetails {
	
	
	private static final Long serialVersionUID = 1L;    
	private Integer oldLaptapId;
	@NotBlank(message = "brand name is required")
	private String brandName;
	@NotBlank(message = "generation is required")
	private String generation;
	@NotBlank(message = "serial number is required")
	@Size(min=4,max=45, message="please use 4 to 5 characters") 
	private String serialNumber;
	//@NotBlank(message = "date is required")
	//@JsonFormat(pattern="yyyy-mm-dd")
	private String sellDate;
	
	@Id
	@GeneratedValue//(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public Integer getOldLaptapId() {
		return oldLaptapId;
	}
	public void setOldLaptapId(Integer oldLaptapId) {
		this.oldLaptapId = oldLaptapId;
	}
	@Column(name="brandname")
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	@Column(name="generation")
	public String getGeneration() {
		return generation;
	}
	public void setGeneration(String generation) {
		this.generation = generation;
	}
	@Column(name="serialnumber")
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	@Column(name="selldate")
	public String getSellDate() {
		return sellDate;
	}
	public void setSellDate(String sellDate) {
		this.sellDate = sellDate;
	}
	
	
	
	
	
	

}
