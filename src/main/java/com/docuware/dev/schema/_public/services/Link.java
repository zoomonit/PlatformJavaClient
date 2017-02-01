

package com.docuware.dev.schema._public.services;

import com.docuware.dev.Extensions.Extension;
import com.docuware.dev.Extensions.Extensions;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Link")
public class Link  {

    @XmlAttribute(name = "rel")
    protected String rel;
    @XmlAttribute(name = "href")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "type")
    protected String type;

    public String getRel() {
        return rel;
    }

    public void setRel(String value) {
        this.rel = value;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String value) {
        this.href = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }


	/**
	* Returns a String that represents this instance
	*
	* @return	A String representing this instance.
	*/
    @Extension
    public String toString() {
	return Extensions.linkToString(this);
    }



}
