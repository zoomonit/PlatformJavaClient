

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.CompareIgnore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewerToolbarControl")
@CompareIgnore
public class ViewerToolbarControl  {

    @XmlAttribute(name = "Type", required = true)
    protected ToolbarControlType type;
    @XmlAttribute(name = "Checked", required = true)
    protected boolean checked;
    @XmlAttribute(name = "State", required = true)
    protected ToolbarControlState state;

    public ToolbarControlType getType() {
        return type;
    }

    public void setType(ToolbarControlType value) {
        this.type = value;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean value) {
        this.checked = value;
    }

    public ToolbarControlState getState() {
        return state;
    }

    public void setState(ToolbarControlState value) {
        this.state = value;
    }



}
