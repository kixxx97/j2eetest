package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the training_participant database table.
 * 
 */
@Entity
@Table(name="training_participant")
@NamedQuery(name="TrainingParticipant.findAll", query="SELECT t FROM TrainingParticipant t")
public class TrainingParticipant implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TrainingParticipantPK id;

	public TrainingParticipant() {
	}

	public TrainingParticipantPK getId() {
		return this.id;
	}

	public void setId(TrainingParticipantPK id) {
		this.id = id;
	}

}