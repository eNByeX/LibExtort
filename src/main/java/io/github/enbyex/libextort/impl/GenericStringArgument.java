package io.github.enbyex.libextort.impl;

import io.github.enbyex.libextort.Argument;
import io.github.enbyex.libextort.util.ArgumentData;

/**
 * @author soniex2
 */
public class GenericStringArgument implements Argument<String> {

    protected final ArgumentData argData;

    public GenericStringArgument(String id) {
        this.argData = new ArgumentData(id);
    }

    @Override
    public GenericStringArgument setShortDescription(String shortDescription) {
        argData.setShortDescription(shortDescription);
        return this;
    }

    @Override
    public GenericStringArgument setLongDescription(String longDescription) {
        argData.setLongDescription(longDescription);
        return this;
    }

    @Override
    public String getId() {
        return argData.getId();
    }

    @Override
    public String getShortDescription() {
        return argData.getShortDescription();
    }

    @Override
    public String getLongDescription() {
        return argData.getLongDescription();
    }

    @Override
    public String parse(String s) {
        return s;
    }
}
