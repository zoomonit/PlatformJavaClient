

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.Extension;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextField", propOrder = {
"widthSpecified",
    "width"
})
@XmlSeeAlso({
    NumberField.class,
    MultiLineTextField.class
})
public class TextField
    extends WebFormField
 {
private boolean widthSpecified;//test


    @XmlElement(name = "Width")
    protected Integer width;

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer value) {
        this.width = value;
    }

    @Extension
    public boolean isWidthSpecified() {
	return widthSpecified;
    }

    @Extension
    public void setWidthSpecified(boolean widthSpecified) {
	this.widthSpecified = widthSpecified;
    }



}
