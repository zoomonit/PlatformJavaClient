

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentMergeOperationInfo", propOrder = {
    "documents"
})
public class ContentMergeOperationInfo  {

    @XmlElement(name = "Documents", type = Integer.class)
    protected List<Integer> documents;
    @XmlAttribute(name = "Operation", required = true)
    protected ContentMergeOperation operation;
    @XmlAttribute(name = "Force")
    protected Boolean force;

    /**ArrayList is required for the XML-Marshalling */
    public void setDocuments(ArrayList<Integer> value) {
        documents=value;
    }

    /**Collection of documents to be used in the operation*/
    public List<Integer> getDocuments() {
        if (documents == null) {
            documents = new ArrayList<Integer>();
        }
        return this.documents;
    }

    /**Operation that have to be executed.*/
    public ContentMergeOperation getOperation() {
        return operation;
    }

    /**Operation that have to be executed.*/
    public void setOperation(ContentMergeOperation value) {
        this.operation = value;
    }

    /**Force merge operation even if possible loss of data*/
    public boolean isForce() {
        if (force == null) {
            return false;
        } else {
            return force;
        }
    }

    /**Force merge operation even if possible loss of data*/
    public void setForce(Boolean value) {
        this.force = value;
    }



}
