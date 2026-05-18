package com.google.android.recaptcha.internal;

import Ca.I;
import android.webkit.JavascriptInterface;
import cb.x;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzij {
    final /* synthetic */ zzja zza;
    private Long zzb;
    private final zzjh zzc = zzjh.zzb();

    public zzij(zzja zzjaVar) {
        this.zza = zzjaVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(String str) {
        zzja zzjaVar = this.zza;
        if (zzjaVar.zzq().zzb == null) {
            zzen zzo = zzja.zzo(zzjaVar);
            if (zzo != null) {
                zzo.zza();
            }
            zzja.zzB(this.zza, null);
        }
        zzb();
        zzrc zzl = zzrc.zzl(zzbt.zza(str));
        zztw zzi = zztx.zzi();
        zzi.zzf(zzl);
        zzja.zzn(this.zza).zze((zztx) zzi.zzi());
    }

    @JavascriptInterface
    public final void zzlsm(String str) {
        zzb();
        zztw zzi = zztx.zzi();
        zzi.zzq(zzrr.zzi(zzbt.zza(str)));
        zzja.zzn(this.zza).zze((zztx) zzi.zzi());
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzts zzg = zzts.zzg(zzbt.zza(str));
        zzg.zzi().name();
        if (zzg.zzi() == zztv.JS_CODE_SUCCESS) {
            this.zza.zzA().hashCode();
            if (this.zza.zzA().o(I.a)) {
                return;
            }
            this.zza.zzA().hashCode();
            return;
        }
        zzg.zzi().name();
        int i = zzbd.zza;
        zzbd zza = zzbc.zza(zzg.zzi());
        this.zza.zzA().hashCode();
        this.zza.zzA().b(zza);
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        zzfo zzfoVar = this.zza.zzb;
        if (zzfoVar == null) {
            zzfoVar = null;
        }
        zzfoVar.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(String str) {
        zzb();
        zzsi zzi = zzsi.zzi(zzbt.zza(str));
        zzi.toString();
        x xVar = (x) zzja.zzz(this.zza).remove(zzi.zzk());
        if (xVar != null) {
            xVar.o(zzi);
        }
    }
}
