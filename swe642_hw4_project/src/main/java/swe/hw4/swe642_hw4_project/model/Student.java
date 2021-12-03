/*
 * Brandon Mack, Qingyang Dai
 * */

package swe.hw4.swe642_hw4_project.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//Creates the table SQL data structure

@Entity
public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Integer sid;
	private String sname;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String telephone;
	private String email;
	private String url;
	private String dos;
	private Integer scode;
	
	public Student() {}
	
	public Student(Integer scode, String name, String address, String city, String state, String zipcode, String telephone, String email, String url, String dos) {
		this.scode = scode;
		this.sname = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.telephone = telephone;
		this.email = email;
		this.url = url;
		this.dos = dos;
	}
	
	public void setStudentCode(Integer code) {
		this.scode = code;
	}
	
	public Integer getStudentCode() {
		return this.scode;
	}

	public Integer getStudentID() {
		return this.sid;
	}

	public void setStudentID(Integer id) {
		this.sid = id;
	}

	public String getName() {
		return this.sname;
	}

	public void setName(String str) {
		this.sname = str;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String str) {
		this.address = str;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String str) {
		this.city = str;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String str) {
		this.state = str;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String str) {
		this.zipcode = str;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String str) {
		this.telephone = str;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String str) {
		this.email = str;
	}

	public String getURL() {
		return this.url;
	}

	public void setURL(String str) {
		this.url = str;
	}

	public String getDOS() {
		return this.dos;
	}

	public void setDOS(String str) {
		this.dos = str;
	}
	
	@Override
	public String toString() {
		return "Student{" +
				"sid=" + sid + '|' +
				"sname=" + sname + '|' +
				"address=" + address + '|' +
				"city=" + city + '|' +
				"state=" + state + '|' +
				"zipcode=" + zipcode + '|' +
				"telephone=" + telephone + '|' +
				"email=" + email + '|' +
				"url=" + url + '|' +
				"dos=" + dos + '|' +
				"scode=" + scode + '|' +
				'}';
	}
}
