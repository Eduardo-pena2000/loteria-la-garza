package com.google.android.gms.internal.ads;

import V5.o0;
import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbwr extends zzbwx {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcjl zzj;
    private final Activity zzk;
    private zzclv zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbwy zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        E6.g.f("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public zzbwr(zzcjl zzcjlVar, zzbwy zzbwyVar) {
        super(zzcjlVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcjlVar;
        this.zzk = zzcjlVar.zzj();
        this.zzo = zzbwyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzf(boolean z) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzmn)).booleanValue()) {
            this.zzq.removeView(this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView(this.zzj);
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzmo)).booleanValue()) {
            View view = this.zzj;
            ViewGroup parent = view.getParent();
            if (parent instanceof ViewGroup) {
                parent.removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) S5.D.c().zzd(zzbhe.zzmp)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    View view2 = this.zzj;
                    viewGroup2.addView(view2);
                    view2.zzaf(this.zzl);
                } catch (IllegalStateException e) {
                    int i = o0.b;
                    W5.p.d("Unable to add webview back to view hierarchy.", e);
                    R5.t.l().zzg(e, "MraidCallResizeHandler.collapseInternal");
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                View view3 = this.zzj;
                viewGroup3.addView(view3);
                view3.zzaf(this.zzl);
            }
        }
        if (z) {
            zzk("default");
            zzbwy zzbwyVar = this.zzo;
            if (zzbwyVar != null) {
                zzbwyVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.util.Map r19) {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwr.zza(java.util.Map):void");
    }

    public final void zzb(boolean z) {
        synchronized (this.zzi) {
            try {
                if (this.zzp != null) {
                    if (!((Boolean) S5.D.c().zzd(zzbhe.zzmm)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        zzf(z);
                    } else {
                        zzcei.zzf.submit(new zzbwq(this, z));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(int i, int i2, boolean z) {
        synchronized (this.zzi) {
            this.zzc = i;
            this.zzd = i2;
        }
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.zzi) {
            z = this.zzp != null;
        }
        return z;
    }

    public final void zze(int i, int i2) {
        this.zzc = i;
        this.zzd = i2;
    }
}
