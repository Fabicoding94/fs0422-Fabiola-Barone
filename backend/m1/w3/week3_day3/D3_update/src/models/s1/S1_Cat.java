package models.s1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MyCat")
public class S1_Cat extends S1_Animal {

	@Column(name = "jump_heigth")
	private int jumpHeigth;

	public S1_Cat() {
	}

	public S1_Cat(String _name, int _age, int jump_heigth) {
		super(_name, _age);
		jumpHeigth = jump_heigth;
	}

	public int getJumpHeigth() {
		return jumpHeigth;
	}

	public void setJumpHeigth(int jumpHeigth) {
		this.jumpHeigth = jumpHeigth;
	}

}
