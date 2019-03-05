package org.camunda.bpm.getstarted.loanapproval;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import static org.camunda.bpm.getstarted.loanapproval.common.CommonConstants.SERVER_PORT;
import static org.camunda.bpm.getstarted.loanapproval.common.CommonConstants.LOCAL_HOST;
import org.springframework.stereotype.Component;

@Component
public class LoanApprovalRoute extends RouteBuilder {
	@Override
	public void configure() throws Exception {

		/**
		 * Rest end point{ eg: "http://localhost:8080/test/raiseLoanRequest"} configuration to start process instance .
		 */
		restConfiguration().component("servlet").host(LOCAL_HOST).port(SERVER_PORT).bindingMode(RestBindingMode.json);

		rest().get("/raiseLoanRequest").to("direct:raiseLoanRequest");

		// from("direct:hello")
		// .log(LoggingLevel.INFO, "Hello World")
		// .transform().simple("Hello World");
		
		/**
		 * Calling camunda process here.
		 */
		from("direct:raiseLoanRequest").log(LoggingLevel.INFO, "Hello World Camunda instance started")
				.to("class:org.camunda.bpm.getstarted.loanapproval.CamelBootStrap?method=processPostDeploy").transform().simple("Loan approval process instance started!!");


		/**
		 * Other routes
		 */
		from("direct:approveLoan").log(LoggingLevel.INFO, "Hello loan").transform().simple(" World loan approved...");
	}
}