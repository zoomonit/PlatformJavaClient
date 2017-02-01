

package com.docuware.dev._public.intellix;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BarCodeZone", propOrder = {
    "value"
})
public class BarCodeZone
    extends RectangleBase
 {

    @XmlElement(name = "Value")
    protected String value;
    @XmlAttribute(name = "BarcodeType")
    protected String barcodeType;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getBarcodeType() {
        return barcodeType;
    }

    public void setBarcodeType(String value) {
        this.barcodeType = value;
    }



}
