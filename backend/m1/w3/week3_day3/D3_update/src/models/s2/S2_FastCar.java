package models.s2;

import javax.persistence.Entity;

@Entity
public class S2_FastCar extends S2_Car {

	private double speed;

	private double acceleration;

	public S2_FastCar() {
	}

	public S2_FastCar(String _name, String _brand, double _speed, double _acceleration) {
		super(_name, _brand);
		speed = _speed;
		acceleration = _acceleration;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}

}
