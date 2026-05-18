package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzetm implements zzfax {
    private final Set zza;

    public zzetm(Set set) {
        this.zza = set;
    }

    public final x7.e zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzgzo.zza(new zzetl(arrayList, null));
    }

    public final int zzb() {
        return 8;
    }
}
