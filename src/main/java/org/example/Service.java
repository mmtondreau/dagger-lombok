package org.example;

public class Service {
  private final DBClient dbClient;

  public Service() {
    dbClient = new DBClient("us-west-1");
  }

  public String sendHello(String toName, String fromName) {
    try {
      dbClient.insert(String.format("Hello %s, my name is %s.", toName, fromName));
      return "success";
    } catch (DBException e) {
      return "failure";
    }
  }
}
