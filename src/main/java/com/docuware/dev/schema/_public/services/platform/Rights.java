

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rights", propOrder = {
    "right"
})
public class Rights  {

    @XmlElement(name = "Right")
    @XmlSchemaType(name = "string")
    protected List<Right> right;

    /**ArrayList is required for the XML-Marshalling */
    public void setRight(ArrayList<Right> value) {
        right=value;
    }

    /**List of rights.*/
    public List<Right> getRight() {
        if (right == null) {
            right = new ArrayList<Right>();
        }
        return this.right;
    }



}
