

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.CompareIgnore;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkAreaPreferences", propOrder = {
    "contentAreas"
})
@CompareIgnore
public class WorkAreaPreferences  {

    @XmlElement(name = "ContentAreas")
    protected List<ContentAreaPreferences> contentAreas;
    @XmlAttribute(name = "Name")
    protected String name;

    /**ArrayList is required for the XML-Marshalling */
    public void setContentAreas(ArrayList<ContentAreaPreferences> value) {
        contentAreas=value;
    }

    public List<ContentAreaPreferences> getContentAreas() {
        if (contentAreas == null) {
            contentAreas = new ArrayList<ContentAreaPreferences>();
        }
        return this.contentAreas;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }



}
