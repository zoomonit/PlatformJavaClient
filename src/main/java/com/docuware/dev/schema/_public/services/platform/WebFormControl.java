

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebFormControl", propOrder = {
    "id",
    "label"
})
@XmlSeeAlso({
    WebFormField.class
})
public abstract class WebFormControl  {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "Label", required = true)
    protected String label;

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String value) {
        this.label = value;
    }



}
