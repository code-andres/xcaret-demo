package com.xacaret.demo.domain;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "covid_tracking__c")
public class CovidTracking {
  
  @Id
  @GeneratedValue
  private long id;
  private long date;
  private long states;
  private long positive;
  private long negative;
  private long pending;
  private long hospitalizedCurrently;
  private long hospitalizedCumulative;
  private long inIcuCurrently;
  private long inIcuCumulative;
  private long onVentilatorCurrently;
  private long onVentilatorCumulative;
  private Date dateChecked;
  private long death;
  private long hospitalized;
  private long totalTestResults;
  private String lastModified;
  private long recovered;
  private long total;
  private long posNeg;
  private long deathIncrease;
  private long hospitalizedIncrease;
  private long negativeIncrease;
  private long positiveIncrease;
  private long totalTestResultsIncrease;
  private String hash;

  public long getId() {
    return id;
  }
  public void setId(long id) {
    this.id = id;
  }
  public long getDate() {
    return date;
  }
  public void setDate(long date) {
    this.date = date;
  }
  public long getStates() {
    return states;
  }
  public void setStates(long states) {
    this.states = states;
  }
  public long getPositive() {
    return positive;
  }
  public void setPositive(long positive) {
    this.positive = positive;
  }
  public long getNegative() {
    return negative;
  }
  public void setNegative(long negative) {
    this.negative = negative;
  }
  public long getPending() {
    return pending;
  }
  public void setPending(long pending) {
    this.pending = pending;
  }
  public long getHospitalizedCurrently() {
    return hospitalizedCurrently;
  }
  public void setHospitalizedCurrently(long hospitalizedCurrently) {
    this.hospitalizedCurrently = hospitalizedCurrently;
  }
  public long getHospitalizedCumulative() {
    return hospitalizedCumulative;
  }
  public void setHospitalizedCumulative(long hospitalizedCumulative) {
    this.hospitalizedCumulative = hospitalizedCumulative;
  }
  public long getInIcuCurrently() {
    return inIcuCurrently;
  }
  public void setInIcuCurrently(long inIcuCurrently) {
    this.inIcuCurrently = inIcuCurrently;
  }
  public long getInIcuCumulative() {
    return inIcuCumulative;
  }
  public void setInIcuCumulative(long inIcuCumulative) {
    this.inIcuCumulative = inIcuCumulative;
  }
  public long getOnVentilatorCurrently() {
    return onVentilatorCurrently;
  }
  public void setOnVentilatorCurrently(long onVentilatorCurrently) {
    this.onVentilatorCurrently = onVentilatorCurrently;
  }
  public long getOnVentilatorCumulative() {
    return onVentilatorCumulative;
  }
  public void setOnVentilatorCumulative(long onVentilatorCumulative) {
    this.onVentilatorCumulative = onVentilatorCumulative;
  }
  public Date getDateChecked() {
    return dateChecked;
  }
  public void setDateChecked(Date dateChecked) {
    this.dateChecked = dateChecked;
  }
  public long getDeath() {
    return death;
  }
  public void setDeath(long death) {
    this.death = death;
  }
  public long getHospitalized() {
    return hospitalized;
  }
  public void setHospitalized(long hospitalized) {
    this.hospitalized = hospitalized;
  }
  public long getTotalTestResults() {
    return totalTestResults;
  }
  public void setTotalTestResults(long totalTestResults) {
    this.totalTestResults = totalTestResults;
  }
  public String getLastModified() {
    return lastModified;
  }
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }
  public long getRecovered() {
    return recovered;
  }
  public void setRecovered(long recovered) {
    this.recovered = recovered;
  }
  public long getTotal() {
    return total;
  }
  public void setTotal(long total) {
    this.total = total;
  }
  public long getPosNeg() {
    return posNeg;
  }
  public void setPosNeg(long posNeg) {
    this.posNeg = posNeg;
  }
  public long getDeathIncrease() {
    return deathIncrease;
  }
  public void setDeathIncrease(long deathIncrease) {
    this.deathIncrease = deathIncrease;
  }
  public long getHospitalizedIncrease() {
    return hospitalizedIncrease;
  }
  public void setHospitalizedIncrease(long hospitalizedIncrease) {
    this.hospitalizedIncrease = hospitalizedIncrease;
  }
  public long getNegativeIncrease() {
    return negativeIncrease;
  }
  public void setNegativeIncrease(long negativeIncrease) {
    this.negativeIncrease = negativeIncrease;
  }
  public long getPositiveIncrease() {
    return positiveIncrease;
  }
  public void setPositiveIncrease(long positiveIncrease) {
    this.positiveIncrease = positiveIncrease;
  }
  public long getTotalTestResultsIncrease() {
    return totalTestResultsIncrease;
  }
  public void setTotalTestResultsIncrease(long totalTestResultsIncrease) {
    this.totalTestResultsIncrease = totalTestResultsIncrease;
  }
  public String getHash() {
    return hash;
  }
  public void setHash(String hash) {
    this.hash = hash;
  }
  
}
