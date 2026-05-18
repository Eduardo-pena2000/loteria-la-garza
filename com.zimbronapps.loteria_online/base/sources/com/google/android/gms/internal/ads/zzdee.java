package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzdee implements Runnable {
    private final WeakReference zza;

    public /* synthetic */ zzdee(zzdeg zzdegVar, byte[] bArr) {
        this.zza = new WeakReference(zzdegVar);
    }

    public final void run() {
        zzdeg zzdegVar = (zzdeg) this.zza.get();
        if (zzdegVar != null) {
            zzdegVar.zzs(zzded.zza);
        }
    }
}
