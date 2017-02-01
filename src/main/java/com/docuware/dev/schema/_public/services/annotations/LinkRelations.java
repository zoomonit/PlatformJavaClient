

package com.docuware.dev.schema._public.services.annotations;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkRelations", propOrder = {
    "relation"
})
public class LinkRelations  {

    @XmlElement(name = "Relation")
    protected List<LinkRelation> relation;
    @XmlAttribute(name = "IsComplete")
    protected Boolean isComplete;

    /**ArrayList is required for the XML-Marshalling */
    public void setRelation(ArrayList<LinkRelation> value) {
        relation=value;
    }

    public List<LinkRelation> getRelation() {
        if (relation == null) {
            relation = new ArrayList<LinkRelation>();
        }
        return this.relation;
    }

    /**If this is true than there are no other links are expected than the specified.*/
    public boolean isIsComplete() {
        if (isComplete == null) {
            return false;
        } else {
            return isComplete;
        }
    }

    /**If this is true than there are no other links are expected than the specified.*/
    public void setIsComplete(Boolean value) {
        this.isComplete = value;
    }



}
