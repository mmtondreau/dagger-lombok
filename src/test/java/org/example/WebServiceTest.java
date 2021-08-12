package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

public class WebServiceTest extends MockitoTest {

  @Mock
  private Service service;

  @InjectMocks
  private WebService webService;

  @Test
  public void testHandleRequest() {
    WebServiceRequest request = WebServiceRequest.builder()
        .withFromName("Bob")
        .withToName("John")
        .build();

    when(service.sendHello(eq("John"), eq("Bob"))).thenReturn("success");
    assertEquals(webService.handleRequest(request).getStatus(), "success");
  }

}
