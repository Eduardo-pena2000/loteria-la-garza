package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbuw implements Y5.n, Y5.t, Y5.v {
    private final zzbtz zza;
    private Y5.C zzb;
    private zzbln zzc;

    public zzbuw(zzbtz zzbtzVar) {
        this.zza = zzbtzVar;
    }

    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 44);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i);
        W5.p.a(sb.toString());
        try {
            this.zza.zzg(i);
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        Y5.C c = this.zzb;
        if (this.zzc == null) {
            if (c == null) {
                W5.p.i("#007 Could not call remote method.", null);
                return;
            } else if (!c.n()) {
                W5.p.a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        W5.p.a("Adapter called onAdImpression.");
        try {
            this.zza.zzk();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzh();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onAdLoaded.");
        try {
            this.zza.zzj();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onAdOpened.");
        try {
            this.zza.zzi();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onVideoEnd.");
        try {
            this.zza.zzn();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void zza(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onAppEvent.");
        try {
            this.zza.zzl(str, str2);
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final Y5.C zzb() {
        return this.zzb;
    }

    public final void zzc(MediationNativeAdapter mediationNativeAdapter, zzbln zzblnVar) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onAdLoaded with template id ".concat(String.valueOf(zzblnVar.zzb())));
        this.zzc = zzblnVar;
        try {
            this.zza.zzj();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void zzd(MediationNativeAdapter mediationNativeAdapter, zzbln zzblnVar, String str) {
        try {
            this.zza.zzm(zzblnVar.zza(), str);
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final zzbln zze() {
        return this.zzc;
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, L5.b bVar) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        int a = bVar.a();
        String c = bVar.c();
        String b = bVar.b();
        int length = String.valueOf(a).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(c).length() + 15 + String.valueOf(b).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(a);
        sb.append(". ErrorMessage: ");
        sb.append(c);
        sb.append(". ErrorDomain: ");
        sb.append(b);
        W5.p.a(sb.toString());
        try {
            this.zza.zzx(bVar.d());
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzh();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onAdLoaded.");
        try {
            this.zza.zzj();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onAdOpened.");
        try {
            this.zza.zzi();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        Y5.C c = this.zzb;
        if (this.zzc == null) {
            if (c == null) {
                W5.p.i("#007 Could not call remote method.", null);
                return;
            } else if (!c.m()) {
                W5.p.a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        W5.p.a("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzh();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, Y5.C c) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onAdLoaded.");
        this.zzb = c;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            L5.B b = new L5.B();
            b.b(new zzbuj());
            if (c != null && c.s()) {
                c.H(b);
            }
        }
        try {
            this.zza.zzj();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onAdOpened.");
        try {
            this.zza.zzi();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 44);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        W5.p.a(sb.toString());
        try {
            this.zza.zzg(i);
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, L5.b bVar) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        int a = bVar.a();
        String c = bVar.c();
        String b = bVar.b();
        int length = String.valueOf(a).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(c).length() + 15 + String.valueOf(b).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(a);
        sb.append(". ErrorMessage: ");
        sb.append(c);
        sb.append(". ErrorDomain: ");
        sb.append(b);
        W5.p.a(sb.toString());
        try {
            this.zza.zzx(bVar.d());
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 44);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        W5.p.a(sb.toString());
        try {
            this.zza.zzg(i);
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, L5.b bVar) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        int a = bVar.a();
        String c = bVar.c();
        String b = bVar.b();
        int length = String.valueOf(a).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(c).length() + 15 + String.valueOf(b).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(a);
        sb.append(". ErrorMessage: ");
        sb.append(c);
        sb.append(". ErrorDomain: ");
        sb.append(b);
        W5.p.a(sb.toString());
        try {
            this.zza.zzx(bVar.d());
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }
}
