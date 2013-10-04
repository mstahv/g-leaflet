package org.peimari.gleaflet.client.resources;

import com.google.gwt.core.client.GWT;

public class LeafletResourceInjector {

	protected static LeafletClienBundle bundle;

	public static void ensureInjected() {
		if (bundle == null) {
			bundle = GWT.create(LeafletClienBundle.class);
			LeafletResourceInjector injector = GWT
					.create(LeafletResourceInjector.class);
			injector.injectResources();
		}
	}
	
	/**
	 * Override this with deferred binding to customize injected stuff
	 */
	protected void injectResources() {
		bundle.css().ensureInjected();
		injectScript(bundle.baseScript().getText());
		setDefaultMarkerIconPath(getDefaultMarkerDirectory());
		// TODO make sure it is possible to inject without the draw plugin
		// Probably best to split into separate bundle
		bundle.drawCss().ensureInjected();
		injectScript(bundle.drawScript().getText());
	}

	protected String getDefaultMarkerDirectory() {
		return GWT.getModuleBaseURL() + "markers/";
	}

	protected native static void setDefaultMarkerIconPath(String path) 
	/*-{
		$wnd.L.Icon.Default.imagePath = path;
	}-*/;

	private static native void injectScript(String script)
	/*-{
	    $wnd.eval(script);
	}-*/;

}
