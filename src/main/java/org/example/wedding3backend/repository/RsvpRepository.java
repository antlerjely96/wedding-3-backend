package org.example.wedding3backend.repository;

import org.example.wedding3backend.entity.RsvpReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RsvpRepository extends JpaRepository<RsvpReport, Long> {
    List<RsvpReport> findByGuestOf(String guestOf);
}
