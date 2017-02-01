

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionalSettings")
public class RegionalSettings  {

    @XmlAttribute(name = "Language")
    protected String language;
    @XmlAttribute(name = "Culture")
    protected String culture;
    @XmlAttribute(name = "Calendar")
    protected String calendar;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String value) {
        this.culture = value;
    }

    public String getCalendar() {
        return calendar;
    }

    public void setCalendar(String value) {
        this.calendar = value;
    }



}
