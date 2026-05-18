package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfzb implements o2.E {
    public static final zzfzb zza = new zzfzb();
    private static final zzfyy zzb;

    static {
        zzfyy zzd = zzfyy.zzd();
        kotlin.jvm.internal.t.f(zzd, "getDefaultInstance(...)");
        zzb = zzd;
    }

    private zzfzb() {
    }

    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    public final Object readFrom(InputStream inputStream, Ga.e eVar) {
        try {
            zzfyy zzc = zzfyy.zzc(inputStream);
            kotlin.jvm.internal.t.d(zzc);
            return zzc;
        } catch (Exception unused) {
            return zzb;
        }
    }

    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, Ga.e eVar) {
        ((zzfyy) obj).zzaO(outputStream);
        return Ca.I.a;
    }
}
