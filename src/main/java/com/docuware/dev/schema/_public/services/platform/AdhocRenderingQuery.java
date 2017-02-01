

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.settings.common.DWSize;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdhocRenderingQuery", propOrder = {
    "size"
})
public class AdhocRenderingQuery  {

    @XmlElement(name = "Size")
    protected DWSize size;
    @XmlAttribute(name = "Page")
    protected Integer page;
    @XmlAttribute(name = "Dpi")
    protected Float dpi;

    /**Gets or sets the size in pixels of the rendering canvas.*/
    public DWSize getSize() {
        return size;
    }

    public void setSize(DWSize value) {
        this.size = value;
    }

    /**Gets or sets page number to be rendered.*/
    public int getPage() {
        if (page == null) {
            return  0;
        } else {
            return page;
        }
    }

    public void setPage(Integer value) {
        this.page = value;
    }

    /**Gets or sets the resolution of the rendered bitmap.*/
    public float getDpi() {
        if (dpi == null) {
            return  72.0F;
        } else {
            return dpi;
        }
    }

    public void setDpi(Float value) {
        this.dpi = value;
    }



}
