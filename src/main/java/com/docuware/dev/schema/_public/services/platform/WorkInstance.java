

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.CompareIgnore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkInstance")
@CompareIgnore
public class WorkInstance  {

    @XmlAttribute(name = "ID")
    protected String id;

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }



}
