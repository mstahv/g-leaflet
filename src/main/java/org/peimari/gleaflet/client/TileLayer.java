package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class TileLayer extends JavaScriptObject implements ILayer {
	
	protected TileLayer() {}
	
	public static native TileLayer create(String url, TileLayerOptions tileOptions) 
	/*-{
		return new $wnd.L.TileLayer(url, tileOptions);
	}-*/;
        
        public native final void bringToFront() 
        /*-{
            this.bringToFront();
        }-*/;

        public native final void bringToBack() 
        /*-{
            this.bringToBack();
        }-*/;
        
        /**
         * Adds load listener to the layer.
         * <p>
         * The listeners are called when all visible tiles are loaded.
         * @param listener
	 * @return a handle that can be used to remove this specific listener from
	 *         the map
	 * @see {@link http://leafletjs.com/reference.html#tilelayer-load}
         */
        public native final JavaScriptObject addLoadListener(LoadListener listener)
        /*-{
		var fn = $entry(function(e) {
				listener.@org.peimari.gleaflet.client.LoadListener::onLoad(Lorg/peimari/gleaflet/client/Event;)(e);
		});
		fn.prototype['gname'] = "load";
		this.on(fn.prototype['gname'], fn);
		return fn;
         }-*/;
        
        /**
         * Adds loading listener to the layer.
         * <p>
         * The listeners are called when the tile layer starts loading tiles.
         * @param listener
	 * @return a handle that can be used to remove this specific listener from
	 *         the map
	 * @see {@link http://leafletjs.com/reference.html#tilelayer-loading}
         */
        public native final JavaScriptObject addLoadingListener(LoadingListener listener)
        /*-{
		var fn = $entry(function(e) {
				listener.@org.peimari.gleaflet.client.LoadingListener::onLoading(Lorg/peimari/gleaflet/client/Event;)(e);
		});
		fn.prototype['gname'] = "loading";
		this.on(fn.prototype['gname'], fn);
		return fn;
         }-*/;
      
        /**
	 * Removes listener from layer. The listener is detected on listener
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
}
