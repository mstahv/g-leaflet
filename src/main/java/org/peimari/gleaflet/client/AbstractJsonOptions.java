package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class AbstractJsonOptions extends JavaScriptObject implements ILayer {

    protected AbstractJsonOptions() {
    }

    /**
     * Warning, this method may break things, be careful with it, almost like
     * real JS development.
     *
     * @param optionName
     * @param optionValue
     */
    public native final void setCustomOption(String optionName,
            String optionValue) /*-{
        this[optionName] = optionValue;
    }-*/;

    /**
     * Warning, this method may break things, be careful with it, almost like
     * real JS development.
     *
     * @param optionName
     * @param optionValue
     */
    public native final void setCustomOption(String optionName,
            double optionValue) /*-{
        this[optionName] = optionValue;
    }-*/;

    /**
     * Warning, this method may break things, be careful with it, almost like
     * real JS development.
     *
     * @param optionName
     * @param optionValue
     */
    public native final void setCustomOption(String optionName,
            int optionValue) /*-{
        this[optionName] = optionValue;
    }-*/;

    /**
     * Warning, this method may break things, be careful with it, almost like
     * real JS development.
     *
     * @param optionName
     * @param optionValue
     */
    public native final void setCustomOption(String optionName,
            boolean optionValue) /*-{
        this[optionName] = optionValue;
    }-*/;
}
