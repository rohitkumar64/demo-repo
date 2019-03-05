package org.camunda.bpm.getstarted.loanapproval;
import static org.camunda.bpm.getstarted.loanapproval.common.CommonConstants.CAMEL_SERVLET;
import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableProcessApplication
public class WebappExampleProcessApplication {

	public static void main(String... args) {
		SpringApplication.run(WebappExampleProcessApplication.class, args);
	}


	/**
	 * Camel servlet registration.
	 */
	@Bean
	public ServletRegistrationBean camelServletRegistrationBean() {
		ServletRegistrationBean servlet = new ServletRegistrationBean(new CamelHttpTransportServlet(), "/test/*");
		servlet.setName(CAMEL_SERVLET);
		return servlet;
	}

}