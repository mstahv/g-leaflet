package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JsArrayString;

public class TileLayerOptions extends GridLayerOptions {
	
	protected TileLayerOptions() {}
	
	public static native TileLayerOptions create() 
	/*-{
		return {};
	}-*/;

	public native final void setDetectRetina(boolean detect) 
	/*-{
		this.detectRetina = detect;
	}-*/;

	public final void setSubDomains(String... subDomains) {
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

	public native final void setMinZoom(int minZoom)
	/*-{
		this.minZoom = minZoom;
	}-*/;

	public native final void setMaxZoom(int maxZoom) 
	/*-{
		this.maxZoom = maxZoom;
	}-*/;

	public native final void setTms(boolean tms) 
	/*-{
		this.tms = tms;
	}-*/;

	public native final void setZoomOffset(int zoomOffset)
	/*-{
		this.zoomOffset = zoomOffset;
	}-*/;

}
