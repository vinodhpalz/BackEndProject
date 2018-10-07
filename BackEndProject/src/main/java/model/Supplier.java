package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Supplier")
public class Supplier {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SupplierID")
	private int sId;
	@Column(name="SupplierName")
	private String sName;
	
	public Supplier()
	{
	
	}

	public Supplier(String sName) {
		this.sName = sName;
	}

	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
}






