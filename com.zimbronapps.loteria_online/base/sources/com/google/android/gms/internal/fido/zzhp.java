package com.google.android.gms.internal.fido;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzhp implements Comparable {
    private final zzhp zzc(Class cls) throws zzho {
        if (cls.isInstance(this)) {
            return (zzhp) cls.cast(this);
        }
        throw new zzho("Expected a " + cls.getName() + " value, but got " + getClass().getName());
    }

    public static int zzd(byte b) {
        return (b >> 5) & 7;
    }

    public static zzhk zzg(long j) {
        return new zzhk(j);
    }

    public static zzhn zzi(String str) {
        return new zzhn(str);
    }

    public static zzhp zzj(byte... bArr) throws zzhj {
        bArr.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length));
        return zzhq.zza(byteArrayInputStream, new zzhs(byteArrayInputStream));
    }

    public static zzhp zzk(InputStream inputStream) throws zzhj {
        return zzhq.zza(inputStream, new zzhs(inputStream));
    }

    public abstract int zza();

    public int zzb() {
        return 0;
    }

    public final zzhi zze() throws zzho {
        return (zzhi) zzc(zzhi.class);
    }

    public final zzhk zzf() throws zzho {
        return (zzhk) zzc(zzhk.class);
    }

    public final zzhm zzh() throws zzho {
        return (zzhm) zzc(zzhm.class);
    }
}
