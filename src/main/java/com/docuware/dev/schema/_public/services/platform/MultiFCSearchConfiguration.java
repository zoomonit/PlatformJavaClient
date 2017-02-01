

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.CompareIgnore;
import com.docuware.dev.Extensions.Eagle;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiFCSearchConfiguration", propOrder = {
    "fcIds"
})
@CompareIgnore
public class MultiFCSearchConfiguration  {

    @XmlElement(name = "FcIds")
    protected List<String> fcIds;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "SearchDialogID")
    protected String searchDialogID;
    @XmlAttribute(name = "SearchDialogFCID")
    protected String searchDialogFCID;
    @XmlAttribute(name = "Id")
    protected String id;

    /**ArrayList is required for the XML-Marshalling */
    public void setFcIds(ArrayList<String> value) {
        fcIds=value;
    }

    @Eagle
    public List<String> getFcIds() {
        if (fcIds == null) {
            fcIds = new ArrayList<String>();
        }
        return this.fcIds;
    }

    @Eagle
    public String getName() {
        return name;
    }

    @Eagle
    public void setName(String value) {
        this.name = value;
    }

    @Eagle
    public String getSearchDialogID() {
        return searchDialogID;
    }

    @Eagle
    public void setSearchDialogID(String value) {
        this.searchDialogID = value;
    }

    @Eagle
    public String getSearchDialogFCID() {
        return searchDialogFCID;
    }

    @Eagle
    public void setSearchDialogFCID(String value) {
        this.searchDialogFCID = value;
    }

    @Eagle
    public String getId() {
        return id;
    }

    @Eagle
    public void setId(String value) {
        this.id = value;
    }



}
