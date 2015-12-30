package io.github.enbyex.libextort.impl;

import io.github.enbyex.libextort.IntArgument;
import io.github.enbyex.libextort.util.ArgumentData;

/**
 * @author soniex2
 */
public class GenericEnumIntArgument<T extends Enum<T>> implements IntArgument<T> {
    protected final ArgumentData argData;
    protected final Class<T> type;

    public GenericEnumIntArgument(String id, Class<T> type) {
        this.argData = new ArgumentData(id);
        this.type = type;
    }

    @Override
    public int parseInt(String s) throws IllegalArgumentException {
        return parse(s).ordinal();
    }

    @Override
    public GenericEnumIntArgument<T> setShortDescription(String shortDescription) {
        argData.setShortDescription(shortDescription);
        return this;
    }

    @Override
    public GenericEnumIntArgument<T> setLongDescription(String longDescription) {
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
    public T parse(String s) throws IllegalArgumentException {
        return Enum.valueOf(type, s);
    }
}
