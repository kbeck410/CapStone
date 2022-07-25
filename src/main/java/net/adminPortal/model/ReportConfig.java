package net.adminPortal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_reportconfig")
public class ReportConfig {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long CONFIGID;
	
	@Column(name = "DIMENSIONSTARTCOL")
	private long dimensionsStartCol;
	
	@Column(name = "DIMENSIONSTARTROW")
	private long dimensionsStartRow;
	
	@Column(name = "DIMENSIONLENGTH")
	private long dimensionLength;
	
	@Column(name = "FORMATTYPE")
	private long formatType;
	
	@Column(name = "POSTTITLE")
	private String postTitle;
	
	@Column(name = "CMAPID")
	private long cmapId;
	
	@Column(name = "DIMID")
	private long dimId;
	
	@Column(name = "DIMVALUE")
	private String dimValue;
	
	@Column(name = "CONFIGGROUPID")
	private long configGroupId;
	
	@Column(name = "ADDEDBY")
	private String addedBy;
	
	@Column(name = "MODIFIEDBY")
	private String modifiedBy;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "DELETEDBY")
	private String deletedBy;
	
	@Column(name = "GROUPED")
	private String grouped;
	
	@Column(name = "GROUPORDER")
	private long groupOrder;
	
	@Column(name = "EXCELCOLUMN")
	private String excelColumn;
	
	@Column(name = "EXCELROW")
	private long excelRow;
	
	@Column(name = "DIMREPID")
	private long dimRepId;

	public long getCONFIGID() {
		return CONFIGID;
	}

	public void setCONFIGID(long cONFIGID) {
		CONFIGID = cONFIGID;
	}

	public long getDimensionsStartCol() {
		return dimensionsStartCol;
	}

	public void setDimensionsStartCol(long dimensionsStartCol) {
		this.dimensionsStartCol = dimensionsStartCol;
	}

	public long getDimensionsStartRow() {
		return dimensionsStartRow;
	}

	public void setDimensionsStartRow(long dimensionsStartRow) {
		this.dimensionsStartRow = dimensionsStartRow;
	}

	public long getDimensionLength() {
		return dimensionLength;
	}

	public void setDimensionLength(long dimensionLength) {
		this.dimensionLength = dimensionLength;
	}

	public long getFormatType() {
		return formatType;
	}

	public void setFormatType(long formatType) {
		this.formatType = formatType;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public long getCmapId() {
		return cmapId;
	}

	public void setCmapId(long cmapId) {
		this.cmapId = cmapId;
	}

	public long getDimId() {
		return dimId;
	}

	public void setDimId(long dimId) {
		this.dimId = dimId;
	}

	public String getDimValue() {
		return dimValue;
	}

	public void setDimValue(String dimValue) {
		this.dimValue = dimValue;
	}

	public long getConfigGroupId() {
		return configGroupId;
	}

	public void setConfigGroupId(long configGroupId) {
		this.configGroupId = configGroupId;
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

	public String getGrouped() {
		return grouped;
	}

	public void setGrouped(String grouped) {
		this.grouped = grouped;
	}

	public long getGroupOrder() {
		return groupOrder;
	}

	public void setGroupOrder(long groupOrder) {
		this.groupOrder = groupOrder;
	}

	public String getExcelColumn() {
		return excelColumn;
	}

	public void setExcelColumn(String excelColumn) {
		this.excelColumn = excelColumn;
	}

	public long getExcelRow() {
		return excelRow;
	}

	public void setExcelRow(long excelRow) {
		this.excelRow = excelRow;
	}

	public long getDimRepId() {
		return dimRepId;
	}

	public void setDimRepId(long dimRepId) {
		this.dimRepId = dimRepId;
	}
	
}
