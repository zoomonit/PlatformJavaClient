

package com.docuware.dev.schema._public.services;

import com.docuware.dev.Extensions.CompareIgnore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogMessageGroups", propOrder = {
    "message"
})
@CompareIgnore
public class LogMessageGroups  {

    @XmlElement(name = "Message")
    protected List<LogMessageGroup> message;

    /**ArrayList is required for the XML-Marshalling */
    public void setMessage(ArrayList<LogMessageGroup> value) {
        message=value;
    }

    public List<LogMessageGroup> getMessage() {
        if (message == null) {
            message = new ArrayList<LogMessageGroup>();
        }
        return this.message;
    }



}
