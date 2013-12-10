package org.peimari.gleaflet.client;


public class CircleMarkerOptions extends CircleOptions {

	protected CircleMarkerOptions() {}

	public static native CircleMarkerOptions create()
	/*-{
		return {};
	}-*/;

	public native final void setRadius(double radius)
	/*-{
		this.radius = radius;
	}-*/;
}
