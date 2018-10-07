package model;
import java.util.List;

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
	public List<Supplier> getSupplier()throws Exception
	{
		sess = db.getSess();
		sess.beginTransaction();
		return sess.createQuery("FROM Supplier", Supplier.class).getResultList();
	}
}
