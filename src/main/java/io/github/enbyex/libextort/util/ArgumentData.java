package io.github.enbyex.libextort.util;

/**
 * @author soniex2
 */
public class ArgumentData {
    /**
     * Argument ID, also used in command-line argument.
     */
    private final String id;
    /**
     * Human-readable name.
     */
    protected String shortDescription = "";
    /**
     * Description when showing help commands.
     */
    protected String longDescription = "";

    public ArgumentData(String id) {
        this.id = id;
    }

    /**
     * Returns this argument's ID.
     *
     * @return This argument's ID.
     */
    public String getId() {
        return id;
    }

    /**
     * Returns this argument's short description. This is a short summary (1-3 words) of
     * what this argument is for, which may also be referred to as a human-readable name.
     *
     * @return This argument's short description.
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets this argument's short description. This is a short summary (1-3 words) of
     * what this argument is for, which may also be referred to as a human-readable name.
     *
     * @param shortDescription The short description.
     * @return A reference to this object.
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * Returns this argument's long description. This is the description used in help menus.
     *
     * @return This argument's long description.
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Sets this argument's ling description. This is the description used in help menus.
     *
     * @param longDescription The long description.
     * @return A reference to this object.
     */
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
}
