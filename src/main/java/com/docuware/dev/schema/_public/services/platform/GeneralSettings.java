

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.CompareIgnore;
import com.docuware.dev.Extensions.Eagle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralSettings")
@CompareIgnore
public class GeneralSettings  {

    @XmlAttribute(name = "StartWith")
    protected WorkAreaType startWith;

    @Eagle
    public WorkAreaType getStartWith() {
        if (startWith == null) {
            return WorkAreaType.NONE;
        } else {
            return startWith;
        }
    }

    @Eagle
    public void setStartWith(WorkAreaType value) {
        this.startWith = value;
    }



}
