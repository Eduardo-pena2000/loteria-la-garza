package com.google.android.gms.common.api.internal;

import android.app.Activity;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class i {
    public final Object a;

    public i(Activity activity) {
        com.google.android.gms.common.internal.t.m(activity, "Activity must not be null");
        this.a = activity;
    }

    public final boolean a() {
        return this.a instanceof androidx.fragment.app.u;
    }

    public final boolean b() {
        return this.a instanceof Activity;
    }

    public final Activity c() {
        return (Activity) this.a;
    }

    public final androidx.fragment.app.u d() {
        return (androidx.fragment.app.u) this.a;
    }
}
