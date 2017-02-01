

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
@XmlType(name = "Stamps", propOrder = {
"proxy",
    "stamp"
})
public class Stamps  implements IHttpClientProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Stamp")
    protected List<Stamp> stamp;

    /**ArrayList is required for the XML-Marshalling */
    public void setStamp(ArrayList<Stamp> value) {
        stamp=value;
    }

    /**List of stamps.*/
    public List<Stamp> getStamp() {
        if (stamp == null) {
            stamp = new ArrayList<Stamp>();
        }
        return this.stamp;
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
	if(this.stamp!=null) { 
        for (int i = 0; (i < this.stamp.size()); i = (i + 1)) {
            this.stamp.get(i).setProxy(proxy);
        }
	}
    }



}
