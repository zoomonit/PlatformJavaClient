

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchUpdateDocumentsSource", propOrder = {
    "id"
})
public class BatchUpdateDocumentsSource
    extends BatchUpdateSource
 {

    @XmlElement(name = "Id", type = Integer.class)
    protected List<Integer> id;

    /**ArrayList is required for the XML-Marshalling */
    public void setId(ArrayList<Integer> value) {
        id=value;
    }

    /**The ids of the documents to be updated.*/
    public List<Integer> getId() {
        if (id == null) {
            id = new ArrayList<Integer>();
        }
        return this.id;
    }



}
