package com.unity3d.ads.core.utils;

import Za.A;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class GetMemoryValueFromStringKt {
    public static final long getMemoryValueFromString(String str) {
        Long r;
        if (str == null) {
            return -1L;
        }
        Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
        String str2 = null;
        while (matcher.find()) {
            str2 = matcher.group(1);
        }
        if (str2 == null || (r = A.r(str2)) == null) {
            return -1L;
        }
        return r.longValue();
    }
}
