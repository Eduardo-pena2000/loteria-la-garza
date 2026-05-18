package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhf {
    public static final /* synthetic */ int zzh = 0;
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        zzal.zzb("media3.datasource");
    }

    public /* synthetic */ zzhf(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj, byte[] bArr2) {
        this(uri, 0L, 1, null, map, j2, j3, null, i2, null);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        long j = this.zze;
        int length2 = String.valueOf(j).length();
        long j2 = this.zzf;
        int length3 = String.valueOf(j2).length();
        int i = this.zzg;
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i).length() + 1);
        sb.append("DataSpec[");
        sb.append("GET");
        sb.append(" ");
        sb.append(obj);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", null, ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public final boolean zza(int i) {
        return (this.zzg & i) == i;
    }

    public final zzhe zzb() {
        return new zzhe(this, null);
    }

    private zzhf(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        boolean z = false;
        boolean z2 = j2 >= 0;
        zzgrc.zza(z2);
        zzgrc.zza(z2);
        if (j3 > 0) {
            z = true;
        } else if (j3 == -1) {
            j3 = -1;
            z = true;
        }
        zzgrc.zza(z);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zze = j2;
        this.zzf = j3;
        this.zzg = i2;
    }

    @Deprecated
    public zzhf(Uri uri, long j, long j2, String str) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j, j2, null, 0, null);
    }
}
