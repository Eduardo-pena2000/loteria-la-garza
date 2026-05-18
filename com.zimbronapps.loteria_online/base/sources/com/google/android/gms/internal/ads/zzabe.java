package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzabe extends IOException {
    public zzabe(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String concat = th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : "";
        StringBuilder sb = new StringBuilder(simpleName.length() + 11 + concat.length());
        sb.append("Unexpected ");
        sb.append(simpleName);
        sb.append(concat);
        super(sb.toString(), th);
    }
}
