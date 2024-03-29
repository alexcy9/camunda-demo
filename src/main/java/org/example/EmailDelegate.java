package org.example;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmailDelegate implements JavaDelegate {

  private static final Logger LOGGER = LoggerFactory.getLogger(EmailDelegate.class);

  private int count = 0;

  @Override
  public void execute(DelegateExecution execution) throws Exception {
    if (count++ % 2 == 0) {
      LOGGER.info("Email receipt to finance");
    } else {
      throw new RuntimeException("Cannot send email");
    }
  }

}
