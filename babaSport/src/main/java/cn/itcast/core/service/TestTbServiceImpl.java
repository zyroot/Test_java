package cn.itcast.core.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.core.bean.TestTb;
import cn.itcast.core.dao.TestTbDao;


@Service
@Transactional
public class TestTbServiceImpl implements TestTbService{

	@Resource
	private TestTbDao testdao;
	
//	@Transactional(readOnly = true)   查询语句关闭事务
	public void addTestTb(TestTb tb) {
		testdao.addTestTb(tb);
		
//		throw new RuntimeException();
		
	}

}
