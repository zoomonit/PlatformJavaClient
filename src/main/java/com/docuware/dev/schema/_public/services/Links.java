

package com.docuware.dev.schema._public.services;

import com.docuware.dev.Extensions.Extension;
import com.docuware.dev.Extensions.RelationExtension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Links", propOrder = {
    "link"
})
public class Links  {

    @XmlElement(name = "Link")
    protected List<Link> link;

    /**ArrayList is required for the XML-Marshalling */
    public void setLink(ArrayList<Link> value) {
        link=value;
    }

    public List<Link> getLink() {
        if (link == null) {
            link = new ArrayList<Link>();
        }
        return this.link;
    }


	/**
	* Gets the link by its name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists; null otherwise.
	*/
    @Extension
    public Link getLink(String relationName) {
	return RelationExtension.getLink(this, relationName);
    }



}
