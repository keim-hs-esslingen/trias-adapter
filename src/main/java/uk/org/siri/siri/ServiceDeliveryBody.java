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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for SIRI Service Delivery type.  
 * 
 * <p>Java class for ServiceDeliveryBody complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDeliveryBodyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ServiceDeliveryBodyGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="srsName" type="{http://www.siri.org.uk/siri}SrsNameType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDeliveryBodyStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "status",
    "errorCondition",
    "moreData",
    "productionTimetableDelivery",
    "estimatedTimetableDelivery",
    "stopTimetableDelivery",
    "stopMonitoringDelivery",
    "vehicleMonitoringDelivery",
    "connectionTimetableDelivery",
    "connectionMonitoringFeederDelivery",
    "connectionMonitoringDistributorDelivery",
    "generalMessageDelivery",
    "facilityMonitoringDelivery",
    "situationExchangeDelivery"
})
public class ServiceDeliveryBody {

    @XmlElement(name = "Status", namespace = "http://www.siri.org.uk/siri", defaultValue = "true")
    protected Boolean status;
    @XmlElement(name = "ErrorCondition", namespace = "http://www.siri.org.uk/siri")
    protected uk.org.siri.siri.ServiceDelivery.ErrorCondition errorCondition;
    @XmlElement(name = "MoreData", namespace = "http://www.siri.org.uk/siri", defaultValue = "false")
    protected Boolean moreData;
    @XmlElement(name = "ProductionTimetableDelivery", namespace = "http://www.siri.org.uk/siri")
    protected List<ProductionTimetableDelivery> productionTimetableDelivery;
    @XmlElement(name = "EstimatedTimetableDelivery", namespace = "http://www.siri.org.uk/siri")
    protected List<EstimatedTimetableDelivery> estimatedTimetableDelivery;
    @XmlElement(name = "StopTimetableDelivery", namespace = "http://www.siri.org.uk/siri")
    protected List<StopTimetableDelivery> stopTimetableDelivery;
    @XmlElement(name = "StopMonitoringDelivery", namespace = "http://www.siri.org.uk/siri")
    protected List<StopMonitoringDelivery> stopMonitoringDelivery;
    @XmlElement(name = "VehicleMonitoringDelivery", namespace = "http://www.siri.org.uk/siri")
    protected List<VehicleMonitoringDelivery> vehicleMonitoringDelivery;
    @XmlElement(name = "ConnectionTimetableDelivery", namespace = "http://www.siri.org.uk/siri")
    protected List<ConnectionTimetableDelivery> connectionTimetableDelivery;
    @XmlElement(name = "ConnectionMonitoringFeederDelivery", namespace = "http://www.siri.org.uk/siri")
    protected List<ConnectionMonitoringFeederDelivery> connectionMonitoringFeederDelivery;
    @XmlElement(name = "ConnectionMonitoringDistributorDelivery", namespace = "http://www.siri.org.uk/siri")
    protected List<ConnectionMonitoringDistributorDelivery> connectionMonitoringDistributorDelivery;
    @XmlElement(name = "GeneralMessageDelivery", namespace = "http://www.siri.org.uk/siri")
    protected List<GeneralMessageDelivery> generalMessageDelivery;
    @XmlElement(name = "FacilityMonitoringDelivery", namespace = "http://www.siri.org.uk/siri")
    protected List<FacilityMonitoringDelivery> facilityMonitoringDelivery;
    @XmlElement(name = "SituationExchangeDelivery", namespace = "http://www.siri.org.uk/siri")
    protected List<SituationExchangeDelivery> situationExchangeDelivery;
    @XmlAttribute(name = "srsName")
    protected String srsName;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ServiceDeliveryBody setStatus(Boolean value) {
        this.status = value;
        return this;
    }

    /**
     * Gets the value of the errorCondition property.
     * 
     * @return
     *     possible object is
     *     {@link uk.org.siri.siri.ServiceDelivery.ErrorCondition }
     *     
     */
    public uk.org.siri.siri.ServiceDelivery.ErrorCondition getErrorCondition() {
        return errorCondition;
    }

    /**
     * Sets the value of the errorCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link uk.org.siri.siri.ServiceDelivery.ErrorCondition }
     *     
     */
    public void setErrorCondition(uk.org.siri.siri.ServiceDelivery.ErrorCondition value) {
        this.errorCondition = value;
    }

    /**
     * Gets the value of the moreData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreData() {
        return moreData;
    }

    /**
     * Sets the value of the moreData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ServiceDeliveryBody setMoreData(Boolean value) {
        this.moreData = value;
        return this;
    }

    /**
     * Gets the value of the productionTimetableDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionTimetableDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionTimetableDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionTimetableDelivery }
     * 
     * 
     */
    public List<ProductionTimetableDelivery> getProductionTimetableDelivery() {
        if (productionTimetableDelivery == null) {
            productionTimetableDelivery = new ArrayList<ProductionTimetableDelivery>();
        }
        return this.productionTimetableDelivery;
    }

    /**
     * Gets the value of the estimatedTimetableDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedTimetableDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedTimetableDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstimatedTimetableDelivery }
     * 
     * 
     */
    public List<EstimatedTimetableDelivery> getEstimatedTimetableDelivery() {
        if (estimatedTimetableDelivery == null) {
            estimatedTimetableDelivery = new ArrayList<EstimatedTimetableDelivery>();
        }
        return this.estimatedTimetableDelivery;
    }

    /**
     * Gets the value of the stopTimetableDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopTimetableDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopTimetableDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopTimetableDelivery }
     * 
     * 
     */
    public List<StopTimetableDelivery> getStopTimetableDelivery() {
        if (stopTimetableDelivery == null) {
            stopTimetableDelivery = new ArrayList<StopTimetableDelivery>();
        }
        return this.stopTimetableDelivery;
    }

    /**
     * Delviery for Stop Event service.Gets the value of the stopMonitoringDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopMonitoringDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopMonitoringDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopMonitoringDelivery }
     * 
     * 
     */
    public List<StopMonitoringDelivery> getStopMonitoringDelivery() {
        if (stopMonitoringDelivery == null) {
            stopMonitoringDelivery = new ArrayList<StopMonitoringDelivery>();
        }
        return this.stopMonitoringDelivery;
    }

    /**
     * Delviery for Vehicle Activity Service Gets the value of the vehicleMonitoringDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleMonitoringDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleMonitoringDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleMonitoringDelivery }
     * 
     * 
     */
    public List<VehicleMonitoringDelivery> getVehicleMonitoringDelivery() {
        if (vehicleMonitoringDelivery == null) {
            vehicleMonitoringDelivery = new ArrayList<VehicleMonitoringDelivery>();
        }
        return this.vehicleMonitoringDelivery;
    }

    /**
     * Gets the value of the connectionTimetableDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionTimetableDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionTimetableDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionTimetableDelivery }
     * 
     * 
     */
    public List<ConnectionTimetableDelivery> getConnectionTimetableDelivery() {
        if (connectionTimetableDelivery == null) {
            connectionTimetableDelivery = new ArrayList<ConnectionTimetableDelivery>();
        }
        return this.connectionTimetableDelivery;
    }

    /**
     * Delivery for Connection Protection Fetcher Service.Gets the value of the connectionMonitoringFeederDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionMonitoringFeederDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionMonitoringFeederDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionMonitoringFeederDelivery }
     * 
     * 
     */
    public List<ConnectionMonitoringFeederDelivery> getConnectionMonitoringFeederDelivery() {
        if (connectionMonitoringFeederDelivery == null) {
            connectionMonitoringFeederDelivery = new ArrayList<ConnectionMonitoringFeederDelivery>();
        }
        return this.connectionMonitoringFeederDelivery;
    }

    /**
     * Delivery for Connection Protection Fetcher Service.Gets the value of the connectionMonitoringDistributorDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionMonitoringDistributorDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionMonitoringDistributorDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionMonitoringDistributorDelivery }
     * 
     * 
     */
    public List<ConnectionMonitoringDistributorDelivery> getConnectionMonitoringDistributorDelivery() {
        if (connectionMonitoringDistributorDelivery == null) {
            connectionMonitoringDistributorDelivery = new ArrayList<ConnectionMonitoringDistributorDelivery>();
        }
        return this.connectionMonitoringDistributorDelivery;
    }

    /**
     * Delivery for general Message service.Gets the value of the generalMessageDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalMessageDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralMessageDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralMessageDelivery }
     * 
     * 
     */
    public List<GeneralMessageDelivery> getGeneralMessageDelivery() {
        if (generalMessageDelivery == null) {
            generalMessageDelivery = new ArrayList<GeneralMessageDelivery>();
        }
        return this.generalMessageDelivery;
    }

    /**
     * Gets the value of the facilityMonitoringDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityMonitoringDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityMonitoringDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityMonitoringDelivery }
     * 
     * 
     */
    public List<FacilityMonitoringDelivery> getFacilityMonitoringDelivery() {
        if (facilityMonitoringDelivery == null) {
            facilityMonitoringDelivery = new ArrayList<FacilityMonitoringDelivery>();
        }
        return this.facilityMonitoringDelivery;
    }

    /**
     * Gets the value of the situationExchangeDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situationExchangeDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationExchangeDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationExchangeDelivery }
     * 
     * 
     */
    public List<SituationExchangeDelivery> getSituationExchangeDelivery() {
        if (situationExchangeDelivery == null) {
            situationExchangeDelivery = new ArrayList<SituationExchangeDelivery>();
        }
        return this.situationExchangeDelivery;
    }

    /**
     * Gets the value of the srsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Sets the value of the srsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ServiceDeliveryBody setSrsName(String value) {
        this.srsName = value;
        return this;
    }

}