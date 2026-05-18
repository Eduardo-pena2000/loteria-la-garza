package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcgf {
    private static final boolean zza;
    private final Context zzb;
    private final String zzc;
    private final W5.a zzd;
    private final zzbhq zze;
    private final zzbht zzf;
    private final V5.H zzg;
    private final long[] zzh;
    private final String[] zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcfk zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;

    static {
        zza = S5.B.h().nextInt(100) < ((Integer) S5.D.c().zzd(zzbhe.zzog)).intValue();
    }

    public zzcgf(Context context, W5.a aVar, String str, zzbht zzbhtVar, zzbhq zzbhqVar) {
        V5.G g = new V5.G();
        g.a("min_1", Double.MIN_VALUE, 1.0d);
        g.a("1_5", 1.0d, 5.0d);
        g.a("5_10", 5.0d, 10.0d);
        g.a("10_20", 10.0d, 20.0d);
        g.a("20_30", 20.0d, 30.0d);
        g.a("30_max", 30.0d, Double.MAX_VALUE);
        this.zzg = g.b();
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzr = -1L;
        this.zzb = context;
        this.zzd = aVar;
        this.zzc = str;
        this.zzf = zzbhtVar;
        this.zze = zzbhqVar;
        String str2 = (String) S5.D.c().zzd(zzbhe.zzak);
        if (str2 == null) {
            this.zzi = new String[0];
            this.zzh = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.zzi = new String[length];
        this.zzh = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.zzh[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                int i2 = o0.b;
                W5.p.g("Unable to parse frame hash target time number.", e);
                this.zzh[i] = -1;
            }
        }
    }

    public final void zza(zzcfk zzcfkVar) {
        zzbht zzbhtVar = this.zzf;
        zzbhl.zza(zzbhtVar, this.zze, "vpc2");
        this.zzj = true;
        zzbhtVar.zzd("vpn", zzcfkVar.zza());
        this.zzo = zzcfkVar;
    }

    public final void zzb() {
        if (!this.zzj || this.zzk) {
            return;
        }
        zzbhl.zza(this.zzf, this.zze, "vfr2");
        this.zzk = true;
    }

    public final void zzc() {
        if (!zza || this.zzp) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.zzc);
        bundle.putString("player", this.zzo.zza());
        for (V5.F f : this.zzg.b()) {
            String str = f.a;
            String valueOf = String.valueOf(str);
            bundle.putString("fps_c_".concat(valueOf), Integer.toString(f.e));
            String valueOf2 = String.valueOf(str);
            bundle.putString("fps_p_".concat(valueOf2), Double.toString(f.d));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.zzh;
            if (i >= jArr.length) {
                R5.t.g().T(this.zzb, this.zzd.a, "gmob-apps", bundle, true);
                this.zzp = true;
                return;
            }
            String str2 = this.zzi[i];
            if (str2 != null) {
                Long valueOf3 = Long.valueOf(jArr[i]);
                new StringBuilder(valueOf3.toString().length() + 3);
                bundle.putString("fh_".concat(valueOf3.toString()), str2);
            }
            i++;
        }
    }

    public final void zzd(zzcfk zzcfkVar) {
        if (this.zzl && !this.zzm) {
            if (o0.m() && !this.zzm) {
                o0.k("VideoMetricsMixin first frame");
            }
            zzbhl.zza(this.zzf, this.zze, "vff2");
            this.zzm = true;
        }
        long nanoTime = R5.t.o().nanoTime();
        if (this.zzn && this.zzq && this.zzr != -1) {
            this.zzg.a(TimeUnit.SECONDS.toNanos(1L) / (nanoTime - this.zzr));
        }
        this.zzq = this.zzn;
        this.zzr = nanoTime;
        long longValue = ((Long) S5.D.c().zzd(zzbhe.zzal)).longValue();
        long zzh = zzcfkVar.zzh();
        int i = 0;
        while (true) {
            String[] strArr = this.zzi;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && longValue > Math.abs(zzh - this.zzh[i])) {
                int i2 = 8;
                Bitmap bitmap = zzcfkVar.getBitmap(8, 8);
                long j = 63;
                long j2 = 0;
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j);
                        j--;
                        i4++;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr[i] = String.format("%016X", new Object[]{Long.valueOf(j2)});
                return;
            }
            i++;
        }
    }

    public final void zze() {
        this.zzn = true;
        if (!this.zzk || this.zzl) {
            return;
        }
        zzbhl.zza(this.zzf, this.zze, "vfp2");
        this.zzl = true;
    }

    public final void zzf() {
        this.zzn = false;
    }
}
