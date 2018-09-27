package cn.itcast.core.dao;

import java.util.List;

import cn.itcast.core.bean.TestTb;

/**
 * 测试
 * @author Zy
 *
 */
public interface TestTbDao {
	
	public void addTestTb(TestTb tb);

	public List<TestTb> TestTb();
}
