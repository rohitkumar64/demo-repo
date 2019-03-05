package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;

public class CamelBootStrap {
	public  final String PROCESS_ID_LOAN_APPROVAL="loanApproval";
	@Autowired
	private RuntimeService runtimeService;

	/**
	 * Starting camunda process here, this method will be called from route.
	 */
	public void processPostDeploy() {
		runtimeService.startProcessInstanceByKey(PROCESS_ID_LOAN_APPROVAL);
	}
	
}