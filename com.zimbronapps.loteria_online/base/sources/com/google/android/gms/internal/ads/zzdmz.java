package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzdmz implements zzboh {
    private final WeakReference zza;
    private final WeakReference zzb;

    public /* synthetic */ zzdmz(zzdnb zzdnbVar, View view, byte[] bArr) {
        this.zza = new WeakReference(zzdnbVar);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzos)).booleanValue()) {
            this.zzb = new WeakReference(view);
        } else {
            this.zzb = new WeakReference((Object) null);
        }
    }

    public final void zza(Object obj, Map map) {
        zzdnb zzdnbVar = (zzdnb) this.zza.get();
        if (zzdnbVar == null) {
            return;
        }
        zzdnbVar.zzC().zza();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzos)).booleanValue()) {
            zzdnbVar.zzB((View) this.zzb.get());
        }
    }
}
