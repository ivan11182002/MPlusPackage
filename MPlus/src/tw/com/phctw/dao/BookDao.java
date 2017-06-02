package tw.com.phctw.dao;

import java.util.List;

import tw.com.phctw.bean.Book;

public interface BookDao {
    
    public int save( Book book );
    
    public int update( Book book );
    
    public int delete( String isbn );
    
    public Book findOne( String isbn );
    
    public List<Book> findAll();
}
