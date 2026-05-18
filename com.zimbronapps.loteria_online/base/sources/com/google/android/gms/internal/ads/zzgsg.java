package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgsg extends zzgvi {
    final /* synthetic */ zzgsi zza;

    public zzgsg(zzgsi zzgsiVar) {
        Objects.requireNonNull(zzgsiVar);
        this.zza = zzgsiVar;
    }

    public final boolean contains(Object obj) {
        return zzgtd.zza(this.zza.zza.entrySet(), obj);
    }

    public final Iterator iterator() {
        return new zzgsh(this.zza);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzgsi zzgsiVar = this.zza;
        zzgsiVar.zzb.zzn(entry.getKey());
        return true;
    }

    public final Map zza() {
        return this.zza;
    }
}
