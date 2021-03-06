

package com.docuware.dev.schema._public.services.platform;

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
@XmlType(name = "DocumentLinks", propOrder = {
"proxy",
    "items"
})
public class DocumentLinks  implements IHttpClientProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Items")
    protected List<DocumentLink> items;

    /**ArrayList is required for the XML-Marshalling */
    public void setItems(ArrayList<DocumentLink> value) {
        items=value;
    }

    /**Define specific document link of a document*/
    public List<DocumentLink> getItems() {
        if (items == null) {
            items = new ArrayList<DocumentLink>();
        }
        return this.items;
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
	if(this.items!=null) { 
        for (int i = 0; (i < this.items.size()); i = (i + 1)) {
            this.items.get(i).setProxy(proxy);
        }
	}
    }



}
