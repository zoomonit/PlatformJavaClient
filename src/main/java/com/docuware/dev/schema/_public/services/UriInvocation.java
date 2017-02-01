

package com.docuware.dev.schema._public.services;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UriInvocation", propOrder = {
    "acceptedType",
    "producedType",
    "tag"
})
public class UriInvocation  {

    @XmlElement(name = "AcceptedType")
    protected List<TypeReference> acceptedType;
    @XmlElement(name = "ProducedType")
    protected List<TypeReference> producedType;
    @XmlElement(name = "Tag")
    protected String tag;
    @XmlAttribute(name = "Verb")
    @XmlSchemaType(name = "anySimpleType")
    protected String verb;

    /**ArrayList is required for the XML-Marshalling */
    public void setAcceptedType(ArrayList<TypeReference> value) {
        acceptedType=value;
    }

    public List<TypeReference> getAcceptedType() {
        if (acceptedType == null) {
            acceptedType = new ArrayList<TypeReference>();
        }
        return this.acceptedType;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setProducedType(ArrayList<TypeReference> value) {
        producedType=value;
    }

    public List<TypeReference> getProducedType() {
        if (producedType == null) {
            producedType = new ArrayList<TypeReference>();
        }
        return this.producedType;
    }

    /**Application specific tag for the method.*/
    public String getTag() {
        return tag;
    }

    /**Application specific tag for the method.*/
    public void setTag(String value) {
        this.tag = value;
    }

    public String getVerb() {
        if (verb == null) {
            return "GET";
        } else {
            return verb;
        }
    }

    public void setVerb(String value) {
        this.verb = value;
    }



}
