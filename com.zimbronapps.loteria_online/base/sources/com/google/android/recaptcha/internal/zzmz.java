package com.google.android.recaptcha.internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzmz extends zzmx implements zzoj {
    public zzmz(zzna zznaVar) {
        super(zznaVar);
    }

    /* renamed from: zze, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzna zzl() {
        if (!((zzna) this.zza).zzL()) {
            return (zzna) this.zza;
        }
        ((zzna) this.zza).zzb.zzg();
        return (zzna) super.zzl();
    }

    public final void zzo() {
        super.zzo();
        if (((zzna) this.zza).zzb != zzmt.zzd()) {
            zzna zznaVar = (zzna) this.zza;
            zznaVar.zzb = zznaVar.zzb.clone();
        }
    }
}
