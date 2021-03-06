package com.nepxion.eventbus.thread.util;

/**
 * <p>Title: Nepxion EventBus</p>
 * <p>Description: Nepxion EventBus AOP</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

public class StringUtil {
    public static String firstLetterToUpper(String value) {
        Character character = Character.toUpperCase(value.charAt(0));

        return character.toString().concat(value.substring(1));
    }

    public static String firstLetterToLower(String value) {
        Character character = Character.toLowerCase(value.charAt(0));

        return character.toString().concat(value.substring(1));
    }
}