package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgwp {
    public static zzgwo zza(Set set, Set set2) {
        zzgrc.zzk(set, "set1");
        zzgrc.zzk(set2, "set2");
        return new zzgwk(set, set2);
    }

    public static Set zzb(Set set, zzgrd zzgrdVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof zzgwl)) {
                set.getClass();
                return new zzgwl(set, zzgrdVar);
            }
            zzgwl zzgwlVar = (zzgwl) set;
            return new zzgwl(zzgwlVar.zza, zzgrg.zzb(zzgwlVar.zzb, zzgrdVar));
        }
        zzgwl zzgwlVar2 = (SortedSet) set;
        if (!(zzgwlVar2 instanceof zzgwl)) {
            zzgwlVar2.getClass();
            return new zzgwm(zzgwlVar2, zzgrdVar);
        }
        zzgwl zzgwlVar3 = zzgwlVar2;
        return new zzgwm(zzgwlVar3.zza, zzgrg.zzb(zzgwlVar3.zzb, zzgrdVar));
    }

    public static int zzc(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public static boolean zzd(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (NullPointerException | ClassCastException unused) {
            }
        }
        return false;
    }

    public static boolean zze(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    public static boolean zzf(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzgvw) {
            collection = ((zzgvw) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zze(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
