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

	/**
	 * Adds a new Crs definition and makes it immediately available for use inside a Map. The
	 * new Crs extends Crs.Simple, uses the Projection as specified in the parameters and
	 * an affine transform as specified by the a, b, c, d parameters). For the meaning of the
	 * affine transform parameters, see: http://leafletjs.com/reference.html#transformation.
	 * @param name Name for the new Crs.
	 * @param projection Name of the projection for this new Crs. It needs to be the name of a
	 * valid projection defined in L.Projection (LonLat, SphericalMercator, Mercator).
     * @param a a in transformation calculation (a*x + b, c*y + d)
     * @param b b in transformation calculation (a*x + b, c*y + d)
     * @param c c in transformation calculation (a*x + b, c*y + d)
     * @param d d in transformation calculation (a*x + b, c*y + d)
     * @return the Crs
	 */
	public static native final Crs add(String name, String projection, double a, double b, double c, double d)
	/*-{
            $wnd.L.CRS[name] = $wnd.L.extend({}, $wnd.L.CRS, {
                code: name,
		projection: $wnd.L.Projection[projection],
                transformation: new $wnd.L.Transformation(a, b, c, d),
                distance: function (t, e) {
                    var i = e.lng - t.lng, n = e.lat - t.lat;
                    return Math.sqrt(i * i + n * n)
                }
            });
            return $wnd.L.CRS[name];
        }-*/;

	/**
	 * Adds a new Crs definition and makes it immediately available for use inside a Map. The
	 * new Crs extends Crs.Simple, uses a plat-carré projection with the
	 * extents given by the min_* and max_* parameters. For the meaning of the
	 * affine transform parameters, see: http://leafletjs.com/reference.html#transformation.
	 * @param name Name for the new Crs.
     * @param min_x the min_x value
     * @param min_y the min_y value
     * @param max_x the max_x value
     * @param max_y the max_y value
     * @param a a in transformation calculation (a*x + b, c*y + d)
     * @param b b in transformation calculation (a*x + b, c*y + d)
     * @param c c in transformation calculation (a*x + b, c*y + d)
     * @param d d in transformation calculation (a*x + b, c*y + d)
     * @return the Crs
	 */
	public static native final Crs add(String name, double min_x, double min_y, double max_x, double max_y,
			double a, double b, double c, double d)
	/*-{
            var projection = {
              project: function (latlng) {
                return new $wnd.L.Point(latlng.lng, latlng.lat);
              },
              unproject: function (point) {
                return new $wnd.L.LatLng(point.y, point.x);
              },
              bounds: $wnd.L.bounds([min_x, min_y], [max_x, max_y])
            };
            $wnd.L.CRS[name] = $wnd.L.extend({}, $wnd.L.CRS, {
                code: name,
		projection: projection,
                transformation: new $wnd.L.Transformation(a, b, c, d),
                distance: function (t, e) {
                    var i = e.lng - t.lng, n = e.lat - t.lat;
                    return Math.sqrt(i * i + n * n)
                }
            });
            return $wnd.L.CRS[name];
        }-*/;
}
