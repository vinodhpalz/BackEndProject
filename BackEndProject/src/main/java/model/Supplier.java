package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supplier {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sId;
	private String sName;
	private String sAddress;
	
	public Supplier()
	{
		
	}

	public Supplier(String sName, String sAddress) {
		super();
		this.sName = sName;
		this.sAddress = sAddress;
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

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	
	
}
