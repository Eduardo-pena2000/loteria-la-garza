package com.google.android.gms.internal.drive;

import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzje implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzjc zzjcVar = (zzjc) obj;
        zzjc zzjcVar2 = (zzjc) obj2;
        zzjj zzjjVar = (zzjj) zzjcVar.iterator();
        zzjj zzjjVar2 = (zzjj) zzjcVar2.iterator();
        while (zzjjVar.hasNext() && zzjjVar2.hasNext()) {
            int compare = Integer.compare(zzjc.zzb(zzjjVar.nextByte()), zzjc.zzb(zzjjVar2.nextByte()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzjcVar.size(), zzjcVar2.size());
    }
}
