package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the account database table.
 * 
 */
@Entity
@NamedQuery(name="Account.findAll", query="SELECT a FROM Account a")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="account_id")
	private int accountId;

	@Column(name="contact_number")
	private String contactNumber;

	private String email;

	private String fname;

	private String lname;

	private String password;

	private String type;

	//bi-directional many-to-many association to Training
	@ManyToMany(mappedBy="accounts1")
	private List<Training> trainings1;

	//bi-directional many-to-many association to Training
	@ManyToMany(mappedBy="accounts2")
	private List<Training> trainings2;

	public Account() {
	}

	public int getAccountId() {
		return this.accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Training> getTrainings1() {
		return this.trainings1;
	}

	public void setTrainings1(List<Training> trainings1) {
		this.trainings1 = trainings1;
	}

	public List<Training> getTrainings2() {
		return this.trainings2;
	}

	public void setTrainings2(List<Training> trainings2) {
		this.trainings2 = trainings2;
	}

}