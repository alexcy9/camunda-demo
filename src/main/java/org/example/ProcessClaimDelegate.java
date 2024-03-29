package org.example;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcessClaimDelegate implements JavaDelegate {

  private static final Logger LOGGER = LoggerFactory.getLogger(ProcessClaimDelegate.class);

  @Override
  public void execute(DelegateExecution execution) throws Exception {
    String name = (String) execution.getVariable("name");
    if (name.equals("Demo")) {
      LOGGER.error("Cannot submit claim as Demo");
      throw new RuntimeException();
    } else {
      LOGGER.info("Allowed to proceed");
    }
  }

}
