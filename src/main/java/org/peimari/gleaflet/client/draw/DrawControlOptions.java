package org.peimari.gleaflet.client.draw;

import org.peimari.gleaflet.client.FeatureGroup;

import com.google.gwt.core.client.JavaScriptObject;

public class DrawControlOptions extends JavaScriptObject {

	protected DrawControlOptions() {
	}

	public static native DrawControlOptions create()
	/*-{
		return { draw:{}, edit:{}};
	}-*/;

	public native final void setEditableFeatureGroup(FeatureGroup layerGroup)
	/*-{
	 	this.edit.featureGroup = layerGroup;
	}-*/;

}
