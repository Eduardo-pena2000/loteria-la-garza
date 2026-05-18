package com.google.android.gms.internal.auth;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzet extends zzdp {
    protected zzev zza;
    private final zzev zzb;

    public zzet(zzev zzevVar) {
        this.zzb = zzevVar;
        if (zzevVar.zzm()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zzevVar.zzc();
    }

    /* renamed from: zzb, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzet zza() {
        zzet zzetVar = (zzet) this.zzb.zzn(5, null, null);
        zzetVar.zza = zzd();
        return zzetVar;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public zzev zzd() {
        if (!this.zza.zzm()) {
            return this.zza;
        }
        this.zza.zzi();
        return this.zza;
    }

    public final /* bridge */ /* synthetic */ zzfx zze() {
        throw null;
    }
}
