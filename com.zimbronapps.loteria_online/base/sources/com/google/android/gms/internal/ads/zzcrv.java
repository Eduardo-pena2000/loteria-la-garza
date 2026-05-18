package com.google.android.gms.internal.ads;

import V5.q0;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcrv {
    zzbyr zza;
    zzbyr zzb;
    private final Context zzc;
    private final q0 zzd;
    private final zzekc zze;
    private final zzdva zzf;
    private final zzgzy zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    public zzcrv(Context context, q0 q0Var, zzekc zzekcVar, zzdva zzdvaVar, zzgzy zzgzyVar, zzgzy zzgzyVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = q0Var;
        this.zze = zzekcVar;
        this.zzf = zzdvaVar;
        this.zzg = zzgzyVar;
        this.zzh = zzgzyVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzc(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) S5.D.c().zzd(zzbhe.zzlF));
    }

    private final x7.e zzk(String str, InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) S5.D.c().zzd(zzbhe.zzlF)) || this.zzd.zzx()) {
                return zzgzo.zza(str);
            }
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter((String) S5.D.c().zzd(zzbhe.zzlG), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (inputEvent != null) {
                return (zzgzg) zzgzo.zzh((zzgzg) zzgzo.zzj(zzgzg.zzw(this.zze.zza()), new zzcrp(this, buildUpon, str, inputEvent), this.zzh), Throwable.class, new zzcrq(this, buildUpon), this.zzg);
            }
            buildUpon.appendQueryParameter((String) S5.D.c().zzd(zzbhe.zzlH), "11");
            return zzgzo.zza(buildUpon.toString());
        } catch (Exception e) {
            return zzgzo.zzc(e);
        }
    }

    public final void zza(String str, zzfqk zzfqkVar, Random random, W5.w wVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzgzo.zzr(zzgzo.zzi(zzk(str, this.zzf.zzb(), random), ((Integer) S5.D.c().zzd(zzbhe.zzlL)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcro(this, zzfqkVar, str, wVar), this.zzg);
    }

    public final x7.e zzb(String str, Random random) {
        return TextUtils.isEmpty(str) ? zzgzo.zza(str) : zzgzo.zzh(zzk(str, this.zzf.zzb(), random), Throwable.class, new zzcru(this, str), this.zzg);
    }

    public final /* synthetic */ x7.e zzd(String str, Throwable th) {
        this.zzg.submit(new zzcrt(this, th));
        return zzgzo.zza(str);
    }

    public final /* synthetic */ x7.e zze(Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) S5.D.c().zzd(zzbhe.zzlH), "10");
            return zzgzo.zza(builder.toString());
        }
        Uri.Builder buildUpon = builder.build().buildUpon();
        buildUpon.appendQueryParameter((String) S5.D.c().zzd(zzbhe.zzlI), "1");
        buildUpon.appendQueryParameter((String) S5.D.c().zzd(zzbhe.zzlH), "12");
        if (str.contains((CharSequence) S5.D.c().zzd(zzbhe.zzlJ))) {
            buildUpon.authority((String) S5.D.c().zzd(zzbhe.zzlK));
        }
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(this.zze.zzb(buildUpon.build(), inputEvent)), new zzcrr(builder), this.zzh);
    }

    public final /* synthetic */ x7.e zzf(Uri.Builder builder, Throwable th) {
        this.zzg.submit(new zzcrs(this, th));
        builder.appendQueryParameter((String) S5.D.c().zzd(zzbhe.zzlH), "9");
        return zzgzo.zza(builder.toString());
    }

    public final /* synthetic */ void zzg(Throwable th) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzlM)).booleanValue()) {
            zzbyr zzc = zzbyp.zzc(this.zzc);
            this.zzb = zzc;
            zzc.zzh(th, "AttributionReporting");
        } else {
            zzbyr zza = zzbyp.zza(this.zzc);
            this.zza = zza;
            zza.zzh(th, "AttributionReportingSampled");
        }
    }

    public final /* synthetic */ void zzh(Throwable th) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzlM)).booleanValue()) {
            zzbyr zzc = zzbyp.zzc(this.zzc);
            this.zzb = zzc;
            zzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            zzbyr zza = zzbyp.zza(this.zzc);
            this.zza = zza;
            zza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    public final /* synthetic */ Context zzi() {
        return this.zzc;
    }

    public final /* synthetic */ zzgzy zzj() {
        return this.zzg;
    }
}
