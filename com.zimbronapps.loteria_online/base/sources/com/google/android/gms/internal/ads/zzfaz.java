package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzfaz implements Callable {
    private final /* synthetic */ List zza;
    private final /* synthetic */ Object zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ Bundle zzd;
    private final /* synthetic */ Bundle zze;

    public /* synthetic */ zzfaz(List list, Object obj, boolean z, Bundle bundle, Bundle bundle2) {
        this.zza = list;
        this.zzb = obj;
        this.zzc = z;
        this.zzd = bundle;
        this.zze = bundle2;
    }

    public final /* synthetic */ Object call() {
        Object obj;
        Bundle bundle;
        Iterator it = this.zza.iterator();
        while (true) {
            obj = this.zzb;
            if (!it.hasNext()) {
                break;
            }
            zzfav zzfavVar = (zzfav) ((x7.e) it.next()).get();
            if (zzfavVar != null) {
                boolean z = this.zzc;
                zzfavVar.zza(obj);
                if (z) {
                    zzfavVar.zzb(obj);
                }
            }
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcK)).booleanValue() && (bundle = this.zzd) != null) {
            Bundle bundle2 = this.zze;
            long a = R5.t.o().a();
            if (obj instanceof zzdah) {
                bundle.putLong(zzdxh.zzf.zza(), a);
                bundle.putBundle("client_sig_latency_key", bundle2);
            } else {
                bundle.putLong(zzdxh.zzi.zza(), a);
                bundle.putBundle("gms_sig_latency_key", bundle2);
            }
        }
        return obj;
    }
}
