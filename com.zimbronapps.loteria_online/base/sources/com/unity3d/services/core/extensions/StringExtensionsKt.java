package com.unity3d.services.core.extensions;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StringExtensionsKt {
    public static final String toUnityMessage(String str) {
        if (str == null || str.length() == 0) {
            return "[Unity Ads] Internal error";
        }
        return "[Unity Ads] " + str;
    }
}
