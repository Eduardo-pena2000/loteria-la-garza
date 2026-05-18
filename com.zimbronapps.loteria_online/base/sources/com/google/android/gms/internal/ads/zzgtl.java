package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgtl extends AbstractCollection {
    final /* synthetic */ zzgtm zza;

    public /* synthetic */ zzgtl(zzgtm zzgtmVar, byte[] bArr) {
        Objects.requireNonNull(zzgtmVar);
        this.zza = zzgtmVar;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final Iterator iterator() {
        zzgtm zzgtmVar = this.zza;
        Map zzc = zzgtmVar.zzc();
        return zzc != null ? zzc.values().iterator() : new zzgtg(zzgtmVar);
    }

    public final int size() {
        return this.zza.size();
    }
}
