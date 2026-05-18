package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgur extends zzgup {
    private final transient zzgus zza;

    public zzgur(zzgus zzgusVar) {
        this.zza = zzgusVar;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzgus zzgusVar = this.zza;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) zzgusVar.zzu().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzguj(this.zza);
    }

    public final int size() {
        return this.zza.size;
    }

    public final zzgwt zza() {
        return new zzguj(this.zza);
    }

    public final boolean zzf() {
        return false;
    }
}
