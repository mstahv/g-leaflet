package org.peimari.gleaflet.client.control;

import com.google.gwt.core.client.JavaScriptObject;

public class ScaleOptions extends JavaScriptObject {
	
	protected ScaleOptions() {}
	
	public static native ScaleOptions create() 
	/*-{
		return {};
	}-*/;

	public native final void setImperial(boolean imperial) 
	/*-{
		this.imperial = imperial;
	}-*/;

	public native final void setMetric(boolean metric) 
	/*-{
		this.metric = metric;
	}-*/;

}
