package Test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.common.SpringJunitTest;
import cn.itcast.core.bean.TestTb;
import cn.itcast.core.dao.TestTbDao;
import cn.itcast.core.service.TestTbService;



public class MyTestTb extends SpringJunitTest{
	
	@Autowired
	private TestTbService ts;
	
	@Autowired
	private TestTbDao td;
	
	@Test
	public void testAdd() throws Exception {
		TestTb testTb = new TestTb();
		testTb.setName("金乐乐"); 
		ts.addTestTb(testTb);
		
//		List<TestTb> testTb2 = td.TestTb();
		
	}
	
}
