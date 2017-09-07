package org.peimari.gleaflet.client;

public class TooltipOptions extends DivOverlayOptions {

    protected TooltipOptions() {}

    public static native TooltipOptions create()
	/*-{
		return {};
	}-*/;

	public native final void setDirection(String direction)
	/*-{
		this.direction = direction;
	}-*/;

	public native final void setPermanent(boolean permanent)
	/*-{
		this.permanent = permanent;
	}-*/;

	public native final void setSticky(boolean sticky)
	/*-{
		this.sticky = sticky;
	}-*/;

	public native final void setInteractive(boolean interactive)
	/*-{
		this.interactive = interactive;
	}-*/;

	public native final void setOpacity(double opacity)
	/*-{
		this.opacity = opacity;
	}-*/;

}
