package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Crs extends JavaScriptObject {
	
	protected Crs() {}
	
	private static native Crs create() 
	/*-{
		return {};
	}-*/;

	public static native final Crs EPSG3857() 
	/*-{
		return $wnd.L.CRS.EPSG3857;
	}-*/;

	public static native final Crs EPSG4326() 
	/*-{
		return $wnd.L.CRS.EPSG4326;
	}-*/;
	public static native final Crs EPSG3395() 
	/*-{
		return $wnd.L.CRS.EPSG3395;
	}-*/;
	public static native final Crs Simple() 
	/*-{
		return $wnd.L.CRS.Simple;
	}-*/;
        
        public static native final Crs byName(String name) 
	/*-{
		return $wnd.L.CRS[name];
	}-*/;

	public static native final Crs add(String name, String projection, double a, double b, double c, double d)
	/*-{
            $wnd.L.CRS[name] = $wnd.L.extend({}, $wnd.L.CRS.Simple, {
                code: name,
		projection: $wnd.L.Projection[projection],
                transformation: new $wnd.L.Transformation(a, b, c, d)
            });
            return $wnd.L.CRS[name];
        }-*/;
}
