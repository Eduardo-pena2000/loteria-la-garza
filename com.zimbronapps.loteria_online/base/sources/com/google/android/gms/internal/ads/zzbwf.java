package com.google.android.gms.internal.ads;

import S5.g1;
import S5.l2;
import S5.q2;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbwf extends zzbvr {
    private final RtbAdapter zza;
    private Y5.q zzb;
    private Y5.w zzc;
    private Y5.h zzd;
    private String zze = "";

    public zzbwf(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzv(l2 l2Var) {
        Bundle bundle;
        Bundle bundle2 = l2Var.m;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle zzw(String str) throws RemoteException {
        W5.p.f("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                bundle2.putString(str2, jSONObject.getString(str2));
            }
            return bundle2;
        } catch (JSONException e) {
            W5.p.d("", e);
            throw new RemoteException();
        }
    }

    private static final boolean zzx(l2 l2Var) {
        if (l2Var.f) {
            return true;
        }
        S5.B.a();
        return W5.g.D();
    }

    private static final String zzy(String str, l2 l2Var) {
        String str2 = l2Var.u;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    public final /* synthetic */ void zzc(Y5.q qVar) {
        this.zzb = qVar;
    }

    public final /* synthetic */ void zzd(Y5.w wVar) {
        this.zzc = wVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(N6.a r5, java.lang.String r6, android.os.Bundle r7, android.os.Bundle r8, S5.q2 r9, com.google.android.gms.internal.ads.zzbvv r10) throws android.os.RemoteException {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzbwd r0 = new com.google.android.gms.internal.ads.zzbwd     // Catch: java.lang.Throwable -> L71
            r0.<init>(r4, r10)     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r10 = r4.zza     // Catch: java.lang.Throwable -> L71
            Y5.o r1 = new Y5.o     // Catch: java.lang.Throwable -> L71
            int r2 = r6.hashCode()     // Catch: java.lang.Throwable -> L71
            switch(r2) {
                case -1396342996: goto L4d;
                case -1052618729: goto L43;
                case -239580146: goto L39;
                case 604727084: goto L2f;
                case 1167692200: goto L25;
                case 1778294298: goto L1b;
                case 1911491517: goto L11;
                default: goto L10;
            }
        L10:
            goto L57
        L11:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 3
            goto L58
        L1b:
            java.lang.String r2 = "app_open_ad"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 6
            goto L58
        L25:
            java.lang.String r2 = "app_open"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 5
            goto L58
        L2f:
            java.lang.String r2 = "interstitial"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 1
            goto L58
        L39:
            java.lang.String r2 = "rewarded"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 2
            goto L58
        L43:
            java.lang.String r2 = "native"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 4
            goto L58
        L4d:
            java.lang.String r2 = "banner"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 0
            goto L58
        L57:
            r6 = -1
        L58:
            switch(r6) {
                case 0: goto L8a;
                case 1: goto L87;
                case 2: goto L84;
                case 3: goto L81;
                case 4: goto L7e;
                case 5: goto L7b;
                case 6: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L73
        L5c:
            com.google.android.gms.internal.ads.zzbgv r6 = com.google.android.gms.internal.ads.zzbhe.zznn     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.internal.ads.zzbhc r2 = S5.D.c()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r6 = r2.zzd(r6)     // Catch: java.lang.Throwable -> L71
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L71
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L71
            if (r6 == 0) goto L73
            L5.c r6 = L5.c.APP_OPEN_AD     // Catch: java.lang.Throwable -> L71
            goto L8c
        L71:
            r6 = move-exception
            goto Lb0
        L73:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L71
            java.lang.String r7 = "Internal Error"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L71
            throw r6     // Catch: java.lang.Throwable -> L71
        L7b:
            L5.c r6 = L5.c.APP_OPEN_AD     // Catch: java.lang.Throwable -> L71
            goto L8c
        L7e:
            L5.c r6 = L5.c.NATIVE     // Catch: java.lang.Throwable -> L71
            goto L8c
        L81:
            L5.c r6 = L5.c.REWARDED_INTERSTITIAL     // Catch: java.lang.Throwable -> L71
            goto L8c
        L84:
            L5.c r6 = L5.c.REWARDED     // Catch: java.lang.Throwable -> L71
            goto L8c
        L87:
            L5.c r6 = L5.c.INTERSTITIAL     // Catch: java.lang.Throwable -> L71
            goto L8c
        L8a:
            L5.c r6 = L5.c.BANNER     // Catch: java.lang.Throwable -> L71
        L8c:
            r1.<init>(r6, r8)     // Catch: java.lang.Throwable -> L71
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L71
            r6.<init>()     // Catch: java.lang.Throwable -> L71
            r6.add(r1)     // Catch: java.lang.Throwable -> L71
            a6.a r8 = new a6.a     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = N6.b.r1(r5)     // Catch: java.lang.Throwable -> L71
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> L71
            int r2 = r9.e     // Catch: java.lang.Throwable -> L71
            int r3 = r9.b     // Catch: java.lang.Throwable -> L71
            java.lang.String r9 = r9.a     // Catch: java.lang.Throwable -> L71
            L5.h r9 = L5.F.a(r2, r3, r9)     // Catch: java.lang.Throwable -> L71
            r8.<init>(r1, r6, r7, r9)     // Catch: java.lang.Throwable -> L71
            r10.collectSignals(r8, r0)     // Catch: java.lang.Throwable -> L71
            return
        Lb0:
            java.lang.String r7 = "Error generating signals for RTB"
            W5.p.d(r7, r6)
            java.lang.String r7 = "adapter.collectSignals"
            com.google.android.gms.internal.ads.zzbtq.zza(r5, r6, r7)
            android.os.RemoteException r5 = new android.os.RemoteException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwf.zze(N6.a, java.lang.String, android.os.Bundle, android.os.Bundle, S5.q2, com.google.android.gms.internal.ads.zzbvv):void");
    }

    public final zzbwh zzf() throws RemoteException {
        return zzbwh.zza(this.zza.getVersionInfo());
    }

    public final zzbwh zzg() throws RemoteException {
        return zzbwh.zza(this.zza.getSDKVersionInfo());
    }

    public final g1 zzh() {
        Object obj = this.zza;
        if (obj instanceof Y5.D) {
            try {
                return ((Y5.D) obj).getVideoController();
            } catch (Throwable th) {
                W5.p.d("", th);
            }
        }
        return null;
    }

    public final void zzi(String str, String str2, l2 l2Var, N6.a aVar, zzbvg zzbvgVar, zzbtz zzbtzVar, q2 q2Var) throws RemoteException {
        try {
            this.zza.loadRtbBannerAd(new Y5.m((Context) N6.b.r1(aVar), str, zzw(str2), zzv(l2Var), zzx(l2Var), l2Var.k, l2Var.g, l2Var.t, zzy(str2, l2Var), L5.F.a(q2Var.e, q2Var.b, q2Var.a), this.zze), new zzbvx(this, zzbvgVar, zzbtzVar));
        } catch (Throwable th) {
            W5.p.d("Adapter failed to render banner ad.", th);
            zzbtq.zza(aVar, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    public final void zzj(String str, String str2, l2 l2Var, N6.a aVar, zzbvj zzbvjVar, zzbtz zzbtzVar) throws RemoteException {
        try {
            this.zza.loadRtbInterstitialAd(new Y5.s((Context) N6.b.r1(aVar), str, zzw(str2), zzv(l2Var), zzx(l2Var), l2Var.k, l2Var.g, l2Var.t, zzy(str2, l2Var), this.zze), new zzbvz(this, zzbvjVar, zzbtzVar));
        } catch (Throwable th) {
            W5.p.d("Adapter failed to render interstitial ad.", th);
            zzbtq.zza(aVar, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    public final boolean zzk(N6.a aVar) throws RemoteException {
        Y5.q qVar = this.zzb;
        if (qVar == null) {
            return false;
        }
        try {
            qVar.showAd((Context) N6.b.r1(aVar));
            return true;
        } catch (Throwable th) {
            W5.p.d("", th);
            zzbtq.zza(aVar, th, "adapter.showRtbInterstitialAd");
            return true;
        }
    }

    public final void zzl(String str, String str2, l2 l2Var, N6.a aVar, zzbvp zzbvpVar, zzbtz zzbtzVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedAd(new Y5.y((Context) N6.b.r1(aVar), str, zzw(str2), zzv(l2Var), zzx(l2Var), l2Var.k, l2Var.g, l2Var.t, zzy(str2, l2Var), this.zze), new zzbwe(this, zzbvpVar, zzbtzVar));
        } catch (Throwable th) {
            W5.p.d("Adapter failed to render rewarded ad.", th);
            zzbtq.zza(aVar, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    public final boolean zzm(N6.a aVar) throws RemoteException {
        Y5.w wVar = this.zzc;
        if (wVar == null) {
            return false;
        }
        try {
            wVar.showAd((Context) N6.b.r1(aVar));
            return true;
        } catch (Throwable th) {
            W5.p.d("", th);
            zzbtq.zza(aVar, th, "adapter.showRtbRewardedAd");
            return true;
        }
    }

    public final void zzn(String str, String str2, l2 l2Var, N6.a aVar, zzbvm zzbvmVar, zzbtz zzbtzVar) throws RemoteException {
        zzr(str, str2, l2Var, aVar, zzbvmVar, zzbtzVar, null);
    }

    public final void zzo(String str) {
        this.zze = str;
    }

    public final void zzp(String str, String str2, l2 l2Var, N6.a aVar, zzbvp zzbvpVar, zzbtz zzbtzVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedInterstitialAd(new Y5.y((Context) N6.b.r1(aVar), str, zzw(str2), zzv(l2Var), zzx(l2Var), l2Var.k, l2Var.g, l2Var.t, zzy(str2, l2Var), this.zze), new zzbwe(this, zzbvpVar, zzbtzVar));
        } catch (Throwable th) {
            W5.p.d("Adapter failed to render rewarded interstitial ad.", th);
            zzbtq.zza(aVar, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    public final void zzq(String str, String str2, l2 l2Var, N6.a aVar, zzbvg zzbvgVar, zzbtz zzbtzVar, q2 q2Var) throws RemoteException {
        try {
            zzbvy zzbvyVar = new zzbvy(this, zzbvgVar, zzbtzVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(l2Var);
            zzx(l2Var);
            Location location = l2Var.k;
            zzy(str2, l2Var);
            L5.F.a(q2Var.e, q2Var.b, q2Var.a);
            zzbvyVar.onFailure(new L5.b(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
        } catch (Throwable th) {
            W5.p.d("Adapter failed to render interscroller ad.", th);
            zzbtq.zza(aVar, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    public final void zzr(String str, String str2, l2 l2Var, N6.a aVar, zzbvm zzbvmVar, zzbtz zzbtzVar, zzbkh zzbkhVar) throws RemoteException {
        try {
            this.zza.loadRtbNativeAdMapper(new Y5.u((Context) N6.b.r1(aVar), str, zzw(str2), zzv(l2Var), zzx(l2Var), l2Var.k, l2Var.g, l2Var.t, zzy(str2, l2Var), this.zze, zzbkhVar), new zzbwa(this, zzbvmVar, zzbtzVar));
        } catch (Throwable th) {
            W5.p.d("Adapter failed to render native ad.", th);
            zzbtq.zza(aVar, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                this.zza.loadRtbNativeAd(new Y5.u((Context) N6.b.r1(aVar), str, zzw(str2), zzv(l2Var), zzx(l2Var), l2Var.k, l2Var.g, l2Var.t, zzy(str2, l2Var), this.zze, zzbkhVar), new zzbwb(this, zzbvmVar, zzbtzVar));
            } catch (Throwable th2) {
                W5.p.d("Adapter failed to render native ad.", th2);
                zzbtq.zza(aVar, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    public final void zzs(String str, String str2, l2 l2Var, N6.a aVar, zzbvd zzbvdVar, zzbtz zzbtzVar) throws RemoteException {
        try {
            this.zza.loadRtbAppOpenAd(new Y5.j((Context) N6.b.r1(aVar), str, zzw(str2), zzv(l2Var), zzx(l2Var), l2Var.k, l2Var.g, l2Var.t, zzy(str2, l2Var), this.zze), new zzbwc(this, zzbvdVar, zzbtzVar));
        } catch (Throwable th) {
            W5.p.d("Adapter failed to render app open ad.", th);
            zzbtq.zza(aVar, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    public final boolean zzt(N6.a aVar) throws RemoteException {
        Y5.h hVar = this.zzd;
        if (hVar == null) {
            return false;
        }
        try {
            hVar.showAd((Context) N6.b.r1(aVar));
            return true;
        } catch (Throwable th) {
            W5.p.d("", th);
            zzbtq.zza(aVar, th, "adapter.showRtbAppOpenAd");
            return true;
        }
    }

    public final /* synthetic */ void zzu(Y5.h hVar) {
        this.zzd = hVar;
    }
}
