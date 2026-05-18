package com.google.android.gms.internal.firebase-auth-api;

import java.util.Iterator;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzaq extends zzag implements Set {
    private transient zzah zza;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return zzav.zza(this, obj);
    }

    public int hashCode() {
        return zzav.zza(this);
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public zzah zzc() {
        zzah zzahVar = this.zza;
        if (zzahVar != null) {
            return zzahVar;
        }
        zzah zzf = zzf();
        this.zza = zzf;
        return zzf;
    }

    public zzah zzf() {
        return zzah.zza(toArray());
    }
}
