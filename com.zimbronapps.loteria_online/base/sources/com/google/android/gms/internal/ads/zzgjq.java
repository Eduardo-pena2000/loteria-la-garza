package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgjq implements zzgjf {
    private final zzfxa zza;
    private final zzgky zzb;
    private final zzgmu zzc;
    private final zzgoe zzd;
    private final ExecutorService zze;
    private final AtomicReference zzf = new AtomicReference("2.825731049.-1");

    public zzgjq(zzfxa zzfxaVar, zzgky zzgkyVar, zzgmu zzgmuVar, zzgoe zzgoeVar, ExecutorService executorService) {
        this.zza = zzfxaVar;
        this.zzb = zzgkyVar;
        this.zzc = zzgmuVar;
        this.zzd = zzgoeVar;
        this.zze = executorService;
    }

    public final String zza() {
        return (String) this.zzf.get();
    }

    public final x7.e zzb() {
        return (zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzg(zzgzg.zzw(this.zzb.zzb()), Throwable.class, zzgjp.zza, zzhaf.zza()), new zzgjh(this), zzhaf.zza()), new zzgji(this), zzhaf.zza()), new zzgjj(this), zzhaf.zza()), zzgjk.zza, zzhaf.zza());
    }

    public final x7.e zzc(Context context) {
        return zzgzo.zzd(new zzgjl(this, context), this.zze);
    }

    public final x7.e zzd(Context context, String str, View view, Activity activity) {
        return zzgzo.zzd(new zzgjm(this, context, null, view, activity), this.zze);
    }

    public final x7.e zze(Context context, String str, View view, Activity activity) {
        return zzgzo.zzd(new zzgjn(this, context, str, view, null), this.zze);
    }

    public final void zzf(InputEvent inputEvent) {
        zzfvk zzb = this.zza.zzb();
        if (zzb == null) {
            this.zzd.zzb(15004);
        } else if (inputEvent instanceof MotionEvent) {
            try {
                zzb.zzd(null, (MotionEvent) inputEvent);
            } catch (zzfwz e) {
                this.zzd.zzd(15005, e);
            }
        }
    }

    public final int zzg() {
        return 3;
    }

    public final /* synthetic */ boolean zzh(zzgdu zzgduVar) {
        if (this.zzc.zzb(zzgduVar) && zzgduVar != null) {
            return true;
        }
        this.zzd.zzb(15003);
        throw new zzgjg(1);
    }

    public final /* synthetic */ x7.e zzi(Boolean bool) {
        return this.zzb.zze();
    }

    public final /* synthetic */ boolean zzj(zzfwq zzfwqVar) {
        if (zzfwqVar == null) {
            throw new zzgjg(3);
        }
        File zzb = zzfwqVar.zzb();
        if (Build.VERSION.SDK_INT >= 34) {
            zzb.setReadOnly();
        }
        this.zzd.zzf(15002, new zzgjo(this, zzfwqVar));
        return true;
    }

    public final /* synthetic */ String zzk(Context context) {
        zzfvk zzb = this.zza.zzb();
        if (zzb == null) {
            this.zzd.zzb(15004);
            return "";
        }
        String zza = zzb.zza(context, null);
        if (zza != null) {
            return zza;
        }
        this.zzd.zzb(15006);
        return "";
    }

    public final /* synthetic */ String zzl(Context context, String str, View view, Activity activity) {
        zzfvk zzb = this.zza.zzb();
        if (zzb == null) {
            this.zzd.zzb(15004);
            return "";
        }
        String zzb2 = zzb.zzb(context, null, view, activity);
        if (zzb2 != null) {
            return zzb2;
        }
        this.zzd.zzb(15007);
        return "";
    }

    public final /* synthetic */ String zzm(Context context, String str, View view, Activity activity) {
        zzfvk zzb = this.zza.zzb();
        if (zzb == null) {
            this.zzd.zzb(15004);
            return "";
        }
        String zzc = zzb.zzc(context, null, str, view, null);
        if (zzc != null) {
            return zzc;
        }
        this.zzd.zzb(15008);
        return "";
    }

    public final /* synthetic */ void zzn(zzfwq zzfwqVar) {
        if (!this.zza.zza(zzfwqVar)) {
            throw new zzgjg(2);
        }
        this.zzf.set("2.825731049.".concat(String.valueOf(zzfwqVar.zza().zza())));
    }
}
