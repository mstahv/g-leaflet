package org.peimari.gleaflet.client;

public class AbstractVector extends Layer {
	
	protected AbstractVector() {}

	public native final void openTooltip()
	/*-{
		this.openTooltip();
	}-*/;

	public native final void closeTooltip()
	/*-{
		this.closeTooltip();
	}-*/;
	
	public native final void openPopup() 
	/*-{
		this.openPopup();
	}-*/;

	public native final void closePopup() 
	/*-{
		this.closePopup();
	}-*/;

    public native final void bringToFront() 
    /*-{
        this.bringToFront();
    }-*/;

    public native final void bringToBack() 
    /*-{
        this.bringToBack();
    }-*/;


}
