

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.Extension;
import com.docuware.dev.Extensions.Extensions;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentIndexFields", propOrder = {
    "field"
})
@XmlSeeAlso({
    UpdateIndexFieldsInfo.class
})
public class DocumentIndexFields  {

    @XmlElement(name = "Field")
    protected List<DocumentIndexField> field;

    /**ArrayList is required for the XML-Marshalling */
    public void setField(ArrayList<DocumentIndexField> value) {
        field=value;
    }

    /**List of index fields*/
    public List<DocumentIndexField> getField() {
        if (field == null) {
            field = new ArrayList<DocumentIndexField>();
        }
        return this.field;
    }


	/**
	* Gets the DocumentIndexField with the specified name.
	* 
	* @param fieldName	Name of the Field
	* @return	the requested field
	*/
    @Extension
    public DocumentIndexField getItem(String fieldName) {
	return Extensions.getDocumentIndexFieldByNameFromDocumentIndexFields(this, fieldName);
    }


	/**
	* Sets or create the DocumentIndexField with the specified name and value.
	* 
	* @param fieldName	Name of the Field
	* @param value	The value
	* @return	the requested field
	*/
    @Extension
    public void setItem(String fieldName,DocumentIndexField value) {
	Extensions.createOrUpdate(this.getField(), fieldName, value);
    }



}
