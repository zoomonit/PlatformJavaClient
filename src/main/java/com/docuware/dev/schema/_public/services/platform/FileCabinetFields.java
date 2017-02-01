

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileCabinetFields", propOrder = {
    "field"
})
public class FileCabinetFields  {

    @XmlElement(name = "Field", required = true)
    protected List<FileCabinetField> field;

    /**ArrayList is required for the XML-Marshalling */
    public void setField(ArrayList<FileCabinetField> value) {
        field=value;
    }

    /**List of file cabinet fields.*/
    public List<FileCabinetField> getField() {
        if (field == null) {
            field = new ArrayList<FileCabinetField>();
        }
        return this.field;
    }



}
