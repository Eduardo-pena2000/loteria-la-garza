package com.unity3d.ads.core.data.model;

import java.util.Locale;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public enum OperationType {
    UNKNOWN,
    INITIALIZATION,
    LOAD,
    LOAD_HEADER_BIDDING,
    SHOW,
    REFRESH,
    PRIVACY_UPDATE,
    INITIALIZATION_COMPLETED,
    TRANSACTION_EVENT,
    GET_TOKEN,
    UNIVERSAL_EVENT;

    public String toString() {
        String str = super.toString();
        Locale locale = Locale.getDefault();
        t.f(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
