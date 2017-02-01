

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotationsPlacement", propOrder = {
    "items"
})
public class AnnotationsPlacement  {

    @XmlElements({
        @XmlElement(name = "Annotation", type = Annotation.class),
        @XmlElement(name = "StampPlacement", type = StampPlacement.class)
    })
    protected List<Object> items;

    /**ArrayList is required for the XML-Marshalling */
    public void setItems(ArrayList<Object> value) {
        items=value;
    }

    public List<Object> getItems() {
        if (items == null) {
            items = new ArrayList<Object>();
        }
        return this.items;
    }



}
