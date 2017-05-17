package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the training database table.
 * 
 */
@Entity
@NamedQuery(name="Training.findAll", query="SELECT t FROM Training t")
public class Training implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="training_id")
	private int trainingId;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	private String name;

	@Lob
	private String objective;

	@Lob
	private String outline;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	//bi-directional many-to-one association to TrainingProgram
	@ManyToOne
	@JoinColumn(name="tp_id")
	private TrainingProgram trainingProgram;

	//bi-directional many-to-many association to Account
	@ManyToMany
	@JoinTable(
		name="training_facilitator"
		, joinColumns={
			@JoinColumn(name="training_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="account_id")
			}
		)
	private List<Account> accounts1;

	//bi-directional many-to-many association to Account
	@ManyToMany
	@JoinTable(
		name="training_participant"
		, joinColumns={
			@JoinColumn(name="training_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="account_id")
			}
		)
	private List<Account> accounts2;

	public Training() {
	}

	public int getTrainingId() {
		return this.trainingId;
	}

	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getObjective() {
		return this.objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public String getOutline() {
		return this.outline;
	}

	public void setOutline(String outline) {
		this.outline = outline;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public TrainingProgram getTrainingProgram() {
		return this.trainingProgram;
	}

	public void setTrainingProgram(TrainingProgram trainingProgram) {
		this.trainingProgram = trainingProgram;
	}

	public List<Account> getAccounts1() {
		return this.accounts1;
	}

	public void setAccounts1(List<Account> accounts1) {
		this.accounts1 = accounts1;
	}

	public List<Account> getAccounts2() {
		return this.accounts2;
	}

	public void setAccounts2(List<Account> accounts2) {
		this.accounts2 = accounts2;
	}

}