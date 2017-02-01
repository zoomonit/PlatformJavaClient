

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ContentDivideOperation")
@XmlEnum
public enum ContentDivideOperation {


    @XmlEnumValue("Unclip")
    UNCLIP("Unclip"),

    @XmlEnumValue("Unstaple")
    UNSTAPLE("Unstaple"),

    @XmlEnumValue("Split")
    SPLIT("Split");
    private final String value;

    ContentDivideOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContentDivideOperation fromValue(String v) {
        for (ContentDivideOperation c: ContentDivideOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
