package org.example;

import lombok.AllArgsConstructor;
import lombok.NonNull;

import javax.inject.Inject;

@AllArgsConstructor(onConstructor = @__(@Inject))
public class WebService {
  @NonNull public final Service service;

  public WebServiceResponse handleRequest(WebServiceRequest webServiceRequest) {
    String result = service.sendHello(webServiceRequest.getToName(), webServiceRequest.getFromName());
    return WebServiceResponse.builder()
        .withStatus(result)
        .build();
  }

}
