package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzpr {
    public static final zzpr zza;
    public final int zzb;
    public final int zzc;
    private final zzgup zzd;

    static {
        zzpr zzprVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzguo zzguoVar = new zzguo();
            for (int i = 1; i <= 10; i++) {
                zzguoVar.zzf(Integer.valueOf(zzfj.zzB(i)));
            }
            zzprVar = new zzpr(2, zzguoVar.zzi());
        } else {
            zzprVar = new zzpr(2, 10);
        }
        zza = zzprVar;
    }

    public zzpr(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpr)) {
            return false;
        }
        zzpr zzprVar = (zzpr) obj;
        return this.zzb == zzprVar.zzb && this.zzc == zzprVar.zzc && Objects.equals(this.zzd, zzprVar.zzd);
    }

    public final int hashCode() {
        zzgup zzgupVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzgupVar == null ? 0 : zzgupVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(i2).length() + 15 + valueOf.length() + 1);
        sb.append("AudioProfile[format=");
        sb.append(i);
        sb.append(", maxChannelCount=");
        sb.append(i2);
        sb.append(", channelMasks=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final boolean zza(int i) {
        zzgup zzgupVar = this.zzd;
        if (zzgupVar == null) {
            return i <= this.zzc;
        }
        int zzB = zzfj.zzB(i);
        if (zzB == 0) {
            return false;
        }
        return zzgupVar.contains(Integer.valueOf(zzB));
    }

    public final int zzb(int i, zzd zzdVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (Build.VERSION.SDK_INT < 29) {
            Integer num = (Integer) zzps.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i2 = this.zzb;
        for (int i3 = 10; i3 > 0; i3--) {
            int zzB = zzfj.zzB(i3);
            if (zzB != 0 && V2.f.a(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i).setChannelMask(zzB).build(), zzdVar.zza())) {
                return i3;
            }
        }
        return 0;
    }

    public zzpr(int i, Set set) {
        this.zzb = i;
        zzgup zzo = zzgup.zzo(set);
        this.zzd = zzo;
        zzgwt it = zzo.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = i2;
    }
}
