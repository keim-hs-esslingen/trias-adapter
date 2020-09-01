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

import java.time.ZonedDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.hsesslingen.keim.efs.adapter.trias.jaxb.ZonedDateTimeAdapter;
import eu.datex2.schema._1_0._1_0.SourceTypeEnum;


/**
 * Type for a source ie provider of information.
 * 
 * <p>Java class for SituationSourceStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituationSourceStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/>
 *         &lt;element name="SourceType" type="{http://www.siri.org.uk/siri}SituationSourceTypeEnumeration"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationSourceDetailsGroup"/>
 *         &lt;element name="SourceMethod" type="{http://datex2.eu/schema/1_0/1_0}SourceTypeEnum" minOccurs="0"/>
 *         &lt;element name="AgentReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element name="SourceRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeOfCommunication" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExternalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceFile" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationSourceStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "country",
    "sourceType",
    "email",
    "phone",
    "fax",
    "web",
    "other",
    "sourceMethod",
    "agentReference",
    "name",
    "sourceRole",
    "timeOfCommunication",
    "externalCode",
    "sourceFile"
})
public class SituationSourceStructure {

    @XmlElement(name = "Country", namespace = "http://www.siri.org.uk/siri")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String country;
    @XmlElement(name = "SourceType", namespace = "http://www.siri.org.uk/siri", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected SituationSourceTypeEnumeration sourceType;
    @XmlElement(name = "Email", namespace = "http://www.siri.org.uk/siri")
    protected String email;
    @XmlElement(name = "Phone", namespace = "http://www.siri.org.uk/siri")
    protected String phone;
    @XmlElement(name = "Fax", namespace = "http://www.siri.org.uk/siri")
    protected String fax;
    @XmlElement(name = "Web", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "anyURI")
    protected String web;
    @XmlElement(name = "Other", namespace = "http://www.siri.org.uk/siri")
    protected String other;
    @XmlElement(name = "SourceMethod", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "string")
    protected SourceTypeEnum sourceMethod;
    @XmlElement(name = "AgentReference", namespace = "http://www.siri.org.uk/siri")
    protected String agentReference;
    @XmlElement(name = "Name", namespace = "http://www.siri.org.uk/siri")
    protected NaturalLanguageStringStructure name;
    @XmlElement(name = "SourceRole", namespace = "http://www.siri.org.uk/siri")
    protected String sourceRole;
    @XmlElement(name = "TimeOfCommunication", namespace = "http://www.siri.org.uk/siri", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime timeOfCommunication;
    @XmlElement(name = "ExternalCode", namespace = "http://www.siri.org.uk/siri")
    protected String externalCode;
    @XmlElement(name = "SourceFile", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "anyURI")
    protected String sourceFile;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link SituationSourceTypeEnumeration }
     *     
     */
    public SituationSourceTypeEnumeration getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationSourceTypeEnumeration }
     *     
     */
    public void setSourceType(SituationSourceTypeEnumeration value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the web property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeb() {
        return web;
    }

    /**
     * Sets the value of the web property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeb(String value) {
        this.web = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
        this.other = value;
    }

    /**
     * Gets the value of the sourceMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SourceTypeEnum }
     *     
     */
    public SourceTypeEnum getSourceMethod() {
        return sourceMethod;
    }

    /**
     * Sets the value of the sourceMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceTypeEnum }
     *     
     */
    public void setSourceMethod(SourceTypeEnum value) {
        this.sourceMethod = value;
    }

    /**
     * Gets the value of the agentReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentReference() {
        return agentReference;
    }

    /**
     * Sets the value of the agentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentReference(String value) {
        this.agentReference = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setName(NaturalLanguageStringStructure value) {
        this.name = value;
    }

    /**
     * Gets the value of the sourceRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceRole() {
        return sourceRole;
    }

    /**
     * Sets the value of the sourceRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceRole(String value) {
        this.sourceRole = value;
    }

    /**
     * Gets the value of the timeOfCommunication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getTimeOfCommunication() {
        return timeOfCommunication;
    }

    /**
     * Sets the value of the timeOfCommunication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOfCommunication(ZonedDateTime value) {
        this.timeOfCommunication = value;
    }

    /**
     * Gets the value of the externalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCode() {
        return externalCode;
    }

    /**
     * Sets the value of the externalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCode(String value) {
        this.externalCode = value;
    }

    /**
     * Gets the value of the sourceFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceFile() {
        return sourceFile;
    }

    /**
     * Sets the value of the sourceFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceFile(String value) {
        this.sourceFile = value;
    }

}
