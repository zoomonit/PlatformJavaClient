

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.Eagle;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountResult", propOrder = {
    "group"
})
public class CountResult  {

    @XmlElement(name = "Group", required = true)
    protected List<CountResultItem> group;
    @XmlAttribute(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected GregorianCalendar timeStamp;

    /**ArrayList is required for the XML-Marshalling */
    public void setGroup(ArrayList<CountResultItem> value) {
        group=value;
    }

    /**Set of count results*/
    public List<CountResultItem> getGroup() {
        if (group == null) {
            group = new ArrayList<CountResultItem>();
        }
        return this.group;
    }

    /**TimeStamp of the result*/
    @Eagle
    public GregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**TimeStamp of the result*/
    @Eagle
    public void setTimeStamp(GregorianCalendar value) {
        this.timeStamp = value;
    }



}
