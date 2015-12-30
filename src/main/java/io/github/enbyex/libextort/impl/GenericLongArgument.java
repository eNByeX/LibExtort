package io.github.enbyex.libextort.impl;

import io.github.enbyex.libextort.LongArgument;
import io.github.enbyex.libextort.util.ArgumentData;

// TODO check code quality

/**
 * @author soniex2
 */
public class GenericLongArgument implements LongArgument<Long> {

    protected long lowerBound = Long.MIN_VALUE;
    protected long upperBound = Long.MAX_VALUE;
    protected long step = 1L;

    protected final ArgumentData argData;

    public GenericLongArgument(String id) {
        this.argData = new ArgumentData(id);
    }

    public GenericLongArgument(String id, long lowerBound, long upperBound) {
        this(id);
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public GenericLongArgument(String id, long lowerBound, long upperBound, long step) {
        this(id, lowerBound, upperBound);
        if (step == 0L) throw new IllegalArgumentException("Step cannot be 0");
        this.step = step;
    }

    public long getLowerBound() {
        return lowerBound;
    }

    public GenericLongArgument setLowerBound(long lowerBound) {
        if (lowerBound > upperBound)
            throw new IllegalArgumentException("Lower bound cannot be larger than upper bound");
        this.lowerBound = lowerBound;
        return this;
    }

    public long getUpperBound() {
        return upperBound;
    }

    public GenericLongArgument setUpperBound(long upperBound) {
        if (lowerBound > upperBound)
            throw new IllegalArgumentException("Lower bound cannot be larger than upper bound");
        this.upperBound = upperBound;
        return this;
    }

    public long getStep() {
        return step;
    }

    public GenericLongArgument setStep(long step) {
        if (step == 0L) throw new IllegalArgumentException("Step cannot be 0");
        this.step = step;
        return this;
    }

    @Override
    public long parseLong(String s) throws IllegalArgumentException {
        long i = Long.parseLong(s);
        if (i < lowerBound || i > upperBound)
            throw new IllegalArgumentException("Argument does not satisfy boundary requirement");
        // TODO make overflow-aware (can only happen if lowerBound < Long.MIN_VALUE/2)
        if ((i - lowerBound) % step == 0L)
            throw new IllegalArgumentException("Argument does not satisfy step requirement");
        return i;
    }

    @Override
    public GenericLongArgument setShortDescription(String shortDescription) {
        argData.setShortDescription(shortDescription);
        return this;
    }

    @Override
    public GenericLongArgument setLongDescription(String longDescription) {
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
    public Long parse(String s) {
        return parseLong(s);
    }
}
