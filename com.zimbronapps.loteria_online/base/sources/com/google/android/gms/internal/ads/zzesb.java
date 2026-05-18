package com.google.android.gms.internal.ads;

import S5.c1;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzesb implements zzdbi {
    private final /* synthetic */ zzerp zza;
    private final /* synthetic */ zzbrb zzb;

    public /* synthetic */ zzesb(zzerp zzerpVar, zzbrb zzbrbVar) {
        this.zza = zzerpVar;
        this.zzb = zzbrbVar;
    }

    public final /* synthetic */ void zzdI(c1 c1Var) {
        this.zza.zzdI(c1Var);
        zzbrb zzbrbVar = this.zzb;
        if (zzbrbVar != null) {
            try {
                zzbrbVar.zzg(c1Var);
            } catch (RemoteException e) {
                W5.p.i("#007 Could not call remote method.", e);
            }
        }
        if (zzbrbVar != null) {
            try {
                zzbrbVar.zzf(c1Var.a);
            } catch (RemoteException e2) {
                W5.p.i("#007 Could not call remote method.", e2);
            }
        }
    }
}
