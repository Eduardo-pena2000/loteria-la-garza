package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzchr implements com.google.android.gms.common.api.k {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzchr(zzcge zzcgeVar) {
        Context context = zzcgeVar.getContext();
        this.zza = context;
        this.zzb = R5.t.g().R(context, zzcgeVar.zzs().a);
        this.zzc = new WeakReference(zzcgeVar);
    }

    public void release() {
    }

    public abstract boolean zze(String str);

    public boolean zzf(String str, String[] strArr) {
        return zze(str);
    }

    public boolean zzg(String str, String[] strArr, zzchj zzchjVar) {
        return zze(str);
    }

    public void zzh(int i) {
    }

    public void zzi(int i) {
    }

    public void zzj(int i) {
    }

    public void zzk(int i) {
    }

    public abstract void zzl();

    public final void zzm(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        W5.g.b.post(new zzchm(this, str, str2, j, j2, j3, j4, j5, z, i, i2));
    }

    public final void zzn(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        W5.g.b.post(new zzchn(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    public final void zzo(String str, String str2, int i) {
        W5.g.b.post(new zzcho(this, str, str2, i));
    }

    public final void zzp(String str, String str2, long j) {
        W5.g.b.post(new zzchp(this, str, str2, j));
    }

    public final void zzq(String str, String str2, String str3, String str4) {
        W5.g.b.post(new zzchq(this, str, str2, str3, str4));
    }

    public final /* synthetic */ void zzw(String str, Map map) {
        zzcge zzcgeVar = (zzcge) this.zzc.get();
        if (zzcgeVar != null) {
            zzcgeVar.zze("onPrecacheEvent", map);
        }
    }
}
