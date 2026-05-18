package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzahd implements zzaef {
    private final zzafh zza;
    private final int zzb;
    private final zzafb zzc = new zzafb();

    public /* synthetic */ zzahd(zzafh zzafhVar, int i, byte[] bArr) {
        this.zza = zzafhVar;
        this.zzb = i;
    }

    private final long zzc(zzaev zzaevVar) throws IOException {
        while (zzaevVar.zzm() < zzaevVar.zzo() - 6) {
            zzafh zzafhVar = this.zza;
            int i = this.zzb;
            zzafb zzafbVar = this.zzc;
            long zzm = zzaevVar.zzm();
            zzer zzerVar = new zzer(17);
            zzaevVar.zzi(zzerVar.zzi(), 0, 2);
            if (zzerVar.zzo() != i) {
                zzaevVar.zzl();
                zzaevVar.zzk((int) (zzm - zzaevVar.zzn()));
            } else {
                zzerVar.zzf(zzaey.zzb(zzaevVar, zzerVar.zzi(), 2, 15) + 2);
                zzaevVar.zzl();
                zzaevVar.zzk((int) (zzm - zzaevVar.zzn()));
                if (zzafc.zza(zzerVar, zzafhVar, i, zzafbVar)) {
                    break;
                }
            }
            zzaevVar.zzk(1);
        }
        if (zzaevVar.zzm() < zzaevVar.zzo() - 6) {
            return this.zzc.zza;
        }
        zzaevVar.zzk((int) (zzaevVar.zzo() - zzaevVar.zzm()));
        return this.zza.zzj;
    }

    public final zzaee zza(zzaev zzaevVar, long j) throws IOException {
        long zzn = zzaevVar.zzn();
        long zzc = zzc(zzaevVar);
        long zzm = zzaevVar.zzm();
        zzaevVar.zzk(Math.max(6, this.zza.zzc));
        long zzc2 = zzc(zzaevVar);
        return (zzc > j || zzc2 <= j) ? zzc2 <= j ? zzaee.zzb(zzc2, zzaevVar.zzm()) : zzaee.zza(zzc, zzn) : zzaee.zzc(zzm);
    }
}
