

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.Dolphin;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDefinedSearchInfo", propOrder = {
    "dialogExpression"
})
public class UserDefinedSearchInfo  {

    @XmlElement(name = "DialogExpression", required = true)
    protected DialogExpression dialogExpression;
    @XmlAttribute(name = "Name")
    protected String name;

    /**Gets or sets the conditions which are used for creating user defined search based on result list.*/
    @Dolphin
    public DialogExpression getDialogExpression() {
        return dialogExpression;
    }

    @Dolphin
    public void setDialogExpression(DialogExpression value) {
        this.dialogExpression = value;
    }

    /**The name of the user defined search based on result list.*/
    @Dolphin
    public String getName() {
        return name;
    }

    /**The name of the user defined search based on result list.*/
    @Dolphin
    public void setName(String value) {
        this.name = value;
    }



}
