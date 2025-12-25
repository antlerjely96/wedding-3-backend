package org.example.wedding3backend.repository;

import org.example.wedding3backend.entity.RsvpReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RsvpRepository extends JpaRepository<RsvpReport, Long> {

}
