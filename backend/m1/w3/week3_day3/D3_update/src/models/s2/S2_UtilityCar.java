package models.s2;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class S2_UtilityCar extends S2_Car {

	@Column(name = "for_family")
	private boolean forFamily;

	@Column(name = "comfort_level")
	private int comfortLevel;

	public S2_UtilityCar() {
	}

	public S2_UtilityCar(String _name, String _brand, boolean for_family, int comfort_level) {
		super(_name, _brand);
		forFamily = for_family;
		comfortLevel = comfort_level;
	}

	public boolean isForFamily() {
		return forFamily;
	}

	public void setForFamily(boolean forFamily) {
		this.forFamily = forFamily;
	}

	public int getComfortLevel() {
		return comfortLevel;
	}

	public void setComfortLevel(int comfortLevel) {
		this.comfortLevel = comfortLevel;
	}

}
