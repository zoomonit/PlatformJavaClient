

package com.docuware.dev.settings.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DWSize")
public class DWSize  {

    @XmlAttribute(name = "Width", required = true)
    protected double width;
    @XmlAttribute(name = "Height", required = true)
    protected double height;

    /**The width in coordinates.*/
    public double getWidth() {
        return width;
    }

    /**The width in coordinates.*/
    public void setWidth(double value) {
        this.width = value;
    }

    /**The height in coordinates.*/
    public double getHeight() {
        return height;
    }

    /**The height in coordinates.*/
    public void setHeight(double value) {
        this.height = value;
    }



}
