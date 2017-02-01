

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileCabinetTransferInfo", propOrder = {
    "sourceDocId"
})
public class FileCabinetTransferInfo  {

    @XmlElement(name = "SourceDocId", type = Integer.class)
    protected List<Integer> sourceDocId;
    @XmlAttribute(name = "SourceFileCabinetId", required = true)
    protected String sourceFileCabinetId;
    @XmlAttribute(name = "KeepSource")
    protected Boolean keepSource;
    @XmlAttribute(name = "FillIntellix")
    protected Boolean fillIntellix;

    /**ArrayList is required for the XML-Marshalling */
    public void setSourceDocId(ArrayList<Integer> value) {
        sourceDocId=value;
    }

    /**Contains the identifiers of the documents to be copied/moved.*/
    public List<Integer> getSourceDocId() {
        if (sourceDocId == null) {
            sourceDocId = new ArrayList<Integer>();
        }
        return this.sourceDocId;
    }

    /**Gets the id of the file cabinet which contains the document to be copied/moved.*/
    public String getSourceFileCabinetId() {
        return sourceFileCabinetId;
    }

    /**Gets the id of the file cabinet which contains the document to be copied/moved.*/
    public void setSourceFileCabinetId(String value) {
        this.sourceFileCabinetId = value;
    }

    /**If this flag is true the source documents remain in the source file cabinet; otherwise they are removed from the source file cabinet.*/
    public boolean isKeepSource() {
        if (keepSource == null) {
            return false;
        } else {
            return keepSource;
        }
    }

    /**If this flag is true the source documents remain in the source file cabinet; otherwise they are removed from the source file cabinet.*/
    public void setKeepSource(Boolean value) {
        this.keepSource = value;
    }

    /**If this flag is true the source document's metadata is adjusted with intellix suggestions using the intellix map for the default assigned file cabinet.*/
    public boolean isFillIntellix() {
        if (fillIntellix == null) {
            return false;
        } else {
            return fillIntellix;
        }
    }

    /**If this flag is true the source document's metadata is adjusted with intellix suggestions using the intellix map for the default assigned file cabinet.*/
    public void setFillIntellix(Boolean value) {
        this.fillIntellix = value;
    }



}
