package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "with")
public class WebServiceRequest {
  private String fromName;
  private String toName;
}
