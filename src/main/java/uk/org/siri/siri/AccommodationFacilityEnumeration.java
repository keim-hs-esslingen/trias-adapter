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
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccommodationFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccommodationFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti23_3"/>
 *     &lt;enumeration value="sleeper"/>
 *     &lt;enumeration value="pti23_4"/>
 *     &lt;enumeration value="couchette"/>
 *     &lt;enumeration value="pti23_5"/>
 *     &lt;enumeration value="specialSeating"/>
 *     &lt;enumeration value="pti23_11"/>
 *     &lt;enumeration value="freeSeating"/>
 *     &lt;enumeration value="pti23_12"/>
 *     &lt;enumeration value="recliningSeats"/>
 *     &lt;enumeration value="pti23_13"/>
 *     &lt;enumeration value="babyCompartment"/>
 *     &lt;enumeration value="familyCarriage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccommodationFacilityEnumeration", namespace = "http://www.siri.org.uk/siri")
@XmlEnum
public enum AccommodationFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti23_3")
    PTI_23_3("pti23_3"),
    @XmlEnumValue("sleeper")
    SLEEPER("sleeper"),
    @XmlEnumValue("pti23_4")
    PTI_23_4("pti23_4"),
    @XmlEnumValue("couchette")
    COUCHETTE("couchette"),
    @XmlEnumValue("pti23_5")
    PTI_23_5("pti23_5"),
    @XmlEnumValue("specialSeating")
    SPECIAL_SEATING("specialSeating"),
    @XmlEnumValue("pti23_11")
    PTI_23_11("pti23_11"),
    @XmlEnumValue("freeSeating")
    FREE_SEATING("freeSeating"),
    @XmlEnumValue("pti23_12")
    PTI_23_12("pti23_12"),
    @XmlEnumValue("recliningSeats")
    RECLINING_SEATS("recliningSeats"),
    @XmlEnumValue("pti23_13")
    PTI_23_13("pti23_13"),
    @XmlEnumValue("babyCompartment")
    BABY_COMPARTMENT("babyCompartment"),
    @XmlEnumValue("familyCarriage")
    FAMILY_CARRIAGE("familyCarriage");
    private final String value;

    AccommodationFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccommodationFacilityEnumeration fromValue(String v) {
        for (AccommodationFacilityEnumeration c: AccommodationFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
