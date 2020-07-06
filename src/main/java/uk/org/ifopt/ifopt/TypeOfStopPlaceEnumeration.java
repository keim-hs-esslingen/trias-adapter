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


package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfStopPlaceEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfStopPlaceEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="onstreetBus"/>
 *     &lt;enumeration value="onstreetTram"/>
 *     &lt;enumeration value="ferryStop"/>
 *     &lt;enumeration value="airport"/>
 *     &lt;enumeration value="railStation"/>
 *     &lt;enumeration value="metroStation"/>
 *     &lt;enumeration value="coachStation"/>
 *     &lt;enumeration value="ferryPort"/>
 *     &lt;enumeration value="harbourPort"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeOfStopPlaceEnumeration", namespace = "http://www.ifopt.org.uk/ifopt")
@XmlEnum
public enum TypeOfStopPlaceEnumeration {

    @XmlEnumValue("onstreetBus")
    ONSTREET_BUS("onstreetBus"),
    @XmlEnumValue("onstreetTram")
    ONSTREET_TRAM("onstreetTram"),
    @XmlEnumValue("ferryStop")
    FERRY_STOP("ferryStop"),
    @XmlEnumValue("airport")
    AIRPORT("airport"),
    @XmlEnumValue("railStation")
    RAIL_STATION("railStation"),
    @XmlEnumValue("metroStation")
    METRO_STATION("metroStation"),
    @XmlEnumValue("coachStation")
    COACH_STATION("coachStation"),
    @XmlEnumValue("ferryPort")
    FERRY_PORT("ferryPort"),
    @XmlEnumValue("harbourPort")
    HARBOUR_PORT("harbourPort"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TypeOfStopPlaceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfStopPlaceEnumeration fromValue(String v) {
        for (TypeOfStopPlaceEnumeration c: TypeOfStopPlaceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
