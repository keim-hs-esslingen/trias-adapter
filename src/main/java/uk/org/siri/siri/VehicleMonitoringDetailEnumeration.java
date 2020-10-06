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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


import lombok.ToString;
@ToString
/**
 * <p>Java class for VehicleMonitoringDetailEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleMonitoringDetailEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="minimum"/>
 *     &lt;enumeration value="basic"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="calls"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleMonitoringDetailEnumeration", namespace = "http://www.siri.org.uk/siri")
@XmlEnum
public enum VehicleMonitoringDetailEnumeration {


    /**
     * Return only the minimum amount of optional data for each stop event to provide a display, A time, line name  and destination name.
     * 
     */
    @XmlEnumValue("minimum")
    MINIMUM("minimum"),

    /**
     * Return  minimum and other available  basic details for each stop event. Do not include data on time at next stop or destination.
     * 
     */
    @XmlEnumValue("basic")
    BASIC("basic"),

    /**
     * Return all basic  data, and also arrival times at destination.
     * 
     */
    @XmlEnumValue("normal")
    NORMAL("normal"),

    /**
     * Return all available data for each stop event, including previous and onward journey patterns passing times.
     * 
     */
    @XmlEnumValue("calls")
    CALLS("calls");
    private final String value;

    VehicleMonitoringDetailEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleMonitoringDetailEnumeration fromValue(String v) {
        for (VehicleMonitoringDetailEnumeration c: VehicleMonitoringDetailEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
