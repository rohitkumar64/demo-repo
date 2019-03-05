package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckLoanEligibilityService implements JavaDelegate {

	public void execute(DelegateExecution delegate) throws Exception {

		System.out.println("eligible for loan.....");

	}

}