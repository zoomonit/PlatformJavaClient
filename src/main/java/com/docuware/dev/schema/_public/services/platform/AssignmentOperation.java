

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignmentOperation", propOrder = {
    "ids"
})
public class AssignmentOperation  {

    @XmlElement(name = "Ids")
    protected List<String> ids;
    @XmlAttribute(name = "OperationType", required = true)
    protected AssignmentOperationType operationType;

    /**ArrayList is required for the XML-Marshalling */
    public void setIds(ArrayList<String> value) {
        ids=value;
    }

    /**List of ids of the assigned objects.*/
    public List<String> getIds() {
        if (ids == null) {
            ids = new ArrayList<String>();
        }
        return this.ids;
    }

    public AssignmentOperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(AssignmentOperationType value) {
        this.operationType = value;
    }



}
