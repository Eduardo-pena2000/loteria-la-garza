package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzjj extends zzjn implements Serializable {
    final int zza;
    private final Queue zzb;

    private zzjj(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(zzji.zza("maxSize (%s) must >= 0", Integer.valueOf(i)));
        }
        this.zzb = new ArrayDeque(i);
        this.zza = i;
    }

    public static zzjj zza(int i) {
        return new zzjj(i);
    }

    public final boolean add(Object obj) {
        obj.getClass();
        if (this.zza == 0) {
            return true;
        }
        if (size() == this.zza) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.zza) {
            return zzjq.zza(this, collection.iterator());
        }
        clear();
        int i = size - this.zza;
        zzjf.zzb(i >= 0, "number to skip cannot be negative");
        return zzjq.zza(this, new zzjp(collection, i).iterator());
    }

    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    public final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    public final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    public final Queue zzd() {
        return this.zzb;
    }
}
