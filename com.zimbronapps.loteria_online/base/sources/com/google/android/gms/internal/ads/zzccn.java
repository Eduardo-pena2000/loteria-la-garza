package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzccn implements zzbde {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzccn(Context context, String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final void zza(boolean z) {
        zzccq d = R5.t.d();
        Context context = this.zza;
        if (d.zza(context)) {
            synchronized (this.zzb) {
                try {
                    if (this.zzd == z) {
                        return;
                    }
                    this.zzd = z;
                    String str = this.zzc;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.zzd) {
                        R5.t.d().zzd(context, str);
                    } else {
                        R5.t.d().zze(context, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String zzb() {
        return this.zzc;
    }

    public final void zzdj(zzbdd zzbddVar) {
        zza(zzbddVar.zzj);
    }
}
