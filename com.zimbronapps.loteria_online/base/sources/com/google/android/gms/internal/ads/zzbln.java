package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbln {
    private final zzblm zza;

    public zzbln(zzblm zzblmVar) {
        Context context;
        this.zza = zzblmVar;
        try {
            context = (Context) N6.b.r1(zzblmVar.zzm());
        } catch (RemoteException | NullPointerException e) {
            W5.p.d("", e);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzn(N6.b.s1(new O5.b(context)));
            } catch (RemoteException e2) {
                W5.p.d("", e2);
            }
        }
    }

    public final zzblm zza() {
        return this.zza;
    }

    public final String zzb() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }
}
