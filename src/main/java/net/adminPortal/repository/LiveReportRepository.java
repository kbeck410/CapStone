package net.adminPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.adminPortal.model.LiveReport;

public interface LiveReportRepository extends JpaRepository<LiveReport, Long> {

}
