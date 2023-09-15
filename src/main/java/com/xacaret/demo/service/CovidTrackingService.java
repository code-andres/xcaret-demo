package com.xacaret.demo.service;

import java.util.List;

import com.xacaret.demo.client.CovidTrackingClient;
import com.xacaret.demo.domain.CovidTracking;
import com.xacaret.demo.repos.CovidTrackingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import groovyjarjarantlr4.v4.parse.ANTLRParser.parserRule_return;

@Service
public class CovidTrackingService {

  @Autowired
  private CovidTrackingClient client;

  @Autowired
  private CovidTrackingRepository repository;

  public void syncAll() {
    repository.saveAll(client.request());
  }

  public List<CovidTracking> findAll() {
    return repository.findAll(Sort.by(Direction.DESC, "dateChecked"));
  }

  public CovidTracking findById(long id) {
    return repository.findById(id).orElse(null);
  }

  public void delete(long id) {
    repository.deleteById(id);
  }
  
  public void clear() {
    repository.deleteAll();
  }

}
