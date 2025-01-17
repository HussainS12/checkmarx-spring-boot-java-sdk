//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.05.23 at 09:34:45 AM EDT
//


package com.checkmarx.sdk.dto.cx.xml;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for CxXMLResultsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CxXMLResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Query" type="{}QueryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="InitiatorName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ScanId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TeamFullPathOnReportDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DeepLink" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ScanStart" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Preset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ScanTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LinesOfCodeScanned" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FilesScanned" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReportCreationTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Team" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CheckmarxVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ScanComments" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ScanType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SourceOrigin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Visibility" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxXMLResultsType", propOrder = {
    "query"
})
@XmlRootElement(name = "CxXMLResults")
public class CxXMLResultsType {

    @XmlElement(name = "Query")
    protected List<QueryType> query;
    @XmlAttribute(name = "InitiatorName")
    protected String initiatorName;
    @XmlAttribute(name = "Owner")
    protected String owner;
    @XmlAttribute(name = "ScanId")
    protected String scanId;
    @XmlAttribute(name = "ProjectId")
    protected String projectId;
    @XmlAttribute(name = "ProjectName")
    protected String projectName;

    @XmlAttribute(name = "DeepLink")
    protected String deepLink;

    @XmlAttribute(name = "ScanTime")
    protected String scanTime;

    @XmlAttribute(name = "ReportCreationTime")
    protected String reportCreationTime;


    @XmlAttribute(name = "TeamFullPathOnReportDate")
    protected String teamFullPathOnReportDate;

    @XmlAttribute(name = "ScanStart")
    protected String scanStart;
    @XmlAttribute(name = "Preset")
    protected String preset;

    @XmlAttribute(name = "LinesOfCodeScanned")
    protected String linesOfCodeScanned;
    @XmlAttribute(name = "FilesScanned")
    protected String filesScanned;

    @XmlAttribute(name = "Team")
    protected String team;
    @XmlAttribute(name = "CheckmarxVersion")
    protected String checkmarxVersion;
    @XmlAttribute(name = "ScanComments")
    protected String scanComments;
    @XmlAttribute(name = "ScanType")
    protected String scanType;
    @XmlAttribute(name = "SourceOrigin")
    protected String sourceOrigin;
    @XmlAttribute(name = "Visibility")
    protected String visibility;
    @XmlAttribute(name = "ScanCustomFields")
    protected String scanCustomFields;

    /**
     * Gets the value of the query property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the query property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuery().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryType }
     *
     *
     */
    public List<QueryType> getQuery() {
        if (query == null) {
            query = new ArrayList<>();
        }
        return this.query;
    }

    /**
     * Gets the value of the initiatorName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInitiatorName() {
        return initiatorName;
    }

    /**
     * Sets the value of the initiatorName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInitiatorName(String value) {
        this.initiatorName = value;
    }

    /**
     * Gets the value of the owner property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the scanId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getScanId() {
        return scanId;
    }

    /**
     * Sets the value of the scanId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setScanId(String value) {
        this.scanId = value;
    }

    /**
     * Gets the value of the projectId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProjectId(String value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the projectName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the teamFullPathOnReportDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTeamFullPathOnReportDate() {
        return teamFullPathOnReportDate;
    }

    /**
     * Sets the value of the teamFullPathOnReportDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTeamFullPathOnReportDate(String value) {
        this.teamFullPathOnReportDate = value;
    }

    /**
     * Gets the value of the deepLink property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeepLink() {
        return deepLink;
    }

    /**
     * Sets the value of the deepLink property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeepLink(String value) {
        this.deepLink = value;
    }

    /**
     * Gets the value of the scanStart property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getScanStart() {
        return scanStart;
    }

    /**
     * Sets the value of the scanStart property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setScanStart(String value) {
        this.scanStart = value;
    }

    /**
     * Gets the value of the preset property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreset() {
        return preset;
    }

    /**
     * Sets the value of the preset property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreset(String value) {
        this.preset = value;
    }

    /**
     * Gets the value of the scanTime property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getScanTime() {
        return scanTime;
    }

    /**
     * Sets the value of the scanTime property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setScanTime(String value) {
        this.scanTime = value;
    }

    /**
     * Gets the value of the linesOfCodeScanned property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLinesOfCodeScanned() {
        return linesOfCodeScanned;
    }

    /**
     * Sets the value of the linesOfCodeScanned property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLinesOfCodeScanned(String value) {
        this.linesOfCodeScanned = value;
    }

    /**
     * Gets the value of the filesScanned property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFilesScanned() {
        return filesScanned;
    }

    /**
     * Sets the value of the filesScanned property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFilesScanned(String value) {
        this.filesScanned = value;
    }

    /**
     * Gets the value of the reportCreationTime property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportCreationTime() {
        return reportCreationTime;
    }

    /**
     * Sets the value of the reportCreationTime property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportCreationTime(String value) {
        this.reportCreationTime = value;
    }

    /**
     * Gets the value of the team property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTeam() {
        return team;
    }

    /**
     * Sets the value of the team property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTeam(String value) {
        this.team = value;
    }

    /**
     * Gets the value of the checkmarxVersion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCheckmarxVersion() {
        return checkmarxVersion;
    }

    /**
     * Sets the value of the checkmarxVersion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCheckmarxVersion(String value) {
        this.checkmarxVersion = value;
    }

    /**
     * Gets the value of the scanComments property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getScanComments() {
        return scanComments;
    }

    /**
     * Sets the value of the scanComments property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setScanComments(String value) {
        this.scanComments = value;
    }

    /**
     * Gets the value of the scanType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getScanType() {
        return scanType;
    }

    /**
     * Sets the value of the scanType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setScanType(String value) {
        this.scanType = value;
    }

    /**
     * Gets the value of the sourceOrigin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSourceOrigin() {
        return sourceOrigin;
    }

    /**
     * Sets the value of the sourceOrigin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSourceOrigin(String value) {
        this.sourceOrigin = value;
    }

    /**
     * Gets the value of the visibility property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVisibility(String value) {
        this.visibility = value;
    }
    /**
     * Gets the value of the scanCustomFields property.
     *
     * @return
     *     allowed object is
     *     {@link String }
     *
     */
    public String getScanCustomFields() {
        return scanCustomFields;
    }

    /**
     * Sets the value of the scanCustomFields property.
     *
     * @param scanCustomFields
     *     allowed object is
     *     {@link String }
     *
     */
    public void setScanCustomFields(String scanCustomFields) {
        this.scanCustomFields = scanCustomFields;
    }
}
