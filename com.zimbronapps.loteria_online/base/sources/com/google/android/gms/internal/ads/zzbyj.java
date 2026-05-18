package com.google.android.gms.internal.ads;

import S5.l2;
import S5.m2;
import S5.n1;
import S5.p2;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbyj {
    private static zzcdd zze;
    private final Context zza;
    private final L5.c zzb;
    private final n1 zzc;
    private final String zzd;

    public zzbyj(Context context, L5.c cVar, n1 n1Var, String str) {
        this.zza = context;
        this.zzb = cVar;
        this.zzc = n1Var;
        this.zzd = str;
    }

    public static zzcdd zza(Context context) {
        zzcdd zzcddVar;
        synchronized (zzbyj.class) {
            try {
                if (zze == null) {
                    zze = S5.B.b().i(context, new zzbtp());
                }
                zzcddVar = zze;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcddVar;
    }

    public final void zzb(e6.b bVar) {
        l2 a;
        long currentTimeMillis = System.currentTimeMillis();
        Context context = this.zza;
        zzcdd zza = zza(context);
        if (zza == null) {
            bVar.onFailure("Internal Error, query info generator is null.");
            return;
        }
        N6.a s1 = N6.b.s1(context);
        n1 n1Var = this.zzc;
        if (n1Var == null) {
            m2 m2Var = new m2();
            m2Var.i(currentTimeMillis);
            a = m2Var.a();
        } else {
            n1Var.o(currentTimeMillis);
            a = p2.a.a(context, n1Var);
        }
        try {
            zza.zze(s1, new zzcdh(this.zzd, this.zzb.name(), null, a, 0, null), new zzbyi(this, bVar));
        } catch (RemoteException unused) {
            bVar.onFailure("Internal Error.");
        }
    }
}
