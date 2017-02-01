

package com.docuware.dev.schema._public.services;

import com.docuware.dev.Extensions.CompareIgnore;

import javax.xml.bind.annotation.*;
import java.util.GregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogMessageGroup", propOrder = {
    "group"
})
@CompareIgnore
public class LogMessageGroup  {

    @XmlElement(name = "Group", required = true)
    protected String group;
    @XmlAttribute(name = "Level")
    protected LogMessageLevel level;
    @XmlAttribute(name = "Count", required = true)
    protected int count;
    @XmlAttribute(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected GregorianCalendar timeStamp;

    /**Something which identifies a group of log messages.*/
    public String getGroup() {
        return group;
    }

    /**Something which identifies a group of log messages.*/
    public void setGroup(String value) {
        this.group = value;
    }

    public LogMessageLevel getLevel() {
        if (level == null) {
            return LogMessageLevel.INFO;
        } else {
            return level;
        }
    }

    public void setLevel(LogMessageLevel value) {
        this.level = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int value) {
        this.count = value;
    }

    public GregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(GregorianCalendar value) {
        this.timeStamp = value;
    }



}
