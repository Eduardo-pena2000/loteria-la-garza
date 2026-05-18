package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzikx extends v.e {
    private final WeakReference zza;

    public zzikx(zzbif zzbifVar) {
        this.zza = new WeakReference(zzbifVar);
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, v.c cVar) {
        zzbif zzbifVar = (zzbif) this.zza.get();
        if (zzbifVar != null) {
            zzbifVar.zzf(cVar);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zzbif zzbifVar = (zzbif) this.zza.get();
        if (zzbifVar != null) {
            zzbifVar.zzg();
        }
    }
}
