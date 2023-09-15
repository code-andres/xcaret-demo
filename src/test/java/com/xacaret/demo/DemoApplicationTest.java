package com.xacaret.demo;

import java.util.Date;
import java.util.List;

import com.xacaret.demo.domain.CovidTracking;
import com.xacaret.demo.service.CovidTrackingService;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTest {

  @Autowired
  private CovidTrackingService service;

  @Test
  public void CovidTrackingService_syncAll() {
    service.clear();
    List<CovidTracking> list = service.findAll();
    Assertions.assertThat(list).isEmpty();

    service.syncAll();
    list = service.findAll();

    Assertions.assertThat(list).isNotNull();
    Assertions.assertThat(list).isNotEmpty();
  }

  @Test
  public void CovidTrackingService_findAll() {
    List<CovidTracking> list = service.findAll();
    Assertions.assertThat(list).isNotNull();

    Date first = list.get(0).getDateChecked();
    Date second = list.get(1).getDateChecked();

    Assertions.assertThat(first).isAfterOrEqualTo(second);
  }

  @Test
  public void CovidTrackingService_delete() {
    List<CovidTracking> list = service.findAll();
    long id = list.get(0).getId();
    service.delete(id);
    
    CovidTracking covidTracking = service.findById(id);
    Assertions.assertThat(covidTracking).isNull();
  }

}
