package in.amey.testRun;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping("/amey")
	public String sayHello(){
		return "Hello world from Spring boot web. Time is ...";
	}

}
