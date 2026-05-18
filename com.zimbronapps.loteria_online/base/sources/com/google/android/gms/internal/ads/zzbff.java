package com.google.android.gms.internal.ads;

import N5.a;
import S5.Y;
import S5.n1;
import S5.p2;
import S5.q2;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbff {
    private Y zza;
    private final Context zzb;
    private final String zzc;
    private final n1 zzd;
    private final a.a zze;
    private final zzbtp zzf = new zzbtp();
    private final p2 zzg = p2.a;

    public zzbff(Context context, String str, n1 n1Var, a.a aVar) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = n1Var;
        this.zze = aVar;
    }

    public final void zza() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            q2 P1 = q2.P1();
            S5.y b = S5.B.b();
            Context context = this.zzb;
            String str = this.zzc;
            Y a = b.a(context, P1, str, this.zzf);
            this.zza = a;
            if (a != null) {
                n1 n1Var = this.zzd;
                n1Var.o(currentTimeMillis);
                this.zza.zzJ(new zzbes(this.zze, str));
                this.zza.zze(this.zzg.a(context, n1Var));
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }
}
