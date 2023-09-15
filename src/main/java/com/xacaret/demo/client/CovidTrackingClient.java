package com.xacaret.demo.client;

import java.util.List;

import com.xacaret.demo.domain.CovidTracking;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CovidTrackingClient {
  
  public static final String COVID_API_URI = "https://api.covidtracking.com/v1/us/daily.json";

  public List<CovidTracking> request() {
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<List<CovidTracking>> responseEntity = restTemplate.exchange(
      COVID_API_URI,
      HttpMethod.GET,
      null,
      new ParameterizedTypeReference<List<CovidTracking>>() {}
    );
    return responseEntity.getBody();
  }

}
