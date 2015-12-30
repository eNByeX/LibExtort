package io.github.enbyex.libextort;

/**
 * @author soniex2
 */
public interface Argument<T> {
    /**
     * Sets this argument's short description. This is a short summary (1-3 words) of
     * what this argument is for, which may also be referred to as a human-readable name.
     *
     * @param shortDescription The short description.
     * @return A reference to this object.
     */
    Argument<T> setShortDescription(String shortDescription);

    /**
     * Sets this argument's ling description. This is the description used in help menus.
     *
     * @param longDescription The long description.
     * @return A reference to this object.
     */
    Argument<T> setLongDescription(String longDescription);

    /**
     * Returns this argument's ID.
     *
     * @return This argument's ID.
     */
    String getId();

    /**
     * Returns this argument's short description. This is a short summary (1-3 words) of
     * what this argument is for, which may also be referred to as a human-readable name.
     *
     * @return This argument's short description.
     */
    String getShortDescription();

    /**
     * Returns this argument's long description. This is the description used in help menus.
     *
     * @return This argument's long description.
     */
    String getLongDescription();

    /**
     * Parses the given string and returns the parsed value.
     *
     * @param s A string to parse.
     * @return The parsed value.
     * @throws IllegalArgumentException if the passed string does not represent a valid value.
     */
    T parse(String s) throws IllegalArgumentException;
}
