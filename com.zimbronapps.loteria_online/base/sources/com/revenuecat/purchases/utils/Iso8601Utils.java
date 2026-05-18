package com.revenuecat.purchases.utils;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Iso8601Utils {
    private static final String GMT_ID = "GMT";
    private static final TimeZone TIMEZONE_Z = TimeZone.getTimeZone("GMT");

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static String format(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TIMEZONE_Z, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(24);
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        padInt(sb, gregorianCalendar.get(14), 3);
        sb.append('Z');
        return sb.toString();
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    public static Date parse(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        TimeZone timeZone;
        char charAt;
        try {
            int parseInt = parseInt(str, 0, 4);
            int i6 = checkOffset(str, 4, '-') ? 5 : 4;
            int i7 = i6 + 2;
            int parseInt2 = parseInt(str, i6, i7);
            if (checkOffset(str, i7, '-')) {
                i7 = i6 + 3;
            }
            int i8 = i7 + 2;
            int parseInt3 = parseInt(str, i7, i8);
            boolean checkOffset = checkOffset(str, i8, 'T');
            if (!checkOffset && str.length() <= i8) {
                return new GregorianCalendar(parseInt, parseInt2 - 1, parseInt3).getTime();
            }
            if (checkOffset) {
                int i9 = i7 + 5;
                int parseInt4 = parseInt(str, i7 + 3, i9);
                if (checkOffset(str, i9, ':')) {
                    i9 = i7 + 6;
                }
                int i10 = i9 + 2;
                i5 = parseInt(str, i9, i10);
                if (checkOffset(str, i10, ':')) {
                    i10 = i9 + 3;
                }
                if (str.length() <= i10 || (charAt = str.charAt(i10)) == 'Z' || charAt == '+' || charAt == '-') {
                    i = parseInt;
                    i2 = parseInt4;
                    i8 = i10;
                    i3 = 0;
                    i4 = 0;
                } else {
                    int i11 = i10 + 2;
                    i4 = parseInt(str, i10, i11);
                    if (i4 > 59 && i4 < 63) {
                        i4 = 59;
                    }
                    if (checkOffset(str, i11, '.')) {
                        int i12 = i10 + 3;
                        int indexOfNonDigit = indexOfNonDigit(str, i10 + 4);
                        int min = Math.min(indexOfNonDigit, i10 + 6);
                        i = parseInt;
                        i3 = (int) (Math.pow(10.0d, 3 - (min - i12)) * parseInt(str, i12, min));
                        i2 = parseInt4;
                        i8 = indexOfNonDigit;
                    } else {
                        i = parseInt;
                        i2 = parseInt4;
                        i8 = i11;
                        i3 = 0;
                    }
                }
            } else {
                i = parseInt;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            if (str.length() <= i8) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char charAt2 = str.charAt(i8);
            if (charAt2 == 'Z') {
                timeZone = TIMEZONE_Z;
            } else {
                if (charAt2 != '+' && charAt2 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                }
                String substring = str.substring(i8);
                if ("+0000".equals(substring) || "+00:00".equals(substring)) {
                    timeZone = TIMEZONE_Z;
                } else {
                    String str2 = "GMT" + substring;
                    TimeZone timeZone2 = TimeZone.getTimeZone(str2);
                    String id = timeZone2.getID();
                    if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone2.getID());
                    }
                    timeZone = timeZone2;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i);
            gregorianCalendar.set(2, parseInt2 - 1);
            gregorianCalendar.set(5, parseInt3);
            gregorianCalendar.set(11, i2);
            gregorianCalendar.set(12, i5);
            gregorianCalendar.set(13, i4);
            gregorianCalendar.set(14, i3);
            return gregorianCalendar.getTime();
        } catch (IllegalArgumentException e) {
            e = e;
            throw new SerializationException("Not an RFC 3339 date: " + str, e);
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            throw new SerializationException("Not an RFC 3339 date: " + str, e);
        }
    }

    private static int parseInt(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - digit2;
            i4 = i5;
        }
        return -i3;
    }
}
