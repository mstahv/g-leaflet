package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class DivIconOptions extends JavaScriptObject {

	protected DivIconOptions() {
	}

	public static native DivIconOptions create()
	/*-{
		return {};
	}-*/;

	/**
	 * The coordinates of the point from which popups will "open", relative to the icon anchor.
	 * @param point
	 */
	public native final void setPopupAnchor(Point point)
	/*-{
		this.popupAnchor = point;
	}-*/;

	/**
	 * The coordinates of the "tip" of the icon (relative to its top left
	 * corner). The icon will be aligned so that this point is at the marker's
	 * geographical location. Centered by default if size is specified, also can
	 * be set in CSS with negative margins.
	 * 
	 * @param point
	 */
	public native final void setIconAnchor(Point point)
	/*-{
		this.iconAnchor = point;
	}-*/;

	public native final void setIconSize(Point size)
	/*-{
		this.iconSize = size;
	}-*/;

	public native final void setHtml(String html) 
	/*-{
		this.html = html;
	}-*/;

	public native final void setClassName(String className) 
	/*-{
		this.className = className;
	}-*/;

    public native final String getClassName() 
    /*-{
        return this.className;
    }-*/;
}
