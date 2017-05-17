package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the training_facilitator database table.
 * 
 */
@Embeddable
public class TrainingFacilitatorPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="training_id", insertable=false, updatable=false)
	private int trainingId;

	@Column(name="account_id", insertable=false, updatable=false)
	private int accountId;

	public TrainingFacilitatorPK() {
	}
	public int getTrainingId() {
		return this.trainingId;
	}
	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}
	public int getAccountId() {
		return this.accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TrainingFacilitatorPK)) {
			return false;
		}
		TrainingFacilitatorPK castOther = (TrainingFacilitatorPK)other;
		return 
			(this.trainingId == castOther.trainingId)
			&& (this.accountId == castOther.accountId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.trainingId;
		hash = hash * prime + this.accountId;
		
		return hash;
	}
}