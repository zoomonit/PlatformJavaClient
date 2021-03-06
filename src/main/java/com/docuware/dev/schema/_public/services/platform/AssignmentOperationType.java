

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "AssignmentOperationType")
@XmlEnum
public enum AssignmentOperationType {


    @XmlEnumValue("Add")
    ADD("Add"),

    @XmlEnumValue("Remove")
    REMOVE("Remove");
    private final String value;

    AssignmentOperationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssignmentOperationType fromValue(String v) {
        for (AssignmentOperationType c: AssignmentOperationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
