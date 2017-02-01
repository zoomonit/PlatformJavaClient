

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.CompareIgnore;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotationToolSettings")
@XmlSeeAlso({
    TextAnnotationToolSettings.class,
    SizedAnnotationToolSettings.class
})
@CompareIgnore
public class AnnotationToolSettings  {

    @XmlAttribute(name = "Type", required = true)
    protected AnnotationTools type;
    @XmlAttribute(name = "Color")
    protected String color;

    public AnnotationTools getType() {
        return type;
    }

    public void setType(AnnotationTools value) {
        this.type = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String value) {
        this.color = value;
    }



}
