package tw.com.phctw.springMVC;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tw.com.phctw.bean.TestBean;
import tw.com.phctw.service.TestService;

@Controller
@RequestMapping("/Test")
public class TestController {
	
	@Resource
    private TestService testService;

	@RequestMapping(value="/test",produces="application/json")
    public @ResponseBody TestBean test() {
		TestBean test = new TestBean();
		test.setIS_SYS_DEFAULT("22222");
		System.out.println(test);
        return test;
    }
    
}
