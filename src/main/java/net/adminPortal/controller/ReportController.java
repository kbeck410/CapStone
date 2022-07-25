package net.adminPortal.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.adminPortal.exception.ResourceNotFoundException;
import net.adminPortal.model.Report;
import net.adminPortal.repository.ReportRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class ReportController {
	@Autowired
	private ReportRepository reportRepository;
	
	// get all reports
	@GetMapping("/reports")
	public List<Report> getAllUsers(){
		return reportRepository.findAll();
	}		
	
	// create report rest api
	@PostMapping("/reports")
	public Report createReport(@RequestBody Report report) {
		return reportRepository.save(report);
	}
	
	// get report by id rest api
	@GetMapping("/reports/{REPORTID}")
	public ResponseEntity<Report> getReportByREPORTID(@PathVariable Long REPORTID) {
		Report report = reportRepository.findById(REPORTID)
				.orElseThrow(() -> new ResourceNotFoundException("Report does not exist with id :" + REPORTID));
		return ResponseEntity.ok(report);
	}
	
	// update report rest api
	
	@PutMapping("/reports/{REPORTID}")
	public ResponseEntity<Report> updateReport(@PathVariable Long REPORTID, @RequestBody Report reportDetails){
		Report report = reportRepository.findById(REPORTID)
				.orElseThrow(() -> new ResourceNotFoundException("Report does not exist with username :" + REPORTID));
		
		report.setReportName(reportDetails.getReportName());
		report.setDescription(reportDetails.getDescription());
		report.setTitle(reportDetails.getTitle());
		report.setAbstract(reportDetails.getAbstract());
		report.setStatus(reportDetails.getStatus());
		
		Report updatedReport = reportRepository.save(report);
		return ResponseEntity.ok(updatedReport);
	}
	
	// delete report rest api
	@DeleteMapping("/reports/{REPORTID}")
	public ResponseEntity<Map<String, Boolean>> deleteReport(@PathVariable Long REPORTID){
		Report report = reportRepository.findById(REPORTID)
				.orElseThrow(() -> new ResourceNotFoundException("Report does not exist with reportID :" + REPORTID));
		
		reportRepository.delete(report);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
