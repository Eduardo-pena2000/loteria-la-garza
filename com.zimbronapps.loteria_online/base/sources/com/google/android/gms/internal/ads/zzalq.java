package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzalq extends zzalt {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    public static boolean zzd(zzer zzerVar) {
        return zzk(zzerVar, zza);
    }

    private static boolean zzk(zzer zzerVar, byte[] bArr) {
        if (zzerVar.zzd() < 8) {
            return false;
        }
        int zzg = zzerVar.zzg();
        byte[] bArr2 = new byte[8];
        zzerVar.zzm(bArr2, 0, 8);
        zzerVar.zzh(zzg);
        return Arrays.equals(bArr2, bArr);
    }

    public final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zzc = false;
        }
    }

    public final long zzb(zzer zzerVar) {
        return zzi(zzafu.zzd(zzerVar.zzi()));
    }

    public final boolean zzc(zzer zzerVar, long j, zzalr zzalrVar) throws zzat {
        if (zzk(zzerVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzerVar.zzi(), zzerVar.zze());
            int i = copyOf[9] & 255;
            List zza2 = zzafu.zza(copyOf);
            if (zzalrVar.zza != null) {
                return true;
            }
            zzt zztVar = new zzt();
            zztVar.zzl("audio/ogg");
            zztVar.zzm("audio/opus");
            zztVar.zzE(i);
            zztVar.zzF(48000);
            zztVar.zzp(zza2);
            zzalrVar.zza = zztVar.zzM();
            return true;
        }
        if (!zzk(zzerVar, zzb)) {
            zzalrVar.zza.getClass();
            return false;
        }
        zzalrVar.zza.getClass();
        if (this.zzc) {
            return true;
        }
        this.zzc = true;
        zzerVar.zzk(8);
        zzap zzc = zzagn.zzc(zzguf.zzr(zzagn.zzb(zzerVar, false, false).zza));
        if (zzc == null) {
            return true;
        }
        zzt zza3 = zzalrVar.zza.zza();
        zza3.zzk(zzc.zzf(zzalrVar.zza.zzl));
        zzalrVar.zza = zza3.zzM();
        return true;
    }
}
