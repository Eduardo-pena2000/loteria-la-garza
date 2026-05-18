package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzedy implements zzefe {
    private static final Pattern zzh = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzecz zza;
    private final zzgzy zzb;
    private final zzfjk zzc;
    private final ScheduledExecutorService zzd;
    private final zzehr zze;
    private final zzfoo zzf;
    private final Context zzg;

    public zzedy(Context context, zzfjk zzfjkVar, zzecz zzeczVar, zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzehr zzehrVar, zzfoo zzfooVar) {
        this.zzg = context;
        this.zzc = zzfjkVar;
        this.zza = zzeczVar;
        this.zzb = zzgzyVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzehrVar;
        this.zzf = zzfooVar;
    }

    public static /* synthetic */ Pattern zzd() {
        return zzh;
    }

    public final x7.e zza(zzbzu zzbzuVar) {
        Context context = this.zzg;
        x7.e zza = this.zza.zza(zzbzuVar);
        zzfoe zzn = zzfoe.zzn(context, 11);
        zzfon.zzb(zza, zzn);
        x7.e zzj = zzgzo.zzj(zza, new zzedx(this), this.zzb);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgB)).booleanValue()) {
            zzj = zzgzo.zzh(zzgzo.zzi(zzj, ((Integer) S5.D.c().zzd(zzbhe.zzgC)).intValue(), TimeUnit.SECONDS, this.zzd), TimeoutException.class, zzedw.zza, zzcei.zzg);
        }
        zzfon.zzd(zzj, this.zzf, zzn);
        zzgzo.zzr(zzj, new zzedv(this), zzcei.zzg);
        return zzj;
    }

    public final /* synthetic */ x7.e zzb(zzefg zzefgVar) {
        return zzgzo.zza(new zzfjc(new zzfiz(this.zzc), zzfjb.zza(new InputStreamReader(zzefgVar.zza()), zzefgVar.zzb().zzm)));
    }

    public final /* synthetic */ zzehr zzc() {
        return this.zze;
    }
}
