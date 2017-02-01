

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportEntryVersion")
public class ImportEntryVersion  {

    @XmlAttribute(name = "Id", required = true)
    protected int id;
    @XmlAttribute(name = "Status", required = true)
    protected ImportEntryVersionStatus status;

    /**Gets or sets the error message if the import operation fails.*/
    public int getId() {
        return id;
    }

    public void setId(int value) {
        this.id = value;
    }

    /**Gets or sets the status of the document.*/
    public ImportEntryVersionStatus getStatus() {
        return status;
    }

    public void setStatus(ImportEntryVersionStatus value) {
        this.status = value;
    }



}
