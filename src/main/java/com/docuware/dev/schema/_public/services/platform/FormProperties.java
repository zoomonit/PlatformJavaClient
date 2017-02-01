

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormProperties", propOrder = {
    "formWidth",
    "formAlignment",
    "webPageBackgroundColor"
})
public class FormProperties  {

    @XmlElement(name = "FormWidth")
    protected int formWidth;
    @XmlElement(name = "FormAlignment", required = true)
    @XmlSchemaType(name = "string")
    protected AlignmentType formAlignment;
    @XmlElement(name = "WebPageBackgroundColor", required = true)
    protected String webPageBackgroundColor;

    public int getFormWidth() {
        return formWidth;
    }

    public void setFormWidth(int value) {
        this.formWidth = value;
    }

    public AlignmentType getFormAlignment() {
        return formAlignment;
    }

    public void setFormAlignment(AlignmentType value) {
        this.formAlignment = value;
    }

    public String getWebPageBackgroundColor() {
        return webPageBackgroundColor;
    }

    public void setWebPageBackgroundColor(String value) {
        this.webPageBackgroundColor = value;
    }



}
