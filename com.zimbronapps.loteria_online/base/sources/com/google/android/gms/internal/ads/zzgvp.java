package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgvp extends zzgvt {
    final /* synthetic */ Comparator zza;

    public zzgvp(Comparator comparator) {
        this.zza = comparator;
    }

    public final Map zza() {
        return new TreeMap(this.zza);
    }
}
