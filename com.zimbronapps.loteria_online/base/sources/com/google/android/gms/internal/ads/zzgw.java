package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgw extends zzgt {
    private final zzgv zza;
    private Uri zzb;
    private byte[] zzc;
    private int zzd;
    private int zze;
    private boolean zzf;

    public zzgw(byte[] bArr) {
        zzgu zzguVar = new zzgu(bArr);
        super(false);
        this.zza = zzguVar;
        zzgrc.zza(bArr.length > 0);
    }

    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zze;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.zzc;
        bArr2.getClass();
        System.arraycopy(bArr2, this.zzd, bArr, i, min);
        this.zzd += min;
        this.zze -= min;
        zzh(min);
        return min;
    }

    public final long zzb(zzhf zzhfVar) throws IOException {
        zzf(zzhfVar);
        Uri uri = zzhfVar.zza;
        this.zzb = uri;
        byte[] zza = this.zza.zza(uri);
        this.zzc = zza;
        long j = zzhfVar.zze;
        int length = zza.length;
        if (j > length) {
            throw new zzhc(2008);
        }
        int i = (int) j;
        this.zzd = i;
        int i2 = length - i;
        this.zze = i2;
        long j2 = zzhfVar.zzf;
        if (j2 != -1) {
            this.zze = (int) Math.min(i2, j2);
        }
        this.zzf = true;
        zzg(zzhfVar);
        return j2 != -1 ? j2 : this.zze;
    }

    public final Uri zzc() {
        return this.zzb;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
            zzi();
        }
        this.zzb = null;
        this.zzc = null;
    }
}
