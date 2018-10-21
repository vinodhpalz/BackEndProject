package model;
import java.util.List;

import org.hibernate.Session;

public class ProductDAO {

	private DBConfig db;
	private Session sess;
	public ProductDAO()
	{
		db = new DBConfig();
	}
	
	public boolean insertProduct(Product p)
	{
		boolean b = true;
		try
		{
			sess = db.getSess();
			sess.beginTransaction();
			sess.save(p);
			sess.getTransaction().commit();
			
		}catch(Exception ex)
		{
			b = false;
			sess.getTransaction().rollback();
			ex.printStackTrace();
		}
		return b;
	}
	
	public List<Product> getProducts()
	{
		List<Product> lp = null;
		try
		{
			sess = db.getSess();
			sess.beginTransaction();
			lp = sess.createQuery("FROM Product", Product.class).getResultList();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return lp;
	}
	
}










