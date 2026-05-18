package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzath extends zzijr implements Closeable {
    static {
        zzijy.zzb(zzath.class);
    }

    public zzath(zzijs zzijsVar, zzatg zzatgVar) throws IOException {
        zzd(zzijsVar, zzijsVar.zzb(), zzatgVar);
    }

    public final void close() throws IOException {
    }

    public final String toString() {
        String obj = this.zzc.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
