package com.google.android.gms.internal.auth;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhd implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzhe zzb;

    public zzhd(zzhe zzheVar) {
        this.zzb = zzheVar;
        this.zza = zzhe.zza(zzheVar).iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
