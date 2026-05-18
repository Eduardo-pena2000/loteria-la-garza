package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzbx extends zzbq implements Set {
    private transient zzbt zza;

    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (NullPointerException | ClassCastException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return zzcg.zza(this);
    }

    public zzbt zzd() {
        zzbt zzbtVar = this.zza;
        if (zzbtVar != null) {
            return zzbtVar;
        }
        zzbt zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public abstract zzch iterator();

    public zzbt zzh() {
        Object[] array = toArray();
        int i = zzbt.zzd;
        return zzbt.zzi(array, array.length);
    }
}
