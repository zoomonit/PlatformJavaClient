

package com.docuware.dev.settings.common;

import javax.xml.bind.annotation.XmlRegistry;


@XmlRegistry
public class ObjectFactory  {


    public ObjectFactory() {
    }

    public DWRectangle createDWRectangle() {
        return new DWRectangle();
    }

    public KeyValuePair createKeyValuePair() {
        return new KeyValuePair();
    }

    public KeyValuePairs createKeyValuePairs() {
        return new KeyValuePairs();
    }

    public DWPoint createDWPoint() {
        return new DWPoint();
    }

    public DWSize createDWSize() {
        return new DWSize();
    }



}
