package tw.com.phctw.service;

import java.util.List;

import tw.com.phctw.bean.TestBean;

public interface TestService {
    
    public int create( TestBean test );
    
    public TestBean findOne( String isbn );
    
    public List<TestBean> findAll();
    
    public int update( TestBean test );
    
    public int delete( String isbn );
}
