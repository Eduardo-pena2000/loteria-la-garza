package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzahr implements zzaeu {
    private zzaex zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzahv zzg;
    private zzaev zzh;
    private zzagd zzi;
    private zzakw zzj;
    private final zzer zza = new zzer(2);
    private long zzf = -1;

    private final int zzh(zzaev zzaevVar) throws IOException {
        zzer zzerVar = this.zza;
        zzerVar.zza(2);
        ((zzael) zzaevVar).zzh(zzerVar.zzi(), 0, 2, false);
        return zzerVar.zzt();
    }

    private final int zzi(zzaev zzaevVar) throws IOException {
        zzer zzerVar = this.zza;
        zzerVar.zza(2);
        zzaevVar.zzi(zzerVar.zzi(), 0, 2);
        return zzerVar.zzt() - 2;
    }

    private final void zzj() {
        zzaex zzaexVar = this.zzb;
        zzaexVar.getClass();
        zzaexVar.zzv();
        this.zzb.zzw(new zzafx(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    public final boolean zza(zzaev zzaevVar) throws IOException {
        int zzi;
        if (zzh(zzaevVar) == 65496) {
            while (true) {
                int zzh = zzh(zzaevVar);
                this.zzd = zzh;
                if (zzh == 65498 || (zzi = zzi(zzaevVar)) < 0) {
                    break;
                }
                if (this.zzd != 65505) {
                    ((zzael) zzaevVar).zzj(zzi, false);
                } else {
                    zzer zzerVar = this.zza;
                    zzerVar.zza(zzi);
                    ((zzael) zzaevVar).zzh(zzerVar.zzi(), 0, zzi, false);
                    if (Objects.equals(zzerVar.zzM((char) 0), "http://ns.adobe.com/xap/1.0/") && zzahu.zzb(zzerVar.zzM((char) 0))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void zzc(zzaex zzaexVar) {
        this.zzb = zzaexVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzd(com.google.android.gms.internal.ads.zzaev r26, com.google.android.gms.internal.ads.zzafv r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahr.zzd(com.google.android.gms.internal.ads.zzaev, com.google.android.gms.internal.ads.zzafv):int");
    }

    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzakw zzakwVar = this.zzj;
            zzakwVar.getClass();
            zzakwVar.zze(j, j2);
        }
    }

    public final void zzf() {
    }
}
