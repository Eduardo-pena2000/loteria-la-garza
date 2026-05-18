package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaw {
    private final zzr zza = new zzr();

    public final zzaw zza(int i) {
        this.zza.zza(i);
        return this;
    }

    public final zzaw zzb(int i, boolean z) {
        if (z) {
            this.zza.zza(i);
        }
        return this;
    }

    public final zzaw zzc(int... iArr) {
        for (int i = 0; i < 20; i++) {
            this.zza.zza(iArr[i]);
        }
        return this;
    }

    public final zzaw zzd(zzax zzaxVar) {
        zzs zza = zzaxVar.zza();
        for (int i = 0; i < zza.zzb(); i++) {
            this.zza.zza(zza.zzc(i));
        }
        return this;
    }

    public final zzax zze() {
        return new zzax(this.zza.zzb(), null);
    }
}
