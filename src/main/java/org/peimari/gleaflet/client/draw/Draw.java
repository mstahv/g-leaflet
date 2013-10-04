package org.peimari.gleaflet.client.draw;

import org.peimari.gleaflet.client.control.Control;

public class Draw extends Control {
	
	protected Draw() {}
	
	public static native Draw create(DrawControlOptions options) 
	/*-{
		return new $wnd.L.Control.Draw(options);
	}-*/;

}
