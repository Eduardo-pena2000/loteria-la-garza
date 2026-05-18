package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzaen implements zzaeo {
    static final /* synthetic */ zzaen zza = new zzaen();

    private /* synthetic */ zzaen() {
    }

    public final /* synthetic */ Constructor zza() {
        int i = zzaeq.zza;
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", (Class[]) null).invoke((Object) null, (Object[]) null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzaeu.class).getConstructor(new Class[]{Integer.TYPE});
        }
        return null;
    }
}
