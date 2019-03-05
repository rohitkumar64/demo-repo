package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartProcessInstanceController {

	@Autowired
	private RuntimeService runtimeService;

	@GetMapping("/startBPM")
	public void processPostDeploy() {
		System.out.println("cockpit..");
		runtimeService.startProcessInstanceByKey("loanApproval");
	}
	
	
	
}
