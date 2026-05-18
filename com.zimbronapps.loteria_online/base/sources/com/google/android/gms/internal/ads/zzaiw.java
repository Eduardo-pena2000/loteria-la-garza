package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaiw implements zzao {
    public final List zza;

    public zzaiw(List list) {
        this.zza = list;
        boolean z = false;
        if (!list.isEmpty()) {
            long j = ((zzaiv) list.get(0)).zzb;
            int i = 1;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (((zzaiv) list.get(i)).zza < j) {
                    z = true;
                    break;
                } else {
                    j = ((zzaiv) list.get(i)).zzb;
                    i++;
                }
            }
        }
        zzgrc.zza(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaiw.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzaiw) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }
}
