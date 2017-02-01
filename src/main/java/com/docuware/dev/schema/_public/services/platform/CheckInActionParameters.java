

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckInActionParameters", propOrder = {
    "documentVersion"
})
public class CheckInActionParameters
    extends DocumentActionParameters
 {

    @XmlElement(name = "DocumentVersion", required = true)
    protected DocumentVersion documentVersion;
    @XmlAttribute(name = "Comments")
    protected String comments;

    /**Check in version of the document*/
    public DocumentVersion getDocumentVersion() {
        return documentVersion;
    }

    /**Check in version of the document*/
    public void setDocumentVersion(DocumentVersion value) {
        this.documentVersion = value;
    }

    /**Minor version of the document.*/
    public String getComments() {
        return comments;
    }

    /**Minor version of the document.*/
    public void setComments(String value) {
        this.comments = value;
    }



}
