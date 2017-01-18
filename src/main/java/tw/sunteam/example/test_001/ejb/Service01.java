package tw.sunteam.example.test_001.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class Service01 {

	public Service01() {
		System.out.println("Service01");
	}

	
	public String test(){
		return "SUCCESS";
	}

	@PostConstruct
	public void init(){
		System.out.println("init");
	}
	
	
	@PreDestroy
	public void destory(){
		System.out.println("destory");
	}
	
}
