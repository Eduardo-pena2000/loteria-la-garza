package org.apache.tika.utils;

import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class StringUtils {
    public static final String EMPTY = "";
    static int PAD_LIMIT = 10000;
    public static final String SPACE = " ";

    public static boolean isBlank(String str) {
        return str == null || org.apache.tika.config.b.a(str);
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String joinWith(String str, List list) {
        if (list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            int i2 = i + 1;
            if (i > 0) {
                sb.append(str);
            }
            sb.append(str2);
            i = i2;
        }
        return sb.toString();
    }

    public static String leftPad(String str, int i, String str2) {
        if (str == null) {
            return null;
        }
        if (isEmpty(str2)) {
            str2 = " ";
        }
        int length = str2.length();
        int length2 = i - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= PAD_LIMIT) {
            return leftPad(str, i, str2.charAt(0));
        }
        if (length2 == length) {
            return str2.concat(str);
        }
        if (length2 < length) {
            return str2.substring(0, length2).concat(str);
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i2 = 0; i2 < length2; i2++) {
            cArr[i2] = charArray[i2 % length];
        }
        return new String(cArr).concat(str);
    }

    public static String repeat(char c, int i) {
        if (i <= 0) {
            return "";
        }
        char[] cArr = new char[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            cArr[i2] = c;
        }
        return new String(cArr);
    }

    public static String repeat(String str, int i) {
        if (str == null) {
            return null;
        }
        if (i <= 0) {
            return "";
        }
        int length = str.length();
        if (i == 1 || length == 0) {
            return str;
        }
        if (length == 1 && i <= PAD_LIMIT) {
            return repeat(str.charAt(0), i);
        }
        int i2 = length * i;
        if (length == 1) {
            return repeat(str.charAt(0), i);
        }
        if (length != 2) {
            StringBuilder sb = new StringBuilder(i2);
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(str);
            }
            return sb.toString();
        }
        char charAt = str.charAt(0);
        char charAt2 = str.charAt(1);
        char[] cArr = new char[i2];
        for (int i4 = (i * 2) - 2; i4 >= 0; i4 -= 2) {
            cArr[i4] = charAt;
            cArr[i4 + 1] = charAt2;
        }
        return new String(cArr);
    }

    public static String leftPad(String str, int i, char c) {
        if (str == null) {
            return null;
        }
        int length = i - str.length();
        if (length <= 0) {
            return str;
        }
        if (length > PAD_LIMIT) {
            return leftPad(str, i, String.valueOf(c));
        }
        return repeat(c, length).concat(str);
    }
}
