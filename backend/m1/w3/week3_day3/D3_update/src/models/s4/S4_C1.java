package models.s4;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public abstract class S4_C1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String f1;

	private String f2;

	public S4_C1() {
	}

	public S4_C1(String _f1, String _f2) {
		f1 = _f1;
		f2 = _f2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getF1() {
		return f1;
	}

	public void setF1(String f1) {
		this.f1 = f1;
	}

	public String getF2() {
		return f2;
	}

	public void setF2(String f2) {
		this.f2 = f2;
	}

}