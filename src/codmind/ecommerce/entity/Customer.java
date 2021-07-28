package codmind.ecommerce.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import codmind.ecommerce.entity.enums.CustomerStatus;

@Entity
@Table(name="customers")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="firstName",nullable=false,length=100)
	private String firstName;
	@Column(name="lastName",nullable=false,length=100)
	private String lastName;
	
	@Column(name="birthday",nullable=false)
	private LocalDate birthDay;
	
	@Enumerated(EnumType.STRING)
	@Column(name="status",length=15,nullable=false)
	private CustomerStatus status;
	

	
	
	public LocalDate getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	public CustomerStatus getStatus() {
		return status;
	}
	public void setStatus(CustomerStatus status) {
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
