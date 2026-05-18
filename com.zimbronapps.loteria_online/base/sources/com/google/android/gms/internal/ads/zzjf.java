package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzjf {
    final Context zza;
    zzdn zzb;
    zzgru zzc;
    zzgru zzd;
    zzgru zze;
    zzgru zzf;
    zzgru zzg;
    zzgqt zzh;
    Looper zzi;
    int zzj;
    zzd zzk;
    int zzl;
    boolean zzm;
    zzmt zzn;
    zzms zzo;
    long zzp;
    long zzq;
    int zzr;
    int zzs;
    int zzt;
    int zzu;
    boolean zzv;
    boolean zzw;
    String zzx;
    zzip zzy;

    public zzjf(Context context, zzmq zzmqVar) {
        zzje zzjeVar = new zzje(zzmqVar);
        zziz zzizVar = new zziz(context);
        zzja zzjaVar = new zzja(context);
        zziy zziyVar = zziy.zza;
        zzjb zzjbVar = new zzjb(context);
        zzix zzixVar = zzix.zza;
        context.getClass();
        this.zza = context;
        this.zzc = zzjeVar;
        this.zzd = zzizVar;
        this.zze = zzjaVar;
        this.zzf = zziyVar;
        this.zzg = zzjbVar;
        this.zzh = zzixVar;
        this.zzi = zzfj.zze();
        this.zzk = zzd.zza;
        this.zzl = 1;
        this.zzm = true;
        this.zzn = zzmt.zzc;
        this.zzo = zzms.zza;
        this.zzy = new zzip(0.97f, 1.03f, 1000L, 1.0E-7f, zzfj.zzq(20L), zzfj.zzq(500L), 0.999f, null);
        this.zzb = zzdn.zza;
        this.zzp = 500L;
        this.zzq = 2000L;
        this.zzr = 600000;
        this.zzs = Integer.MAX_VALUE;
        this.zzt = Integer.MAX_VALUE;
        this.zzu = 600000;
        this.zzv = true;
        this.zzx = "";
        this.zzj = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i = zziv.zza;
        }
    }
}
