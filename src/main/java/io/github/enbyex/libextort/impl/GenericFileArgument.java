package io.github.enbyex.libextort.impl;

import io.github.enbyex.libextort.Argument;
import io.github.enbyex.libextort.util.ArgumentData;

import java.io.File;

/**
 * @author soniex2
 */
public class GenericFileArgument implements Argument<File> {
    protected final ArgumentData argData;
    protected final File basedir;

    public GenericFileArgument(String id) {
        this(id, null);
    }

    public GenericFileArgument(String id, File basedir) {
        this.argData = new ArgumentData(id);
        this.basedir = basedir;
        if (basedir.exists() && !basedir.isDirectory()) throw new IllegalArgumentException("Base directory not a directory");
    }

    public File getBaseDir() {
        return basedir;
    }

    @Override
    public GenericFileArgument setShortDescription(String shortDescription) {
        argData.setShortDescription(shortDescription);
        return this;
    }

    @Override
    public GenericFileArgument setLongDescription(String longDescription) {
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
    public File parse(String s) throws IllegalArgumentException {
        return new File(basedir, s);
    }
}
