package tw.com.phctw.springMVC;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import tw.com.phctw.service.TestService;

@Controller
public class LoginController {
	
	@Resource
    private TestService testService;

	@RequestMapping( "/login" )
    public ModelAndView showIndexMessage() {
		
		return new ModelAndView( "testPage", "testemg", "this is message from loginController" );
    }
	
}
