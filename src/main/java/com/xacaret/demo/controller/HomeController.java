package com.xacaret.demo.controller;

import java.util.List;

import com.xacaret.demo.domain.CovidTracking;
import com.xacaret.demo.service.CovidTrackingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

  @Autowired
  private CovidTrackingService service;

  @GetMapping("/")
  public String index(Model model) {
    List<CovidTracking> list = service.findAll();
    model.addAttribute("covid_list", list);
    return "home/index";
  }

  @GetMapping("/sync")
  public String sync() {
    service.syncAll();
    return "redirect:/";
  }

  @DeleteMapping("/")
  public String delete(@RequestParam("id") long id) {
    service.delete(id);
    return "redirect:GET/";
  }

}
