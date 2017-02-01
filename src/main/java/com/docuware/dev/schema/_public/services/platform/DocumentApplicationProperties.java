

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentApplicationProperties", propOrder = {
    "documentApplicationProperty"
})
public class DocumentApplicationProperties  {

    @XmlElement(name = "DocumentApplicationProperty")
    protected List<DocumentApplicationProperty> documentApplicationProperty;

    /**ArrayList is required for the XML-Marshalling */
    public void setDocumentApplicationProperty(ArrayList<DocumentApplicationProperty> value) {
        documentApplicationProperty=value;
    }

    /**Define application specific properties. Different applications store specific application here*/
    public List<DocumentApplicationProperty> getDocumentApplicationProperty() {
        if (documentApplicationProperty == null) {
            documentApplicationProperty = new ArrayList<DocumentApplicationProperty>();
        }
        return this.documentApplicationProperty;
    }



}
