package org.peimari.gleaflet.client.control;

import com.google.gwt.core.client.JavaScriptObject;

public class LayersOptions extends JavaScriptObject {

    protected LayersOptions() {
    }

    public static native LayersOptions create()
	/*-{
        return {};
    }-*/;

    public native final void setCollapsed(boolean collapsed)
	/*-{
        this.collapsed = collapsed;
    }-*/;
}
