package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzggg implements zzgha {
    private final Map zza;
    private final zzawg zzb;
    private final zzgoc zzc;
    private final long zzd;

    public zzggg(zzawg zzawgVar, Map map, zzgbf zzgbfVar, zzgoe zzgoeVar) {
        this.zza = map;
        this.zzb = zzawgVar;
        this.zzc = zzgoeVar.zza(112);
        this.zzd = zzgbfVar.zzj();
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zza();
        return null;
    }

    public final Void zza() throws Exception {
        zzaxg zzaxgVar;
        try {
            try {
                this.zzc.zza();
                x7.e eVar = (x7.e) this.zza.get("gs");
                if (eVar != null && (zzaxgVar = (zzaxg) eVar.get(this.zzd, TimeUnit.MILLISECONDS)) != null) {
                    zzawg zzawgVar = this.zzb;
                    synchronized (zzawgVar) {
                        zzawgVar.zzad(zzaxgVar.zzh());
                        zzawgVar.zzN(zzaxgVar.zzd());
                    }
                }
            } catch (Throwable th) {
                this.zzc.zzc();
                throw th;
            }
        } catch (ExecutionException | TimeoutException | ClassCastException | InterruptedException e) {
            this.zzc.zzb(e);
        }
        this.zzc.zzc();
        return null;
    }
}
