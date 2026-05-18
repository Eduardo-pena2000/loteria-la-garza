package com.google.android.gms.internal.firebase-auth-api;

import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzajx implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzajv zzajvVar = (zzajv) obj;
        zzajv zzajvVar2 = (zzajv) obj2;
        zzakb zzakbVar = (zzakb) zzajvVar.iterator();
        zzakb zzakbVar2 = (zzakb) zzajvVar2.iterator();
        while (zzakbVar.hasNext() && zzakbVar2.hasNext()) {
            int compare = Integer.compare(zzajv.zza(zzakbVar.zza()), zzajv.zza(zzakbVar2.zza()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzajvVar.zzb(), zzajvVar2.zzb());
    }
}
