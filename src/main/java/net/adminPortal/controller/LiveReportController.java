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
import net.adminPortal.model.LiveReport;
import net.adminPortal.repository.LiveReportRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class LiveReportController {
	@Autowired
	private LiveReportRepository liveReportRepository;
	
	// get all reports
	@GetMapping("/liveReports")
	public List<LiveReport> getAllLiveReports(){
		return liveReportRepository.findAll();
	}		
	
	// create report rest api
	@PostMapping("/liveReports")
	public LiveReport createLiveReport(@RequestBody LiveReport liveReport) {
		return liveReportRepository.save(liveReport);
	}
	
	// get report by id rest api
	@GetMapping("/liveReports/{RDOCID}")
	public ResponseEntity<LiveReport> getReportByLIVEREPORTID(@PathVariable Long RDOCID) {
		LiveReport liveReport = liveReportRepository.findById(RDOCID)
				.orElseThrow(() -> new ResourceNotFoundException("Live Report does not exist with id :" + RDOCID));
		return ResponseEntity.ok(liveReport);
	}
	
	// update report rest api
	
	/*
	 * @PutMapping("/liveReports/{RDOCID}") public ResponseEntity<LiveReport>
	 * updateLiveReport(@PathVariable Long RDOCID, @RequestBody LiveReport
	 * liveReportDetails){ LiveReport liveReport =
	 * liveReportRepository.findById(RDOCID) .orElseThrow(() -> new
	 * ResourceNotFoundException("Report does not exist with id :" + RDOCID));
	 * 
	 * liveReport.setRdocTitle(liveReportDetails.getRdocTitle());
	 * liveReport.setRdocDesc(liveReportDetails.getRdocDesc());
	 * liveReport.setRdocAbstract(liveReportDetails.getRdocAbstract());
	 * 
	 * LiveReport updatedLiveReport = liveReportRepository.save(liveReport); return
	 * ResponseEntity.ok(updatedLiveReport); }
	 */
	
	// delete report rest api
	@DeleteMapping("/liveReports/{RDOCID}")
	public ResponseEntity<Map<String, Boolean>> deleteReport(@PathVariable Long RDOCID){
		LiveReport liveReport = liveReportRepository.findById(RDOCID)
				.orElseThrow(() -> new ResourceNotFoundException("Report does not exist with reportID :" + RDOCID));
		
		liveReportRepository.delete(liveReport);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
