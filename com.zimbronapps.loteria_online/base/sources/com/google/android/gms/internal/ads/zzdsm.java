package com.google.android.gms.internal.ads;

import S5.g1;
import V5.F0;
import V5.o0;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.Collections;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdsm extends zzbqu implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbkc {
    private View zza;
    private g1 zzb;
    private zzdoc zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdsm(zzdoc zzdocVar, zzdoh zzdohVar) {
        this.zza = zzdohVar.zzJ();
        this.zzb = zzdohVar.zzy();
        this.zzc = zzdocVar;
        if (zzdohVar.zzT() != null) {
            zzdohVar.zzT().zzax(this);
        }
    }

    private final void zzg() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewGroup parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.removeView(this.zza);
        }
    }

    private final void zzh() {
        View view;
        zzdoc zzdocVar = this.zzc;
        if (zzdocVar == null || (view = this.zza) == null) {
            return;
        }
        zzdocVar.zzu(view, Collections.emptyMap(), Collections.emptyMap(), zzdoc.zzI(this.zza));
    }

    private static final void zzi(zzbqy zzbqyVar, int i) {
        try {
            zzbqyVar.zzf(i);
        } catch (RemoteException e) {
            int i2 = o0.b;
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onGlobalLayout() {
        zzh();
    }

    public final void onScrollChanged() {
        zzh();
    }

    public final void zza() {
        F0.l.post(new zzdsl(this));
    }

    public final g1 zzb() throws RemoteException {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        int i = o0.b;
        W5.p.c("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    public final void zzc() throws RemoteException {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        zzg();
        zzdoc zzdocVar = this.zzc;
        if (zzdocVar != null) {
            zzdocVar.zzd();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    public final void zzd(N6.a aVar, zzbqy zzbqyVar) throws RemoteException {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i = o0.b;
            W5.p.c("Instream ad can not be shown after destroy().");
            zzi(zzbqyVar, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            int i2 = o0.b;
            W5.p.c("Instream internal error: ".concat(str));
            zzi(zzbqyVar, 0);
            return;
        }
        if (this.zze) {
            int i3 = o0.b;
            W5.p.c("Instream ad should not be used again.");
            zzi(zzbqyVar, 1);
            return;
        }
        this.zze = true;
        zzg();
        ((ViewGroup) N6.b.r1(aVar)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
        R5.t.c();
        zzcev.zza(this.zza, this);
        R5.t.c();
        zzcev.zzb(this.zza, this);
        zzh();
        try {
            zzbqyVar.zze();
        } catch (RemoteException e) {
            int i4 = o0.b;
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void zze(N6.a aVar) throws RemoteException {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        zzd(aVar, new zzdsk(this));
    }

    public final zzbkp zzf() {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i = o0.b;
            W5.p.c("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdoc zzdocVar = this.zzc;
        if (zzdocVar == null || zzdocVar.zzP() == null) {
            return null;
        }
        return zzdocVar.zzP().zza();
    }
}
