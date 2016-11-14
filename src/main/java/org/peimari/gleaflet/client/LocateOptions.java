package org.peimari.gleaflet.client;

/**
 * Replicates the same class in LeafletJS:
 *
 * Some of the geolocation methods for Map take in an options parameter. This is a plain javascript object with the following optional components:
 *
 * Option	Type	Default	Description
 * watch	Boolean	false	If true, starts continous watching of location changes (instead of detecting it once) using W3C watchPosition method. You can later stop watching using map.stopLocate() method.
 * setView	Boolean	false	If true, automatically sets the map view to the user location with respect to detection accuracy, or to world view if geolocation failed.
 * maxZoom	Number	Infinity	The maximum zoom for automatic view setting when using setView option.
 * timeout	Number	10000	Number of milliseconds to wait for a response from geolocation before firing a locationerror event.
 * maximumAge	Number	0	Maximum age of detected location. If less than this amount of milliseconds passed since last geolocation response, locate will return a cached location.
 * enableHighAccuracy	Boolean	false	Enables high accuracy, see description in the W3C spec.
 */
public class LocateOptions extends AbstractJsonOptions {

	protected LocateOptions() {}
	
	public static native LocateOptions create()
	/*-{
		return {};
	}-*/;

	public native final void setWatch(boolean w)
	/*-{
		this.watch = w;
	}-*/;

	public native final void setView(boolean v)
	/*-{
		this.setView = v;
	}-*/;

	public native final void setMaxZoom(double z)
	/*-{
		this.maxZoom = z;
	}-*/;

	public native final void setTimeout(double timeout)
	/*-{
		this.timeout = timeout
	}-*/;

	public native final void setMaximumAge(double age)
	/*-{
		this.maximumAge = age;
	}-*/;

	public native final void setEnableHighAccuracy(boolean e)
	/*-{
		this.enableHighAccuracy = e;
	}-*/;

}
