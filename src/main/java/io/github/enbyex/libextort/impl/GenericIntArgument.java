package io.github.enbyex.libextort.impl;

import io.github.enbyex.libextort.IntArgument;
import io.github.enbyex.libextort.util.ArgumentData;

// TODO check code quality

/**
 * @author soniex2
 */
public class GenericIntArgument implements IntArgument<Integer> {

    protected int lowerBound = Integer.MIN_VALUE;
    protected int upperBound = Integer.MAX_VALUE;
    protected int step = 1;

    protected final ArgumentData argData;

    public GenericIntArgument(String id) {
        this.argData = new ArgumentData(id);
    }

    public GenericIntArgument(String id, int lowerBound, int upperBound) {
        this(id);
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public GenericIntArgument(String id, int lowerBound, int upperBound, int step) {
        this(id, lowerBound, upperBound);
        if (step == 0) throw new IllegalArgumentException("Step cannot be 0");
        this.step = step;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public GenericIntArgument setLowerBound(int lowerBound) {
        if (lowerBound > upperBound)
            throw new IllegalArgumentException("Lower bound cannot be larger than upper bound");
        this.lowerBound = lowerBound;
        return this;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public GenericIntArgument setUpperBound(int upperBound) {
        if (lowerBound > upperBound)
            throw new IllegalArgumentException("Lower bound cannot be larger than upper bound");
        this.upperBound = upperBound;
        return this;
    }

    public int getStep() {
        return step;
    }

    public GenericIntArgument setStep(int step) {
        if (step == 0) throw new IllegalArgumentException("Step cannot be 0");
        this.step = step;
        return this;
    }

    @Override
    public int parseInt(String s) throws IllegalArgumentException {
        int i = Integer.parseInt(s);
        if (i < lowerBound || i > upperBound)
            throw new IllegalArgumentException("Argument does not satisfy boundary requirement");
        // TODO make overflow-aware (can only happen if lowerBound < Integer.MIN_VALUE/2)
        if ((i - lowerBound) % step == 0)
            throw new IllegalArgumentException("Argument does not satisfy step requirement");
        return i;
    }

    @Override
    public GenericIntArgument setShortDescription(String shortDescription) {
        argData.setShortDescription(shortDescription);
        return this;
    }

    @Override
    public GenericIntArgument setLongDescription(String longDescription) {
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
    public Integer parse(String s) {
        return parseInt(s);
    }
}
