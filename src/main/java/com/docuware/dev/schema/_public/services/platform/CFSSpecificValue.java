

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFSSpecificValue", propOrder = {
    "value"
})
public class CFSSpecificValue  {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "ValueName")
    protected String valueName;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String value) {
        this.valueName = value;
    }



}
