package io.github.enbyex.libextort;

/**
 * @author soniex2
 */
public interface Arguments {
    Argument<String> setStringArgument(String id);

    Argument<String> setStringArgument(String id, String defaultValue);

    IntArgument<Integer> setIntArgument(String id);

    IntArgument<Integer> setIntArgument(String id, int defaultValue);

    LongArgument<Long> setLongArgument(String id);

    LongArgument<Long> setLongArgument(String id, long defaultValue);

    <T extends Enum<T>> Argument<T> setEnumArgument(String id, Class<T> type);

    <T extends Enum<T>> Argument<T> setEnumArgument(String id, Class<T> type, T defaultValue);

    <T> Argument<T> setArgument(String id, Class<T> type);

    <T> Argument<T> setArgument(String id, Class<T> type, T defaultValue);

    <T> Argument<T> setArgument(Argument<T> arg);

    Argument<Arguments> setCategoryArgument(String id);

    /**
     * Commit the arguments. Call this when you want to read arguments.
     */
    void commit();

    /**
     * Clear the arguments. Use this to ask for more arguments.
     */
    void clear();

    <T> T getArgument(Argument<T> argument);

    int getIntArgument(IntArgument<?> argument);

    long getLongArgument(LongArgument<?> argument);
}
