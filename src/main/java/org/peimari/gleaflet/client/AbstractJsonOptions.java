package org.peimari.gleaflet.client;

public class AbstractJsonOptions extends Layer {

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
