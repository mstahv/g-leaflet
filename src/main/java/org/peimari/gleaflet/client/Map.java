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
	 * @param e the element to the map should be rendered
	 * @param options options for the map
	 * @return the created Map object
	 */
	public static native Map create(Element e, MapOptions options)
	/*-{

        function debounce(func, wait, immediate) {
            var timeout;
            return function() {
                var context = this, args = arguments;
                clearTimeout(timeout);
                timeout = setTimeout(function() {
                    timeout = null;
                    if (!immediate) func.apply(context, args);
                }, wait);
                if (immediate && !timeout) func.apply(context, args);
            };
        };


        var map = new $wnd.L.Map(e,options);
        map.on('zoomanim', debounce(map._onZoomTransitionEnd, 250));

		return map;
	}-*/;

	public native final double getZoom()
	/*-{
        return this.getZoom()*1;
 	}-*/;

	public native final LatLng getCenter()
    /*-{
        return this.getCenter();
    }-*/;

    public native final Point getSize()
    /*-{
           return this.getSize();
     }-*/;

	public native final void setView(LatLng center, Double zoom)
	/*-{
		this.setView(center,zoom,null);
	}-*/;

        public native final void setView(LatLng center, Double zoom, JavaScriptObject options)
	/*-{
		this.setView(center,zoom,options);
	}-*/;

	public native final void flyTo(LatLng center, Double zoom)
	/*-{
		this.flyTo(center, zoom);
	}-*/;

    public native final LatLngBounds getBounds()
	/*-{
		return this.getBounds();
	}-*/;

	public native final void fitBounds(LatLngBounds b)
	/*-{
		this.fitBounds(b);
	}-*/;

	public native final void locate(LocateOptions o)
	/*-{
		this.locate(o);
	}-*/;

	public native final void stopLocate()
	/*-{
		this.stopLocate();
	}-*/;

	public native final Attribution getAttributionControl()
	/*-{
		return this.attributionControl;
	}-*/;

	public native final void invalidateSize()
	/*-{
		this.invalidateSize();
	}-*/;

	public native final void addLayer(Layer layer)
	/*-{
		this.addLayer(layer);
	}-*/;

	public native final void removeLayer(Layer layer)
	/*-{
		this.removeLayer(layer);
	}-*/;

	/**
	 * Adds location found listener to map.
	 *
	 * @param listener the listener
	 * @return a handle that can be used to remove this specific listener from
	 *         the map
	 */
	public native final JavaScriptObject addLocationFoundListener(LocationFoundListener listener)
	/*-{

		var fn = $entry(function(e) {
				listener.@org.peimari.gleaflet.client.LocationFoundListener::onFound(Lorg/peimari/gleaflet/client/LocationEvent;)(e);
		});
		fn.prototype['gname'] = "locationfound";
		this.on(fn.prototype['gname'], fn);
		return fn;
	}-*/;

	/**
	 * Adds location error listener to map.
	 *
	 * @param listener the listener
	 * @return a handle that can be used to remove this specific listener from
	 *         the map
	 */
	public native final JavaScriptObject addLocationErrorListener(LocationErrorListener listener)
	/*-{
		var fn = $entry(function(e) {
				listener.@org.peimari.gleaflet.client.LocationErrorListener::onError(Lorg/peimari/gleaflet/client/ErrorEvent;)(e);
		});
		fn.prototype['gname'] = "locationerror";
		this.on(fn.prototype['gname'], fn);
		return fn;
	}-*/;

	/**
	 * Adds click listener to map.
	 *
	 * @param listener the listener
	 * @return a handle that can be used to remove this specific listener from
	 *         the map
	 */
	public native final JavaScriptObject addClickListener(ClickListener listener)
	/*-{

		var fn = $entry(function(e) {
				listener.@org.peimari.gleaflet.client.ClickListener::onClick(Lorg/peimari/gleaflet/client/MouseEvent;)(e);
		});
		fn.prototype['gname'] = "click";
		this.on(fn.prototype['gname'], fn);
		return fn;
	}-*/;

    public native final JavaScriptObject addContextMenuListener(ContextMenuListener listener)
    /*-{

        var fn = $entry(function(e) {
            listener.@org.peimari.gleaflet.client.ContextMenuListener::onContextMenu(Lorg/peimari/gleaflet/client/MouseEvent;)(e);
        });
        fn.prototype['gname'] = "contextmenu";
        this.on(fn.prototype['gname'], fn);
        return fn;
    }-*/;

	public native final void addControl(Control control)
	/*-{
		this.addControl(control);
	}-*/;

	public native final void removeControl(Control control)
	/*-{
		this.removeControl(control);
	}-*/;

	public native final JavaScriptObject addBaseLayerChangeListener(BaseLayerChangeListener listener)
	/*-{
		var fn = $entry(function(e) {
				listener.@org.peimari.gleaflet.client.BaseLayerChangeListener::onBaseLayerChange(Lorg/peimari/gleaflet/client/LayersControlEvent;)(e);
		});
		fn.prototype['gname'] = "baselayerchange";
		this.on(fn.prototype['gname'], fn);
		return fn;
	}-*/;

	public native final JavaScriptObject addOverlayAddListener(OverlayAddListener listener)
	/*-{
		var fn = $entry(function(e) {
				listener.@org.peimari.gleaflet.client.OverlayAddListener::onOverlayAdd(Lorg/peimari/gleaflet/client/LayersControlEvent;)(e);
		});
		fn.prototype['gname'] = "overlayadd";
		this.on(fn.prototype['gname'], fn);
		return fn;
	}-*/;

	public native final JavaScriptObject addOverlayRemoveListener(OverlayRemoveListener listener)
	/*-{
		var fn = $entry(function(e) {
				listener.@org.peimari.gleaflet.client.OverlayRemoveListener::onOverlayRemove(Lorg/peimari/gleaflet/client/LayersControlEvent;)(e);
		});
		fn.prototype['gname'] = "overlayremove";
		this.on(fn.prototype['gname'], fn);
		return fn;
	}-*/;

	public native final JavaScriptObject addMoveEndListener(
			MoveEndListener listener)
	/*-{
		var fn = $entry(function(e) {
				listener.@org.peimari.gleaflet.client.MoveEndListener::onMoveEnd(Lorg/peimari/gleaflet/client/Event;)(e);
		});
		fn.prototype['gname'] = "moveend";
		this.on(fn.prototype['gname'], fn);
		return fn;
	}-*/;

	public native final JavaScriptObject addDragEndListener(
			DragEndListener listener)
	/*-{
		var fn = $entry(function(e) {
				listener.@org.peimari.gleaflet.client.DragEndListener::onDragEnd(Lorg/peimari/gleaflet/client/Event;)(e);
		});
		fn.prototype['gname'] = "dragend";
		this.on(fn.prototype['gname'], fn);
		return fn;
	}-*/;

	/**
	 * Removes listener from map. The listener is detected on listener
	 * registration object returned by listener addition method.
	 *
	 * @param listenerRegistration
	 *            the object returned by listener addition method
	 */
	public native final void removeListener(
			JavaScriptObject listenerRegistration)
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

    public native final void setMaxBounds(LatLngBounds bounds)
    /*-{
        this.setMaxBounds(bounds);
    }-*/;

    public native final void closePopup(Popup popup)
    /*-{
        this.closePopup(popup);
    }-*/;

	public native final void closeTooltip(Tooltip tooltip)
    /*-{
        this.closeTooltip(tooltip);
    }-*/;

    public native final void setDragging(boolean dragging)
    /*-{
        if(dragging) {
    		this.dragging.enable();
    	}
    	else {
    		this.dragging.disable();
    	}
	}-*/;

    public native final void setBoxZoom(boolean boxZoom)
    /*-{
    	if(boxZoom) {
			this.boxZoom.enable();
		}
		else {
			this.boxZoom.disable();
		}
	}-*/;

    public native final void setDoubleClickZoom(boolean doubleClickZoom)
    /*-{
		if(doubleClickZoom) {
			this.doubleClickZoom.enable();
		}
		else {
			this.doubleClickZoom.disable();
		}
	}-*/;

    public native final void setKeyboard(boolean keyboard)
    /*-{
		if(keyboard) {
			this.keyboard.enable();
		}
		else {
			this.keyboard.disable();
		}
	}-*/;

    public native final void setScrollWheelZoom(boolean scrollWheelZoom)
    /*-{
		if(scrollWheelZoom) {
			this.scrollWheelZoom.enable();
		}
		else {
			this.scrollWheelZoom.disable();
		}
	}-*/;
    public native final void setTouchZoom(boolean touchZoom)
    /*-{
		if(dragging) {
			this.touchZoom.enable();
		}
		else {
			this.touchZoom.disable();
		}
	}-*/;

    public native final LatLng containerPointToLatLng(Point p)
    /*-{
            return this.containerPointToLatLng(p);
    }-*/;
}
