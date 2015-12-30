package io.github.enbyex.libextort;

/**
 * @author soniex2
 */
public interface BooleanArgument<T> extends Argument<T> {
    /**
     * Parses the given string and returns a boolean representation of the parsed value.
     *
     * @param s A string to parse.
     * @return A boolean representation of the parsed value.
     * @throws IllegalArgumentException if the passed string does not represent a valid value.
     */
    boolean parseBoolean(String s);
}
