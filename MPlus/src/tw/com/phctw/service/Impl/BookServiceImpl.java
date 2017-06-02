package tw.com.phctw.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import tw.com.phctw.bean.Book;
import tw.com.phctw.dao.BookDao;
import tw.com.phctw.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {
    
    public static void main (String arg[])
    {
        BookServiceImpl service = new BookServiceImpl();
         System.out.println(service.findAll());
    }
    
    @Resource
    private BookDao bookDao;

    public int create( Book book ) {
        return bookDao.save( book );
    }

    public Book findOne(String isbn) {
        return bookDao.findOne( isbn );
    }

    public List<Book> findAll() {
        return bookDao.findAll();
    }

    public int update( Book book ) {
        return bookDao.update( book );
    }

    public int delete( String isbn ) {
        return bookDao.delete( isbn );
    }
}
