package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
abstract class zzgsy implements zzgvn {
    private transient Set zza;
    private transient Collection zzb;
    private transient Map zzc;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgvn) {
            return zzu().equals(((zzgvn) obj).zzu());
        }
        return false;
    }

    public final int hashCode() {
        return zzu().hashCode();
    }

    public final String toString() {
        return zzu().toString();
    }

    public boolean zze(Object obj, Object obj2) {
        throw null;
    }

    public abstract Set zzh();

    public abstract Collection zzj();

    public Iterator zzk() {
        throw null;
    }

    public abstract Map zzl();

    public boolean zzr(Object obj) {
        Iterator it = zzu().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final Set zzs() {
        Set set = this.zza;
        if (set != null) {
            return set;
        }
        Set zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    public Collection zzt() {
        Collection collection = this.zzb;
        if (collection != null) {
            return collection;
        }
        Collection zzj = zzj();
        this.zzb = zzj;
        return zzj;
    }

    public Map zzu() {
        Map map = this.zzc;
        if (map != null) {
            return map;
        }
        Map zzl = zzl();
        this.zzc = zzl;
        return zzl;
    }
}
