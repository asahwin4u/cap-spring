package org.cap.config;

import org.cap.aspects.EmployeeAspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.cap")
@EnableAspectJAutoProxy
public class JavaConfig {
	
	@Bean
	public EmployeeAspects getEmpAspects(){
		return new EmployeeAspects();
	}

}
