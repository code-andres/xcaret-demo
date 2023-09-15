package com.xacaret.demo.repos;

import com.xacaret.demo.domain.CovidTracking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CovidTrackingRepository extends JpaRepository<CovidTracking, Long> {
}
