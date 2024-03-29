package org.example;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcessPaymentDelegate implements JavaDelegate {

  private static final Logger LOGGER = LoggerFactory.getLogger(ProcessPaymentDelegate.class);

  @Override
  public void execute(DelegateExecution execution) throws Exception {
    String accountNumber = (String) execution.getVariable("accountNumber");
    Integer amount = (Integer) execution.getVariable("amount");
    LOGGER.info("Processing payment of {} to account {}", amount, accountNumber);
  }

}
