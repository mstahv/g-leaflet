package org.peimari.gleaflet.client;

import org.peimari.gleaflet.client.control.Attribution;
import org.peimari.gleaflet.client.control.Control;
import org.peimari.gleaflet.client.control.Zoom;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class Map extends JavaScriptObject {

	protected Map() {
	}

	/**
	 * Initializes Leaflet map overlay (L.Map) around given element.
	 * 
	 * @param e
	 * @param options
	 * @return
	 */
	public static native Map create(Element e, MapOptions options)
	/*-{
		return new $wnd.L.Map(e,options);
	}-*/;

	public native final int getZoom()
	/*-{
		return this.getZoom();
	}-*/;

	public native final void setView(LatLng center, Integer zoom)
	/*-{
		this.setView(center,zoom,null);
	}-*/;

	public native final LatLngBounds getBounds()
	/*-{
		return this.getBounds();
	}-*/;

	public native final void fitBounds(LatLngBounds b)
	/*-{
		this.fitBounds(b);
	}-*/;

	public native final Attribution getAttributionControl()
	/*-{
		return this.attributionControl;
	}-*/;

	public native final void invalidateSize()
	/*-{
		this.invalidateSize();
	}-*/;

	public native final void addLayer(ILayer layer)
	/*-{
		this.addLayer(layer);
	}-*/;

	public native final void removeLayer(ILayer layer)
	/*-{
		this.removeLayer(layer);
	}-*/;

	/**
	 * Adds click listener to map.
	 * 
	 * @param listener
	 */
	public native final void addClickListener(ClickListener listener)
	/*-{
		this.on("click", function(e) {
				$entry(listener.@org.peimari.gleaflet.client.ClickListener::onClick(Lorg/peimari/gleaflet/client/MouseEvent;)(e));
		});
		// TODO return the function that user can use as reference if a specific listener needs to be removed
	}-*/;

	public native final void addControl(Control control)
	/*-{
		this.addControl(control);
	}-*/;

	public native final void removeControl(Control control)
	/*-{
		this.removeControl(control);
	}-*/;

	public native final void addMoveEndListener(MoveEndListener listener)
	/*-{
		this.on("moveend", function(e) {
				$entry(listener.@org.peimari.gleaflet.client.MoveEndListener::onMoveEnd(Lorg/peimari/gleaflet/client/Event;)(e));
		});
	}-*/;

	/**
	 * Removes listener from map. The listener is detected on listener
	 * registration object returned by listener addition method.
	 * 
	 * @param listenerRegistration
	 */
	public native final void removeListener(JavaScriptObject listenerRegistration)
	/*-{
		this.off(listenerRegistration.prototype.gname, listenerRegistration);
	}-*/;

	public native final void removeClickListeners()
	/*-{
		this.off("click");
	}-*/;

	public native final Zoom getZoomControl()
	/*-{
		return this.zoomControl;
	}-*/;

}
