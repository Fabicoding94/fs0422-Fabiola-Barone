package models.s3;

import javax.persistence.Entity;

@Entity
public class S3_C3 extends S3_C1 {

	private String f4;

	public S3_C3() {
	}

	public S3_C3(String _f1, String _f2, String _f4) {
		super(_f1, _f2);
		f4 = _f4;
	}

	public String getF4() {
		return f4;
	}

	public void setF4(String f4) {
		this.f4 = f4;
	}

}
