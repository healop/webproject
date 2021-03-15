package org.zerock.web;

import java.sql.Connection;
import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//�׽�Ʈ�ڵ� ���� �� �������� �ε��ǵ��� �ϴ� �κ�, location �Ӽ��� xml ������ ���� �ε�
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(
		locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DataSourceTest {
	@Inject // @Inject : �����ڰ� ��ü���� ���ص� ��
	private DataSource ds;
	
	@Test
	public void testConnection()throws Exception{
		try(Connection con = ds.getConnection()){
			System.out.println(con);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
// ������ ���� ���� Ȯ�� �ڵ�