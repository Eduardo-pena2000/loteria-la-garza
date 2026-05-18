package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzedj implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzedj(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzedj zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzedj(zzikpVar, zzikpVar2);
    }

    public final /* synthetic */ Object zzb() {
        zzfnu zzfnuVar = (zzfnu) this.zza.zzb();
        CookieManager a = R5.t.j().a((Context) this.zzb.zzb());
        zzfno zzfnoVar = zzfno.WEBVIEW_COOKIE;
        Objects.requireNonNull(zzfnuVar);
        return zzfnf.zzb(new zzede(a), zzfnoVar, zzfnuVar).zzh(1L, TimeUnit.SECONDS).zzf(Exception.class, zzedb.zza).zzi();
    }
}
