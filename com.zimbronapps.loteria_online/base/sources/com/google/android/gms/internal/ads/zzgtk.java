package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgtk extends zzgsw {
    final /* synthetic */ zzgtm zza;
    private final Object zzb;
    private int zzc;

    public zzgtk(zzgtm zzgtmVar, int i) {
        Objects.requireNonNull(zzgtmVar);
        this.zza = zzgtmVar;
        this.zzb = zzgtmVar.zzo(i);
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i != -1) {
            zzgtm zzgtmVar = this.zza;
            if (i < zzgtmVar.size() && Objects.equals(this.zzb, zzgtmVar.zzo(this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzi(this.zzb);
    }

    public final Object getKey() {
        return this.zzb;
    }

    public final Object getValue() {
        zzgtm zzgtmVar = this.zza;
        Map zzc = zzgtmVar.zzc();
        if (zzc != null) {
            return zzc.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzgtmVar.zzp(i);
    }

    public final Object setValue(Object obj) {
        zzgtm zzgtmVar = this.zza;
        Map zzc = zzgtmVar.zzc();
        if (zzc != null) {
            return zzc.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            zzgtmVar.put(this.zzb, obj);
            return null;
        }
        Object zzp = zzgtmVar.zzp(i);
        zzgtmVar.zzq(this.zzc, obj);
        return zzp;
    }
}
