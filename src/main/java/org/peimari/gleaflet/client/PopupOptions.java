package org.peimari.gleaflet.client;

public class PopupOptions extends DivOverlayOptions {
	
	protected PopupOptions() {}
	
	public static native PopupOptions create() 
	/*-{
		return {};
	}-*/;

	public native final void setMaxWidth(int maxWidth) 
	/*-{
		this.maxWidth = maxWidth;
	}-*/;

	public native final void setMinWidth(int minWidth) 
	/*-{
		this.minWidth = minWidth;
	}-*/;

	public native final void setMaxHeight(int maxHeight)
	/*-{
		this.maxHeight = maxHeight;
	}-*/;

	public native final void setCloseButton(boolean closeButton) 
	/*-{
		this.closeButton = closeButton;
	}-*/;

	public native final void setAutoPan(boolean autoPan) 
	/*-{
		this.autoPan = autoPan;
	}-*/;

        public native final void setKeepInView(boolean keepInView) 
	/*-{
		this.keepInView = keepInView;
	}-*/;

        public native final void setCloseOnClick(boolean closeOnClick) 
	/*-{
		this.closeOnClick = closeOnClick;
	}-*/;
	
	public native final void setAutoClose(boolean autoClose)
	/*-{
		this.autoClose = autoClose;
	}-*/;

	public native final void setZoomAnimation(boolean zoomAnimation) 
	/*-{
		this.zoomAnimation = zoomAnimation;
	}-*/;

	public  native final void setAutoPanPadding(Point autoPanPadding) 
	/*-{
		this.autoPanPadding = autoPanPadding; 
	}-*/;

}
