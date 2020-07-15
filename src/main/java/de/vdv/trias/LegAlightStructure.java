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


package de.vdv.trias;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the alight situation for a passenger leg.
 * 
 * <p>Java class for LegAlightStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegAlightStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.vdv.de/trias}StopPointGroup"/>
 *         &lt;element name="ServiceArrival" type="{http://www.vdv.de/trias}ServiceCallStructure"/>
 *         &lt;element name="ServiceDeparture" type="{http://www.vdv.de/trias}ServiceCallStructure" minOccurs="0"/>
 *         &lt;element name="MeetsViaRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;group ref="{http://www.vdv.de/trias}StopCallStatusGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegAlightStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "stopPointRef",
    "stopPointName",
    "nameSuffix",
    "plannedBay",
    "estimatedBay",
    "serviceArrival",
    "serviceDeparture",
    "meetsViaRequest",
    "stopSeqNumber",
    "demandStop",
    "unplannedStop",
    "notServicedStop",
    "noBoardingAtStop",
    "noAlightingAtStop"
})
public class LegAlightStructure implements de.hsesslingen.keim.efs.trias.supertypes. ILegEnd {

    @XmlElement(name = "StopPointRef", namespace = "http://www.vdv.de/trias", required = true)
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "StopPointName", namespace = "http://www.vdv.de/trias", required = true)
    protected List<InternationalTextStructure> stopPointName;
    @XmlElement(name = "NameSuffix", namespace = "http://www.vdv.de/trias")
    protected List<InternationalTextStructure> nameSuffix;
    @XmlElement(name = "PlannedBay", namespace = "http://www.vdv.de/trias")
    protected List<InternationalTextStructure> plannedBay;
    @XmlElement(name = "EstimatedBay", namespace = "http://www.vdv.de/trias")
    protected List<InternationalTextStructure> estimatedBay;
    @XmlElement(name = "ServiceArrival", namespace = "http://www.vdv.de/trias", required = true)
    protected ServiceCallStructure serviceArrival;
    @XmlElement(name = "ServiceDeparture", namespace = "http://www.vdv.de/trias")
    protected ServiceCallStructure serviceDeparture;
    @XmlElement(name = "MeetsViaRequest", namespace = "http://www.vdv.de/trias", defaultValue = "false")
    protected Boolean meetsViaRequest;
    @XmlElement(name = "StopSeqNumber", namespace = "http://www.vdv.de/trias")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger stopSeqNumber;
    @XmlElement(name = "DemandStop", namespace = "http://www.vdv.de/trias", defaultValue = "false")
    protected Boolean demandStop;
    @XmlElement(name = "UnplannedStop", namespace = "http://www.vdv.de/trias", defaultValue = "false")
    protected Boolean unplannedStop;
    @XmlElement(name = "NotServicedStop", namespace = "http://www.vdv.de/trias", defaultValue = "false")
    protected Boolean notServicedStop;
    @XmlElement(name = "NoBoardingAtStop", namespace = "http://www.vdv.de/trias", defaultValue = "false")
    protected Boolean noBoardingAtStop;
    @XmlElement(name = "NoAlightingAtStop", namespace = "http://www.vdv.de/trias", defaultValue = "false")
    protected Boolean noAlightingAtStop;

    /**
     * Gets the value of the stopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Sets the value of the stopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStopPointRef(StopPointRefStructure value) {
        this.stopPointRef = value;
    }

    /**
     * Gets the value of the stopPointName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopPointName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopPointName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalTextStructure }
     * 
     * 
     */
    public List<InternationalTextStructure> getStopPointName() {
        if (stopPointName == null) {
            stopPointName = new ArrayList<InternationalTextStructure>();
        }
        return this.stopPointName;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameSuffix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameSuffix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalTextStructure }
     * 
     * 
     */
    public List<InternationalTextStructure> getNameSuffix() {
        if (nameSuffix == null) {
            nameSuffix = new ArrayList<InternationalTextStructure>();
        }
        return this.nameSuffix;
    }

    /**
     * Gets the value of the plannedBay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plannedBay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlannedBay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalTextStructure }
     * 
     * 
     */
    public List<InternationalTextStructure> getPlannedBay() {
        if (plannedBay == null) {
            plannedBay = new ArrayList<InternationalTextStructure>();
        }
        return this.plannedBay;
    }

    /**
     * Gets the value of the estimatedBay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedBay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedBay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalTextStructure }
     * 
     * 
     */
    public List<InternationalTextStructure> getEstimatedBay() {
        if (estimatedBay == null) {
            estimatedBay = new ArrayList<InternationalTextStructure>();
        }
        return this.estimatedBay;
    }

    /**
     * Gets the value of the serviceArrival property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCallStructure }
     *     
     */
    public ServiceCallStructure getServiceArrival() {
        return serviceArrival;
    }

    /**
     * Sets the value of the serviceArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCallStructure }
     *     
     */
    public void setServiceArrival(ServiceCallStructure value) {
        this.serviceArrival = value;
    }

    /**
     * Gets the value of the serviceDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCallStructure }
     *     
     */
    public ServiceCallStructure getServiceDeparture() {
        return serviceDeparture;
    }

    /**
     * Sets the value of the serviceDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCallStructure }
     *     
     */
    public void setServiceDeparture(ServiceCallStructure value) {
        this.serviceDeparture = value;
    }

    /**
     * Gets the value of the meetsViaRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeetsViaRequest() {
        return meetsViaRequest;
    }

    /**
     * Sets the value of the meetsViaRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeetsViaRequest(Boolean value) {
        this.meetsViaRequest = value;
    }

    /**
     * Gets the value of the stopSeqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStopSeqNumber() {
        return stopSeqNumber;
    }

    /**
     * Sets the value of the stopSeqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStopSeqNumber(BigInteger value) {
        this.stopSeqNumber = value;
    }

    /**
     * Gets the value of the demandStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDemandStop() {
        return demandStop;
    }

    /**
     * Sets the value of the demandStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDemandStop(Boolean value) {
        this.demandStop = value;
    }

    /**
     * Gets the value of the unplannedStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnplannedStop() {
        return unplannedStop;
    }

    /**
     * Sets the value of the unplannedStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnplannedStop(Boolean value) {
        this.unplannedStop = value;
    }

    /**
     * Gets the value of the notServicedStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotServicedStop() {
        return notServicedStop;
    }

    /**
     * Sets the value of the notServicedStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotServicedStop(Boolean value) {
        this.notServicedStop = value;
    }

    /**
     * Gets the value of the noBoardingAtStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoBoardingAtStop() {
        return noBoardingAtStop;
    }

    /**
     * Sets the value of the noBoardingAtStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoBoardingAtStop(Boolean value) {
        this.noBoardingAtStop = value;
    }

    /**
     * Gets the value of the noAlightingAtStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoAlightingAtStop() {
        return noAlightingAtStop;
    }

    /**
     * Sets the value of the noAlightingAtStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoAlightingAtStop(Boolean value) {
        this.noAlightingAtStop = value;
    }

}
