

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.CompareIgnore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebClientLayout")
@CompareIgnore
public class WebClientLayout  {

    @XmlAttribute(name = "Mode", required = true)
    protected LayoutMode mode;

    public LayoutMode getMode() {
        return mode;
    }

    public void setMode(LayoutMode value) {
        this.mode = value;
    }



}
