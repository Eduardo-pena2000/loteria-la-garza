package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class m {
    public static l a(Object obj, Looper looper, String str) {
        com.google.android.gms.common.internal.t.m(obj, "Listener must not be null");
        com.google.android.gms.common.internal.t.m(looper, "Looper must not be null");
        com.google.android.gms.common.internal.t.m(str, "Listener type must not be null");
        return new l(looper, obj, str);
    }

    public static l.a b(Object obj, String str) {
        com.google.android.gms.common.internal.t.m(obj, "Listener must not be null");
        com.google.android.gms.common.internal.t.m(str, "Listener type must not be null");
        com.google.android.gms.common.internal.t.g(str, "Listener type must not be empty");
        return new l.a(obj, str);
    }
}
