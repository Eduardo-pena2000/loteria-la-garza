package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgtj extends AbstractSet {
    final /* synthetic */ zzgtm zza;

    public /* synthetic */ zzgtj(zzgtm zzgtmVar, byte[] bArr) {
        Objects.requireNonNull(zzgtmVar);
        this.zza = zzgtmVar;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    public final Iterator iterator() {
        zzgtm zzgtmVar = this.zza;
        Map zzc = zzgtmVar.zzc();
        return zzc != null ? zzc.keySet().iterator() : new zzgte(zzgtmVar);
    }

    public final boolean remove(Object obj) {
        zzgtm zzgtmVar = this.zza;
        Map zzc = zzgtmVar.zzc();
        return zzc != null ? zzc.keySet().remove(obj) : zzgtmVar.zzj(obj) != zzgtm.zzr();
    }

    public final int size() {
        return this.zza.size();
    }
}
