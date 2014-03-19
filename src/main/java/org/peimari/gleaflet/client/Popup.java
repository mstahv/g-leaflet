package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;


public class Popup extends JavaScriptObject {

	protected Popup() {}
	
	public static native Popup create(PopupOptions options) 
	/*-{
		return $wnd.L.popup(options);
	}-*/;
        
	public static native Popup create() 
	/*-{
		return $wnd.L.popup();
	}-*/;
        
        public native final Popup setContent(String htmlContent) 
        /*-{
            return this.setContent(htmlContent);
        }-*/;

        public native final Popup openOn(Map map) 
        /*-{
            return this.openOn(map);
        }-*/;

        public native final Popup addTo(Map map) 
        /*-{
            return this.addTo(map);
        }-*/;
        
        public native final Popup setLatLng(LatLng ll)
        /*-{
            return this.setLatLng(ll);
        }-*/;
        
        public native final Popup update()
        /*-{
            return this.update();
        }-*/;
        

}
