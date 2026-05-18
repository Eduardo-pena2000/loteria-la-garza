package com.google.android.gms.internal.drive;

import I6.d;
import I6.n;
import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzee extends zzet {
    private static final k zzbz = new k("EventCallback", "");
    private final n zzgt;
    private final zzeg zzgu;
    private final List zzgv = new ArrayList();
    private final int zzda = 1;

    public zzee(Looper looper, Context context, int i, n nVar) {
        this.zzgt = nVar;
        this.zzgu = new zzeg(looper, context, null);
    }

    public static /* synthetic */ k zzai() {
        return zzbz;
    }

    public final void zzc(zzfp zzfpVar) throws RemoteException {
        d zzat = zzfpVar.zzat();
        t.o(this.zzda == zzat.getType());
        t.o(this.zzgv.contains(Integer.valueOf(zzat.getType())));
        zzeg zzegVar = this.zzgu;
        zzegVar.sendMessage(zzegVar.obtainMessage(1, new Pair(this.zzgt, zzat)));
    }

    public final void zzf(int i) {
        this.zzgv.add(1);
    }

    public final boolean zzg(int i) {
        return this.zzgv.contains(1);
    }
}
