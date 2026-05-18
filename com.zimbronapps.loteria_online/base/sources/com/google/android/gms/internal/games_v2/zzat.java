package com.google.android.gms.internal.games_v2;

import android.app.Application;
import com.google.android.gms.common.internal.t;
import java.util.concurrent.atomic.AtomicReference;
import z.Y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzat {
    private static final AtomicReference zza = new AtomicReference();
    private final zzas zzb;
    private final zzav zzc;

    public zzat(Application application, zzav zzavVar) {
        this.zzb = new zzas(this, application, null);
        this.zzc = zzavVar;
    }

    public static zzat zza(Application application) {
        AtomicReference atomicReference = zza;
        zzat zzatVar = (zzat) atomicReference.get();
        if (zzatVar != null) {
            return zzatVar;
        }
        zzat zzatVar2 = new zzat(application, zzax.zza(application));
        while (!Y.a(atomicReference, (Object) null, zzatVar2) && atomicReference.get() == null) {
        }
        return (zzat) t.l((zzat) zza.get());
    }

    public static /* bridge */ /* synthetic */ zzav zzb(zzat zzatVar) {
        return zzatVar.zzc;
    }

    public final void zzc() {
        zzfg.zza("AutomaticGamesAuthenticator", "startWatching()");
        zzas.zza(this.zzb);
    }
}
