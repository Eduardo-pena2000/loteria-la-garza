package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzyy implements Comparator {
    static final /* synthetic */ zzyy zza = new zzyy();

    private /* synthetic */ zzyy() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzyx) Collections.max((List) obj)).compareTo((zzyx) Collections.max((List) obj2));
    }
}
