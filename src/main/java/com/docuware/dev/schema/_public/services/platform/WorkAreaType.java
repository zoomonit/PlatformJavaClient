

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.CompareIgnore;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "WorkAreaType")
@XmlEnum
@CompareIgnore
public enum WorkAreaType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Basket")
    BASKET("Basket"),
    @XmlEnumValue("Search")
    SEARCH("Search"),
    @XmlEnumValue("TaskList")
    TASK_LIST("TaskList"),
    @XmlEnumValue("Workflow")
    WORKFLOW("Workflow"),
    @XmlEnumValue("TreeView")
    TREE_VIEW("TreeView");
    private final String value;

    WorkAreaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkAreaType fromValue(String v) {
        for (WorkAreaType c: WorkAreaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
