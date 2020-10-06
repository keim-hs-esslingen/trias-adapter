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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


import lombok.ToString;
@ToString
/**
 * Type for Description of the monitoring conditions (frequency of mesurement, etc): an automatic monitoring of the satus of a lift with pushed alert in case of incident is very different from a daily manual/visual check ....
 * 
 * <p>Java class for MonitoringValidityCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitoringValidityConditionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Period" type="{http://www.siri.org.uk/siri}HalfOpenTimestampRangeStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Timeband" type="{http://www.siri.org.uk/siri}HalfOpenTimeRangeStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DayType" type="{http://www.siri.org.uk/siri}DaysOfWeekEnumerationx" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HolidayType" type="{http://www.siri.org.uk/siri}HolidayTypeEnumerationx" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoringValidityConditionStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "period",
    "timeband",
    "dayType",
    "holidayType"
})
public class MonitoringValidityCondition {

    @XmlElement(name = "Period", namespace = "http://www.siri.org.uk/siri")
    protected List<HalfOpenTimestampRange> period;
    @XmlElement(name = "Timeband", namespace = "http://www.siri.org.uk/siri")
    protected List<HalfOpenTimeRange> timeband;
    @XmlElement(name = "DayType", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<DaysOfWeekEnumerationx> dayType;
    @XmlElement(name = "HolidayType", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<HolidayTypeEnumerationx> holidayType;

    /**
     * Gets the value of the period property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the period property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HalfOpenTimestampRange }
     * 
     * 
     */
    public List<HalfOpenTimestampRange> getPeriod() {
        if (period == null) {
            period = new ArrayList<HalfOpenTimestampRange>();
        }
        return this.period;
    }

    /**
     * Gets the value of the timeband property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeband property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeband().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HalfOpenTimeRange }
     * 
     * 
     */
    public List<HalfOpenTimeRange> getTimeband() {
        if (timeband == null) {
            timeband = new ArrayList<HalfOpenTimeRange>();
        }
        return this.timeband;
    }

    /**
     * Gets the value of the dayType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DaysOfWeekEnumerationx }
     * 
     * 
     */
    public List<DaysOfWeekEnumerationx> getDayType() {
        if (dayType == null) {
            dayType = new ArrayList<DaysOfWeekEnumerationx>();
        }
        return this.dayType;
    }

    /**
     * Gets the value of the holidayType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holidayType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHolidayType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HolidayTypeEnumerationx }
     * 
     * 
     */
    public List<HolidayTypeEnumerationx> getHolidayType() {
        if (holidayType == null) {
            holidayType = new ArrayList<HolidayTypeEnumerationx>();
        }
        return this.holidayType;
    }

}
