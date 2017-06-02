package tw.com.phctw.springMVC;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tw.com.phctw.bean.Book;
import tw.com.phctw.service.BookService;

@Controller 
public class BookController {
    
    @Resource
    private BookService bookService;
    
    @RequestMapping( "/bookform" )
    public ModelAndView showform() {
        return new ModelAndView( "bookform", "command", new Book() );
    }
    
    @RequestMapping( value="/save",method = RequestMethod.POST )
    public ModelAndView save( @ModelAttribute("book") Book book ) {
        bookService.create( book );
        return new ModelAndView( "redirect:/viewbook" );
    }
    
    @RequestMapping( "/viewbook" )
    public ModelAndView viewbook() {
        List<Book> list = bookService.findAll();
        //List<Book> list = null;
        return new ModelAndView( "viewbook", "list", list );
    }
    
    @RequestMapping(value="/editbook/{isbn}")
    public ModelAndView edit( @PathVariable String isbn ){
        Book book = bookService.findOne( isbn );
        return new ModelAndView( "bookeditform", "command", book );
    }
    
    @RequestMapping( value="/editsave", method = RequestMethod.POST )
    public ModelAndView editsave( @ModelAttribute("book") Book book ){
        bookService.update( book );
        return new ModelAndView( "redirect:/viewbook" );
    }
    
    @RequestMapping( value="/deletebook/{isbn}", method = RequestMethod.GET )
    public ModelAndView delete( @PathVariable String isbn ){
        bookService.delete( isbn );
        return new ModelAndView( "redirect:/viewbook" );
    }
}
