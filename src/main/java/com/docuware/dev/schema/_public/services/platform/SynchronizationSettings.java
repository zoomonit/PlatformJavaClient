

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.Extension;
import com.docuware.dev.Extensions.FileCabinetExtensionsBase;
import com.docuware.dev.Extensions.IStringContent;
import com.sun.jersey.multipart.FormDataBodyPart;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchronizationSettingss", propOrder = {
    "fieldMappings"
})
public class SynchronizationSettings  implements IStringContent {

    @XmlElement(name = "FieldMappings")
    protected FieldMappings fieldMappings;
    @XmlAttribute(name = "SynchronizationOperation")
    protected SynchronizationOperation synchronizationOperation;
    @XmlAttribute(name = "Id")
    protected Integer id;
    @XmlAttribute(name = "PreserveSystemFields")
    protected Boolean preserveSystemFields;
    @XmlAttribute(name = "ImportNotMappedFields")
    protected Boolean importNotMappedFields;

    /**Gets or sets field mappings.*/
    public FieldMappings getFieldMappings() {
        return fieldMappings;
    }

    public void setFieldMappings(FieldMappings value) {
        this.fieldMappings = value;
    }

    /**Gets or sets a value indicating whether the document' system fields to be replaced.*/
    public SynchronizationOperation getSynchronizationOperation() {
        if (synchronizationOperation == null) {
            return SynchronizationOperation.ADD;
        } else {
            return synchronizationOperation;
        }
    }

    public void setSynchronizationOperation(SynchronizationOperation value) {
        this.synchronizationOperation = value;
    }

    /**Document identity*/
    public int getId() {
        if (id == null) {
            return -1;
        } else {
            return id;
        }
    }

    /**Document identity*/
    public void setId(Integer value) {
        this.id = value;
    }

    /**Gets or sets a value indicating whether the document' system fields to be replaced.*/
    public boolean isPreserveSystemFields() {
        if (preserveSystemFields == null) {
            return false;
        } else {
            return preserveSystemFields;
        }
    }

    public void setPreserveSystemFields(Boolean value) {
        this.preserveSystemFields = value;
    }

    public boolean isImportNotMappedFields() {
        if (importNotMappedFields == null) {
            return false;
        } else {
            return importNotMappedFields;
        }
    }

    public void setImportNotMappedFields(Boolean value) {
        this.importNotMappedFields = value;
    }

    @Extension
    public FormDataBodyPart getStringContent() {
	return FileCabinetExtensionsBase.toStringContent(this);
    }



}
