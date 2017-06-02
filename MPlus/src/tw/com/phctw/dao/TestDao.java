package tw.com.phctw.dao;

import java.util.List;

import tw.com.phctw.bean.TestBean;

public interface TestDao {
    
    public int save( TestBean test );
    
    public int update( TestBean test );
    
    public int delete( String pk );
    
    public TestBean findOne( String pk );
    
    public List<TestBean> findAll();
}