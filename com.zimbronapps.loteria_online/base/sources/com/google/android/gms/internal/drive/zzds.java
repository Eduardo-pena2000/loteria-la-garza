package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzds extends zzav {
    private final /* synthetic */ List zzgb;
    private final /* synthetic */ zzdp zzgq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzdp zzdpVar, h hVar, List list) {
        super(hVar);
        this.zzgq = zzdpVar;
        this.zzgb = list;
    }

    public final /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zza(new zzgw(this.zzgq.zzk, this.zzgb), new zzgy(this));
    }
}
