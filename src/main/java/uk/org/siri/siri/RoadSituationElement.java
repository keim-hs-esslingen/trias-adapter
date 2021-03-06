/*
 * MIT License
 * 
 * Copyright (c) 2020 Hochschule Esslingen
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE. 
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package uk.org.siri.siri;

import lombok.ToString;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.datex2.schema._1_0._1_0.InformationStatusEnum;
import eu.datex2.schema._1_0._1_0.ProbabilityOfOccurrenceEnum;
import eu.datex2.schema._1_0._1_0.PublicEventTypeEnum;
import eu.datex2.schema._1_0._1_0.SituationRecord;


/**
 * Type for individual PT situation.
 * 
 * <p>Java class for RoadSituationElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadSituationElementStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}SituationElementStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}RoadSituationBodyGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadSituationElementStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "verification",
    "progress",
    "qualityIndex",
    "reality",
    "likelihood",
    "publication",
    "validityPeriod",
    "repetitions",
    "publicationWindow",
    "unknownReason",
    "miscellaneousReason",
    "personnelReason",
    "equipmentReason",
    "environmentReason",
    "undefinedReason",
    "publicEventReason",
    "reasonName",
    "severity",
    "priority",
    "sensitivity",
    "audience",
    "scopeType",
    "reportType",
    "planned",
    "keywords",
    "secondaryReasons",
    "language",
    "summary",
    "description",
    "detail",
    "advice",
    "internal",
    "images",
    "infoLinks",
    "affects",
    "consequences",
    "publishingActions",
    "situationRecord",
    "extensions"
})
@ToString
public class RoadSituationElement
    extends SituationElement
{

    @XmlElement(name = "Verification", namespace = "http://www.siri.org.uk/siri")
    protected VerificationStatusEnumeration verification;
    @XmlElement(name = "Progress", namespace = "http://www.siri.org.uk/siri", defaultValue = "open")
    @XmlSchemaType(name = "NMTOKEN")
    protected WorkflowStatusEnumeration progress;
    @XmlElement(name = "QualityIndex", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "string")
    protected QualityEnumeration qualityIndex;
    @XmlElement(name = "Reality", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "string")
    protected InformationStatusEnum reality;
    @XmlElement(name = "Likelihood", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "string")
    protected ProbabilityOfOccurrenceEnum likelihood;
    @XmlElement(name = "Publication", namespace = "http://www.siri.org.uk/siri")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected List<String> publication;
    @XmlElement(name = "ValidityPeriod", namespace = "http://www.siri.org.uk/siri", required = true)
    protected List<uk.org.siri.siri.PtSituationElement.ValidityPeriod> validityPeriod;
    @XmlElement(name = "Repetitions", namespace = "http://www.siri.org.uk/siri")
    protected uk.org.siri.siri.PtSituationElement.Repetitions repetitions;
    @XmlElement(name = "PublicationWindow", namespace = "http://www.siri.org.uk/siri")
    protected HalfOpenTimestampRange publicationWindow;
    @XmlElement(name = "UnknownReason", namespace = "http://www.siri.org.uk/siri")
    protected String unknownReason;
    @XmlElement(name = "MiscellaneousReason", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "NMTOKEN")
    protected MiscellaneousReasonEnumeration miscellaneousReason;
    @XmlElement(name = "PersonnelReason", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "NMTOKEN")
    protected PersonnelReasonEnumeration personnelReason;
    @XmlElement(name = "EquipmentReason", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "NMTOKEN")
    protected EquipmentReasonEnumeration equipmentReason;
    @XmlElement(name = "EnvironmentReason", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "NMTOKEN")
    protected EnvironmentReasonEnumeration environmentReason;
    @XmlElement(name = "UndefinedReason", namespace = "http://www.siri.org.uk/siri")
    protected String undefinedReason;
    @XmlElement(name = "PublicEventReason", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "string")
    protected PublicEventTypeEnum publicEventReason;
    @XmlElement(name = "ReasonName", namespace = "http://www.siri.org.uk/siri")
    protected NaturalLanguageString reasonName;
    @XmlElement(name = "Severity", namespace = "http://www.siri.org.uk/siri", defaultValue = "normal")
    @XmlSchemaType(name = "NMTOKEN")
    protected SeverityEnumeration severity;
    @XmlElement(name = "Priority", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger priority;
    @XmlElement(name = "Sensitivity", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "NMTOKEN")
    protected SensitivityEnumeration sensitivity;
    @XmlElement(name = "Audience", namespace = "http://www.siri.org.uk/siri", defaultValue = "public")
    @XmlSchemaType(name = "NMTOKEN")
    protected AudienceEnumeration audience;
    @XmlElement(name = "ScopeType", namespace = "http://www.siri.org.uk/siri")
    protected ScopeTypeEnumeration scopeType;
    @XmlElement(name = "ReportType", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String reportType;
    @XmlElement(name = "Planned", namespace = "http://www.siri.org.uk/siri", defaultValue = "false")
    protected Boolean planned;
    @XmlList
    @XmlElement(name = "Keywords", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> keywords;
    @XmlElement(name = "SecondaryReasons", namespace = "http://www.siri.org.uk/siri")
    protected uk.org.siri.siri.PtSituationElement.SecondaryReasons secondaryReasons;
    @XmlElement(name = "Language", namespace = "http://www.siri.org.uk/siri", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String language;
    @XmlElement(name = "Summary", namespace = "http://www.siri.org.uk/siri")
    protected DefaultedText summary;
    @XmlElement(name = "Description", namespace = "http://www.siri.org.uk/siri")
    protected DefaultedText description;
    @XmlElement(name = "Detail", namespace = "http://www.siri.org.uk/siri")
    protected DefaultedText detail;
    @XmlElement(name = "Advice", namespace = "http://www.siri.org.uk/siri")
    protected DefaultedText advice;
    @XmlElement(name = "Internal", namespace = "http://www.siri.org.uk/siri")
    protected DefaultedText internal;
    @XmlElement(name = "Images", namespace = "http://www.siri.org.uk/siri")
    protected uk.org.siri.siri.PtSituationElement.Images images;
    @XmlElement(name = "InfoLinks", namespace = "http://www.siri.org.uk/siri")
    protected uk.org.siri.siri.PtSituationElement.InfoLinks infoLinks;
    @XmlElement(name = "Affects", namespace = "http://www.siri.org.uk/siri")
    protected AffectsScope affects;
    @XmlElement(name = "Consequences", namespace = "http://www.siri.org.uk/siri")
    protected PtConsequences consequences;
    @XmlElement(name = "PublishingActions", namespace = "http://www.siri.org.uk/siri")
    protected Actions publishingActions;
    @XmlElement(name = "SituationRecord", namespace = "http://www.siri.org.uk/siri")
    protected SituationRecord situationRecord;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected Extensions extensions;

    /**
     * Gets the value of the verification property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationStatusEnumeration }
     *     
     */
    public VerificationStatusEnumeration getVerification() {
        return verification;
    }

    /**
     * Sets the value of the verification property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationStatusEnumeration }
     *     
     */
    public RoadSituationElement setVerification(VerificationStatusEnumeration value) {
        this.verification = value;
        return this;
    }

    /**
     * Gets the value of the progress property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowStatusEnumeration }
     *     
     */
    public WorkflowStatusEnumeration getProgress() {
        return progress;
    }

    /**
     * Sets the value of the progress property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowStatusEnumeration }
     *     
     */
    public RoadSituationElement setProgress(WorkflowStatusEnumeration value) {
        this.progress = value;
        return this;
    }

    /**
     * Gets the value of the qualityIndex property.
     * 
     * @return
     *     possible object is
     *     {@link QualityEnumeration }
     *     
     */
    public QualityEnumeration getQualityIndex() {
        return qualityIndex;
    }

    /**
     * Sets the value of the qualityIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityEnumeration }
     *     
     */
    public RoadSituationElement setQualityIndex(QualityEnumeration value) {
        this.qualityIndex = value;
        return this;
    }

    /**
     * Gets the value of the reality property.
     * 
     * @return
     *     possible object is
     *     {@link InformationStatusEnum }
     *     
     */
    public InformationStatusEnum getReality() {
        return reality;
    }

    /**
     * Sets the value of the reality property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationStatusEnum }
     *     
     */
    public RoadSituationElement setReality(InformationStatusEnum value) {
        this.reality = value;
        return this;
    }

    /**
     * Gets the value of the likelihood property.
     * 
     * @return
     *     possible object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public ProbabilityOfOccurrenceEnum getLikelihood() {
        return likelihood;
    }

    /**
     * Sets the value of the likelihood property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public RoadSituationElement setLikelihood(ProbabilityOfOccurrenceEnum value) {
        this.likelihood = value;
        return this;
    }

    /**
     * Gets the value of the publication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPublication() {
        if (publication == null) {
            publication = new ArrayList<String>();
        }
        return this.publication;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validityPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link uk.org.siri.siri.PtSituationElement.ValidityPeriod }
     * 
     * 
     */
    public List<uk.org.siri.siri.PtSituationElement.ValidityPeriod> getValidityPeriod() {
        if (validityPeriod == null) {
            validityPeriod = new ArrayList<uk.org.siri.siri.PtSituationElement.ValidityPeriod>();
        }
        return this.validityPeriod;
    }

    /**
     * Gets the value of the repetitions property.
     * 
     * @return
     *     possible object is
     *     {@link uk.org.siri.siri.PtSituationElement.Repetitions }
     *     
     */
    public uk.org.siri.siri.PtSituationElement.Repetitions getRepetitions() {
        return repetitions;
    }

    /**
     * Sets the value of the repetitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link uk.org.siri.siri.PtSituationElement.Repetitions }
     *     
     */
    public void setRepetitions(uk.org.siri.siri.PtSituationElement.Repetitions value) {
        this.repetitions = value;
    }

    /**
     * Gets the value of the publicationWindow property.
     * 
     * @return
     *     possible object is
     *     {@link HalfOpenTimestampRange }
     *     
     */
    public HalfOpenTimestampRange getPublicationWindow() {
        return publicationWindow;
    }

    /**
     * Sets the value of the publicationWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfOpenTimestampRange }
     *     
     */
    public RoadSituationElement setPublicationWindow(HalfOpenTimestampRange value) {
        this.publicationWindow = value;
        return this;
    }

    /**
     * Gets the value of the unknownReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnknownReason() {
        return unknownReason;
    }

    /**
     * Sets the value of the unknownReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RoadSituationElement setUnknownReason(String value) {
        this.unknownReason = value;
        return this;
    }

    /**
     * Gets the value of the miscellaneousReason property.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousReasonEnumeration }
     *     
     */
    public MiscellaneousReasonEnumeration getMiscellaneousReason() {
        return miscellaneousReason;
    }

    /**
     * Sets the value of the miscellaneousReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousReasonEnumeration }
     *     
     */
    public RoadSituationElement setMiscellaneousReason(MiscellaneousReasonEnumeration value) {
        this.miscellaneousReason = value;
        return this;
    }

    /**
     * Personnel reason.
     * 
     * @return
     *     possible object is
     *     {@link PersonnelReasonEnumeration }
     *     
     */
    public PersonnelReasonEnumeration getPersonnelReason() {
        return personnelReason;
    }

    /**
     * Sets the value of the personnelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonnelReasonEnumeration }
     *     
     */
    public RoadSituationElement setPersonnelReason(PersonnelReasonEnumeration value) {
        this.personnelReason = value;
        return this;
    }

    /**
     * Gets the value of the equipmentReason property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentReasonEnumeration }
     *     
     */
    public EquipmentReasonEnumeration getEquipmentReason() {
        return equipmentReason;
    }

    /**
     * Sets the value of the equipmentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentReasonEnumeration }
     *     
     */
    public RoadSituationElement setEquipmentReason(EquipmentReasonEnumeration value) {
        this.equipmentReason = value;
        return this;
    }

    /**
     * Environment reason.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentReasonEnumeration }
     *     
     */
    public EnvironmentReasonEnumeration getEnvironmentReason() {
        return environmentReason;
    }

    /**
     * Sets the value of the environmentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentReasonEnumeration }
     *     
     */
    public RoadSituationElement setEnvironmentReason(EnvironmentReasonEnumeration value) {
        this.environmentReason = value;
        return this;
    }

    /**
     * Gets the value of the undefinedReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndefinedReason() {
        return undefinedReason;
    }

    /**
     * Sets the value of the undefinedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RoadSituationElement setUndefinedReason(String value) {
        this.undefinedReason = value;
        return this;
    }

    /**
     * Gets the value of the publicEventReason property.
     * 
     * @return
     *     possible object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public PublicEventTypeEnum getPublicEventReason() {
        return publicEventReason;
    }

    /**
     * Sets the value of the publicEventReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public RoadSituationElement setPublicEventReason(PublicEventTypeEnum value) {
        this.publicEventReason = value;
        return this;
    }

    /**
     * Gets the value of the reasonName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageString }
     *     
     */
    public NaturalLanguageString getReasonName() {
        return reasonName;
    }

    /**
     * Sets the value of the reasonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageString }
     *     
     */
    public RoadSituationElement setReasonName(NaturalLanguageString value) {
        this.reasonName = value;
        return this;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link SeverityEnumeration }
     *     
     */
    public SeverityEnumeration getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityEnumeration }
     *     
     */
    public RoadSituationElement setSeverity(SeverityEnumeration value) {
        this.severity = value;
        return this;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public RoadSituationElement setPriority(BigInteger value) {
        this.priority = value;
        return this;
    }

    /**
     * Gets the value of the sensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link SensitivityEnumeration }
     *     
     */
    public SensitivityEnumeration getSensitivity() {
        return sensitivity;
    }

    /**
     * Sets the value of the sensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensitivityEnumeration }
     *     
     */
    public RoadSituationElement setSensitivity(SensitivityEnumeration value) {
        this.sensitivity = value;
        return this;
    }

    /**
     * Gets the value of the audience property.
     * 
     * @return
     *     possible object is
     *     {@link AudienceEnumeration }
     *     
     */
    public AudienceEnumeration getAudience() {
        return audience;
    }

    /**
     * Sets the value of the audience property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudienceEnumeration }
     *     
     */
    public RoadSituationElement setAudience(AudienceEnumeration value) {
        this.audience = value;
        return this;
    }

    /**
     * Gets the value of the scopeType property.
     * 
     * @return
     *     possible object is
     *     {@link ScopeTypeEnumeration }
     *     
     */
    public ScopeTypeEnumeration getScopeType() {
        return scopeType;
    }

    /**
     * Sets the value of the scopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeTypeEnumeration }
     *     
     */
    public RoadSituationElement setScopeType(ScopeTypeEnumeration value) {
        this.scopeType = value;
        return this;
    }

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RoadSituationElement setReportType(String value) {
        this.reportType = value;
        return this;
    }

    /**
     * Gets the value of the planned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlanned() {
        return planned;
    }

    /**
     * Sets the value of the planned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RoadSituationElement setPlanned(Boolean value) {
        this.planned = value;
        return this;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<String>();
        }
        return this.keywords;
    }

    /**
     * Gets the value of the secondaryReasons property.
     * 
     * @return
     *     possible object is
     *     {@link uk.org.siri.siri.PtSituationElement.SecondaryReasons }
     *     
     */
    public uk.org.siri.siri.PtSituationElement.SecondaryReasons getSecondaryReasons() {
        return secondaryReasons;
    }

    /**
     * Sets the value of the secondaryReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link uk.org.siri.siri.PtSituationElement.SecondaryReasons }
     *     
     */
    public void setSecondaryReasons(uk.org.siri.siri.PtSituationElement.SecondaryReasons value) {
        this.secondaryReasons = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RoadSituationElement setLanguage(String value) {
        this.language = value;
        return this;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultedText }
     *     
     */
    public DefaultedText getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultedText }
     *     
     */
    public RoadSituationElement setSummary(DefaultedText value) {
        this.summary = value;
        return this;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultedText }
     *     
     */
    public DefaultedText getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultedText }
     *     
     */
    public RoadSituationElement setDescription(DefaultedText value) {
        this.description = value;
        return this;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultedText }
     *     
     */
    public DefaultedText getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultedText }
     *     
     */
    public RoadSituationElement setDetail(DefaultedText value) {
        this.detail = value;
        return this;
    }

    /**
     * Gets the value of the advice property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultedText }
     *     
     */
    public DefaultedText getAdvice() {
        return advice;
    }

    /**
     * Sets the value of the advice property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultedText }
     *     
     */
    public RoadSituationElement setAdvice(DefaultedText value) {
        this.advice = value;
        return this;
    }

    /**
     * Gets the value of the internal property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultedText }
     *     
     */
    public DefaultedText getInternal() {
        return internal;
    }

    /**
     * Sets the value of the internal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultedText }
     *     
     */
    public RoadSituationElement setInternal(DefaultedText value) {
        this.internal = value;
        return this;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link uk.org.siri.siri.PtSituationElement.Images }
     *     
     */
    public uk.org.siri.siri.PtSituationElement.Images getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link uk.org.siri.siri.PtSituationElement.Images }
     *     
     */
    public void setImages(uk.org.siri.siri.PtSituationElement.Images value) {
        this.images = value;
    }

    /**
     * Gets the value of the infoLinks property.
     * 
     * @return
     *     possible object is
     *     {@link uk.org.siri.siri.PtSituationElement.InfoLinks }
     *     
     */
    public uk.org.siri.siri.PtSituationElement.InfoLinks getInfoLinks() {
        return infoLinks;
    }

    /**
     * Sets the value of the infoLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link uk.org.siri.siri.PtSituationElement.InfoLinks }
     *     
     */
    public void setInfoLinks(uk.org.siri.siri.PtSituationElement.InfoLinks value) {
        this.infoLinks = value;
    }

    /**
     * Gets the value of the affects property.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScope }
     *     
     */
    public AffectsScope getAffects() {
        return affects;
    }

    /**
     * Sets the value of the affects property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScope }
     *     
     */
    public RoadSituationElement setAffects(AffectsScope value) {
        this.affects = value;
        return this;
    }

    /**
     * Gets the value of the consequences property.
     * 
     * @return
     *     possible object is
     *     {@link PtConsequences }
     *     
     */
    public PtConsequences getConsequences() {
        return consequences;
    }

    /**
     * Sets the value of the consequences property.
     * 
     * @param value
     *     allowed object is
     *     {@link PtConsequences }
     *     
     */
    public RoadSituationElement setConsequences(PtConsequences value) {
        this.consequences = value;
        return this;
    }

    /**
     * Gets the value of the publishingActions property.
     * 
     * @return
     *     possible object is
     *     {@link Actions }
     *     
     */
    public Actions getPublishingActions() {
        return publishingActions;
    }

    /**
     * Sets the value of the publishingActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Actions }
     *     
     */
    public RoadSituationElement setPublishingActions(Actions value) {
        this.publishingActions = value;
        return this;
    }

    /**
     * Gets the value of the situationRecord property.
     * 
     * @return
     *     possible object is
     *     {@link SituationRecord }
     *     
     */
    public SituationRecord getSituationRecord() {
        return situationRecord;
    }

    /**
     * Sets the value of the situationRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationRecord }
     *     
     */
    public RoadSituationElement setSituationRecord(SituationRecord value) {
        this.situationRecord = value;
        return this;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public RoadSituationElement setExtensions(Extensions value) {
        this.extensions = value;
        return this;
    }

}
