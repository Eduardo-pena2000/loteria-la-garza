package com.google.android.gms.internal.ads;

import S5.l2;
import V5.o0;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdzx implements zzdzi {
    private final long zza;
    private final zzdzm zzb;
    private final zzfii zzc;

    public zzdzx(long j, Context context, zzdzm zzdzmVar, zzcma zzcmaVar, String str) {
        this.zza = j;
        this.zzb = zzdzmVar;
        zzfik zzq = zzcmaVar.zzq();
        zzq.zzc(context);
        zzq.zzb(str);
        this.zzc = zzq.zza().zzb();
    }

    public final void zza(l2 l2Var) {
        try {
            this.zzc.zzc(l2Var, new zzdzv(this));
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void zzb() {
        try {
            zzfii zzfiiVar = this.zzc;
            zzfiiVar.zze(new zzdzw(this));
            zzfiiVar.zzb(N6.b.s1(null));
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void zzc() {
    }

    public final /* synthetic */ long zzd() {
        return this.zza;
    }

    public final /* synthetic */ zzdzm zze() {
        return this.zzb;
    }
}
