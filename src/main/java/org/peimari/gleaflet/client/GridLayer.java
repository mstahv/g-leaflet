package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class GridLayer extends Layer {

    protected GridLayer() {}

    public static native GridLayer create(GridLayerOptions options)
    /*-{
		return new $wnd.L.GridLayer(options);
	}-*/;

    /**
     * Brings the tile layer to the top of all tile layers.
     */
    public native final void bringToFront()
    /*-{
        this.bringToFront();
    }-*/;

    /**
     * Brings the tile layer to the bottom of all tile layers.
     */
    public native final void bringToBack()
    /*-{
        this.bringToBack();
    }-*/;

    /**
     * Adds load listener to the layer.
     * http://leafletjs.com/reference-1.2.0.html#gridlayer-load
     * <p>
     * The listeners are called when all visible tiles are loaded.
     * @param listener the listener
     * @return a handle that can be used to remove this specific listener from
     *         the map
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
     * http://leafletjs.com/reference-1.2.0.html#gridlayer-load
     * <p>
     * The listeners are called when the tile layer starts loading tiles.
     * @param listener the listener
     * @return a handle that can be used to remove this specific listener from
     *         the map
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


}
