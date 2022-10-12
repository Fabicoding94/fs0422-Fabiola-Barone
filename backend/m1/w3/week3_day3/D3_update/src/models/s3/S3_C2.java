package models.s3;

import javax.persistence.Entity;

@Entity
public class S3_C2 extends S3_C1 {

	private String f3;

	public S3_C2() {

	}

	public S3_C2(String _f1, String _f2, String _f3) {
		super(_f1, _f2);
		f3 = _f3;
	}

	public String getF3() {
		return f3;
	}

	public void setF3(String f3) {
		this.f3 = f3;
	}

}
