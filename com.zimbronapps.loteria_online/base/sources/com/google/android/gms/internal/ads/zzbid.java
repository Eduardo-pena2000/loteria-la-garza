package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbid extends v.e {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private Context zzc;
    private zzdxz zzd;
    private v.f zze;
    private v.c zzf;

    private final void zzf(Context context) {
        String c;
        if (this.zzf != null || context == null || (c = v.c.c(context, (List) null)) == null || c.equals(context.getPackageName())) {
            return;
        }
        v.c.a(context, c, this);
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, v.c cVar) {
        this.zzf = cVar;
        cVar.g(0L);
        this.zze = cVar.e(new zzbia(this));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final void zza(Context context, zzdxz zzdxzVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdxzVar;
        zzf(context);
    }

    public final v.f zzb() {
        if (this.zze == null) {
            zzcei.zza.execute(new zzbic(this));
        }
        return this.zze;
    }

    public final void zzc(int i) {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzfy)).booleanValue() || this.zzd == null) {
            return;
        }
        zzcei.zza.execute(new zzbib(this, i));
    }

    public final /* synthetic */ void zzd() {
        zzf(this.zzc);
    }

    public final /* synthetic */ void zze(int i) {
        zzdxz zzdxzVar = this.zzd;
        if (zzdxzVar != null) {
            zzdxy zza2 = zzdxzVar.zza();
            zza2.zzc("action", "cct_nav");
            zza2.zzc("cct_navs", String.valueOf(i));
            zza2.zzd();
        }
    }
}
