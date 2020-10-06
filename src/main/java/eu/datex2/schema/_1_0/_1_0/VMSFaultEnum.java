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


package eu.datex2.schema._1_0._1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


import lombok.ToString;
@ToString
/**
 * <p>Java class for VMSFaultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VMSFaultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="communicationsFailure"/>
 *     &lt;enumeration value="incorrectMessageDisplayed"/>
 *     &lt;enumeration value="incorrectPictogramDisplayed"/>
 *     &lt;enumeration value="powerFailure"/>
 *     &lt;enumeration value="unableToClearDown"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VMSFaultEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum VMSFaultEnum {


    /**
     * Comunications failure affecting VMS.
     * 
     */
    @XmlEnumValue("communicationsFailure")
    COMMUNICATIONS_FAILURE("communicationsFailure"),

    /**
     * Incorrect message is being displayed.
     * 
     */
    @XmlEnumValue("incorrectMessageDisplayed")
    INCORRECT_MESSAGE_DISPLAYED("incorrectMessageDisplayed"),

    /**
     * Incorrect pictogram is being displayed.
     * 
     */
    @XmlEnumValue("incorrectPictogramDisplayed")
    INCORRECT_PICTOGRAM_DISPLAYED("incorrectPictogramDisplayed"),

    /**
     * Power to VMS has failed.
     * 
     */
    @XmlEnumValue("powerFailure")
    POWER_FAILURE("powerFailure"),

    /**
     * Unable to clear down information displayed on VMS.
     * 
     */
    @XmlEnumValue("unableToClearDown")
    UNABLE_TO_CLEAR_DOWN("unableToClearDown"),

    /**
     * Unknown VMS fault.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    VMSFaultEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VMSFaultEnum fromValue(String v) {
        for (VMSFaultEnum c: VMSFaultEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
