package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class PathOptions extends JavaScriptObject {
	
	protected PathOptions() {}
	
	public static native PathOptions create() 
	/*-{
		return {};
	}-*/;

	public native final void setDashArray(String dashArray)
	/*-{
		this.dashArray = dashArray;
	}-*/;

	public native final void setLineCap(String lineCap)
	/*-{
		this.lineCap = lineCap;
	}-*/;

	public native final void setLineJoin(String lineJoin)
	/*-{
		this.lineJoin = lineJoin;
	}-*/;

	public native final void setClickable(boolean clickable)
	/*-{
		this.clickable = clickable;
	}-*/;

	public native final void setPointerEvents(String pointerEvents)
	/*-{
		this.pointerEvents = pointerEvents;
	}-*/;

	public native final void setClassName(String className)
	/*-{
		this.className = className;
	}-*/;

	public native final void setStroke(boolean stroke)
	/*-{
		this.stroke = stroke;
	}-*/;

	public native final void setWeight(int weight)
	/*-{
		this.weight = weight;
	}-*/;

	public native final void setOpacity(double opacity) 
	/*-{
		this.opacity = opacity;
	}-*/;

	public native final void setFillOpacity(double fillOpacity)
	/*-{
		this.fillOpacity = fillOpacity;
	}-*/;

	public native final void setTitle(String title) 
	/*-{
		this.title = title;
	}-*/;

	public native final void setColor(String color) 
	/*-{
		this.color = color;
	}-*/;
	
	public native final void setFillColor(String fillColor) 
	/*-{
		this.fillColor = fillColor;
	}-*/;

	public native final void setFill(boolean fill) 
	/*-{
		this.fill = fill;
	}-*/;


}
