

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldValueStatistics", propOrder = {
    "value"
})
public class FieldValueStatistics  {

    @XmlElement(name = "Value", required = true)
    protected DocumentIndexFieldValue value;
    @XmlAttribute(name = "Count", required = true)
    protected long count;

    /**The value.*/
    public DocumentIndexFieldValue getValue() {
        return value;
    }

    /**The value.*/
    public void setValue(DocumentIndexFieldValue value) {
        this.value = value;
    }

    /**The number of times the value occurs in the documents.*/
    public long getCount() {
        return count;
    }

    /**The number of times the value occurs in the documents.*/
    public void setCount(long value) {
        this.count = value;
    }



}
