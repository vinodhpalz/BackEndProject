package model;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class SupplierDAO {

	private DBConfig db;
	private Session sess;
	public SupplierDAO()
	{
		db = new DBConfig();
	}
	
	public void insertSupplier(Supplier s)
	{
		try
		{
			sess = db.getSess();
			sess.beginTransaction();
			sess.save(s);
			sess.getTransaction().commit();
			
		}catch(Exception ex)
		{
			sess.getTransaction().rollback();
			ex.printStackTrace();
		}
	}
	
	/*public void updateSupplier(Supplier s)
	{
		try
		{
			sess = db.getSess();
			sess.beginTransaction();
			
			CriteriaBuilder builder = sess.getCriteriaBuilder();
			CriteriaUpdate<Supplier> criteria = builder.createCriteriaUpdate(Supplier.class);
			Root<Supplier> root = criteria.from(Supplier.class);
			criteria.set(root.get("product"),s.getProduct().getpId());
			criteria.where(builder.equal(root.get("sId"),s.getsId()));
			sess.createQuery(criteria).executeUpdate();
			sess.getTransaction().commit();
			
		}catch(Exception ex)
		{
			sess.getTransaction().rollback();
			ex.printStackTrace();
		}
	}*/
	
	public List<Supplier> getSuppliers()
	{
		List<Supplier> lp = null;
		try
		{
			sess = db.getSess();
			sess.beginTransaction();
			lp = sess.createQuery("FROM Supplier", Supplier.class).getResultList();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return lp;
	}	
}










