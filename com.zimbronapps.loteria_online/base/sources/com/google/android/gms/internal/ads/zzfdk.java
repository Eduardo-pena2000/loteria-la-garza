package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfdk implements zzikg {
    public static zzfba zza(Context context, zzcdj zzcdjVar, zzcdk zzcdkVar, Object obj, zzfcc zzfccVar, zzfcw zzfcwVar, zzika zzikaVar, zzika zzikaVar2, zzika zzikaVar3, zzika zzikaVar4, zzika zzikaVar5, zzika zzikaVar6, zzika zzikaVar7, Executor executor, zzfoo zzfooVar, zzdxz zzdxzVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzfcp) obj);
        hashSet.add(zzfccVar);
        hashSet.add(zzfcwVar);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgL)).booleanValue()) {
            hashSet.add((zzfax) zzikaVar.zzb());
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgM)).booleanValue()) {
            hashSet.add((zzfax) zzikaVar2.zzb());
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgO)).booleanValue()) {
            hashSet.add((zzfax) zzikaVar4.zzb());
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgP)).booleanValue()) {
            hashSet.add((zzfax) zzikaVar5.zzb());
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzdQ)).booleanValue()) {
            hashSet.add((zzfax) zzikaVar7.zzb());
        }
        return new zzfba(context, executor, hashSet, zzfooVar, zzdxzVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
