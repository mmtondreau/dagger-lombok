package org.example;

import javax.inject.Inject;

public class Service {
  private final DBClient dbClient;

  @Inject
  public Service(DBClient dbClient) {
    this.dbClient = dbClient;
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
