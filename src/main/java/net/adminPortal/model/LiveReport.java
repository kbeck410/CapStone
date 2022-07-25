package net.adminPortal.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_rootdoc")
public class LiveReport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long RDOCID;
	
	@Column(name = "RDOCODATE")
	private Date rdocoDate;
	
	@Column(name = "RDOCEDATE")
	private Date rdoceDate;
	
	@Column(name = "RDOCTITLE")
	private String rdocTitle;
	
	@Column(name = "RDOCABSTRACT")
	private String rdocAbstract;
	
	@Column(name = "DATID")
	private long datId;
	
	@Column(name = "RDOCSSO")
	private String rdocSso;
	
	@Column(name = "RDOCDESC")
	private String rdocDesc;
	
	@Column(name = "RDOCRTIME")
	private String rdocrTime;
	
	@Column(name = "DOCTID")
	private Long doctId;
	
	@Column(name = "RDALLOWPRNT")
	private long rdAllowPrnt;
	
	@Column(name = "PDATE")
	private Date pDate;
	
	@Column(name = "ALLOWOVERRIDES")
	private long allowOverrides;
	
	@Column(name = "NUMCOLUMNS")
	private long numColumns;

	public long getRDOCID() {
		return RDOCID;
	}

	public void setRDOCID(long rDOCID) {
		RDOCID = rDOCID;
	}

	public Date getRdocoDate() {
		return rdocoDate;
	}

	public void setRdocoDate(Date rdocoDate) {
		this.rdocoDate = rdocoDate;
	}

	public Date getRdoceDate() {
		return rdoceDate;
	}

	public void setRdoceDate(Date rdoceDate) {
		this.rdoceDate = rdoceDate;
	}

	public String getRdocTitle() {
		return rdocTitle;
	}

	public void setRdocTitle(String rdocTitle) {
		this.rdocTitle = rdocTitle;
	}

	public String getRdocAbstract() {
		return rdocAbstract;
	}

	public void setRdocAbstract(String rdocAbstract) {
		this.rdocAbstract = rdocAbstract;
	}

	public long getDatId() {
		return datId;
	}

	public void setDatId(long datId) {
		this.datId = datId;
	}

	public String getRdocSso() {
		return rdocSso;
	}

	public void setRdocSso(String rdocSso) {
		this.rdocSso = rdocSso;
	}

	public String getRdocDesc() {
		return rdocDesc;
	}

	public void setRdocDesc(String rdocDesc) {
		this.rdocDesc = rdocDesc;
	}

	public String getRdocrTime() {
		return rdocrTime;
	}

	public void setRdocrTime(String rdocrTime) {
		this.rdocrTime = rdocrTime;
	}

	public Long getDoctId() {
		return doctId;
	}

	public void setDoctId(Long doctId) {
		this.doctId = doctId;
	}

	public long getRdAllowPrnt() {
		return rdAllowPrnt;
	}

	public void setRdAllowPrnt(long rdAllowPrnt) {
		this.rdAllowPrnt = rdAllowPrnt;
	}

	public Date getpDate() {
		return pDate;
	}

	public void setpDate(Date pDate) {
		this.pDate = pDate;
	}

	public long getAllowOverrides() {
		return allowOverrides;
	}

	public void setAllowOverrides(long allowOverrides) {
		this.allowOverrides = allowOverrides;
	}

	public long getNumColumns() {
		return numColumns;
	}

	public void setNumColumns(long numColumns) {
		this.numColumns = numColumns;
	}
	
}
