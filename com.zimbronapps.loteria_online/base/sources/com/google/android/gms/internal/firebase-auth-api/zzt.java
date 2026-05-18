package com.google.android.gms.internal.firebase-auth-api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzt {
    private final zzf zza;
    private final zzz zzb;
    private final int zzc;

    private zzt(zzz zzzVar) {
        this(zzzVar, false, zzj.zza, Integer.MAX_VALUE);
    }

    public static /* bridge */ /* synthetic */ int zza(zzt zztVar) {
        return zztVar.zzc;
    }

    public static /* bridge */ /* synthetic */ zzf zzb(zzt zztVar) {
        return zztVar.zza;
    }

    public static zzt zza(char c) {
        zzh zzhVar = new zzh(c);
        zzu.zza(zzhVar);
        return new zzt(new zzw(zzhVar));
    }

    private zzt(zzz zzzVar, boolean z, zzf zzfVar, int i) {
        this.zzb = zzzVar;
        this.zza = zzfVar;
        this.zzc = Integer.MAX_VALUE;
    }

    public static zzt zza(String str) {
        zzl zza = zzp.zza(str);
        if (!zza.zza("").zzc()) {
            return new zzt(new zzv(zza));
        }
        throw new IllegalArgumentException(zzp.zza("The pattern may not match the empty string: %s", zza));
    }

    public final List zza(CharSequence charSequence) {
        zzu.zza(charSequence);
        Iterator zza = this.zzb.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zza.hasNext()) {
            arrayList.add((String) zza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
