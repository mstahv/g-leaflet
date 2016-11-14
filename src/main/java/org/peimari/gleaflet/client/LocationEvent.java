package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * latlng 	LatLng	Detected geographical location of the user.
 * bounds 	LatLngBounds	Geographical bounds of the area user is located in (with respect to the accuracy of location).
 * accuracy 	Number	Accuracy of location in meters.
 * altitude 	Number	Height of the position above the WGS84 ellipsoid in meters.
 * altitudeAccuracy 	Number	Accuracy of altitude in meters.
 * heading 	Number	The direction of travel in degrees counting clockwise from true North.
 * speed 	Number	Current velocity in meters per second.
 * timestamp 	Number	The time when the position was acquired.
 *
 * @author mstahv
 */
public class LocationEvent extends JavaScriptObject {
	
	protected LocationEvent() {}
	
	public native final LatLng getLatLng()
	/*-{
		return this.latlng;
	}-*/;

    public native final LatLngBounds getLatLngBounds()
	/*-{
		return this.bounds;
	}-*/;

    public native final double getAccuracy()
	/*-{
		return this.accuracy;
	}-*/;

    public native final double getAltitude()
	/*-{
		return this.altitude;
	}-*/;

    public native final double getHeading()
	/*-{
		return this.heading;
	}-*/;

    public native final double getSpeed()
	/*-{
		return this.speed;
	}-*/;

    public native final double getTimestamp()
	/*-{
		return this.timestamp;
	}-*/;
}
