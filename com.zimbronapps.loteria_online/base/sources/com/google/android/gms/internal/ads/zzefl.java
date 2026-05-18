package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzefl implements zzgyw {
    private final /* synthetic */ zzbzu zza;

    public /* synthetic */ zzefl(zzbzu zzbzuVar) {
        this.zza = zzbzuVar;
    }

    public final /* synthetic */ x7.e zza(Object obj) {
        String str = new String(zzgxf.zza((InputStream) obj), StandardCharsets.UTF_8);
        zzbzu zzbzuVar = this.zza;
        zzbzuVar.zzj = str;
        return zzgzo.zza(zzbzuVar);
    }
}
