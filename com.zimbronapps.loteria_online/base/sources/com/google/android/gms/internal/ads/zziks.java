package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zziks implements zzikg {
    private final List zza;
    private final List zzb;

    static {
        zzikh.zza(Collections.emptySet());
    }

    public /* synthetic */ zziks(List list, List list2, zzikq zzikqVar) {
        this.zza = list;
        this.zzb = list2;
    }

    public static zzikr zza(int i, int i2) {
        return new zzikr(i, i2, null);
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        List list = this.zza;
        int size = list.size();
        List list2 = this.zzb;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((zzikp) list2.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet zzb = zzikd.zzb(size);
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object zzb2 = ((zzikp) list.get(i2)).zzb();
            zzb2.getClass();
            zzb.add(zzb2);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                zzb.add(obj);
            }
        }
        return Collections.unmodifiableSet(zzb);
    }
}
