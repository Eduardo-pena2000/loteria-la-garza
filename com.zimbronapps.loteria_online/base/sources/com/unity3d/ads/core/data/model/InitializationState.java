package com.unity3d.ads.core.data.model;

import java.util.Locale;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public enum InitializationState {
    NOT_INITIALIZED,
    INITIALIZING,
    INITIALIZED,
    FAILED;

    public String toString() {
        String str = super.toString();
        Locale locale = Locale.getDefault();
        t.f(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
