package io.github.enbyex.libextort;

/**
 * @author soniex2
 */
public interface LongArgument<T> extends Argument<T> {
    /**
     * Parses the given string and returns a long representation of the parsed value.
     *
     * @param s A string to parse.
     * @return A long representation of the parsed value.
     * @throws IllegalArgumentException if the passed string does not represent a valid value.
     */
    long parseLong(String s) throws IllegalArgumentException;
}
