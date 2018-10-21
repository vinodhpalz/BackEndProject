package model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
@Table(name="Supplier")
public class Supplier {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SupplierID")
	private int sId;
	@Column(name="SupplierName")
	@Size(min=3,max=30)
	@Pattern(regexp="[^0-9]*",message="Should not start with number")
	private String sName;
	
	@Future
	private Date date;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	@Column(name="SupplierAddress")
	private String sAddress;

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public Supplier()
	{
	
	}

	public Supplier(String sName, String sAddress) {
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
}






