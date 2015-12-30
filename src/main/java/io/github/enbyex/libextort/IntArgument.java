package io.github.enbyex.libextort;

/**
 * @author soniex2
 */
public interface IntArgument<T> extends Argument<T> {
    /**
     * Parses the given string and returns an int representation of the parsed value.
     *
     * @param s A string to parse.
     * @return An int representation of the parsed value.
     * @throws IllegalArgumentException if the passed string does not represent a valid value.
     */
    int parseInt(String s) throws IllegalArgumentException;
}
