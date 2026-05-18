package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgks implements zzgkg {
    private final Context zza;
    private final ExecutorService zzb;
    private final zzgce zzc;
    private final String zzd;
    private final String zze;
    private final zzgoe zzf;
    private final zzgku zzg;

    public zzgks(Context context, ExecutorService executorService, zzgbf zzgbfVar, zzgce zzgceVar, zzgoe zzgoeVar, zzgku zzgkuVar) {
        this.zza = context;
        this.zzb = executorService;
        this.zzc = zzgceVar;
        this.zzf = zzgoeVar;
        this.zzg = zzgkuVar;
        this.zzd = zzgbfVar.zzb();
        this.zze = zzgbfVar.zzi().zzc();
    }

    private static zzgds zze(int i) {
        zzgdr zzd = zzgds.zzd();
        zzd.zze(i);
        return (zzgds) zzd.zzbu();
    }

    public final x7.e zza() {
        int i;
        zzbcc zza = zzbcd.zza();
        byte[] zza2 = zzatu.zza();
        zzian zzianVar = zzian.zza;
        zza.zza(zzian.zzs(zza2, 0, zza2.length));
        zza.zzb(Build.VERSION.SDK_INT);
        zza.zzc(Build.MODEL);
        Context context = this.zza;
        zza.zzd(context.getPackageName());
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        zzgce zzgceVar = this.zzc;
        zzgoe zzgoeVar = this.zzf;
        zza.zze(i);
        zza.zzf(this.zzd);
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk(zzgzg.zzw(zzgceVar.zza(Uri.parse(this.zze).buildUpon().appendQueryParameter("aspq", zzgca.zza(((zzbcd) zza.zzbu()).zzaN(), true)).build().toString())), new zzgkr(this), this.zzb), UnknownHostException.class, new zzgkp(this), zzhaf.zza()), SocketException.class, new zzgkq(this), zzhaf.zza());
        zzgoeVar.zze(20002, zzgzgVar);
        return zzgzgVar;
    }

    public final /* synthetic */ zzgds zzb(zzgcd zzgcdVar) {
        zzgds zze;
        if (zzgcdVar.zza() != 200) {
            this.zzf.zzc(20003, new String(zzatu.zza(), StandardCharsets.UTF_8));
            return zze(7);
        }
        try {
            String zzb = zzgcdVar.zzb();
            if (TextUtils.isEmpty(zzb)) {
                this.zzf.zzb(20004);
                zze = zze(8);
            } else {
                zzbcf zzb2 = zzbcf.zzb(zzgca.zzb(zzb, true), zzibb.zzb());
                if (!zzb2.zza().zzc() || !zzb2.zza().zza()) {
                    this.zzf.zzb(20004);
                    zze = zze(8);
                } else if (this.zzg.zza(zzb2)) {
                    zzgdr zzd = zzgds.zzd();
                    zzgdt zze2 = zzgdu.zze();
                    zze2.zzb(zzb2.zza().zzb());
                    zzd.zzb(zze2);
                    zzd.zzc(zzb2.zza().zzd());
                    zzd.zze(2);
                    zze = (zzgds) zzd.zzbu();
                } else {
                    this.zzf.zzb(20006);
                    zze = zze(12);
                }
            }
            return zze;
        } catch (Throwable th) {
            this.zzf.zzd(20005, th);
            return zze(6);
        }
    }

    public final /* synthetic */ zzgds zzc(UnknownHostException unknownHostException) {
        this.zzf.zzb(20007);
        return zze(13);
    }

    public final /* synthetic */ zzgds zzd(SocketException socketException) {
        this.zzf.zzb(20008);
        return zze(13);
    }
}
