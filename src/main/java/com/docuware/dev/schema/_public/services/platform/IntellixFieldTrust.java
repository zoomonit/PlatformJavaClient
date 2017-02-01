

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "IntellixFieldTrust")
@XmlEnum
public enum IntellixFieldTrust {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Red")
    RED("Red"),
    @XmlEnumValue("Yellow")
    YELLOW("Yellow"),
    @XmlEnumValue("Green")
    GREEN("Green");
    private final String value;

    IntellixFieldTrust(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntellixFieldTrust fromValue(String v) {
        for (IntellixFieldTrust c: IntellixFieldTrust.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
