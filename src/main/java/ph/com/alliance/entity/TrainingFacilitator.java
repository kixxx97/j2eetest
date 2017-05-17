package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the training_facilitator database table.
 * 
 */
@Entity
@Table(name="training_facilitator")
@NamedQuery(name="TrainingFacilitator.findAll", query="SELECT t FROM TrainingFacilitator t")
public class TrainingFacilitator implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TrainingFacilitatorPK id;

	public TrainingFacilitator() {
	}

	public TrainingFacilitatorPK getId() {
		return this.id;
	}

	public void setId(TrainingFacilitatorPK id) {
		this.id = id;
	}

}