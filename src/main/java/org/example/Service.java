package org.example;

import lombok.AllArgsConstructor;
import lombok.NonNull;

import javax.inject.Inject;

@AllArgsConstructor(onConstructor = @__(@Inject))
public class Service {
  @NonNull private final DBClient dbClient;

  public String sendHello(String toName, String fromName) {
    try {
      dbClient.insert(String.format("Hello %s, my name is %s.", toName, fromName));
      return "success";
    } catch (DBException e) {
      return "failure";
    }
  }
}
