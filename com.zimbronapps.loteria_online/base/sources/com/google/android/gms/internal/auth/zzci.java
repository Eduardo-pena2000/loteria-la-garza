package com.google.android.gms.internal.auth;

import android.net.Uri;
import w.i0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzci {
    private final i0 zza;

    public zzci(i0 i0Var) {
        this.zza = i0Var;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        i0 i0Var;
        if (uri != null) {
            i0Var = (i0) this.zza.get(uri.toString());
        } else {
            i0Var = null;
        }
        if (i0Var == null) {
            return null;
        }
        return (String) i0Var.get("".concat(str3));
    }
}
