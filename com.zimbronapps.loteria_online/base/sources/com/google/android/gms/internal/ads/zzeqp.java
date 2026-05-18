package com.google.android.gms.internal.ads;

import S5.V0;
import S5.X;
import S5.d0;
import S5.d1;
import S5.e2;
import S5.g1;
import S5.k1;
import S5.l2;
import S5.p0;
import S5.q2;
import S5.t0;
import S5.w0;
import S5.w2;
import V5.o0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeqp extends X {
    private final Context zza;
    private final S5.K zzb;
    private final zzfjk zzc;
    private final zzctx zzd;
    private final ViewGroup zze;
    private final zzdxz zzf;

    public zzeqp(Context context, S5.K k, zzfjk zzfjkVar, zzctx zzctxVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = k;
        this.zzc = zzfjkVar;
        this.zzd = zzctxVar;
        this.zzf = zzdxzVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View zza = zzctxVar.zza();
        R5.t.g();
        frameLayout.addView(zza, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzn().c);
        frameLayout.setMinimumWidth(zzn().f);
        this.zze = frameLayout;
    }

    public final boolean zzA() throws RemoteException {
        zzctx zzctxVar = this.zzd;
        return zzctxVar != null && zzctxVar.zzs();
    }

    public final boolean zzB() throws RemoteException {
        return false;
    }

    public final void zzC(zzcam zzcamVar) throws RemoteException {
    }

    public final void zzD(String str) throws RemoteException {
    }

    public final void zzE(String str) throws RemoteException {
    }

    public final g1 zzF() throws RemoteException {
        return this.zzd.zzc();
    }

    public final void zzG(e2 e2Var) throws RemoteException {
        int i = o0.b;
        W5.p.e("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzJ(zzbfa zzbfaVar) throws RemoteException {
    }

    public final void zzK(boolean z) throws RemoteException {
    }

    public final void zzP(V0 v0) {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzmY)).booleanValue()) {
            int i = o0.b;
            W5.p.e("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        zzerp zzerpVar = this.zzc.zzc;
        if (zzerpVar != null) {
            try {
                if (!v0.zzf()) {
                    this.zzf.zzb();
                }
            } catch (RemoteException e) {
                int i2 = o0.b;
                W5.p.b("Error in making CSI ping for reporting paid event callback", e);
            }
            zzerpVar.zzo(v0);
        }
    }

    public final void zzT(long j) {
        zzctx zzctxVar = this.zzd;
        if (zzctxVar.zzo() != null) {
            zzctxVar.zzo().zzb(j);
        }
    }

    public final long zzU() {
        zzctx zzctxVar = this.zzd;
        if (zzctxVar == null || zzctxVar.zzo() == null) {
            return 0L;
        }
        return zzctxVar.zzo().zza();
    }

    public final void zzY(t0 t0Var) throws RemoteException {
        int i = o0.b;
        W5.p.e("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final N6.a zzb() throws RemoteException {
        return N6.b.s1(this.zze);
    }

    public final void zzc() throws RemoteException {
        com.google.android.gms.common.internal.t.e("destroy must be called on the main UI thread.");
        this.zzd.zzd();
    }

    public final boolean zzd() throws RemoteException {
        return false;
    }

    public final void zzdR(S5.K k) throws RemoteException {
        int i = o0.b;
        W5.p.e("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final boolean zze(l2 l2Var) throws RemoteException {
        int i = o0.b;
        W5.p.e("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    public final void zzf() throws RemoteException {
        com.google.android.gms.common.internal.t.e("destroy must be called on the main UI thread.");
        this.zzd.zzl().zza(null);
    }

    public final void zzg() throws RemoteException {
        com.google.android.gms.common.internal.t.e("destroy must be called on the main UI thread.");
        this.zzd.zzl().zzb(null);
    }

    public final void zzi(p0 p0Var) throws RemoteException {
        zzerp zzerpVar = this.zzc.zzc;
        if (zzerpVar != null) {
            zzerpVar.zzn(p0Var);
        }
    }

    public final void zzj(d0 d0Var) throws RemoteException {
        int i = o0.b;
        W5.p.e("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final Bundle zzk() throws RemoteException {
        int i = o0.b;
        W5.p.e("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    public final void zzl() throws RemoteException {
    }

    public final void zzm() throws RemoteException {
        this.zzd.zzi();
    }

    public final q2 zzn() {
        com.google.android.gms.common.internal.t.e("getAdSize must be called on the main UI thread.");
        return zzfjq.zza(this.zza, Collections.singletonList(this.zzd.zze()));
    }

    public final void zzo(q2 q2Var) throws RemoteException {
        com.google.android.gms.common.internal.t.e("setAdSize must be called on the main UI thread.");
        zzctx zzctxVar = this.zzd;
        if (zzctxVar != null) {
            zzctxVar.zzb(this.zze, q2Var);
        }
    }

    public final void zzp(zzbyb zzbybVar) throws RemoteException {
    }

    public final void zzq(zzbye zzbyeVar, String str) throws RemoteException {
    }

    public final String zzr() throws RemoteException {
        zzctx zzctxVar = this.zzd;
        if (zzctxVar.zzn() != null) {
            return zzctxVar.zzn().zze();
        }
        return null;
    }

    public final String zzs() throws RemoteException {
        zzctx zzctxVar = this.zzd;
        if (zzctxVar.zzn() != null) {
            return zzctxVar.zzn().zze();
        }
        return null;
    }

    public final d1 zzt() {
        return this.zzd.zzn();
    }

    public final String zzu() throws RemoteException {
        return this.zzc.zzg;
    }

    public final p0 zzv() throws RemoteException {
        return this.zzc.zzo;
    }

    public final S5.K zzw() throws RemoteException {
        return this.zzb;
    }

    public final void zzx(zzbhz zzbhzVar) throws RemoteException {
        int i = o0.b;
        W5.p.e("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzy(S5.H h) throws RemoteException {
        int i = o0.b;
        W5.p.e("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzz(boolean z) throws RemoteException {
        int i = o0.b;
        W5.p.e("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzH(k1 k1Var) throws RemoteException {
    }

    public final void zzI(w2 w2Var) throws RemoteException {
    }

    public final void zzR(N6.a aVar) {
    }

    public final void zzS(w0 w0Var) {
    }

    public final void zzQ(l2 l2Var, S5.N n) {
    }
}
