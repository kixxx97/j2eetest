package ph.com.alliance.service;

import java.util.List;

import ph.com.alliance.entity.Account;
//import ph.com.alliance.entity.Anothertable;
import ph.com.alliance.entity.Product;
//import ph.com.alliance.entity.Table;
import ph.com.alliance.entity.User;

/**
 * 
 * 
 */
public interface DBTransactionTestService {
	/**
	 * 
	 * @return
	 */
	public boolean createUser(User pUser);
	
	/**
	 * 
	 */
	public User updateUser(User pUser);
	
	/**
	 * 
	 */
	public void deleteUser(User pUser);
	
	/**
	 * 
	 * @return
	 */
	public User selectUser(User pUser);
	
	/**
	 * 
	 * @return
	 */
	public List<User> selectUsers(String pKey);
	
	/**
	 * 
	 * @return
	 */
	public boolean createProduct(Product pProd);
	
	/**
	 * 
	 */
	public Product updateProduct(Product pProd);
	
	/**
	 * 
	 */
	public void deleteProduct(Product pProd);
	
	/**
	 * 
	 * @return
	 */
	public Product selectProduct(Product pProd);
	
	/**
	 * 
	 * @return
	 */
	public List<User> selectAllUsers();
	
	/**
	 * 
	 * @return
	 */
	public List<Product> selectProducts(String pKey);
	
	/*-------------------- MULTI TABLE TRANSASCTION TESTS -----------------------*/
	public boolean createUserAndProduct(User pUser, Product pProd, boolean pRollbackFlag);
	public boolean createUserAndUpdateProduct(User pUser, Product pProd, boolean pRollbackFlag);
	
	/*--------------FOR ACCOUNTS---------------*/
	
	
	/*public List<Anothertable> showAll();
	
	public boolean createTable(Anothertable t);
	
	public boolean deleteTable(int id);

	public Anothertable updateTable(Anothertable t);
	
	public List<Anothertable> searchByID(int id);
	
	public List<Anothertable> searchByName(String name);
	
	public List<Anothertable> searchByAge(int age);
	
	public List<Anothertable> searchByAge(int age1, int age2);*/
	
}
