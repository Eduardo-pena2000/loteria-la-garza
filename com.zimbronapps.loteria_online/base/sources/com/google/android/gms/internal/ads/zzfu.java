package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfu extends zzfw {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzfu(int i, long j) {
        super(i, null);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    public final String toString() {
        List list = this.zzb;
        String zze = zzfw.zze(this.zzd);
        String arrays = Arrays.toString(list.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        int length = zze.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(arrays).length() + 13 + String.valueOf(arrays2).length());
        sb.append(zze);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }

    public final void zza(zzfv zzfvVar) {
        this.zzb.add(zzfvVar);
    }

    public final void zzb(zzfu zzfuVar) {
        this.zzc.add(zzfuVar);
    }

    public final zzfv zzc(int i) {
        List list = this.zzb;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzfv zzfvVar = (zzfv) list.get(i2);
            if (zzfvVar.zzd == i) {
                return zzfvVar;
            }
        }
        return null;
    }

    public final zzfu zzd(int i) {
        List list = this.zzc;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzfu zzfuVar = (zzfu) list.get(i2);
            if (zzfuVar.zzd == i) {
                return zzfuVar;
            }
        }
        return null;
    }
}
