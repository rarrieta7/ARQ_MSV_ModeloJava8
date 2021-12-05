package com.ids.fundamentos.fundamentosLiberty;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ids.fundamentos.fundamentosLiberty.bean.MyBean;
import com.ids.fundamentos.fundamentosLiberty.component.ComponentDependency;

@SpringBootApplication
public class FundamentosLibertyApplication implements CommandLineRunner {
	
	private ComponentDependency componentDependency;
	private MyBean myBean;

	// @Autowired
	public FundamentosLibertyApplication(ComponentDependency componentDependency, MyBean myBean){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosLibertyApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
	}
}
