

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.CompareIgnore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebSettings", propOrder = {
    "applicationPreferences"
})
@CompareIgnore
public class WebSettings  {

    @XmlElement(name = "ApplicationPreferences")
    protected List<ApplicationPreferences> applicationPreferences;

    /**ArrayList is required for the XML-Marshalling */
    public void setApplicationPreferences(ArrayList<ApplicationPreferences> value) {
        applicationPreferences=value;
    }

    /**Preferences for a specific application.*/
    public List<ApplicationPreferences> getApplicationPreferences() {
        if (applicationPreferences == null) {
            applicationPreferences = new ArrayList<ApplicationPreferences>();
        }
        return this.applicationPreferences;
    }



}
