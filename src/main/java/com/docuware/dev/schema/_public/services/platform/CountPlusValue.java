

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountPlusValue", propOrder = {
    "value"
})
public class CountPlusValue  {

    @XmlValue
    protected int value;
    @XmlAttribute(name = "HasMore")
    protected Boolean hasMore;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    /**If this flag is true then the real number of hits can be larger than specified by the value of this element.*/
    public boolean isHasMore() {
        if (hasMore == null) {
            return false;
        } else {
            return hasMore;
        }
    }

    /**If this flag is true then the real number of hits can be larger than specified by the value of this element.*/
    public void setHasMore(Boolean value) {
        this.hasMore = value;
    }



}
