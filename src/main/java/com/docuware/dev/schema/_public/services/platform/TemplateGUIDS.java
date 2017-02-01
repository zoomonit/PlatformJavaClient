

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateGUIDS", propOrder = {
    "templateGUID"
})
public class TemplateGUIDS  {

    @XmlElement(name = "TemplateGUID", required = true)
    protected List<String> templateGUID;

    /**ArrayList is required for the XML-Marshalling */
    public void setTemplateGUID(ArrayList<String> value) {
        templateGUID=value;
    }

    public List<String> getTemplateGUID() {
        if (templateGUID == null) {
            templateGUID = new ArrayList<String>();
        }
        return this.templateGUID;
    }



}
