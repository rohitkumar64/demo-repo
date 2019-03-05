package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SendMessageTest implements JavaDelegate {

	public void execute(DelegateExecution delegate) throws Exception {

		System.out.println("emessage sent....");

	}
}
