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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


import lombok.ToString;
@ToString
/**
 * <p>Java class for RecommendationTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecommendationTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NextService"/>
 *     &lt;enumeration value="DifferentRoute"/>
 *     &lt;enumeration value="Hotel"/>
 *     &lt;enumeration value="Taxi"/>
 *     &lt;enumeration value="Bus"/>
 *     &lt;enumeration value="Helpdesk"/>
 *     &lt;enumeration value="Hotline"/>
 *     &lt;enumeration value="Driver"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecommendationTypeEnumeration", namespace = "http://www.vdv.de/trias")
@XmlEnum
public enum RecommendationTypeEnumeration {

    @XmlEnumValue("NextService")
    NEXT_SERVICE("NextService"),
    @XmlEnumValue("DifferentRoute")
    DIFFERENT_ROUTE("DifferentRoute"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Taxi")
    TAXI("Taxi"),
    @XmlEnumValue("Bus")
    BUS("Bus"),
    @XmlEnumValue("Helpdesk")
    HELPDESK("Helpdesk"),
    @XmlEnumValue("Hotline")
    HOTLINE("Hotline"),
    @XmlEnumValue("Driver")
    DRIVER("Driver"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RecommendationTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecommendationTypeEnumeration fromValue(String v) {
        for (RecommendationTypeEnumeration c: RecommendationTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
