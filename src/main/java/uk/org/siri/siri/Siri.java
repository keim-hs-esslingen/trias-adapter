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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;group ref="{http://www.siri.org.uk/siri}RequestGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ResponseGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="1.4" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceRequest",
    "subscriptionRequest",
    "terminateSubscriptionRequest",
    "dataReadyNotification",
    "dataSupplyRequest",
    "checkStatusRequest",
    "heartbeatNotification",
    "capabilitiesRequest",
    "stopPointsRequest",
    "linesRequest",
    "serviceFeaturesRequest",
    "productCategoriesRequest",
    "vehicleFeaturesRequest",
    "infoChannelRequest",
    "facilityRequest",
    "subscriptionResponse",
    "terminateSubscriptionResponse",
    "dataReadyAcknowledgement",
    "serviceDelivery",
    "dataReceivedAcknowledgement",
    "checkStatusResponse",
    "capabilitiesResponse",
    "stopPointsDelivery",
    "linesDelivery",
    "productCategoriesDelivery",
    "serviceFeaturesDelivery",
    "vehicleFeaturesDelivery",
    "infoChannelDelivery",
    "facilityDelivery",
    "extensions"
})
@XmlRootElement(name = "Siri", namespace = "http://www.siri.org.uk/siri")
public class Siri {

    @XmlElement(name = "ServiceRequest", namespace = "http://www.siri.org.uk/siri")
    protected ServiceRequest serviceRequest;
    @XmlElement(name = "SubscriptionRequest", namespace = "http://www.siri.org.uk/siri")
    protected SubscriptionRequest subscriptionRequest;
    @XmlElement(name = "TerminateSubscriptionRequest", namespace = "http://www.siri.org.uk/siri")
    protected TerminateSubscriptionRequestStructure terminateSubscriptionRequest;
    @XmlElement(name = "DataReadyNotification", namespace = "http://www.siri.org.uk/siri")
    protected DataReadyRequestStructure dataReadyNotification;
    @XmlElement(name = "DataSupplyRequest", namespace = "http://www.siri.org.uk/siri")
    protected DataSupplyRequestStructure dataSupplyRequest;
    @XmlElement(name = "CheckStatusRequest", namespace = "http://www.siri.org.uk/siri")
    protected CheckStatusRequestStructure checkStatusRequest;
    @XmlElement(name = "HeartbeatNotification", namespace = "http://www.siri.org.uk/siri")
    protected HeartbeatNotificationStructure heartbeatNotification;
    @XmlElement(name = "CapabilitiesRequest", namespace = "http://www.siri.org.uk/siri")
    protected CapabilitiesRequestStructure capabilitiesRequest;
    @XmlElement(name = "StopPointsRequest", namespace = "http://www.siri.org.uk/siri")
    protected StopPointsRequest stopPointsRequest;
    @XmlElement(name = "LinesRequest", namespace = "http://www.siri.org.uk/siri")
    protected LinesDiscoveryRequestStructure linesRequest;
    @XmlElement(name = "ServiceFeaturesRequest", namespace = "http://www.siri.org.uk/siri")
    protected ServiceFeaturesDiscoveryRequestStructure serviceFeaturesRequest;
    @XmlElement(name = "ProductCategoriesRequest", namespace = "http://www.siri.org.uk/siri")
    protected ProductCategoriesDiscoveryRequestStructure productCategoriesRequest;
    @XmlElement(name = "VehicleFeaturesRequest", namespace = "http://www.siri.org.uk/siri")
    protected VehicleFeaturesDiscoveryRequestStructure vehicleFeaturesRequest;
    @XmlElement(name = "InfoChannelRequest", namespace = "http://www.siri.org.uk/siri")
    protected InfoChannelDiscoveryRequestStructure infoChannelRequest;
    @XmlElement(name = "FacilityRequest", namespace = "http://www.siri.org.uk/siri")
    protected FacilityRequestStructure facilityRequest;
    @XmlElement(name = "SubscriptionResponse", namespace = "http://www.siri.org.uk/siri")
    protected SubscriptionResponseStructure subscriptionResponse;
    @XmlElement(name = "TerminateSubscriptionResponse", namespace = "http://www.siri.org.uk/siri")
    protected TerminateSubscriptionResponseStructure terminateSubscriptionResponse;
    @XmlElement(name = "DataReadyAcknowledgement", namespace = "http://www.siri.org.uk/siri")
    protected DataReadyResponseStructure dataReadyAcknowledgement;
    @XmlElement(name = "ServiceDelivery", namespace = "http://www.siri.org.uk/siri")
    protected ServiceDelivery serviceDelivery;
    @XmlElement(name = "DataReceivedAcknowledgement", namespace = "http://www.siri.org.uk/siri")
    protected DataReceivedResponseStructure dataReceivedAcknowledgement;
    @XmlElement(name = "CheckStatusResponse", namespace = "http://www.siri.org.uk/siri")
    protected CheckStatusResponseStructure checkStatusResponse;
    @XmlElement(name = "CapabilitiesResponse", namespace = "http://www.siri.org.uk/siri")
    protected CapabilitiesResponseStructure capabilitiesResponse;
    @XmlElement(name = "StopPointsDelivery", namespace = "http://www.siri.org.uk/siri")
    protected StopPointsDeliveryStructure stopPointsDelivery;
    @XmlElement(name = "LinesDelivery", namespace = "http://www.siri.org.uk/siri")
    protected LinesDeliveryStructure linesDelivery;
    @XmlElement(name = "ProductCategoriesDelivery", namespace = "http://www.siri.org.uk/siri")
    protected ProductCategoriesDeliveryStructure productCategoriesDelivery;
    @XmlElement(name = "ServiceFeaturesDelivery", namespace = "http://www.siri.org.uk/siri")
    protected ServiceFeaturesDeliveryStructure serviceFeaturesDelivery;
    @XmlElement(name = "VehicleFeaturesDelivery", namespace = "http://www.siri.org.uk/siri")
    protected VehicleFeaturesDeliveryStructure vehicleFeaturesDelivery;
    @XmlElement(name = "InfoChannelDelivery", namespace = "http://www.siri.org.uk/siri")
    protected InfoChannelDeliveryStructure infoChannelDelivery;
    @XmlElement(name = "FacilityDelivery", namespace = "http://www.siri.org.uk/siri")
    protected FacilityDeliveryStructure facilityDelivery;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String version;

    /**
     * Gets the value of the serviceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRequest }
     *     
     */
    public ServiceRequest getServiceRequest() {
        return serviceRequest;
    }

    /**
     * Sets the value of the serviceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRequest }
     *     
     */
    public void setServiceRequest(ServiceRequest value) {
        this.serviceRequest = value;
    }

    /**
     * Gets the value of the subscriptionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionRequest }
     *     
     */
    public SubscriptionRequest getSubscriptionRequest() {
        return subscriptionRequest;
    }

    /**
     * Sets the value of the subscriptionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionRequest }
     *     
     */
    public void setSubscriptionRequest(SubscriptionRequest value) {
        this.subscriptionRequest = value;
    }

    /**
     * Gets the value of the terminateSubscriptionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TerminateSubscriptionRequestStructure }
     *     
     */
    public TerminateSubscriptionRequestStructure getTerminateSubscriptionRequest() {
        return terminateSubscriptionRequest;
    }

    /**
     * Sets the value of the terminateSubscriptionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminateSubscriptionRequestStructure }
     *     
     */
    public void setTerminateSubscriptionRequest(TerminateSubscriptionRequestStructure value) {
        this.terminateSubscriptionRequest = value;
    }

    /**
     * Gets the value of the dataReadyNotification property.
     * 
     * @return
     *     possible object is
     *     {@link DataReadyRequestStructure }
     *     
     */
    public DataReadyRequestStructure getDataReadyNotification() {
        return dataReadyNotification;
    }

    /**
     * Sets the value of the dataReadyNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataReadyRequestStructure }
     *     
     */
    public void setDataReadyNotification(DataReadyRequestStructure value) {
        this.dataReadyNotification = value;
    }

    /**
     * Gets the value of the dataSupplyRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DataSupplyRequestStructure }
     *     
     */
    public DataSupplyRequestStructure getDataSupplyRequest() {
        return dataSupplyRequest;
    }

    /**
     * Sets the value of the dataSupplyRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSupplyRequestStructure }
     *     
     */
    public void setDataSupplyRequest(DataSupplyRequestStructure value) {
        this.dataSupplyRequest = value;
    }

    /**
     * Gets the value of the checkStatusRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CheckStatusRequestStructure }
     *     
     */
    public CheckStatusRequestStructure getCheckStatusRequest() {
        return checkStatusRequest;
    }

    /**
     * Sets the value of the checkStatusRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckStatusRequestStructure }
     *     
     */
    public void setCheckStatusRequest(CheckStatusRequestStructure value) {
        this.checkStatusRequest = value;
    }

    /**
     * Gets the value of the heartbeatNotification property.
     * 
     * @return
     *     possible object is
     *     {@link HeartbeatNotificationStructure }
     *     
     */
    public HeartbeatNotificationStructure getHeartbeatNotification() {
        return heartbeatNotification;
    }

    /**
     * Sets the value of the heartbeatNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartbeatNotificationStructure }
     *     
     */
    public void setHeartbeatNotification(HeartbeatNotificationStructure value) {
        this.heartbeatNotification = value;
    }

    /**
     * Gets the value of the capabilitiesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilitiesRequestStructure }
     *     
     */
    public CapabilitiesRequestStructure getCapabilitiesRequest() {
        return capabilitiesRequest;
    }

    /**
     * Sets the value of the capabilitiesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitiesRequestStructure }
     *     
     */
    public void setCapabilitiesRequest(CapabilitiesRequestStructure value) {
        this.capabilitiesRequest = value;
    }

    /**
     * Gets the value of the stopPointsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointsRequest }
     *     
     */
    public StopPointsRequest getStopPointsRequest() {
        return stopPointsRequest;
    }

    /**
     * Sets the value of the stopPointsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointsRequest }
     *     
     */
    public void setStopPointsRequest(StopPointsRequest value) {
        this.stopPointsRequest = value;
    }

    /**
     * Gets the value of the linesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LinesDiscoveryRequestStructure }
     *     
     */
    public LinesDiscoveryRequestStructure getLinesRequest() {
        return linesRequest;
    }

    /**
     * Sets the value of the linesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinesDiscoveryRequestStructure }
     *     
     */
    public void setLinesRequest(LinesDiscoveryRequestStructure value) {
        this.linesRequest = value;
    }

    /**
     * Gets the value of the serviceFeaturesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeaturesDiscoveryRequestStructure }
     *     
     */
    public ServiceFeaturesDiscoveryRequestStructure getServiceFeaturesRequest() {
        return serviceFeaturesRequest;
    }

    /**
     * Sets the value of the serviceFeaturesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeaturesDiscoveryRequestStructure }
     *     
     */
    public void setServiceFeaturesRequest(ServiceFeaturesDiscoveryRequestStructure value) {
        this.serviceFeaturesRequest = value;
    }

    /**
     * Gets the value of the productCategoriesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategoriesDiscoveryRequestStructure }
     *     
     */
    public ProductCategoriesDiscoveryRequestStructure getProductCategoriesRequest() {
        return productCategoriesRequest;
    }

    /**
     * Sets the value of the productCategoriesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategoriesDiscoveryRequestStructure }
     *     
     */
    public void setProductCategoriesRequest(ProductCategoriesDiscoveryRequestStructure value) {
        this.productCategoriesRequest = value;
    }

    /**
     * Gets the value of the vehicleFeaturesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleFeaturesDiscoveryRequestStructure }
     *     
     */
    public VehicleFeaturesDiscoveryRequestStructure getVehicleFeaturesRequest() {
        return vehicleFeaturesRequest;
    }

    /**
     * Sets the value of the vehicleFeaturesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleFeaturesDiscoveryRequestStructure }
     *     
     */
    public void setVehicleFeaturesRequest(VehicleFeaturesDiscoveryRequestStructure value) {
        this.vehicleFeaturesRequest = value;
    }

    /**
     * Gets the value of the infoChannelRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InfoChannelDiscoveryRequestStructure }
     *     
     */
    public InfoChannelDiscoveryRequestStructure getInfoChannelRequest() {
        return infoChannelRequest;
    }

    /**
     * Sets the value of the infoChannelRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoChannelDiscoveryRequestStructure }
     *     
     */
    public void setInfoChannelRequest(InfoChannelDiscoveryRequestStructure value) {
        this.infoChannelRequest = value;
    }

    /**
     * Gets the value of the facilityRequest property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityRequestStructure }
     *     
     */
    public FacilityRequestStructure getFacilityRequest() {
        return facilityRequest;
    }

    /**
     * Sets the value of the facilityRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityRequestStructure }
     *     
     */
    public void setFacilityRequest(FacilityRequestStructure value) {
        this.facilityRequest = value;
    }

    /**
     * Gets the value of the subscriptionResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionResponseStructure }
     *     
     */
    public SubscriptionResponseStructure getSubscriptionResponse() {
        return subscriptionResponse;
    }

    /**
     * Sets the value of the subscriptionResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionResponseStructure }
     *     
     */
    public void setSubscriptionResponse(SubscriptionResponseStructure value) {
        this.subscriptionResponse = value;
    }

    /**
     * Gets the value of the terminateSubscriptionResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TerminateSubscriptionResponseStructure }
     *     
     */
    public TerminateSubscriptionResponseStructure getTerminateSubscriptionResponse() {
        return terminateSubscriptionResponse;
    }

    /**
     * Sets the value of the terminateSubscriptionResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminateSubscriptionResponseStructure }
     *     
     */
    public void setTerminateSubscriptionResponse(TerminateSubscriptionResponseStructure value) {
        this.terminateSubscriptionResponse = value;
    }

    /**
     * Gets the value of the dataReadyAcknowledgement property.
     * 
     * @return
     *     possible object is
     *     {@link DataReadyResponseStructure }
     *     
     */
    public DataReadyResponseStructure getDataReadyAcknowledgement() {
        return dataReadyAcknowledgement;
    }

    /**
     * Sets the value of the dataReadyAcknowledgement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataReadyResponseStructure }
     *     
     */
    public void setDataReadyAcknowledgement(DataReadyResponseStructure value) {
        this.dataReadyAcknowledgement = value;
    }

    /**
     * Gets the value of the serviceDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDelivery }
     *     
     */
    public ServiceDelivery getServiceDelivery() {
        return serviceDelivery;
    }

    /**
     * Sets the value of the serviceDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDelivery }
     *     
     */
    public void setServiceDelivery(ServiceDelivery value) {
        this.serviceDelivery = value;
    }

    /**
     * Gets the value of the dataReceivedAcknowledgement property.
     * 
     * @return
     *     possible object is
     *     {@link DataReceivedResponseStructure }
     *     
     */
    public DataReceivedResponseStructure getDataReceivedAcknowledgement() {
        return dataReceivedAcknowledgement;
    }

    /**
     * Sets the value of the dataReceivedAcknowledgement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataReceivedResponseStructure }
     *     
     */
    public void setDataReceivedAcknowledgement(DataReceivedResponseStructure value) {
        this.dataReceivedAcknowledgement = value;
    }

    /**
     * Gets the value of the checkStatusResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CheckStatusResponseStructure }
     *     
     */
    public CheckStatusResponseStructure getCheckStatusResponse() {
        return checkStatusResponse;
    }

    /**
     * Sets the value of the checkStatusResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckStatusResponseStructure }
     *     
     */
    public void setCheckStatusResponse(CheckStatusResponseStructure value) {
        this.checkStatusResponse = value;
    }

    /**
     * Responses with  the capabilities of an implementation. Answers a CapabilityRequest 
     * 
     * @return
     *     possible object is
     *     {@link CapabilitiesResponseStructure }
     *     
     */
    public CapabilitiesResponseStructure getCapabilitiesResponse() {
        return capabilitiesResponse;
    }

    /**
     * Sets the value of the capabilitiesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitiesResponseStructure }
     *     
     */
    public void setCapabilitiesResponse(CapabilitiesResponseStructure value) {
        this.capabilitiesResponse = value;
    }

    /**
     * Gets the value of the stopPointsDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointsDeliveryStructure }
     *     
     */
    public StopPointsDeliveryStructure getStopPointsDelivery() {
        return stopPointsDelivery;
    }

    /**
     * Sets the value of the stopPointsDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointsDeliveryStructure }
     *     
     */
    public void setStopPointsDelivery(StopPointsDeliveryStructure value) {
        this.stopPointsDelivery = value;
    }

    /**
     * Gets the value of the linesDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link LinesDeliveryStructure }
     *     
     */
    public LinesDeliveryStructure getLinesDelivery() {
        return linesDelivery;
    }

    /**
     * Sets the value of the linesDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinesDeliveryStructure }
     *     
     */
    public void setLinesDelivery(LinesDeliveryStructure value) {
        this.linesDelivery = value;
    }

    /**
     * Gets the value of the productCategoriesDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategoriesDeliveryStructure }
     *     
     */
    public ProductCategoriesDeliveryStructure getProductCategoriesDelivery() {
        return productCategoriesDelivery;
    }

    /**
     * Sets the value of the productCategoriesDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategoriesDeliveryStructure }
     *     
     */
    public void setProductCategoriesDelivery(ProductCategoriesDeliveryStructure value) {
        this.productCategoriesDelivery = value;
    }

    /**
     * Gets the value of the serviceFeaturesDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeaturesDeliveryStructure }
     *     
     */
    public ServiceFeaturesDeliveryStructure getServiceFeaturesDelivery() {
        return serviceFeaturesDelivery;
    }

    /**
     * Sets the value of the serviceFeaturesDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeaturesDeliveryStructure }
     *     
     */
    public void setServiceFeaturesDelivery(ServiceFeaturesDeliveryStructure value) {
        this.serviceFeaturesDelivery = value;
    }

    /**
     * Gets the value of the vehicleFeaturesDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleFeaturesDeliveryStructure }
     *     
     */
    public VehicleFeaturesDeliveryStructure getVehicleFeaturesDelivery() {
        return vehicleFeaturesDelivery;
    }

    /**
     * Sets the value of the vehicleFeaturesDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleFeaturesDeliveryStructure }
     *     
     */
    public void setVehicleFeaturesDelivery(VehicleFeaturesDeliveryStructure value) {
        this.vehicleFeaturesDelivery = value;
    }

    /**
     * Gets the value of the infoChannelDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link InfoChannelDeliveryStructure }
     *     
     */
    public InfoChannelDeliveryStructure getInfoChannelDelivery() {
        return infoChannelDelivery;
    }

    /**
     * Sets the value of the infoChannelDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoChannelDeliveryStructure }
     *     
     */
    public void setInfoChannelDelivery(InfoChannelDeliveryStructure value) {
        this.infoChannelDelivery = value;
    }

    /**
     * Gets the value of the facilityDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityDeliveryStructure }
     *     
     */
    public FacilityDeliveryStructure getFacilityDelivery() {
        return facilityDelivery;
    }

    /**
     * Sets the value of the facilityDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityDeliveryStructure }
     *     
     */
    public void setFacilityDelivery(FacilityDeliveryStructure value) {
        this.facilityDelivery = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.4";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
