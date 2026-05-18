package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbx extends WebView {
    private final Handler zza;
    private final zzcd zzb;
    private boolean zzc;

    public zzbx(zzbz zzbzVar, Handler handler, zzcd zzcdVar) {
        super(zzbzVar);
        this.zzc = false;
        this.zza = handler;
        this.zzb = zzcdVar;
    }

    public static /* bridge */ /* synthetic */ zzcd zza(zzbx zzbxVar) {
        return zzbxVar.zzb;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzbx zzbxVar, boolean z) {
        zzbxVar.zzc = true;
    }

    public static /* bridge */ /* synthetic */ boolean zze(zzbx zzbxVar) {
        return zzbxVar.zzc;
    }

    public static /* bridge */ /* synthetic */ boolean zzf(zzbx zzbxVar, String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void zzc() {
        zzcd zzcdVar = this.zzb;
        Objects.requireNonNull(zzcdVar);
        this.zza.post(new zzbu(zzcdVar));
    }

    public final void zzd(String str, String str2) {
        this.zza.post(new zzbt(this, str + "(" + str2 + ");"));
    }
}
