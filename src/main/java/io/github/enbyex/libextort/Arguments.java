package io.github.enbyex.libextort;

/**
 * @author soniex2
 */
public interface Arguments {

    HelpArgument setHelpArgument(String help);

    Argument<String> setStringArgument(String id);

    Argument<String> setStringArgument(String id, String defaultValue);

    IntArgument<Integer> setIntArgument(String id);

    IntArgument<Integer> setIntArgument(String id, int defaultValue);

    LongArgument<Long> setLongArgument(String id);

    LongArgument<Long> setLongArgument(String id, long defaultValue);

    BooleanArgument<Boolean> setBooleanArgument(String id);

    BooleanArgument<Boolean> setBooleanArgument(String id, boolean defaultValue);

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

    String[] getArgumentStringsData(Argument<?> argument);

    String getArgumentStringData(Argument<?> argument);

    boolean hasArgument(Argument<?> argument);

    boolean hasArguments(Argument<?> argument, int min, int max);

    <T> T getArgument(Argument<T> argument, Class<T> type);

    int getIntArgument(IntArgument<?> argument);

    long getLongArgument(LongArgument<?> argument);

    boolean getBooleanArgument(BooleanArgument<?> argument);

    <T> T[] getArguments(Argument<T> argument, Class<T> type);

    int[] getIntArguments(IntArgument<?> argument);

    long[] getLongArguments(LongArgument<?> argument);

    boolean[] getBooleanArguments(BooleanArgument<?> argument);
}
