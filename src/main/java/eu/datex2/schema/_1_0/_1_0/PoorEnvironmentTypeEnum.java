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
 * <p>Java class for PoorEnvironmentTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PoorEnvironmentTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="abnormalTemperature"/>
 *     &lt;enumeration value="badWeather"/>
 *     &lt;enumeration value="blizzard"/>
 *     &lt;enumeration value="blowingDust"/>
 *     &lt;enumeration value="blowingSnow"/>
 *     &lt;enumeration value="crosswinds"/>
 *     &lt;enumeration value="damagingHail"/>
 *     &lt;enumeration value="denseFog"/>
 *     &lt;enumeration value="eclipse"/>
 *     &lt;enumeration value="extremeCold"/>
 *     &lt;enumeration value="extremeHeat"/>
 *     &lt;enumeration value="fog"/>
 *     &lt;enumeration value="freezingFog"/>
 *     &lt;enumeration value="frost"/>
 *     &lt;enumeration value="gales"/>
 *     &lt;enumeration value="gustyWinds"/>
 *     &lt;enumeration value="hail"/>
 *     &lt;enumeration value="heavyFrost"/>
 *     &lt;enumeration value="heavyRain"/>
 *     &lt;enumeration value="heavySnowfall"/>
 *     &lt;enumeration value="hurricaneForceWinds"/>
 *     &lt;enumeration value="lowSunGlare"/>
 *     &lt;enumeration value="moderateFog"/>
 *     &lt;enumeration value="ozonePollution"/>
 *     &lt;enumeration value="patchyFog"/>
 *     &lt;enumeration value="precipitationInTheArea"/>
 *     &lt;enumeration value="rain"/>
 *     &lt;enumeration value="rainChangingToSnow"/>
 *     &lt;enumeration value="sandStorms"/>
 *     &lt;enumeration value="severeExhaustPollution"/>
 *     &lt;enumeration value="severeSmog"/>
 *     &lt;enumeration value="showers"/>
 *     &lt;enumeration value="sleet"/>
 *     &lt;enumeration value="smogAlert"/>
 *     &lt;enumeration value="smokeHazard"/>
 *     &lt;enumeration value="snowChangingToRain"/>
 *     &lt;enumeration value="snowfall"/>
 *     &lt;enumeration value="sprayHazard"/>
 *     &lt;enumeration value="stormForceWinds"/>
 *     &lt;enumeration value="strongGustsOfWind"/>
 *     &lt;enumeration value="strongWinds"/>
 *     &lt;enumeration value="swarmsOfInsects"/>
 *     &lt;enumeration value="temperatureFalling"/>
 *     &lt;enumeration value="thunderstorms"/>
 *     &lt;enumeration value="tornadoes"/>
 *     &lt;enumeration value="veryStrongGustsOfWind"/>
 *     &lt;enumeration value="visibilityReduced"/>
 *     &lt;enumeration value="whiteOut"/>
 *     &lt;enumeration value="winterStorm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PoorEnvironmentTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum PoorEnvironmentTypeEnum {


    /**
     * The temperature is outside the normally expected range.
     * 
     */
    @XmlEnumValue("abnormalTemperature")
    ABNORMAL_TEMPERATURE("abnormalTemperature"),

    /**
     * Adverse weather conditions are affecting driving conditions.
     * 
     */
    @XmlEnumValue("badWeather")
    BAD_WEATHER("badWeather"),

    /**
     * Heavy snowfall in combination with strong winds, limiting visibility to 50m or less.
     * 
     */
    @XmlEnumValue("blizzard")
    BLIZZARD("blizzard"),

    /**
     * Dust blowing across the roadway causing significantly reduced visibility.
     * 
     */
    @XmlEnumValue("blowingDust")
    BLOWING_DUST("blowingDust"),

    /**
     * Fallen snow moving due to the forces of wind.
     * 
     */
    @XmlEnumValue("blowingSnow")
    BLOWING_SNOW("blowingSnow"),

    /**
     * Strong cross winds across the direction of the roadway (e.g. on a ridge or bridge).
     * 
     */
    @XmlEnumValue("crosswinds")
    CROSSWINDS("crosswinds"),

    /**
     * Large falling ice pellets or frozen rain capable of causing injury or damage to property.
     * 
     */
    @XmlEnumValue("damagingHail")
    DAMAGING_HAIL("damagingHail"),

    /**
     * Dense fog, limiting visibility to 50m or less.
     * 
     */
    @XmlEnumValue("denseFog")
    DENSE_FOG("denseFog"),

    /**
     * Eclipse, either partial or full, of the sun causing low light levels during normal daylight period.
     * 
     */
    @XmlEnumValue("eclipse")
    ECLIPSE("eclipse"),

    /**
     * Abnormally low temperatures.
     * 
     */
    @XmlEnumValue("extremeCold")
    EXTREME_COLD("extremeCold"),

    /**
     * Abnormally high expected maximum temperature.
     * 
     */
    @XmlEnumValue("extremeHeat")
    EXTREME_HEAT("extremeHeat"),

    /**
     * Fog, visibility more than 50m.
     * 
     */
    @XmlEnumValue("fog")
    FOG("fog"),

    /**
     * Fog, in conjunction with sub-zero air temperatures causing possible freezing of road surface.
     * 
     */
    @XmlEnumValue("freezingFog")
    FREEZING_FOG("freezingFog"),

    /**
     * Frost can be expected.
     * 
     */
    @XmlEnumValue("frost")
    FROST("frost"),

    /**
     * Winds between 60 km/h and 90 km/h.
     * 
     */
    @XmlEnumValue("gales")
    GALES("gales"),

    /**
     * Constantly varying winds, significant at times.
     * 
     */
    @XmlEnumValue("gustyWinds")
    GUSTY_WINDS("gustyWinds"),

    /**
     * Falling ice pellets or frozen rain.
     * 
     */
    @XmlEnumValue("hail")
    HAIL("hail"),

    /**
     * A thick coating of frost can be expected.
     * 
     */
    @XmlEnumValue("heavyFrost")
    HEAVY_FROST("heavyFrost"),

    /**
     * Heavy rainfall, limiting visibility to 50m or less.
     * 
     */
    @XmlEnumValue("heavyRain")
    HEAVY_RAIN("heavyRain"),

    /**
     * Dense falling snow, limiting visibility to 50m or less.
     * 
     */
    @XmlEnumValue("heavySnowfall")
    HEAVY_SNOWFALL("heavySnowfall"),

    /**
     * Winds over 120 km/h.
     * 
     */
    @XmlEnumValue("hurricaneForceWinds")
    HURRICANE_FORCE_WINDS("hurricaneForceWinds"),

    /**
     * Difficult visibility conditions created by low elevation sunlight.
     * 
     */
    @XmlEnumValue("lowSunGlare")
    LOW_SUN_GLARE("lowSunGlare"),

    /**
     * Misty conditions impairing vision over 100m.
     * 
     */
    @XmlEnumValue("moderateFog")
    MODERATE_FOG("moderateFog"),

    /**
     * High concentrations of ozone are present.
     * 
     */
    @XmlEnumValue("ozonePollution")
    OZONE_POLLUTION("ozonePollution"),

    /**
     * Fog, in which intermittent areas of dense fog may be encountered.
     * 
     */
    @XmlEnumValue("patchyFog")
    PATCHY_FOG("patchyFog"),

    /**
     * Unspecified precipitation is falling on the area.
     * 
     */
    @XmlEnumValue("precipitationInTheArea")
    PRECIPITATION_IN_THE_AREA("precipitationInTheArea"),

    /**
     * Rain, visibility more than 50m.
     * 
     */
    @XmlEnumValue("rain")
    RAIN("rain"),

    /**
     * Falling rain is changing to snow.
     * 
     */
    @XmlEnumValue("rainChangingToSnow")
    RAIN_CHANGING_TO_SNOW("rainChangingToSnow"),

    /**
     * Sand blowing across the roadway causing significantly reduced visibility.
     * 
     */
    @XmlEnumValue("sandStorms")
    SAND_STORMS("sandStorms"),

    /**
     * Pollution from exhaust fumes has reached a level sufficient to cause concern.
     * 
     */
    @XmlEnumValue("severeExhaustPollution")
    SEVERE_EXHAUST_POLLUTION("severeExhaustPollution"),

    /**
     * Environmental warning of very poor air quality resulting from smog.
     * 
     */
    @XmlEnumValue("severeSmog")
    SEVERE_SMOG("severeSmog"),

    /**
     * Light rain or intermittent rain.
     * 
     */
    @XmlEnumValue("showers")
    SHOWERS("showers"),

    /**
     * Rain mingled with snow or hail.
     * 
     */
    @XmlEnumValue("sleet")
    SLEET("sleet"),

    /**
     * Environmental warning of poor air quality resulting from smog.
     * 
     */
    @XmlEnumValue("smogAlert")
    SMOG_ALERT("smogAlert"),

    /**
     * Smoke drifting across the roadway causing significantly reduced visibility.
     * 
     */
    @XmlEnumValue("smokeHazard")
    SMOKE_HAZARD("smokeHazard"),

    /**
     * Falling snow is changing to rain.
     * 
     */
    @XmlEnumValue("snowChangingToRain")
    SNOW_CHANGING_TO_RAIN("snowChangingToRain"),

    /**
     * Falling snow, visibility more than 50m.
     * 
     */
    @XmlEnumValue("snowfall")
    SNOWFALL("snowfall"),

    /**
     * Reduced visibility resulting from spray created by moving vehicles on a wet roadway.
     * 
     */
    @XmlEnumValue("sprayHazard")
    SPRAY_HAZARD("sprayHazard"),

    /**
     * Winds between 90 km/h and 120 km/h.
     * 
     */
    @XmlEnumValue("stormForceWinds")
    STORM_FORCE_WINDS("stormForceWinds"),

    /**
     * Constantly varying winds, strong at times.
     * 
     */
    @XmlEnumValue("strongGustsOfWind")
    STRONG_GUSTS_OF_WIND("strongGustsOfWind"),

    /**
     * Winds between 40 km/h and 60 km/h.
     * 
     */
    @XmlEnumValue("strongWinds")
    STRONG_WINDS("strongWinds"),

    /**
     * Large numbers of insects which create a hazard for road users through reduced visibility.
     * 
     */
    @XmlEnumValue("swarmsOfInsects")
    SWARMS_OF_INSECTS("swarmsOfInsects"),

    /**
     * The temperature is falling significantly.
     * 
     */
    @XmlEnumValue("temperatureFalling")
    TEMPERATURE_FALLING("temperatureFalling"),

    /**
     * Electrical storms, generally with heavy rain.
     * 
     */
    @XmlEnumValue("thunderstorms")
    THUNDERSTORMS("thunderstorms"),

    /**
     * Very violent, whirling windstorms affecting narrow strips of country.
     * 
     */
    @XmlEnumValue("tornadoes")
    TORNADOES("tornadoes"),

    /**
     * Constantly varying winds, very strong at times.
     * 
     */
    @XmlEnumValue("veryStrongGustsOfWind")
    VERY_STRONG_GUSTS_OF_WIND("veryStrongGustsOfWind"),

    /**
     * Environmental conditions causing reduced visibility.
     * 
     */
    @XmlEnumValue("visibilityReduced")
    VISIBILITY_REDUCED("visibilityReduced"),

    /**
     * Falling snow in blizzard conditions resulting in very reduced visibility.
     * 
     */
    @XmlEnumValue("whiteOut")
    WHITE_OUT("whiteOut"),

    /**
     * Heavy rain, sleet, hail and/or snow in combination with strong winds, limiting visibility to 50m or less.
     * 
     */
    @XmlEnumValue("winterStorm")
    WINTER_STORM("winterStorm");
    private final String value;

    PoorEnvironmentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PoorEnvironmentTypeEnum fromValue(String v) {
        for (PoorEnvironmentTypeEnum c: PoorEnvironmentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
