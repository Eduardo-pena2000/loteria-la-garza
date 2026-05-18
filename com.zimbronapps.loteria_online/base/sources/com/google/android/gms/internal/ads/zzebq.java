package com.google.android.gms.internal.ads;

import S5.P0;
import V5.o0;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzebq implements U5.E, zzclh {
    private final Context zza;
    private final W5.a zzb;
    private zzebf zzc;
    private zzcjl zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private P0 zzh;
    private boolean zzi;

    public zzebq(Context context, W5.a aVar) {
        this.zza = context;
        this.zzb = aVar;
    }

    private final synchronized boolean zzq(P0 p0) {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzkq)).booleanValue()) {
            int i = o0.b;
            W5.p.f("Ad inspector had an internal error.");
            try {
                p0.zze(zzfkm.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.zzc == null) {
            int i2 = o0.b;
            W5.p.f("Ad inspector had an internal error.");
            try {
                R5.t.l().zzg(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                p0.zze(zzfkm.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.zze && !this.zzf) {
            if (R5.t.o().a() >= this.zzg + ((Integer) S5.D.c().zzd(zzbhe.zzkt)).intValue()) {
                return true;
            }
        }
        int i3 = o0.b;
        W5.p.f("Ad inspector cannot be opened because it is already open.");
        try {
            p0.zze(zzfkm.zzd(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    public final synchronized void zza(boolean z, int i, String str, String str2) {
        if (z) {
            o0.k("Ad inspector loaded.");
            this.zze = true;
            zzn();
            return;
        }
        int i2 = o0.b;
        W5.p.f("Ad inspector failed to load.");
        try {
            zzcdu l = R5.t.l();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb.append("Failed to load UI. Error code: ");
            sb.append(i);
            sb.append(", Description: ");
            sb.append(str);
            sb.append(", Failing URL: ");
            sb.append(str2);
            l.zzg(new Exception(sb.toString()), "InspectorUi.onAdWebViewFinishedLoading 0");
            P0 p0 = this.zzh;
            if (p0 != null) {
                p0.zze(zzfkm.zzd(17, null, null));
            }
        } catch (RemoteException e) {
            R5.t.l().zzg(e, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    public final void zzdS() {
    }

    public final synchronized void zzdT(int i) {
        this.zzd.destroy();
        if (!this.zzi) {
            o0.k("Inspector closed.");
            P0 p0 = this.zzh;
            if (p0 != null) {
                try {
                    p0.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    public final void zzdo() {
    }

    public final void zzdp() {
    }

    public final void zzdq() {
    }

    public final void zzdv() {
    }

    public final void zzdw() {
    }

    public final void zzdx() {
    }

    public final void zzdy() {
    }

    public final void zzdz() {
    }

    public final synchronized void zzh() {
        this.zzf = true;
        zzn();
    }

    public final void zzl(zzebf zzebfVar) {
        this.zzc = zzebfVar;
    }

    public final synchronized void zzm(P0 p0, zzbpc zzbpcVar, zzbov zzbovVar, zzboi zzboiVar) {
        if (zzq(p0)) {
            try {
                R5.t.h();
                zzcjl zza = zzckb.zza(this.zza, zzclv.zzb(), "", false, false, null, null, this.zzb, null, null, null, zzbgd.zza(), null, null, null, null, null);
                this.zzd = zza;
                zzclj zzP = zza.zzP();
                if (zzP == null) {
                    int i = o0.b;
                    W5.p.f("Failed to obtain a web view for the ad inspector");
                    try {
                        R5.t.l().zzg(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        p0.zze(zzfkm.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e) {
                        R5.t.l().zzg(e, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.zzh = p0;
                Context context = this.zza;
                zzP.zzab(null, null, null, null, null, false, null, null, null, null, null, null, null, zzbpcVar, null, new zzbpb(context), zzbovVar, zzboiVar, null, null, null, null);
                zzP.zzG(this);
                this.zzd.loadUrl((String) S5.D.c().zzd(zzbhe.zzkr));
                R5.t.f();
                U5.A.a(context, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true, null);
                this.zzg = R5.t.o().a();
            } catch (zzcka e2) {
                int i2 = o0.b;
                W5.p.g("Failed to obtain a web view for the ad inspector", e2);
                try {
                    R5.t.l().zzg(e2, "InspectorUi.openInspector 0");
                    p0.zze(zzfkm.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e3) {
                    R5.t.l().zzg(e3, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void zzn() {
        if (this.zze && this.zzf) {
            zzcei.zzf.execute(new zzebp(this));
        }
    }

    public final Activity zzo() {
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar == null || zzcjlVar.zzX()) {
            return null;
        }
        return this.zzd.zzj();
    }

    public final /* synthetic */ void zzp() {
        this.zzd.zzc("window.inspectorInfo", this.zzc.zzr().toString());
    }
}
