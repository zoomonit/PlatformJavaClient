

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stroke", propOrder = {
    "point"
})
public class Stroke  {

    @XmlElement(name = "Point", required = true)
    protected List<AnnotationPoint> point;
    @XmlAttribute(name = "_do_not_use", required = true)
    protected boolean doNotUse;

    /**ArrayList is required for the XML-Marshalling */
    public void setPoint(ArrayList<AnnotationPoint> value) {
        point=value;
    }

    /**Sequence of points that define a PloyLine.*/
    public List<AnnotationPoint> getPoint() {
        if (point == null) {
            point = new ArrayList<AnnotationPoint>();
        }
        return this.point;
    }

    public boolean isDoNotUse() {
        return doNotUse;
    }

    public void setDoNotUse(boolean value) {
        this.doNotUse = value;
    }



}
