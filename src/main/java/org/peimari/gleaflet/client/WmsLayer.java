package org.peimari.gleaflet.client;


public class WmsLayer extends TileLayer {
	
	protected WmsLayer() {}
	
	public static native WmsLayer create(String url, WmsLayerOptions options) 
	/*-{
		return new $wnd.L.TileLayer.WMS(url, options);
	}-*/;
	
	public static native WmsLayer create(String url, String authorization, String layers, WmsLayerOptions options, Map map)
	/*-{
	 	try {
		    return $wnd.L.TileLayer.wmsHeader(url,
		       {
		          layers: layers,
		          format: 'image/png',
		          transparent: true
		       },
		       [
		          { header: 'Authorization', value: 'Bearer ' + authorization },
		          { header: 'Content-Type', value: 'text/plain'}
		       ],
		       null
		     ).addTo(map);
	    } catch (err) {
	    	console.error("Error while creating the wms layer with authorization: " + err.message);
	    }
	}-*/;

}
