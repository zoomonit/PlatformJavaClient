

package com.docuware.dev.schema._public.services.annotations;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkRelation", propOrder = {
    "invoke"
})
public class LinkRelation  {

    @XmlElement(name = "Invoke")
    protected List<LinkInvoke> invoke;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "IntroducedIn")
    protected String introducedIn;

    /**ArrayList is required for the XML-Marshalling */
    public void setInvoke(ArrayList<LinkInvoke> value) {
        invoke=value;
    }

    public List<LinkInvoke> getInvoke() {
        if (invoke == null) {
            invoke = new ArrayList<LinkInvoke>();
        }
        return this.invoke;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getIntroducedIn() {
        return introducedIn;
    }

    public void setIntroducedIn(String value) {
        this.introducedIn = value;
    }



}
