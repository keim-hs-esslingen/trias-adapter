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


package uk.org.ifopt.acsb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


import lombok.ToString;
@ToString
/**
 * <p>Java class for MobilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MobilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="wheelchair"/>
 *     &lt;enumeration value="assistedWheelchair"/>
 *     &lt;enumeration value="motorizedWheelchair"/>
 *     &lt;enumeration value="walkingFrame"/>
 *     &lt;enumeration value="restrictedMobility"/>
 *     &lt;enumeration value="otherMobilityNeed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MobilityEnumeration", namespace = "http://www.ifopt.org.uk/acsb")
@XmlEnum
public enum MobilityEnumeration {

    @XmlEnumValue("wheelchair")
    WHEELCHAIR("wheelchair"),
    @XmlEnumValue("assistedWheelchair")
    ASSISTED_WHEELCHAIR("assistedWheelchair"),
    @XmlEnumValue("motorizedWheelchair")
    MOTORIZED_WHEELCHAIR("motorizedWheelchair"),
    @XmlEnumValue("walkingFrame")
    WALKING_FRAME("walkingFrame"),
    @XmlEnumValue("restrictedMobility")
    RESTRICTED_MOBILITY("restrictedMobility"),
    @XmlEnumValue("otherMobilityNeed")
    OTHER_MOBILITY_NEED("otherMobilityNeed");
    private final String value;

    MobilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobilityEnumeration fromValue(String v) {
        for (MobilityEnumeration c: MobilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
