package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class TileLayerOptions extends JavaScriptObject {
	
	protected TileLayerOptions() {}
	
	public static native TileLayerOptions create() 
	/*-{
		return {};
	}-*/;

	public native final void setAttribution(String attributionString) 
	/*-{
		this.attribution = attributionString;
	}-*/;

	public native final void setDetectRetina(boolean detect) 
	/*-{
		this.detectRetina = detect;
	}-*/;

	public final void setSubDomains(String[] subDomains) {
		JsArrayString domains = JsArrayString.createArray().cast();
		for (String a : subDomains) {
			domains.push(a);
		}
		setSubDomains(domains);
	}
	
	public native final void setSubDomains(JsArrayString subdomains) 
	/*-{
		this.subdomains = subdomains;
	}-*/;

	public native final void setMaxZoom(Integer maxZoom) 
	/*-{
		this.maxZoom = maxZoom;
	}-*/;

	public native final void setTms(Boolean tms) 
	/*-{
		this.tms = tms;
	}-*/;

	public native final void setOpacity(Double opacity) 
	/*-{
		this.opacity = opacity;
	}-*/;

}
