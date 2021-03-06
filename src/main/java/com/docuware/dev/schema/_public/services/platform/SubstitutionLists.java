

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.CompareIgnore;
import com.docuware.dev.Extensions.Extension;
import com.docuware.dev.Extensions.HttpClientProxy;
import com.docuware.dev.Extensions.IHttpClientProxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstitutionLists", propOrder = {
"proxy",
    "item"
})
@CompareIgnore
public class SubstitutionLists  implements IHttpClientProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Item")
    protected List<SubstitutionList> item;

    /**ArrayList is required for the XML-Marshalling */
    public void setItem(ArrayList<SubstitutionList> value) {
        item=value;
    }

    public List<SubstitutionList> getItem() {
        if (item == null) {
            item = new ArrayList<SubstitutionList>();
        }
        return this.item;
    }


	/**
	* Gets the proxy.
	* 
	* @return	The proxy
	*/
    @Extension
    public HttpClientProxy getProxy() {
	return this.proxy;
    }


	/**
	* Sets the HTTP Communication Proxy which is used in futher HTTP communication.
	* 
	* @param proxy	The new proxy
	*/
    @Extension
    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
	if(this.item!=null) { 
        for (int i = 0; (i < this.item.size()); i = (i + 1)) {
            this.item.get(i).setProxy(proxy);
        }
	}
    }



}
