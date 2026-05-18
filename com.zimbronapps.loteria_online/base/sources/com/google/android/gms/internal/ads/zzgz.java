package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgz extends zzgt {
    private zzhf zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzgz() {
        super(false);
    }

    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.zzb;
        String str = zzfj.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i, min);
        this.zzc += min;
        this.zzd -= min;
        zzh(min);
        return min;
    }

    public final long zzb(zzhf zzhfVar) throws IOException {
        zzf(zzhfVar);
        this.zza = zzhfVar;
        Uri normalizeScheme = zzhfVar.zza.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        zzgrc.zzf("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = zzfj.zza;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw zzat.zza("Unexpected URI format: ".concat(String.valueOf(normalizeScheme)), null);
        }
        String str2 = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw zzat.zza("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e);
            }
        } else {
            this.zzb = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j = zzhfVar.zze;
        int length = this.zzb.length;
        if (j > length) {
            this.zzb = null;
            throw new zzhc(2008);
        }
        int i = (int) j;
        this.zzc = i;
        int i2 = length - i;
        this.zzd = i2;
        long j2 = zzhfVar.zzf;
        if (j2 != -1) {
            this.zzd = (int) Math.min(i2, j2);
        }
        zzg(zzhfVar);
        return j2 != -1 ? j2 : this.zzd;
    }

    public final Uri zzc() {
        zzhf zzhfVar = this.zza;
        if (zzhfVar != null) {
            return zzhfVar.zza;
        }
        return null;
    }

    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzi();
        }
        this.zza = null;
    }
}
