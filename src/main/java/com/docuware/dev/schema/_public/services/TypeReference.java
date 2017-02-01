

package com.docuware.dev.schema._public.services;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeReference")
public class TypeReference  {

    @XmlAttribute(name = "TypeName", required = true)
    protected String typeName;
    @XmlAttribute(name = "Uri")
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String value) {
        this.typeName = value;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String value) {
        this.uri = value;
    }



}
