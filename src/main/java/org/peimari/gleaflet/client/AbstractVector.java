package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class AbstractVector extends JavaScriptObject implements ILayer {
	
	protected AbstractVector() {}
	
	public native final void openPopup() 
	/*-{
		this.openPopup();
	}-*/;

	public native final void closePopup() 
	/*-{
		this.closePopup();
	}-*/;

	public native final void removeClickListener() 
	/*-{
		this.off("click");
	}-*/;

	public native final void addClickListener(ClickListener listener) 
	/*-{
		this.on("click", function(e) {
				$entry(listener.@org.peimari.gleaflet.client.ClickListener::onClick(Lorg/peimari/gleaflet/client/MouseEvent;)(e));
		});
	}-*/;

}
