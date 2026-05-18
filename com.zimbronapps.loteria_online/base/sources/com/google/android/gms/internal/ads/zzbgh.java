package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbgh {
    final /* synthetic */ zzbgi zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzbgh(zzbgi zzbgiVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzbgiVar);
        this.zza = zzbgiVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzc() {
        try {
            zzbgi zzbgiVar = this.zza;
            if (zzbgiVar.zzb) {
                zzbgiVar.zza.zzh(this.zzb);
                zzbgiVar.zza.zzi(0);
                zzbgiVar.zza.zzj(this.zzc);
                zzbgiVar.zza.zzg(null);
                zzbgiVar.zza.zzf();
            }
        } catch (RemoteException e) {
            W5.p.b("Clearcut log failed", e);
        }
    }

    public final synchronized void zza() {
        this.zza.zza().execute(new zzbgg(this));
    }

    public final zzbgh zzb(int i) {
        this.zzc = i;
        return this;
    }
}
