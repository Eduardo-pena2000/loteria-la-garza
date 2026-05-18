package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzclz implements zzazc {
    private final Context zza;
    private final zzgbb zzb;

    public zzclz(Context context, W5.a aVar) {
        this.zza = context;
        int intValue = ((Integer) S5.D.c().zzd(zzbhe.zzdx)).intValue();
        int i = intValue != 1 ? (intValue == 2 || intValue != 3) ? 3 : 4 : 2;
        zzgbw zze = zzgbx.zze();
        zze.zza(((Float) S5.D.c().zzd(zzbhe.zzdE)).floatValue());
        zzgbx zzgbxVar = (zzgbx) zze.zzbm();
        zzgby zzi = zzgbz.zzi();
        zzi.zza(((Boolean) S5.D.c().zzd(zzbhe.zzdF)).booleanValue());
        zzi.zzb(((Long) S5.D.c().zzd(zzbhe.zzdH)).longValue());
        zzgbz zzgbzVar = (zzgbz) zzi.zzbm();
        zzgbe zzu = zzgbf.zzu();
        zzu.zzi(i);
        zzu.zzb(aVar.a);
        zzu.zza(((Boolean) S5.D.c().zzd(zzbhe.zzdb)).booleanValue());
        zzu.zzh(((Integer) S5.D.c().zzd(zzbhe.zzdu)).intValue() == -1);
        zzu.zzg(((Integer) S5.D.c().zzd(zzbhe.zzdw)).intValue());
        zzu.zze(((Long) S5.D.c().zzd(zzbhe.zzdG)).longValue());
        zzu.zzd(((Integer) S5.D.c().zzd(zzbhe.zzdv)).intValue());
        zzu.zzc(zzgbxVar);
        zzu.zzf(zzgbzVar);
        zzgbb zza = zzgbb.zza(context, zzcei.zza, (zzgbf) zzu.zzbm());
        this.zzb = zza;
        zza.zzb();
    }

    public final String zza() {
        int zzh = this.zzb.zzh() - 1;
        return zzh != 1 ? zzh != 2 ? zzh != 3 ? "uns" : "3.0" : "2.0" : "1.0";
    }

    public final void zzd(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.zzb.zzg(motionEvent);
    }

    @Deprecated
    public final void zze(int i, int i2, int i3) {
        S5.B.a();
        Context context = this.zza;
        float c = W5.g.c(context, i);
        S5.B.a();
        float c2 = W5.g.c(context, i2);
        zzgbb zzgbbVar = this.zzb;
        long j = i3;
        MotionEvent obtain = MotionEvent.obtain(0L, j, 0, c, c2, 0);
        zzgbbVar.zzg(obtain);
        obtain.recycle();
        S5.B.a();
        float c3 = W5.g.c(context, i);
        S5.B.a();
        MotionEvent obtain2 = MotionEvent.obtain(0L, j, 2, c3, W5.g.c(context, i2), 0);
        zzgbbVar.zzg(obtain2);
        obtain2.recycle();
        S5.B.a();
        float c4 = W5.g.c(context, i);
        S5.B.a();
        MotionEvent obtain3 = MotionEvent.obtain(0L, j, 1, c4, W5.g.c(context, i2), 0);
        zzgbbVar.zzg(obtain3);
        obtain3.recycle();
    }

    public final String zzf(Context context, String str, View view, Activity activity) {
        return this.zzb.zze(context, str, view, null);
    }

    public final String zzg(Context context, String str, View view) {
        return this.zzb.zze(context, str, view, null);
    }

    public final void zzh(View view) {
    }

    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        this.zzb.zzf(Arrays.asList(stackTraceElementArr));
    }

    public final String zzj(Context context, View view, Activity activity) {
        return this.zzb.zzd(context, null, view, activity);
    }

    public final String zzk(Context context) {
        return this.zzb.zzc(context);
    }

    public final String zzl(Context context) {
        return this.zzb.zzc(context);
    }
}
