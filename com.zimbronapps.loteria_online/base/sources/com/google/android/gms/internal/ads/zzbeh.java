package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbeh implements Comparator {
    public zzbeh(zzbej zzbejVar) {
        Objects.requireNonNull(zzbejVar);
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbem zzbemVar = (zzbem) obj;
        zzbem zzbemVar2 = (zzbem) obj2;
        int i = zzbemVar.zzc - zzbemVar2.zzc;
        return i != 0 ? i : Long.compare(zzbemVar.zza, zzbemVar2.zza);
    }
}
