package com.google.android.gms.internal.games_v2;

import W6.x;
import Y6.v;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.internal.t;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbr {
    private static final AtomicReference zza = new AtomicReference();
    private static boolean zzb = false;
    private final Application zzc;
    private final zzat zzd;
    private final x zze;
    private final v zzf;

    private zzbr(Application application, zzat zzatVar, x xVar, v vVar) {
        this.zzc = application;
        this.zzd = zzatVar;
        this.zze = xVar;
        this.zzf = vVar;
    }

    public static Application zza() {
        zzb();
        return ((zzbr) zza.get()).zzc;
    }

    public static void zzb() {
        t.p(zzb, "PlayGamesSdk has not been initialized. Ensure that PlayGamesSdk.initialize() has been called.");
    }

    public static void zzc(Context context) {
        t.a(context != null);
        AtomicReference atomicReference = zza;
        if (atomicReference.get() == null) {
            synchronized (atomicReference) {
                try {
                    if (atomicReference.get() == null) {
                        Application applicationContext = context.getApplicationContext();
                        Application application = applicationContext != null ? applicationContext : (Application) context;
                        zzbr zzbrVar = new zzbr(application, zzat.zza(application), x.b(application), v.b(context));
                        atomicReference.set(zzbrVar);
                        zzbrVar.zzf.a();
                        zzbrVar.zzd.zzc();
                        zzbrVar.zze.g();
                    }
                } finally {
                }
            }
        }
        zzb = true;
    }
}
