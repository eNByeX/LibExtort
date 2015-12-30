package io.github.enbyex.libextort.input;

import io.github.enbyex.libextort.*;

import java.lang.reflect.Array;

// TODO the whole thing
/**
 * Reads/parses command line arguments.
 *
 * @author soniex2
 */
public class CommandLineArguments implements Arguments {

    private final String[] args;

    private int pos = 0;

    public CommandLineArguments(String[] args) {
        this.args = args;
    }

    @Override
    public HelpArgument setHelpArgument(String help) {
        return null;
    }

    @Override
    public Argument<String> setStringArgument(String id) {
        return null;
    }

    @Override
    public Argument<String> setStringArgument(String id, String defaultValue) {
        return null;
    }

    @Override
    public IntArgument<Integer> setIntArgument(String id) {
        return null;
    }

    @Override
    public IntArgument<Integer> setIntArgument(String id, int defaultValue) {
        return null;
    }

    @Override
    public LongArgument<Long> setLongArgument(String id) {
        return null;
    }

    @Override
    public LongArgument<Long> setLongArgument(String id, long defaultValue) {
        return null;
    }

    @Override
    public BooleanArgument<Boolean> setBooleanArgument(String id) {
        return null;
    }

    @Override
    public BooleanArgument<Boolean> setBooleanArgument(String id, boolean defaultValue) {
        return null;
    }

    @Override
    public <T extends Enum<T>> Argument<T> setEnumArgument(String id, Class<T> type) {
        return null;
    }

    @Override
    public <T extends Enum<T>> Argument<T> setEnumArgument(String id, Class<T> type, T defaultValue) {
        return null;
    }

    @Override
    public <T> Argument<T> setArgument(String id, Class<T> type) {
        return null;
    }

    @Override
    public <T> Argument<T> setArgument(String id, Class<T> type, T defaultValue) {
        return null;
    }

    @Override
    public <T> Argument<T> setArgument(Argument<T> arg) {
        return null;
    }

    @Override
    public Argument<Arguments> setCategoryArgument(String id) {
        return null;
    }

    @Override
    public void commit() {
        for (; pos < args.length; pos++) {
            if (!args[pos].startsWith("--")) continue; // TODO non-option arguments
            if ("--".equals(args[pos])) break; // separator

        }
    }

    @Override
    public void clear() {

    }

    @Override
    public String[] getArgumentStringsData(Argument<?> argument) {
        return new String[0];
    }

    @Override
    public String getArgumentStringData(Argument<?> argument) {
        return null;
    }

    @Override
    public boolean hasArgument(Argument<?> argument) {
        return false;
    }

    @Override
    public boolean hasArguments(Argument<?> argument, int min, int max) {
        return false;
    }

    @Override
    public <T> T getArgument(Argument<T> argument, Class<T> type) {
        return null;
    }

    @Override
    public int getIntArgument(IntArgument<?> argument) {
        return 0;
    }

    @Override
    public long getLongArgument(LongArgument<?> argument) {
        return 0L;
    }

    @Override
    public boolean getBooleanArgument(BooleanArgument<?> argument) {
        return false;
    }

    @Override
    public <T> T[] getArguments(Argument<T> argument, Class<T> type) {
        return (T[]) Array.newInstance(type, 0);
    }

    @Override
    public int[] getIntArguments(IntArgument<?> argument) {
        return new int[0];
    }

    @Override
    public long[] getLongArguments(LongArgument<?> argument) {
        return new long[0];
    }

    @Override
    public boolean[] getBooleanArguments(BooleanArgument<?> argument) {
        return new boolean[0];
    }
}
