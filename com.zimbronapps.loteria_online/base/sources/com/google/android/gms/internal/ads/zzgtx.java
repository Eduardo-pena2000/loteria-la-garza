package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Queue;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzgtx extends zzgtu implements Queue {
    public final Object element() {
        return zza().element();
    }

    public final boolean offer(Object obj) {
        return zza().offer(obj);
    }

    public final Object peek() {
        return zza().peek();
    }

    public final Object poll() {
        return zza().poll();
    }

    public final Object remove() {
        return zza().remove();
    }

    public abstract Queue zza();

    public /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }
}
