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
import net.adminPortal.model.Alias;
import net.adminPortal.repository.AliasRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class AliasController {
	@Autowired
	private AliasRepository aliasRepository;
	
	// get all aliases
	@GetMapping("/aliases")
	public List<Alias> getAllAliases(){
		return aliasRepository.findAll();
	}		
	
	// create alias rest api
	@PostMapping("/aliases")
	public Alias createAlias(@RequestBody Alias alias) {
		return aliasRepository.save(alias);
	}
	
	// get alias by id rest api
	@GetMapping("/alias/{ALIASID}")
	public ResponseEntity<Alias> getAliasByAliasId(@PathVariable Long ALIASID) {
		Alias alias = aliasRepository.findById(ALIASID)
				.orElseThrow(() -> new ResourceNotFoundException("Report does not exist with aliasID :" + ALIASID));
		return ResponseEntity.ok(alias);
	}
	
	// update alias rest api
	
	@PutMapping("/alias/{ALIASID}")
	public ResponseEntity<Alias> updateAlias(@PathVariable Long ALIASID, @RequestBody Alias aliasDetails){
		Alias alias = aliasRepository.findById(ALIASID)
				.orElseThrow(() -> new ResourceNotFoundException("Report does not exist with aliasID :" + ALIASID));
		
		alias.setAlias(aliasDetails.getAlias());
		
		Alias updatedAlias = aliasRepository.save(alias);
		return ResponseEntity.ok(updatedAlias);
	}
	
	// delete employee rest api
	@DeleteMapping("/alias/{ALIASID}")
	public ResponseEntity<Map<String, Boolean>> deleteAlias(@PathVariable Long ALIASID){
		Alias alias = aliasRepository.findById(ALIASID)
				.orElseThrow(() -> new ResourceNotFoundException("Report does not exist with aliasID :" + ALIASID));
		
		aliasRepository.delete(alias);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
