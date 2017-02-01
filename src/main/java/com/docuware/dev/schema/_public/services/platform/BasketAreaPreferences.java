

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.CompareIgnore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasketAreaPreferences")
@CompareIgnore
public class BasketAreaPreferences
    extends ContentAreaPreferences
 {

    @XmlAttribute(name = "StoreDialogsBarLocked")
    protected Boolean storeDialogsBarLocked;

    public boolean isStoreDialogsBarLocked() {
        if (storeDialogsBarLocked == null) {
            return false;
        } else {
            return storeDialogsBarLocked;
        }
    }

    public void setStoreDialogsBarLocked(Boolean value) {
        this.storeDialogsBarLocked = value;
    }



}
