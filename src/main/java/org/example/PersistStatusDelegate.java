package org.example;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersistStatusDelegate implements JavaDelegate {

  private static final Logger LOGGER = LoggerFactory.getLogger(PersistStatusDelegate.class);

  @Override
  public void execute(DelegateExecution execution) throws Exception {
    String approvalStatus = (String) execution.getVariable("approvalStatus");
    LOGGER.info("Claim approval status: {}", approvalStatus);
  }

}
