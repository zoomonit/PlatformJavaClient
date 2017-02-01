

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.CompareIgnore;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentAreaPreferences", propOrder = {
    "instances"
})
@XmlSeeAlso({
    WorkflowAreaPreferences.class,
    BasketAreaPreferences.class
})
@CompareIgnore
public class ContentAreaPreferences  {

    @XmlElement(name = "Instances")
    protected List<WorkInstance> instances;
    @XmlAttribute(name = "AreaType")
    protected WorkAreaType areaType;
    @XmlAttribute(name = "SelectedInstanceIndex")
    protected Integer selectedInstanceIndex;

    /**ArrayList is required for the XML-Marshalling */
    public void setInstances(ArrayList<WorkInstance> value) {
        instances=value;
    }

    /**Items assigned to the area like dialogs, Baskets.*/
    public List<WorkInstance> getInstances() {
        if (instances == null) {
            instances = new ArrayList<WorkInstance>();
        }
        return this.instances;
    }

    public WorkAreaType getAreaType() {
        if (areaType == null) {
            return WorkAreaType.NONE;
        } else {
            return areaType;
        }
    }

    public void setAreaType(WorkAreaType value) {
        this.areaType = value;
    }

    public Integer getSelectedInstanceIndex() {
        return selectedInstanceIndex;
    }

    public void setSelectedInstanceIndex(Integer value) {
        this.selectedInstanceIndex = value;
    }



}
