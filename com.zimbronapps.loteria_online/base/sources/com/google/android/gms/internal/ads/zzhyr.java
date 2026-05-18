package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhyr extends zzhys {
    final /* synthetic */ zzhys zza;

    public /* synthetic */ zzhyr(zzhys zzhysVar, byte[] bArr) {
        Objects.requireNonNull(zzhysVar);
        this.zza = zzhysVar;
    }

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 21);
        sb.append("NullSafeTypeAdapter[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    public final void zza(zzhzs zzhzsVar, Object obj) throws IOException {
        throw null;
    }
}
