package com.google.android.gms.internal.ads;

import V5.V;
import V5.o0;
import V5.q0;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdpg {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final q0 zzb;
    private final zzfjk zzc;
    private final zzdom zzd;
    private final zzdoh zze;
    private final zzdpu zzf;
    private final zzdqc zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbkh zzj;
    private final zzdoe zzk;

    public zzdpg(q0 q0Var, zzfjk zzfjkVar, zzdom zzdomVar, zzdoh zzdohVar, zzdpu zzdpuVar, zzdqc zzdqcVar, Executor executor, Executor executor2, zzdoe zzdoeVar) {
        this.zzb = q0Var;
        this.zzc = zzfjkVar;
        this.zzj = zzfjkVar.zzj;
        this.zzd = zzdomVar;
        this.zze = zzdohVar;
        this.zzf = zzdpuVar;
        this.zzg = zzdqcVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdoeVar;
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z) {
        View zzJ = z ? this.zze.zzJ() : this.zze.zzK();
        if (zzJ == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzJ.getParent() instanceof ViewGroup) {
            zzJ.getParent().removeView(zzJ);
        }
        viewGroup.addView(zzJ, ((Boolean) S5.D.c().zzd(zzbhe.zzeJ)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final void zza(zzdqe zzdqeVar) {
        this.zzh.execute(new zzdpf(this, zzdqeVar));
    }

    public final void zzb(zzdqe zzdqeVar) {
        zzdpu zzdpuVar;
        if (zzdqeVar == null || (zzdpuVar = this.zzf) == null || zzdqeVar.zzdA() == null || !this.zzd.zzb()) {
            return;
        }
        try {
            zzdqeVar.zzdA().addView(zzdpuVar.zza());
        } catch (zzcka e) {
            o0.l("web view can not be obtained", e);
        }
    }

    public final void zzc(zzdqe zzdqeVar) {
        if (zzdqeVar == null) {
            return;
        }
        Context context = zzdqeVar.zzdE().getContext();
        if (V.i(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                int i = o0.b;
                W5.p.a("Activity context is needed for policy validator.");
                return;
            }
            zzdqc zzdqcVar = this.zzg;
            if (zzdqcVar == null || zzdqeVar.zzdA() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(zzdqcVar.zza(zzdqeVar.zzdA(), windowManager), V.k());
            } catch (zzcka e) {
                o0.l("web view can not be obtained", e);
            }
        }
    }

    public final boolean zzd(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    public final boolean zze(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzdqe r11) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdpg.zzf(com.google.android.gms.internal.ads.zzdqe):void");
    }

    public final /* synthetic */ void zzg(ViewGroup viewGroup) {
        zzdoh zzdohVar = this.zze;
        if (zzdohVar.zzJ() != null) {
            boolean z = viewGroup != null;
            if (zzdohVar.zzx() == 2 || zzdohVar.zzx() == 1) {
                this.zzb.k(this.zzc.zzg, String.valueOf(zzdohVar.zzx()), z);
            } else if (zzdohVar.zzx() == 6) {
                q0 q0Var = this.zzb;
                String str = this.zzc.zzg;
                q0Var.k(str, "2", z);
                q0Var.k(str, "1", z);
            }
        }
    }
}
