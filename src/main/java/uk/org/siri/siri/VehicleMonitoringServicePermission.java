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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Monitoring Service  Permissions.
 * 
 * <p>Java class for VehicleMonitoringServicePermission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleMonitoringServicePermissionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractPermissionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}OperatorPermissions"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}LinePermissions"/>
 *         &lt;element name="VehicleMonitoringPermissions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}AllowAll"/>
 *                   &lt;element name="VehicleMonitorPermission" type="{http://www.siri.org.uk/siri}VehicleMonitorPermissionStructure" maxOccurs="unbounded"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "VehicleMonitoringServicePermissionStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "operatorPermissions",
    "linePermissions",
    "vehicleMonitoringPermissions",
    "extensions"
})
@ToString
public class VehicleMonitoringServicePermission
    extends AbstractPermission
{

    @XmlElement(name = "OperatorPermissions", namespace = "http://www.siri.org.uk/siri", required = true)
    protected OperatorPermissions operatorPermissions;
    @XmlElement(name = "LinePermissions", namespace = "http://www.siri.org.uk/siri", required = true)
    protected LinePermissions linePermissions;
    @XmlElement(name = "VehicleMonitoringPermissions", namespace = "http://www.siri.org.uk/siri", required = true)
    protected VehicleMonitoringServicePermission.VehicleMonitoringPermissions vehicleMonitoringPermissions;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected Extensions extensions;

    /**
     * Gets the value of the operatorPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorPermissions }
     *     
     */
    public OperatorPermissions getOperatorPermissions() {
        return operatorPermissions;
    }

    /**
     * Sets the value of the operatorPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorPermissions }
     *     
     */
    public VehicleMonitoringServicePermission setOperatorPermissions(OperatorPermissions value) {
        this.operatorPermissions = value;
        return this;
    }

    /**
     * Gets the value of the linePermissions property.
     * 
     * @return
     *     possible object is
     *     {@link LinePermissions }
     *     
     */
    public LinePermissions getLinePermissions() {
        return linePermissions;
    }

    /**
     * Sets the value of the linePermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinePermissions }
     *     
     */
    public VehicleMonitoringServicePermission setLinePermissions(LinePermissions value) {
        this.linePermissions = value;
        return this;
    }

    /**
     * Gets the value of the vehicleMonitoringPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMonitoringServicePermission.VehicleMonitoringPermissions }
     *     
     */
    public VehicleMonitoringServicePermission.VehicleMonitoringPermissions getVehicleMonitoringPermissions() {
        return vehicleMonitoringPermissions;
    }

    /**
     * Sets the value of the vehicleMonitoringPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringServicePermission.VehicleMonitoringPermissions }
     *     
     */
    public void setVehicleMonitoringPermissions(VehicleMonitoringServicePermission.VehicleMonitoringPermissions value) {
        this.vehicleMonitoringPermissions = value;
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
    public VehicleMonitoringServicePermission setExtensions(Extensions value) {
        this.extensions = value;
        return this;
    }


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
     *         &lt;element ref="{http://www.siri.org.uk/siri}AllowAll"/>
     *         &lt;element name="VehicleMonitorPermission" type="{http://www.siri.org.uk/siri}VehicleMonitorPermissionStructure" maxOccurs="unbounded"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "allowAll",
        "vehicleMonitorPermission"
    })
    public static class VehicleMonitoringPermissions {

        @XmlElement(name = "AllowAll", namespace = "http://www.siri.org.uk/siri")
        protected Boolean allowAll;
        @XmlElement(name = "VehicleMonitorPermission", namespace = "http://www.siri.org.uk/siri")
        protected List<VehicleMonitorPermission> vehicleMonitorPermission;

        /**
         * Gets the value of the allowAll property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllowAll() {
            return allowAll;
        }

        /**
         * Sets the value of the allowAll property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllowAll(Boolean value) {
            this.allowAll = value;
        }

        /**
         * Gets the value of the vehicleMonitorPermission property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicleMonitorPermission property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicleMonitorPermission().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleMonitorPermission }
         * 
         * 
         */
        public List<VehicleMonitorPermission> getVehicleMonitorPermission() {
            if (vehicleMonitorPermission == null) {
                vehicleMonitorPermission = new ArrayList<VehicleMonitorPermission>();
            }
            return this.vehicleMonitorPermission;
        }

    }

}
