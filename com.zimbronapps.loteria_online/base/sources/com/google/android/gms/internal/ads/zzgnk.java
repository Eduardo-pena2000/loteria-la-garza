package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgnk implements zzgnb, zzgdd {
    private final Context zza;
    private final zzgoe zzb;
    private final zzgzy zzc;
    private final zzgbf zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);
    private x7.e zzf = zzgzo.zza(null);

    public zzgnk(Context context, zzgoe zzgoeVar, zzgzy zzgzyVar, zzgbf zzgbfVar) {
        this.zza = context;
        this.zzb = zzgoeVar;
        this.zzc = zzgzyVar;
        this.zzd = zzgbfVar;
    }

    public final x7.e zza() {
        return (this.zze.getAndSet(true) || !this.zzd.zzc()) ? zzgzo.zzb() : this.zzc.submit(new zzgnj(this));
    }

    public final void zzb(Map map) {
        map.put("gs", this.zzf);
    }

    public final void zzc(Map map, Context context, View view) {
        map.put("gs", this.zzf);
    }

    public final void zzd(Map map) {
        map.put("gs", this.zzf);
    }

    public final /* synthetic */ void zze() {
        x7.e submit = this.zzc.submit(new zzgni(this));
        this.zzb.zze(53, submit);
        this.zzf = submit;
    }

    public final /* synthetic */ zzaxg zzf() {
        Context context = this.zza;
        try {
            return zzfvo.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }
}
