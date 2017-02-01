

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationRights", propOrder = {
    "configurationRight"
})
public class ConfigurationRights  {

    @XmlElement(name = "ConfigurationRight")
    @XmlSchemaType(name = "string")
    protected List<ConfigurationRight> configurationRight;

    /**ArrayList is required for the XML-Marshalling */
    public void setConfigurationRight(ArrayList<ConfigurationRight> value) {
        configurationRight=value;
    }

    /**List of configuration rights.*/
    public List<ConfigurationRight> getConfigurationRight() {
        if (configurationRight == null) {
            configurationRight = new ArrayList<ConfigurationRight>();
        }
        return this.configurationRight;
    }



}
