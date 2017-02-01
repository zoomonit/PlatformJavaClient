

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyTemplateInput")
public class CopyTemplateInput  {

    @XmlAttribute(name = "TemplateGUID", required = true)
    protected String templateGUID;

    /**GUID for the template to copy*/
    public String getTemplateGUID() {
        return templateGUID;
    }

    /**GUID for the template to copy*/
    public void setTemplateGUID(String value) {
        this.templateGUID = value;
    }



}
