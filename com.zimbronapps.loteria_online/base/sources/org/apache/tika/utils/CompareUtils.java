package org.apache.tika.utils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class CompareUtils {
    public static int compareClassName(Object obj, Object obj2) {
        String name = obj.getClass().getName();
        String name2 = obj2.getClass().getName();
        boolean startsWith = name.startsWith("org.apache.tika.");
        return startsWith == name2.startsWith("org.apache.tika.") ? name.compareTo(name2) : startsWith ? 1 : -1;
    }
}
