package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcmb {
    private W5.a zza;
    private Context zzb;
    private long zzc;
    private WeakReference zzd;

    public final zzcmb zza(W5.a aVar) {
        this.zza = aVar;
        return this;
    }

    public final zzcmb zzb(Context context) {
        this.zzd = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzcmb zzc(long j) {
        this.zzc = j;
        return this;
    }

    public final /* synthetic */ W5.a zzd() {
        return this.zza;
    }

    public final /* synthetic */ Context zze() {
        return this.zzb;
    }

    public final /* synthetic */ long zzf() {
        return this.zzc;
    }

    public final /* synthetic */ WeakReference zzg() {
        return this.zzd;
    }
}
