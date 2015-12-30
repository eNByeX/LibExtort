package io.github.enbyex.libextort.impl;

import io.github.enbyex.libextort.Argument;
import io.github.enbyex.libextort.BooleanArgument;
import io.github.enbyex.libextort.util.ArgumentData;

/**
 * @author soniex2
 */
public class GenericBooleanArgument implements BooleanArgument<Boolean> {
    protected final ArgumentData argData;

    public GenericBooleanArgument(String id) {
        this.argData = new ArgumentData(id);
    }

    @Override
    public boolean parseBoolean(String s) {
        return Boolean.parseBoolean(s);
    }

    @Override
    public GenericBooleanArgument setShortDescription(String shortDescription) {
        argData.setShortDescription(shortDescription);
        return this;
    }

    @Override
    public GenericBooleanArgument setLongDescription(String longDescription) {
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
    public Boolean parse(String s) {
        return parseBoolean(s);
    }
}
