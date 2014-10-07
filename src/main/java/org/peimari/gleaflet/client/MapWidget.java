package org.peimari.gleaflet.client;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.Widget;

public class MapWidget extends Widget {
	
	private Map map;

	public MapWidget() {		
		this(MapOptions.create());
	}
	
	public MapWidget(MapOptions options) {   
    	    	setElement(Document.get().createDivElement());
    		setHeight("450px");
    		map = Map.create(getElement(), options);
  }
	
	public Map getMap() {
		return map;
	}

}
