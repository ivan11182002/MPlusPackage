package tw.com.phctw.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import tw.com.phctw.bean.TestBean;
import tw.com.phctw.dao.TestDao;
import tw.com.phctw.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {
    
    public static void main (String arg[])
    {
        TestServiceImpl service = new TestServiceImpl();
         System.out.println(service.findAll());
    }
    
    @Resource
    private TestDao testDao;

	public int create(TestBean test) {
		// TODO Auto-generated method stub
		testDao.save(test);
		return 0;
	}

	public TestBean findOne(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TestBean> findAll() {
		// TODO Auto-generated method stub
		return testDao.findAll();
	}

	public int update(TestBean test) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(String isbn) {
		// TODO Auto-generated method stub
		return 0;
	}

    
}
