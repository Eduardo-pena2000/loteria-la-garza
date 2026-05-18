package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdq extends zzea {
    private final /* synthetic */ boolean zzga = false;
    private final /* synthetic */ zzdp zzgq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdq(zzdp zzdpVar, h hVar, boolean z) {
        super(zzdpVar, hVar, null);
        this.zzgq = zzdpVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zza(new zzek(this.zzgq.zzk, this.zzga), new zzdy(this));
    }
}
