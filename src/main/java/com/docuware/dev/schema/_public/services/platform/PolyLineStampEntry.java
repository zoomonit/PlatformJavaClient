

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolyLineStampEntry", propOrder = {
    "stroke"
})
public class PolyLineStampEntry
    extends StampBase
 {

    @XmlElement(name = "Stroke", required = true)
    protected List<Stroke> stroke;

    /**ArrayList is required for the XML-Marshalling */
    public void setStroke(ArrayList<Stroke> value) {
        stroke=value;
    }

    /**Sequence of strokes of sequence of points that define a set of polylines.*/
    public List<Stroke> getStroke() {
        if (stroke == null) {
            stroke = new ArrayList<Stroke>();
        }
        return this.stroke;
    }



}
