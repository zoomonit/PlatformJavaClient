

package com.docuware.dev._public.intellix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Words", propOrder = {
    "wd"
})
public class Words  {

    @XmlElement(name = "Wd")
    protected List<Word> wd;

    /**ArrayList is required for the XML-Marshalling */
    public void setWd(ArrayList<Word> value) {
        wd=value;
    }

    public List<Word> getWd() {
        if (wd == null) {
            wd = new ArrayList<Word>();
        }
        return this.wd;
    }



}
