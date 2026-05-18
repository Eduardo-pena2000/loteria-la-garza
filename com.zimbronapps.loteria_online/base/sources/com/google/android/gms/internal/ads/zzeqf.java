package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeqf {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdvp zzb;

    public zzeqf(zzdvp zzdvpVar) {
        this.zzb = zzdvpVar;
    }

    public final void zza(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e) {
            o0.l("Couldn't create RTB adapter : ", e);
        }
    }

    public final zzbvs zzb(String str) {
        ConcurrentHashMap concurrentHashMap = this.zza;
        if (concurrentHashMap.containsKey(str)) {
            return (zzbvs) concurrentHashMap.get(str);
        }
        return null;
    }
}
