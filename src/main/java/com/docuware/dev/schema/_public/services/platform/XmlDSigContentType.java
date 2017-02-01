

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.Eagle;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlDSigContentType", propOrder = {
    "nodes"
})
public class XmlDSigContentType  {

    @XmlElement(name = "Nodes")
    protected List<XmlDSigContentType> nodes;
    @XmlAttribute(name = "Status", required = true)
    protected XmlDSigStatusType status;
    @XmlAttribute(name = "Description", required = true)
    protected String description;
    @XmlAttribute(name = "ErrorInfo")
    protected String errorInfo;
    @XmlAttribute(name = "Warning")
    protected Boolean warning;

    /**ArrayList is required for the XML-Marshalling */
    public void setNodes(ArrayList<XmlDSigContentType> value) {
        nodes=value;
    }

    @Eagle
    public List<XmlDSigContentType> getNodes() {
        if (nodes == null) {
            nodes = new ArrayList<XmlDSigContentType>();
        }
        return this.nodes;
    }

    @Eagle
    public XmlDSigStatusType getStatus() {
        return status;
    }

    @Eagle
    public void setStatus(XmlDSigStatusType value) {
        this.status = value;
    }

    @Eagle
    public String getDescription() {
        return description;
    }

    @Eagle
    public void setDescription(String value) {
        this.description = value;
    }

    @Eagle
    public String getErrorInfo() {
        return errorInfo;
    }

    @Eagle
    public void setErrorInfo(String value) {
        this.errorInfo = value;
    }

    @Eagle
    public boolean isWarning() {
        if (warning == null) {
            return false;
        } else {
            return warning;
        }
    }

    @Eagle
    public void setWarning(Boolean value) {
        this.warning = value;
    }



}
