package com.google.android.gms.appset;

import android.content.Context;
import com.google.android.gms.internal.appset.zzr;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class AppSet {
    private AppSet() {
    }

    public static AppSetIdClient getClient(Context context) {
        return new zzr(context);
    }
}
