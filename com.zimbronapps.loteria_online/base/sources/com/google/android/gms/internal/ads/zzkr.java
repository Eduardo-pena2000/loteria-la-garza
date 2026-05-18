package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.function.IntConsumer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzkr {
    final /* synthetic */ zzks zza;
    private final WeakReference zzb;
    private final IntConsumer zzc;

    public /* synthetic */ zzkr(zzks zzksVar, Context context, byte[] bArr) {
        Objects.requireNonNull(zzksVar);
        this.zza = zzksVar;
        this.zzb = new WeakReference(context);
        zzkp zzkpVar = new zzkp(this);
        this.zzc = zzkpVar;
        zzdx zzd = zzksVar.zzY().zzd(zzksVar.zzX(), null);
        Objects.requireNonNull(zzd);
        H.a(context, new zzkq(zzd), zzkpVar);
    }

    public final /* synthetic */ void zza() {
        Context context = (Context) this.zzb.get();
        if (context == null) {
            return;
        }
        G.a(context, this.zzc);
    }
}
