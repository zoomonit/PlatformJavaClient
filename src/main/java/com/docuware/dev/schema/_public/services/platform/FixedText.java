

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedText", propOrder = {
    "fontSize",
    "fontColor",
    "width",
    "alignment"
})
public class FixedText
    extends WebFormField
 {

    @XmlElement(name = "FontSize")
    protected int fontSize;
    @XmlElement(name = "FontColor", required = true)
    protected String fontColor;
    @XmlElement(name = "Width")
    protected int width;
    @XmlElement(name = "Alignment", required = true)
    @XmlSchemaType(name = "string")
    protected AlignmentType alignment;

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int value) {
        this.fontSize = value;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String value) {
        this.fontColor = value;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int value) {
        this.width = value;
    }

    public AlignmentType getAlignment() {
        return alignment;
    }

    public void setAlignment(AlignmentType value) {
        this.alignment = value;
    }



}
