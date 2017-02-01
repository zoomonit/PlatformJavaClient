

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.Eagle;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentDivideOperationInfo", propOrder = {
    "pages",
    "resultNames"
})
public class ContentDivideOperationInfo  {

    @XmlElement(name = "Pages", type = Integer.class)
    protected List<Integer> pages;
    @XmlElement(name = "ResultNames")
    protected List<String> resultNames;
    @XmlAttribute(name = "Operation", required = true)
    protected ContentDivideOperation operation;
    @XmlAttribute(name = "Force")
    protected Boolean force;

    /**ArrayList is required for the XML-Marshalling */
    public void setPages(ArrayList<Integer> value) {
        pages=value;
    }

    /**Collection of pages to be used in the operation*/
    public List<Integer> getPages() {
        if (pages == null) {
            pages = new ArrayList<Integer>();
        }
        return this.pages;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setResultNames(ArrayList<String> value) {
        resultNames=value;
    }

    /**Define document names to be used for the result documents. Original document name is not changed*/
    @Eagle
    public List<String> getResultNames() {
        if (resultNames == null) {
            resultNames = new ArrayList<String>();
        }
        return this.resultNames;
    }

    /**Operation that have to be executed.*/
    public ContentDivideOperation getOperation() {
        return operation;
    }

    /**Operation that have to be executed.*/
    public void setOperation(ContentDivideOperation value) {
        this.operation = value;
    }

    /**Force divide operation even if possible loss of data*/
    public boolean isForce() {
        if (force == null) {
            return false;
        } else {
            return force;
        }
    }

    /**Force divide operation even if possible loss of data*/
    public void setForce(Boolean value) {
        this.force = value;
    }



}
