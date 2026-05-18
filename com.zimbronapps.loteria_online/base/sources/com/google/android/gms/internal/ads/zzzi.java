package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzzi extends zzzs implements Comparable {
    private final int zze;
    private final int zzf;

    public zzzi(int i, zzbg zzbgVar, int i2, zzzl zzzlVar, int i3) {
        super(i, zzbgVar, i2);
        this.zze = zzmn.zzaa(i3, zzzlVar.zzV) ? 1 : 0;
        this.zzf = this.zzd.zzc();
    }

    public final int zza() {
        return this.zze;
    }

    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzi zzziVar) {
        return Integer.compare(this.zzf, zzziVar.zzf);
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        return false;
    }
}
