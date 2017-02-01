

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportResultEntry", propOrder = {
    "entryVersions"
})
public class ImportResultEntry  {

    @XmlElement(name = "EntryVersions")
    protected List<ImportEntryVersion> entryVersions;
    @XmlAttribute(name = "ErrorMessage")
    protected String errorMessage;
    @XmlAttribute(name = "Status", required = true)
    protected ImportEntryStatus status;

    /**ArrayList is required for the XML-Marshalling */
    public void setEntryVersions(ArrayList<ImportEntryVersion> value) {
        entryVersions=value;
    }

    /**A list with the sequence value of the documents that are not imported.*/
    public List<ImportEntryVersion> getEntryVersions() {
        if (entryVersions == null) {
            entryVersions = new ArrayList<ImportEntryVersion>();
        }
        return this.entryVersions;
    }

    /**Gets or sets the error message if the import operation fails.*/
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**Gets or sets the status of the document.*/
    public ImportEntryStatus getStatus() {
        return status;
    }

    public void setStatus(ImportEntryStatus value) {
        this.status = value;
    }



}
