package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzclx {
    private String zza;
    private zziff zzb;
    private zzijc zzc;
    private final ScheduledExecutorService zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);

    public zzclx(zzclk zzclkVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzd = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        try {
            String i = t4.j.a("GET_VARIATIONS_HEADER") ? t4.i.i() : null;
            if (i != null && !i.isEmpty()) {
                this.zza = i;
                byte[] decode = Base64.decode(i, 10);
                this.zzb = zziff.zzc(decode, zzibb.zzb());
                if (((Boolean) S5.D.c().zzd(zzbhe.zzkk)).booleanValue()) {
                    this.zzc = zzijc.zzc(decode, zzibb.zzb());
                }
                if (((Boolean) S5.D.c().zzd(zzbhe.zzki)).booleanValue()) {
                    if (((Boolean) S5.D.c().zzd(zzbhe.zzkh)).booleanValue()) {
                        this.zzd.schedule(new zzclw(this), ((Integer) S5.D.c().zzd(zzbhe.zzkj)).intValue(), TimeUnit.MINUTES);
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            e = e;
            R5.t.l().zzh(e, "ChromeVariations");
        } catch (zzicg e2) {
            e = e2;
            R5.t.l().zzh(e, "ChromeVariations");
        }
    }

    public final void zza() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkh)).booleanValue() && !this.zze.getAndSet(true)) {
            zze();
        }
    }

    public final String zzb() {
        zzijc zzijcVar = this.zzc;
        if (zzijcVar != null) {
            return Base64.encodeToString(zzijcVar.zzaN(), 10);
        }
        return null;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zziff zzd() {
        return this.zzb;
    }
}
