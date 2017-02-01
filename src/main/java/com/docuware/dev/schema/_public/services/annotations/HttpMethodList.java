

package com.docuware.dev.schema._public.services.annotations;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpMethodList", propOrder = {
    "method"
})
public class HttpMethodList  {

    @XmlElement(name = "Method", required = true)
    @XmlSchemaType(name = "string")
    protected List<HttpMethod> method;
    @XmlAttribute(name = "IsComplete")
    protected Boolean isComplete;

    /**ArrayList is required for the XML-Marshalling */
    public void setMethod(ArrayList<HttpMethod> value) {
        method=value;
    }

    public List<HttpMethod> getMethod() {
        if (method == null) {
            method = new ArrayList<HttpMethod>();
        }
        return this.method;
    }

    /**If this is true than there are no other methods are expected than the specified.*/
    public boolean isIsComplete() {
        if (isComplete == null) {
            return false;
        } else {
            return isComplete;
        }
    }

    /**If this is true than there are no other methods are expected than the specified.*/
    public void setIsComplete(Boolean value) {
        this.isComplete = value;
    }



}
