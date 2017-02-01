

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentActionInfo", propOrder = {
    "documentActionParameters"
})
public class DocumentActionInfo  {

    @XmlElement(name = "DocumentActionParameters", required = true)
    protected DocumentActionParameters documentActionParameters;
    @XmlAttribute(name = "DocumentAction", required = true)
    protected DocumentAction documentAction;

    /**Specific data for the action*/
    public DocumentActionParameters getDocumentActionParameters() {
        return documentActionParameters;
    }

    /**Specific data for the action*/
    public void setDocumentActionParameters(DocumentActionParameters value) {
        this.documentActionParameters = value;
    }

    /**Actions pereformed on document*/
    public DocumentAction getDocumentAction() {
        return documentAction;
    }

    /**Actions pereformed on document*/
    public void setDocumentAction(DocumentAction value) {
        this.documentAction = value;
    }



}
