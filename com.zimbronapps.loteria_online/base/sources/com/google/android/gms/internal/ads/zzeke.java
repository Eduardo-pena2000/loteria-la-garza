package com.google.android.gms.internal.ads;

import android.content.Context;
import d4.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeke {
    private final Context zza;

    public zzeke(Context context) {
        this.zza = context;
    }

    public final x7.e zza(boolean z) {
        try {
            d4.b a = new b.a().b("com.google.android.gms.ads").c(z).a();
            b4.a a2 = b4.a.a(this.zza);
            return a2 != null ? a2.b(a) : zzgzo.zzc(new IllegalStateException());
        } catch (Exception e) {
            return zzgzo.zzc(e);
        }
    }
}
