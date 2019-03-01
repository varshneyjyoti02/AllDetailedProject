import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capi.tani.dao.ProductDao;
import com.capi.tani.dao.ProductDaoImpl;
import com.capi.tani.exception.ProductNotFound;
import com.capi.tani.service.ProductService;
import com.capi.tani.service.ProductServiceImpl;

public class TestProd {

	ProductDao pd=new ProductDaoImpl();
	ProductService ps=new ProductServiceImpl(pd);
	@Before
	public void setUp() throws Exception {
	}

	@Test(expected=com.capi.tani.exception.ProductNotFound.class)
	public void test() throws ProductNotFound {
		ps.getProductDetails(10000).getId();
	}
	@Test
	public void test1() throws ProductNotFound {
		ps.getProductDetails(1001).getId();
	}

}
