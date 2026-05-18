package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgth extends AbstractSet {
    final /* synthetic */ zzgtm zza;

    public /* synthetic */ zzgth(zzgtm zzgtmVar, byte[] bArr) {
        Objects.requireNonNull(zzgtmVar);
        this.zza = zzgtmVar;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object obj) {
        zzgtm zzgtmVar = this.zza;
        Map zzc = zzgtmVar.zzc();
        if (zzc != null) {
            return zzc.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int zzi = zzgtmVar.zzi(entry.getKey());
            if (zzi != -1 && Objects.equals(zzgtmVar.zzp(zzi), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public final Iterator iterator() {
        zzgtm zzgtmVar = this.zza;
        Map zzc = zzgtmVar.zzc();
        return zzc != null ? zzc.entrySet().iterator() : new zzgtf(zzgtmVar);
    }

    public final boolean remove(Object obj) {
        zzgtm zzgtmVar = this.zza;
        Map zzc = zzgtmVar.zzc();
        if (zzc != null) {
            return zzc.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (zzgtmVar.zzb()) {
            return false;
        }
        int zzh = zzgtmVar.zzh();
        int zze = zzgtn.zze(entry.getKey(), entry.getValue(), zzh, zzgtmVar.zzk(), zzgtmVar.zzl(), zzgtmVar.zzm(), zzgtmVar.zzn());
        if (zze == -1) {
            return false;
        }
        zzgtmVar.zze(zze, zzh);
        zzgtmVar.zzu(zzgtmVar.zzt() - 1);
        zzgtmVar.zzd();
        return true;
    }

    public final int size() {
        return this.zza.size();
    }
}
