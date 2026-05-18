package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.nativead.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbxa implements c.a {
    private final zzblm zza;

    public zzbxa(zzblm zzblmVar) {
        this.zza = zzblmVar;
        try {
            zzblmVar.zzr();
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }

    public final void setView(View view) {
        try {
            this.zza.zzq(N6.b.s1(view));
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }

    public final boolean start() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e) {
            W5.p.d("", e);
            return false;
        }
    }
}
