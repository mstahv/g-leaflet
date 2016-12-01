package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class DivOverlayOptions extends JavaScriptObject {

    protected DivOverlayOptions() {}

    public native final void setOffset(Point offset)
	/*-{
		this.offset = offset;
	}-*/;

    public native final void setPane(String pane)
	/*-{
		this.pane = pane;
	}-*/;

    public  native final void setClassName(String className)
	/*-{
		this.className = className;
	}-*/;
}
