package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbdw implements Runnable {
    final /* synthetic */ zzbdx zza;

    public zzbdw(zzbdx zzbdxVar) {
        Objects.requireNonNull(zzbdxVar);
        this.zza = zzbdxVar;
    }

    public final void run() {
        zzbdx zzbdxVar = this.zza;
        synchronized (zzbdxVar.zzf()) {
            if (zzbdxVar.zzg().get() && zzbdxVar.zzh()) {
                zzbdxVar.zzg().set(false);
                int i = o0.b;
                W5.p.a("App went background");
                Iterator it = zzbdxVar.zzi().iterator();
                while (it.hasNext()) {
                    try {
                        ((zzbdy) it.next()).zza(false);
                    } catch (Exception e) {
                        W5.p.d("", e);
                    }
                }
            } else {
                int i2 = o0.b;
                W5.p.a("App is still foreground");
            }
        }
    }
}
