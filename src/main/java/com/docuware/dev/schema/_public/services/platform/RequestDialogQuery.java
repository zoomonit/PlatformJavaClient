

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDialogQuery", propOrder = {
    "dialogTypes"
})
public class RequestDialogQuery  {

    @XmlElement(name = "DialogTypes")
    @XmlSchemaType(name = "string")
    protected List<DialogTypes> dialogTypes;

    /**ArrayList is required for the XML-Marshalling */
    public void setDialogTypes(ArrayList<DialogTypes> value) {
        dialogTypes=value;
    }

    /**Array of document types.*/
    public List<DialogTypes> getDialogTypes() {
        if (dialogTypes == null) {
            dialogTypes = new ArrayList<DialogTypes>();
        }
        return this.dialogTypes;
    }



}
