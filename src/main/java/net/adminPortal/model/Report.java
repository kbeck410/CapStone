package net.adminPortal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_report")
public class Report {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long REPORTID;
	
	@Column(name = "REPORTNAME")
	private String reportName;
	
	@Column(name = "HISTORYOFMAXDAYS")
	private long histortOfMaxDays;
	
	@Column(name = "NONSPOOLFILE")
	private long nonSpoolFile;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "ABSTRACT")
	private String Abstract;
	
	@Column(name = "EXPIRATIONDAYS")
	private long expirationDays;
	
	@Column(name = "SKIPPAGES")
	private long skipPages;
	
	@Column(name = "UPLOADEDFILENAME")
	private String uploadedFileName;
	
	@Column(name = "CREATIONDATE")
	private Integer creationDate;
	
	@Column(name = "ALLOWPRNT")
	private long allowPrnt;
	
	@Column(name = "ADDEDBY")
	private String addedBy;
	
	@Column(name = "MODIFIEDBY")
	private String modifiedBy;
	
	@Column(name = "AS400ID")
	private long as400Id;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "DELETEDBY")
	private String deletedBy;
	
	@Column(name = "MULTIREPORTS")
	private String multiReports;
	
	@Column(name = "FILENAME")
	private String fileName;
	
	@Column(name = "ALLOWOVERRIDES")
	private long allowOverrides;
	
	@Column(name = "NUMCOLUMNS")
	private long numColumns;
	
	@Column(name = "CONFIDENTIAL")
	private long confidential;
	
	@Column(name = "BIREPORT")
	private String bireport;
	
	@Column(name = "HELPURL")
	private String helpUrl;
	
	@Column(name = "HELP")
	private String help;
	
	@Column(name = "DETAILDESCRIPTION")
	private String detailDescription;
	
	@Column(name = "COMBINE_PDF_REPORT")
	private long combinePdfReport;

	public long getREPORTID() {
		return REPORTID;
	}

	public void setREPORTID(long rEPORTID) {
		REPORTID = rEPORTID;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public long getHistortOfMaxDays() {
		return histortOfMaxDays;
	}

	public void setHistortOfMaxDays(long histortOfMaxDays) {
		this.histortOfMaxDays = histortOfMaxDays;
	}

	public long getNonSpoolFile() {
		return nonSpoolFile;
	}

	public void setNonSpoolFile(long nonSpoolFile) {
		this.nonSpoolFile = nonSpoolFile;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAbstract() {
		return Abstract;
	}

	public void setAbstract(String abstract1) {
		Abstract = abstract1;
	}

	public long getExpirationDays() {
		return expirationDays;
	}

	public void setExpirationDays(long expirationDays) {
		this.expirationDays = expirationDays;
	}

	public long getSkipPages() {
		return skipPages;
	}

	public void setSkipPages(long skipPages) {
		this.skipPages = skipPages;
	}

	public String getUploadedFileName() {
		return uploadedFileName;
	}

	public void setUploadedFileName(String uploadedFileName) {
		this.uploadedFileName = uploadedFileName;
	}

	public Integer getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Integer creationDate) {
		this.creationDate = creationDate;
	}

	public long getAllowPrnt() {
		return allowPrnt;
	}

	public void setAllowPrnt(long allowPrnt) {
		this.allowPrnt = allowPrnt;
	}

	public String getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public long getAs400Id() {
		return as400Id;
	}

	public void setAs400Id(long as400Id) {
		this.as400Id = as400Id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}

	public String getMultiReports() {
		return multiReports;
	}

	public void setMultiReports(String multiReports) {
		this.multiReports = multiReports;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
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

	public long getConfidential() {
		return confidential;
	}

	public void setConfidential(long confidential) {
		this.confidential = confidential;
	}

	public String getBireport() {
		return bireport;
	}

	public void setBireport(String bireport) {
		this.bireport = bireport;
	}

	public String getHelpUrl() {
		return helpUrl;
	}

	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getDetailDescription() {
		return detailDescription;
	}

	public void setDetailDescription(String detailDescription) {
		this.detailDescription = detailDescription;
	}

	public long getCombinePdfReport() {
		return combinePdfReport;
	}

	public void setCombinePdfReport(long combinePdfReport) {
		this.combinePdfReport = combinePdfReport;
	}
		
	
}
