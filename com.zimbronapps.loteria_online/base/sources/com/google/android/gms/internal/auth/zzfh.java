package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfh extends zzfl {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ zzfh(zzfg zzfgVar) {
        super(null);
    }

    public final void zza(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzhj.zzf(obj, j);
        if (list instanceof zzff) {
            unmodifiableList = ((zzff) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzge) && (list instanceof zzez)) {
                zzez zzezVar = (zzez) list;
                if (zzezVar.zzc()) {
                    zzezVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzhj.zzp(obj, j, unmodifiableList);
    }

    public final void zzb(Object obj, Object obj2, long j) {
        ArrayList zzfeVar;
        ArrayList arrayList = (List) zzhj.zzf(obj2, j);
        int size = arrayList.size();
        ArrayList arrayList2 = (List) zzhj.zzf(obj, j);
        if (arrayList2.isEmpty()) {
            arrayList2 = arrayList2 instanceof zzff ? new zzfe(size) : ((arrayList2 instanceof zzge) && (arrayList2 instanceof zzez)) ? ((zzez) arrayList2).zzd(size) : new ArrayList(size);
            zzhj.zzp(obj, j, arrayList2);
        } else {
            if (zza.isAssignableFrom(arrayList2.getClass())) {
                zzfeVar = new ArrayList(arrayList2.size() + size);
                zzfeVar.addAll(arrayList2);
                zzhj.zzp(obj, j, zzfeVar);
            } else if (arrayList2 instanceof zzhe) {
                zzfeVar = new zzfe(arrayList2.size() + size);
                zzfeVar.addAll(zzfeVar.size(), (zzhe) arrayList2);
                zzhj.zzp(obj, j, zzfeVar);
            } else if ((arrayList2 instanceof zzge) && (arrayList2 instanceof zzez)) {
                zzez zzezVar = (zzez) arrayList2;
                if (!zzezVar.zzc()) {
                    arrayList2 = zzezVar.zzd(arrayList2.size() + size);
                    zzhj.zzp(obj, j, arrayList2);
                }
            }
            arrayList2 = zzfeVar;
        }
        int size2 = arrayList2.size();
        int size3 = arrayList.size();
        if (size2 > 0 && size3 > 0) {
            arrayList2.addAll(arrayList);
        }
        if (size2 > 0) {
            arrayList = arrayList2;
        }
        zzhj.zzp(obj, j, arrayList);
    }

    private zzfh() {
        super(null);
    }
}
