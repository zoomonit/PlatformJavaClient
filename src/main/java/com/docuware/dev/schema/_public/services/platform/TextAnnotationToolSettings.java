

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.CompareIgnore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextAnnotationToolSettings", propOrder = {
    "fontSettings"
})
@CompareIgnore
public class TextAnnotationToolSettings
    extends AnnotationToolSettings
 {

    @XmlElement(name = "FontSettings", required = true)
    protected FontSettings fontSettings;

    public FontSettings getFontSettings() {
        return fontSettings;
    }

    public void setFontSettings(FontSettings value) {
        this.fontSettings = value;
    }



}
