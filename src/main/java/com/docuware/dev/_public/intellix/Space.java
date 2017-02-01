

package com.docuware.dev._public.intellix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Space")
public class Space  {

    @XmlAttribute(name = "W")
    protected Integer w;

    /**The width of the space.*/
    public int getW() {
        if (w == null) {
            return  0;
        } else {
            return w;
        }
    }

    /**The width of the space.*/
    public void setW(Integer value) {
        this.w = value;
    }



}
