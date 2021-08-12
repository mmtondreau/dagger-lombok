package org.example;

import javax.inject.Inject;

public class WebService {
  public final Service service;

  @Inject
  public WebService(Service service) {
    this.service = service;
  }

  public WebServiceResponse handleRequest(WebServiceRequest webServiceRequest) {
    WebServiceResponse response = new WebServiceResponse();
    String result = service.sendHello(webServiceRequest.getToName(), webServiceRequest.getFromName());
    response.setStatus(result);
    return response;
  }

}
