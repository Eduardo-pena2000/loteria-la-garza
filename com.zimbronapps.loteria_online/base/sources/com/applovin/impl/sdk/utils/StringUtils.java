package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class StringUtils {
    private static final char[] a = "0123456789abcdef".toCharArray();

    public class a implements Comparator {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    private static String a(String str, Integer num) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            String hexString = toHexString(messageDigest.digest());
            return num.intValue() > 0 ? hexString.substring(0, Math.min(num.intValue(), hexString.length())) : hexString;
        } catch (Throwable th) {
            throw new RuntimeException("SHA-1 for \"" + str + "\" failed.", th);
        }
    }

    public static void addLinks(Spannable spannable, Pattern pattern, ClickableSpan clickableSpan, boolean z) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            spannable.setSpan(clickableSpan, start, end, 33);
            if (z) {
                spannable.setSpan(new StyleSpan(1), start, end, 256);
            }
        }
    }

    public static String appendQueryParameter(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter(str2, str3);
        return buildUpon.build().toString();
    }

    public static String appendQueryParameters(String str, Map map, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (map == null || map.isEmpty()) {
            return str;
        }
        if (z) {
            Map treeMap = new TreeMap(new a());
            treeMap.putAll(map);
            map = treeMap;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    public static boolean containsAtLeastOneSubstring(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (str.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsIgnoreCase(String str, String str2) {
        return isValidString(str) && isValidString(str2) && str.toLowerCase().contains(str2.toLowerCase());
    }

    public static SpannedString createListItemDetailSpannedString(String str, int i) {
        return createSpannedString(str, i, 16);
    }

    public static SpannedString createListItemDetailSubSpannedString(String str, int i) {
        return createSpannedString(str, i, 12, 1);
    }

    public static SpannedString createSpannedString(String str, int i, int i2) {
        return createSpannedString(str, i, i2, 0);
    }

    public static String defaultIfEmpty(String str, String str2) {
        return isValidString(str) ? str : str2;
    }

    public static String emptyIfNull(String str) {
        return str == null ? "" : str;
    }

    public static String encodeUriString(String str) {
        return isValidString(str) ? Uri.encode(str) : "";
    }

    public static Boolean endsWith(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (str.endsWith((String) it.next())) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static String getHost(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        return parse.getHost() != null ? parse.getHost() : "";
    }

    public static String getHostAndPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        return emptyIfNull(parse.getHost()) + emptyIfNull(parse.getPath());
    }

    public static List getRegexMatches(Matcher matcher, int i) {
        matcher.reset();
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String group = matcher.group(i);
            if (isValidString(group)) {
                arrayList.add(group);
            }
        }
        return arrayList;
    }

    public static boolean isAlphaNumeric(String str) {
        if (isValidString(str)) {
            return str.matches("^[a-zA-Z0-9]*$");
        }
        return false;
    }

    public static boolean isNumeric(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char charAt = str.charAt(0);
        int i = (charAt == '-' || charAt == '+') ? 1 : 0;
        int length = str.length();
        if (i == 1 && length == 1) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static String join(CharSequence charSequence, List list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(charSequence);
        }
        sb.delete(sb.length() - charSequence.length(), sb.length());
        return sb.toString();
    }

    public static Matcher match(String str, String str2) {
        return Pattern.compile(str2).matcher(str);
    }

    public static float parseFloat(String str, float f) {
        try {
            return Float.parseFloat(str);
        } catch (Throwable unused) {
            return f;
        }
    }

    public static int parseInt(String str) {
        return parseInt(str, 0);
    }

    public static long parseLong(String str, long j) {
        return isNumeric(str) ? Long.parseLong(str) : j;
    }

    public static String prefixToIndex(int i, String str) {
        return TextUtils.isEmpty(str) ? str : str.substring(0, Math.min(i, str.length()));
    }

    public static String replace(String str, String str2, String str3) {
        if (str3 == null) {
            throw new IllegalArgumentException("No replacement target specified");
        }
        if (str == null || str.length() < 1 || str2 == null || str2.length() < 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        int indexOf = sb.indexOf(str2);
        while (indexOf != -1) {
            sb.replace(indexOf, str2.length() + indexOf, str3);
            indexOf = sb.indexOf(str2, indexOf + str3.length());
        }
        return sb.toString();
    }

    public static void replaceAll(StringBuffer stringBuffer, String str, String str2) {
        if (TextUtils.isEmpty(stringBuffer) || TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("No replacement target specified");
        }
        int indexOf = stringBuffer.indexOf(str);
        while (indexOf != -1) {
            stringBuffer.replace(indexOf, str.length() + indexOf, str2);
            indexOf = stringBuffer.indexOf(str, indexOf + str2.length());
        }
    }

    public static boolean startsWithAtLeastOnePrefix(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static String toDigitsOnlyVersionString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("\\.");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (isValidString(str2)) {
                String[] split2 = str2.split("[^0-9]+");
                int length = split2.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        String str3 = split2[i];
                        if (isValidString(str3)) {
                            arrayList.add(str3);
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return TextUtils.join(".", arrayList);
    }

    public static String toFullSHA1Hash(String str) {
        return a(str, -1);
    }

    public static String toHexString(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("No data specified");
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            char[] cArr2 = a;
            byte b = bArr[i];
            cArr[i2] = cArr2[(b & 240) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static String toHttpsString(String str) {
        return str.startsWith("http://") ? str.replace("http://", "https://") : str;
    }

    public static String toHumanReadableString(String str) {
        if (!isValidString(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (String str2 : str.split("_")) {
            if (isValidString(str2)) {
                if (str2.equals("id")) {
                    sb.append(str2.toUpperCase(Locale.ENGLISH));
                } else {
                    String substring = str2.substring(0, 1);
                    Locale locale = Locale.ENGLISH;
                    sb.append(substring.toUpperCase(locale));
                    sb.append(str2.substring(1).toLowerCase(locale));
                }
                sb.append(" ");
            }
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static String toShortSHA1Hash(String str) {
        return a(str, 16);
    }

    public static SpannedString createSpannedString(String str, int i, int i2, int i3) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i2, true), 0, spannableString.length(), 33);
        spannableString.setSpan(new StyleSpan(i3), 0, spannableString.length(), 33);
        return new SpannedString(spannableString);
    }

    public static int parseInt(String str, int i) {
        return isNumeric(str) ? Integer.parseInt(str) : i;
    }

    public static String replace(String str, Map map) {
        if (str != null && map != null) {
            for (Map.Entry entry : map.entrySet()) {
                str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
            }
        }
        return str;
    }
}
