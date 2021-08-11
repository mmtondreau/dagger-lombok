package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebServiceTest {

  private final WebService webService = new WebService();

  @Test
  public void testHandleRequest() {
    WebServiceRequest request = new WebServiceRequest();
    request.setFromName("Bob");
    request.setToName("John");
    assertEquals(webService.handleRequest(request).getStatus(), "success");
  }

}
