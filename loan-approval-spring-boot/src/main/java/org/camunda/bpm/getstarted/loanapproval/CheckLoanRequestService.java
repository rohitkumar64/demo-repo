package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;

public class CheckLoanRequestService implements TaskListener {

	@Override
	public void notify(DelegateTask delegateTask) {
		System.out.println("loan is approved by me.");

	}

}