package io.github.enbyex.libextort.impl;

import io.github.enbyex.libextort.Argument;
import io.github.enbyex.libextort.HelpArgument;
import io.github.enbyex.libextort.util.ArgumentData;

/**
 * @author soniex2
 */
public class GenericHelpArgument implements HelpArgument {
    protected final ArgumentData argData;

    public GenericHelpArgument(String id) {
        this.argData = new ArgumentData(id);
    }

    @Override
    public GenericHelpArgument setShortDescription(String shortDescription) {
        argData.setShortDescription(shortDescription);
        return this;
    }

    @Override
    public GenericHelpArgument setLongDescription(String longDescription) {
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
    public Void parse(String s) throws IllegalArgumentException {
        return null;
    }
}
