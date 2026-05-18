package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzekc {
    private a4.a zza;
    private final Context zzb;

    public zzekc(Context context) {
        this.zzb = context;
    }

    public final x7.e zza() {
        try {
            a4.a a = a4.a.a(this.zzb);
            this.zza = a;
            return a == null ? zzgzo.zzc(new IllegalStateException("MeasurementManagerFutures is null")) : a.b();
        } catch (Exception e) {
            return zzgzo.zzc(e);
        }
    }

    public final x7.e zzb(Uri uri, InputEvent inputEvent) {
        try {
            a4.a aVar = this.zza;
            Objects.requireNonNull(aVar);
            return aVar.c(uri, inputEvent);
        } catch (Exception e) {
            return zzgzo.zzc(e);
        }
    }
}
