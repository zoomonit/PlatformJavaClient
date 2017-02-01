

package com.docuware.dev._public.intellix;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextZone", propOrder = {
    "ln"
})
public class TextZone
    extends RectangleBase
 {

    @XmlElement(name = "Ln")
    protected List<Line> ln;
    @XmlAttribute(name = "Lang")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;

    /**ArrayList is required for the XML-Marshalling */
    public void setLn(ArrayList<Line> value) {
        ln=value;
    }

    /**Contains a single text line.*/
    public List<Line> getLn() {
        if (ln == null) {
            ln = new ArrayList<Line>();
        }
        return this.ln;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String value) {
        this.lang = value;
    }



}
