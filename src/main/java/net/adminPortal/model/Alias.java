package net.adminPortal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_alias")
public class Alias {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ALIASID;
	
	@Column(name = "ALIAS")
	private String alias;
	
	@Column(name = "REPORTID")
	private long REPORTID;

	public long getALIASID() {
		return ALIASID;
	}

	public void setALIASID(long aLIASID) {
		ALIASID = aLIASID;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public long getREPORTID() {
		return REPORTID;
	}

	public void setREPORTID(long rEPORTID) {
		REPORTID = rEPORTID;
	}
	
}
