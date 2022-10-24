package models;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "items", discriminatorType = DiscriminatorType.STRING )
public abstract class Items {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long codiceId;
	public long getCodiceId() {
		return codiceId;
	}

	public void setCodiceId(long codiceId) {
		this.codiceId = codiceId;
	}

	public boolean isValidita() {
		return validita;
	}

	public void setValidita(boolean validita) {
		this.validita = validita;
	}

	private boolean validita;
	
	Items(){
		
	}
	
	Items(boolean validita){
		
		this.validita = validita;
	};
	
	
}
