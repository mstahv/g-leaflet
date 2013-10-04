package org.peimari.gleaflet.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.DataResource.DoNotEmbed;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.TextResource;

public interface LeafletClienBundle extends ClientBundle {
	
//    @Source("leaflet-src.js")
    @Source("leaflet.js")
    TextResource baseScript();
    
    @Source("leaflet.css")
    @CssResource.NotStrict
    CssResource css();
 
    @Source("leaflet.draw.js")
    @DoNotEmbed
    TextResource drawScript();

    @Source("leaflet.draw.css")
    @CssResource.NotStrict
    CssResource drawCss();

    @Source("images/layers.png")
    ImageResource layers();

    @Source("images/layers-2x.png")
    ImageResource layers2x();

    @Source("images/spritesheet.png")
    @DoNotEmbed
    ImageResource spritesheet();

    @Source("images/spritesheet-2x.png")
    @DoNotEmbed
    ImageResource spritesheet2x();

}
