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
import net.adminPortal.model.ReportConfig;
import net.adminPortal.repository.ReportConfigRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class ReportConfigController {
	@Autowired
	private ReportConfigRepository reportConfigRepository;
	
	// get all configurations
	@GetMapping("/reportConfig")
	public List<ReportConfig> getAllReportConfig(){
		return reportConfigRepository.findAll();
	}		
	
	// create configuration rest api
	@PostMapping("/reportConfig")
	public ReportConfig createReportConfig(@RequestBody ReportConfig reportConfig) {
		return reportConfigRepository.save(reportConfig);
	}
	
	// get configuration by id rest api
	@GetMapping("/reportConfig/{CONFIGID}")
	public ResponseEntity<ReportConfig> getReportConfigByConfigID(@PathVariable Long CONFIGID) {
		ReportConfig reportConfig = reportConfigRepository.findById(CONFIGID)
				.orElseThrow(() -> new ResourceNotFoundException("Report Configuration does not exist with configurationID :" + CONFIGID));
		return ResponseEntity.ok(reportConfig);
	}
	
	// update configuration rest api
	
	@PutMapping("/reportConfig/{CONFIGID}")
	public ResponseEntity<ReportConfig> updateReportConfig(@PathVariable Long CONFIGID, @RequestBody ReportConfig reportConfigDetails){
		ReportConfig reportConfig = reportConfigRepository.findById(CONFIGID)
				.orElseThrow(() -> new ResourceNotFoundException("Report Configuration does not exist with configurationID :" + CONFIGID));
		
		reportConfig.setCONFIGID(reportConfigDetails.getCONFIGID());
		
		ReportConfig updatedReportConfig = reportConfigRepository.save(reportConfig);
		return ResponseEntity.ok(updatedReportConfig);
	}
	
	// delete configuration rest api
	@DeleteMapping("/reportConfig/{CONFIGID}")
	public ResponseEntity<Map<String, Boolean>> deleteReportConfig(@PathVariable Long CONFIGID){
		ReportConfig reportConfig = reportConfigRepository.findById(CONFIGID)
				.orElseThrow(() -> new ResourceNotFoundException("Report Configuration does not exist with configurationID :" + CONFIGID));
		
		reportConfigRepository.delete(reportConfig);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
