package io.github.enbyex.libextort.util;

import java.util.regex.Pattern;

/**
 * @author soniex2
 */
public class CheckUtils {
    private static final Pattern ID_PATTERN = Pattern.compile("^[A-Za-z0-9][A-Za-z0-9-_]*$");

    public static boolean isValidArgumentId(String id) {
        return ID_PATTERN.matcher(id).matches();
    }

    public static void checkArgumentId(String id) throws IllegalArgumentException {
        if (!isValidArgumentId(id)) throw new IllegalArgumentException(id);
    }
}
