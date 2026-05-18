package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzffk implements zzgyw {
    private final /* synthetic */ zzfli zza;
    private final /* synthetic */ zzcxj zzb;

    public /* synthetic */ zzffk(zzffl zzfflVar, zzfli zzfliVar, zzcxj zzcxjVar) {
        this.zza = zzfliVar;
        this.zzb = zzcxjVar;
    }

    public final /* synthetic */ x7.e zza(Object obj) {
        zzfjc zzfjcVar = (zzfjc) obj;
        this.zza.zzb = zzfjcVar;
        Iterator it = zzfjcVar.zzb.zza.iterator();
        boolean z = false;
        loop0: while (true) {
            if (it.hasNext()) {
                Iterator it2 = ((zzfir) it.next()).zza.iterator();
                while (it2.hasNext()) {
                    if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                        break loop0;
                    }
                    z = true;
                }
            } else if (z) {
                return this.zzb.zzc(zzgzo.zza(zzfjcVar));
            }
        }
        return zzgzo.zza(null);
    }
}
