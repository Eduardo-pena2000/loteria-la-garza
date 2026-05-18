package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class zzgse extends zzgsv implements zzgva {
    public zzgse(Map map) {
        super(map);
    }

    public final Collection zza(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    public final Collection zzb(Object obj, Collection collection) {
        return zzg(obj, (List) collection, null);
    }

    public /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }
}
