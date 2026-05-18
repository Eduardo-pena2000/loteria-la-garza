package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgcz implements zzgda {
    private final zzidc zza;

    public zzgcz(zzidc zzidcVar) {
        this.zza = zzidcVar;
    }

    public final /* synthetic */ void zza(Object obj, OutputStream outputStream) throws IOException {
        ((zzidc) obj).zzaO(outputStream);
    }

    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        try {
            return (zzidc) this.zza.zzbd().zza(inputStream, zzibb.zza());
        } catch (zzicg e) {
            throw new zzgcw("Cannot read proto.", e);
        }
    }

    public final /* synthetic */ Object zzc() {
        return this.zza;
    }
}
