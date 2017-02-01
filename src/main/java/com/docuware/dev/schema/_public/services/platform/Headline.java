

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Headline", propOrder = {
    "fontSize",
    "alignment",
    "subtitle"
})
public class Headline
    extends WebFormField
 {

    @XmlElement(name = "FontSize")
    protected double fontSize;
    @XmlElement(name = "Alignment", required = true)
    @XmlSchemaType(name = "string")
    protected AlignmentType alignment;
    @XmlElement(name = "Subtitle", required = true)
    protected String subtitle;

    public double getFontSize() {
        return fontSize;
    }

    public void setFontSize(double value) {
        this.fontSize = value;
    }

    public AlignmentType getAlignment() {
        return alignment;
    }

    public void setAlignment(AlignmentType value) {
        this.alignment = value;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String value) {
        this.subtitle = value;
    }



}
