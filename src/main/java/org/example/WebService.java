package org.example;

public class WebService {
  public final Service service;

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
