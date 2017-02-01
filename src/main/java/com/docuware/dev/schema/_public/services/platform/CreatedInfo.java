

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;
import java.util.GregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreatedInfo")
public class CreatedInfo  {

    @XmlAttribute(name = "User", required = true)
    protected String user;
    @XmlAttribute(name = "Time", required = true)
    @XmlSchemaType(name = "dateTime")
    protected GregorianCalendar time;

    /**Id of the user who created this item.*/
    public String getUser() {
        return user;
    }

    /**Id of the user who created this item.*/
    public void setUser(String value) {
        this.user = value;
    }

    /**Timestamp when this item was created.*/
    public GregorianCalendar getTime() {
        return time;
    }

    /**Timestamp when this item was created.*/
    public void setTime(GregorianCalendar value) {
        this.time = value;
    }



}
