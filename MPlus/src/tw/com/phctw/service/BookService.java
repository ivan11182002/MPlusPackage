package tw.com.phctw.service;

import java.util.List;

import tw.com.phctw.bean.Book;

public interface BookService {
    
    public int create( Book book );
    
    public Book findOne( String isbn );
    
    public List<Book> findAll();
    
    public int update( Book book );
    
    public int delete( String isbn );
}
