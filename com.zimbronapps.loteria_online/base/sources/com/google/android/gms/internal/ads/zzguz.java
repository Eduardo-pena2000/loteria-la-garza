package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzguz extends zzgvz implements Serializable {
    final Comparator zza;

    public zzguz(Comparator comparator) {
        this.zza = comparator;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Iterator it = ((Iterable) obj).iterator();
        Iterator it2 = ((Iterable) obj2).iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int compare = this.zza.compare(it.next(), it2.next());
            if (compare != 0) {
                return compare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzguz) {
            return this.zza.equals(((zzguz) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 2075626741;
    }

    public final String toString() {
        return this.zza.toString().concat(".lexicographical()");
    }
}
