package com.google.android.gms.internal.ads;

import S5.Y;
import S5.d2;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbmu extends zzbmc {
    private final O5.f zza;

    public zzbmu(O5.f fVar) {
    }

    public final /* synthetic */ O5.f zzc() {
        return null;
    }

    public final void zze(Y y, N6.a aVar) {
        if (y == null || aVar == null) {
            return;
        }
        M5.b bVar = new M5.b((Context) N6.b.r1(aVar));
        try {
            if (y.zzw() instanceof d2) {
                d2 d2Var = (d2) y.zzw();
                bVar.setAdListener(d2Var != null ? d2Var.q1() : null);
            }
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
        try {
            if (y.zzv() instanceof zzbdt) {
                zzbdt zzbdtVar = (zzbdt) y.zzv();
                bVar.setAppEventListener(zzbdtVar != null ? zzbdtVar.zzc() : null);
            }
        } catch (RemoteException e2) {
            W5.p.d("", e2);
        }
        W5.g.b.post(new zzbmt(this, bVar, y));
    }
}
