

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentIndexFieldKeywords", propOrder = {
    "keyword"
})
public class DocumentIndexFieldKeywords  {

    @XmlElement(name = "Keyword")
    protected List<String> keyword;

    /**ArrayList is required for the XML-Marshalling */
    public void setKeyword(ArrayList<String> value) {
        keyword=value;
    }

    /**List of keywords*/
    public List<String> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<String>();
        }
        return this.keyword;
    }



}
