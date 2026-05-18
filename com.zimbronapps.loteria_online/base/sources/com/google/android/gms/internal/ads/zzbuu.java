package com.google.android.gms.internal.ads;

import S5.g1;
import S5.l2;
import S5.q2;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbuu extends zzbtv {
    private final Object zza;
    private zzbuw zzb;
    private zzcar zzc;
    private N6.a zzd;
    private View zze;
    private Y5.q zzf;
    private Y5.C zzg;
    private Y5.z zzh;
    private Y5.w zzi;
    private Y5.p zzj;
    private Y5.h zzk;
    private final String zzl = "";

    public zzbuu(Y5.a aVar) {
        this.zza = aVar;
    }

    private final Bundle zzV(String str, l2 l2Var, String str2) throws RemoteException {
        W5.p.a("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    bundle2.putString(str3, jSONObject.getString(str3));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (l2Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", l2Var.g);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            W5.p.d("", th);
            throw new RemoteException();
        }
    }

    private final Bundle zzW(l2 l2Var) {
        Bundle bundle;
        Bundle bundle2 = l2Var.m;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final boolean zzX(l2 l2Var) {
        if (l2Var.f) {
            return true;
        }
        S5.B.a();
        return W5.g.D();
    }

    private static final String zzY(String str, l2 l2Var) {
        String str2 = l2Var.u;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    public final void zzA(boolean z) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Y5.B) {
            try {
                ((Y5.B) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                W5.p.d("", th);
                return;
            }
        }
        String canonicalName = Y5.B.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        W5.p.a(sb.toString());
    }

    public final g1 zzB() {
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

    public final zzbui zzC() {
        Y5.C c;
        Y5.C zzb;
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof Y5.a) || (c = this.zzg) == null) {
                return null;
            }
            return new zzbva(c);
        }
        zzbuw zzbuwVar = this.zzb;
        if (zzbuwVar == null || (zzb = zzbuwVar.zzb()) == null) {
            return null;
        }
        return new zzbva(zzb);
    }

    public final void zzD(N6.a aVar, l2 l2Var, String str, zzbtz zzbtzVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Y5.a) {
            W5.p.a("Requesting rewarded ad from adapter.");
            try {
                ((Y5.a) obj).loadRewardedAd(new Y5.y((Context) N6.b.r1(aVar), "", zzV(str, l2Var, null), zzW(l2Var), zzX(l2Var), l2Var.k, l2Var.g, l2Var.t, zzY(str, l2Var), ""), new zzbus(this, zzbtzVar));
                return;
            } catch (Exception e) {
                W5.p.d("", e);
                zzbtq.zza(aVar, e, "adapter.loadRewardedAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Y5.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        W5.p.f(sb.toString());
        throw new RemoteException();
    }

    public final void zzE(N6.a aVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Y5.a)) {
            String canonicalName = Y5.a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            W5.p.f(sb.toString());
            throw new RemoteException();
        }
        W5.p.a("Show rewarded ad from adapter.");
        Y5.w wVar = this.zzi;
        if (wVar == null) {
            W5.p.c("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        try {
            wVar.showAd((Context) N6.b.r1(aVar));
        } catch (RuntimeException e) {
            zzbtq.zza(aVar, e, "adapter.rewarded.showAd");
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzF(N6.a r7, com.google.android.gms.internal.ads.zzbqk r8, java.util.List r9) throws android.os.RemoteException {
        /*
            r6 = this;
            java.lang.Object r0 = r6.zza
            boolean r1 = r0 instanceof Y5.a
            if (r1 == 0) goto Lb6
            com.google.android.gms.internal.ads.zzbun r1 = new com.google.android.gms.internal.ads.zzbun
            r1.<init>(r6, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r9.iterator()
        L14:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Laa
            java.lang.Object r2 = r9.next()
            com.google.android.gms.internal.ads.zzbqq r2 = (com.google.android.gms.internal.ads.zzbqq) r2
            java.lang.String r3 = r2.zza
            int r4 = r3.hashCode()
            switch(r4) {
                case -1396342996: goto L66;
                case -1052618729: goto L5c;
                case -239580146: goto L52;
                case 604727084: goto L48;
                case 1167692200: goto L3e;
                case 1778294298: goto L34;
                case 1911491517: goto L2a;
                default: goto L29;
            }
        L29:
            goto L70
        L2a:
            java.lang.String r4 = "rewarded_interstitial"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L70
            r3 = 3
            goto L71
        L34:
            java.lang.String r4 = "app_open_ad"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L70
            r3 = 6
            goto L71
        L3e:
            java.lang.String r4 = "app_open"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L70
            r3 = 5
            goto L71
        L48:
            java.lang.String r4 = "interstitial"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L70
            r3 = 1
            goto L71
        L52:
            java.lang.String r4 = "rewarded"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L70
            r3 = 2
            goto L71
        L5c:
            java.lang.String r4 = "native"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L70
            r3 = 4
            goto L71
        L66:
            java.lang.String r4 = "banner"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L70
            r3 = 0
            goto L71
        L70:
            r3 = -1
        L71:
            r4 = 0
            switch(r3) {
                case 0: goto L9a;
                case 1: goto L97;
                case 2: goto L94;
                case 3: goto L91;
                case 4: goto L8e;
                case 5: goto L8b;
                case 6: goto L76;
                default: goto L75;
            }
        L75:
            goto L9c
        L76:
            com.google.android.gms.internal.ads.zzbgv r3 = com.google.android.gms.internal.ads.zzbhe.zznn
            com.google.android.gms.internal.ads.zzbhc r5 = S5.D.c()
            java.lang.Object r3 = r5.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L9c
            L5.c r4 = L5.c.APP_OPEN_AD
            goto L9c
        L8b:
            L5.c r4 = L5.c.APP_OPEN_AD
            goto L9c
        L8e:
            L5.c r4 = L5.c.NATIVE
            goto L9c
        L91:
            L5.c r4 = L5.c.REWARDED_INTERSTITIAL
            goto L9c
        L94:
            L5.c r4 = L5.c.REWARDED
            goto L9c
        L97:
            L5.c r4 = L5.c.INTERSTITIAL
            goto L9c
        L9a:
            L5.c r4 = L5.c.BANNER
        L9c:
            if (r4 == 0) goto L14
            Y5.o r3 = new Y5.o
            android.os.Bundle r2 = r2.zzb
            r3.<init>(r4, r2)
            r8.add(r3)
            goto L14
        Laa:
            Y5.a r0 = (Y5.a) r0
            java.lang.Object r7 = N6.b.r1(r7)
            android.content.Context r7 = (android.content.Context) r7
            r0.initialize(r7, r1, r8)
            return
        Lb6:
            android.os.RemoteException r7 = new android.os.RemoteException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbuu.zzF(N6.a, com.google.android.gms.internal.ads.zzbqk, java.util.List):void");
    }

    public final void zzG(N6.a aVar, l2 l2Var, String str, zzbtz zzbtzVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Y5.a) {
            W5.p.a("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Y5.a) obj).loadRewardedInterstitialAd(new Y5.y((Context) N6.b.r1(aVar), "", zzV(str, l2Var, null), zzW(l2Var), zzX(l2Var), l2Var.k, l2Var.g, l2Var.t, zzY(str, l2Var), ""), new zzbus(this, zzbtzVar));
                return;
            } catch (Exception e) {
                zzbtq.zza(aVar, e, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Y5.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        W5.p.f(sb.toString());
        throw new RemoteException();
    }

    public final zzbwh zzH() {
        Object obj = this.zza;
        if (obj instanceof Y5.a) {
            return zzbwh.zza(((Y5.a) obj).getVersionInfo());
        }
        return null;
    }

    public final zzbwh zzI() {
        Object obj = this.zza;
        if (obj instanceof Y5.a) {
            return zzbwh.zza(((Y5.a) obj).getSDKVersionInfo());
        }
        return null;
    }

    public final void zzJ(N6.a aVar, q2 q2Var, l2 l2Var, String str, String str2, zzbtz zzbtzVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Y5.a)) {
            String canonicalName = Y5.a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            W5.p.f(sb.toString());
            throw new RemoteException();
        }
        W5.p.a("Requesting interscroller ad from adapter.");
        try {
            Y5.a aVar2 = (Y5.a) obj;
            zzbum zzbumVar = new zzbum(this, zzbtzVar, aVar2);
            zzV(str, l2Var, str2);
            zzW(l2Var);
            zzX(l2Var);
            Location location = l2Var.k;
            zzY(str, l2Var);
            L5.F.c(q2Var.e, q2Var.b);
            zzbumVar.onFailure(new L5.b(7, aVar2.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
        } catch (Exception e) {
            W5.p.d("", e);
            zzbtq.zza(aVar, e, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    public final zzbuc zzK() {
        return null;
    }

    public final void zzL(N6.a aVar) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Y5.a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                zzh();
                return;
            }
            W5.p.a("Show interstitial ad from adapter.");
            Y5.q qVar = this.zzf;
            if (qVar == null) {
                W5.p.c("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
            try {
                qVar.showAd((Context) N6.b.r1(aVar));
                return;
            } catch (RuntimeException e) {
                zzbtq.zza(aVar, e, "adapter.interstitial.showAd");
                throw e;
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = Y5.a.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        W5.p.f(sb.toString());
        throw new RemoteException();
    }

    public final void zzM(N6.a aVar, l2 l2Var, String str, zzbtz zzbtzVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Y5.a) {
            W5.p.a("Requesting app open ad from adapter.");
            try {
                ((Y5.a) obj).loadAppOpenAd(new Y5.j((Context) N6.b.r1(aVar), "", zzV(str, l2Var, null), zzW(l2Var), zzX(l2Var), l2Var.k, l2Var.g, l2Var.t, zzY(str, l2Var), ""), new zzbut(this, zzbtzVar));
                return;
            } catch (Exception e) {
                W5.p.d("", e);
                zzbtq.zza(aVar, e, "adapter.loadAppOpenAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Y5.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        W5.p.f(sb.toString());
        throw new RemoteException();
    }

    public final void zzN(N6.a aVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Y5.a)) {
            String canonicalName = Y5.a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            W5.p.f(sb.toString());
            throw new RemoteException();
        }
        W5.p.a("Show app open ad from adapter.");
        Y5.h hVar = this.zzk;
        if (hVar == null) {
            W5.p.c("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        try {
            hVar.showAd((Context) N6.b.r1(aVar));
        } catch (RuntimeException e) {
            zzbtq.zza(aVar, e, "adapter.appOpen.showAd");
            throw e;
        }
    }

    public final zzbue zzO() {
        return null;
    }

    public final zzbuf zzP() {
        return null;
    }

    public final /* synthetic */ void zzQ(Y5.C c) {
        this.zzg = c;
    }

    public final /* synthetic */ void zzS(Y5.w wVar) {
        this.zzi = wVar;
    }

    public final /* synthetic */ void zzU(Y5.h hVar) {
        this.zzk = hVar;
    }

    public final /* synthetic */ Object zzb() {
        return this.zza;
    }

    public final /* synthetic */ void zzc(View view) {
        this.zze = view;
    }

    public final /* synthetic */ void zzd(Y5.q qVar) {
        this.zzf = qVar;
    }

    public final void zze(N6.a aVar, q2 q2Var, l2 l2Var, String str, zzbtz zzbtzVar) throws RemoteException {
        zzj(aVar, q2Var, l2Var, str, null, zzbtzVar);
    }

    public final N6.a zzf() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return N6.b.s1(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                W5.p.d("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof Y5.a) {
            return N6.b.s1(this.zze);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = Y5.a.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        W5.p.f(sb.toString());
        throw new RemoteException();
    }

    public final void zzg(N6.a aVar, l2 l2Var, String str, zzbtz zzbtzVar) throws RemoteException {
        zzk(aVar, l2Var, str, null, zzbtzVar);
    }

    public final void zzh() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationInterstitialAdapter) {
            W5.p.a("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th) {
                W5.p.d("", th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        W5.p.f(sb.toString());
        throw new RemoteException();
    }

    public final void zzi() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Y5.g) {
            try {
                ((Y5.g) obj).onDestroy();
            } catch (Throwable th) {
                W5.p.d("", th);
                throw new RemoteException();
            }
        }
    }

    public final void zzj(N6.a aVar, q2 q2Var, l2 l2Var, String str, String str2, zzbtz zzbtzVar) throws RemoteException {
        String str3;
        MediationBannerAdapter mediationBannerAdapter;
        zzbul zzbulVar;
        Bundle bundle;
        Object obj = this.zza;
        boolean z = obj instanceof MediationBannerAdapter;
        if (!z && !(obj instanceof Y5.a)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Y5.a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            W5.p.f(sb.toString());
            throw new RemoteException();
        }
        W5.p.a("Requesting banner ad from adapter.");
        L5.h b = q2Var.n ? L5.F.b(q2Var.e, q2Var.b) : L5.F.a(q2Var.e, q2Var.b, q2Var.a);
        if (!z) {
            Object obj2 = this.zza;
            if (obj2 instanceof Y5.a) {
                try {
                    ((Y5.a) obj2).loadBannerAd(new Y5.m((Context) N6.b.r1(aVar), "", zzV(str, l2Var, str2), zzW(l2Var), zzX(l2Var), l2Var.k, l2Var.g, l2Var.t, zzY(str, l2Var), b, this.zzl), new zzbuo(this, zzbtzVar));
                    return;
                } catch (Throwable th) {
                    W5.p.d("", th);
                    zzbtq.zza(aVar, th, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            mediationBannerAdapter = (MediationBannerAdapter) obj;
            List list = l2Var.e;
            Set hashSet = list != null ? new HashSet(list) : null;
            long j = l2Var.b;
            zzbulVar = new zzbul(j == -1 ? null : new Date(j), l2Var.d, hashSet, l2Var.k, zzX(l2Var), l2Var.g, l2Var.r, l2Var.t, zzY(str, l2Var));
            bundle = l2Var.m;
            str3 = "";
        } catch (Throwable th2) {
            th = th2;
            str3 = "";
        }
        try {
            mediationBannerAdapter.requestBannerAd((Context) N6.b.r1(aVar), new zzbuw(zzbtzVar), zzV(str, l2Var, str2), b, zzbulVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th3) {
            th = th3;
            W5.p.d(str3, th);
            zzbtq.zza(aVar, th, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    public final void zzk(N6.a aVar, l2 l2Var, String str, String str2, zzbtz zzbtzVar) throws RemoteException {
        Object obj = this.zza;
        boolean z = obj instanceof MediationInterstitialAdapter;
        if (!z && !(obj instanceof Y5.a)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Y5.a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            W5.p.f(sb.toString());
            throw new RemoteException();
        }
        W5.p.a("Requesting interstitial ad from adapter.");
        if (!z) {
            Object obj2 = this.zza;
            if (obj2 instanceof Y5.a) {
                try {
                    ((Y5.a) obj2).loadInterstitialAd(new Y5.s((Context) N6.b.r1(aVar), "", zzV(str, l2Var, str2), zzW(l2Var), zzX(l2Var), l2Var.k, l2Var.g, l2Var.t, zzY(str, l2Var), this.zzl), new zzbup(this, zzbtzVar));
                    return;
                } catch (Throwable th) {
                    W5.p.d("", th);
                    zzbtq.zza(aVar, th, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
            List list = l2Var.e;
            Set hashSet = list != null ? new HashSet(list) : null;
            long j = l2Var.b;
            zzbul zzbulVar = new zzbul(j == -1 ? null : new Date(j), l2Var.d, hashSet, l2Var.k, zzX(l2Var), l2Var.g, l2Var.r, l2Var.t, zzY(str, l2Var));
            Bundle bundle = l2Var.m;
            mediationInterstitialAdapter.requestInterstitialAd((Context) N6.b.r1(aVar), new zzbuw(zzbtzVar), zzV(str, l2Var, str2), zzbulVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            W5.p.d("", th2);
            zzbtq.zza(aVar, th2, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    public final void zzl() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Y5.g) {
            try {
                ((Y5.g) obj).onPause();
            } catch (Throwable th) {
                W5.p.d("", th);
                throw new RemoteException();
            }
        }
    }

    public final void zzm() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Y5.g) {
            try {
                ((Y5.g) obj).onResume();
            } catch (Throwable th) {
                W5.p.d("", th);
                throw new RemoteException();
            }
        }
    }

    public final void zzn(N6.a aVar, l2 l2Var, String str, zzcar zzcarVar, String str2) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Y5.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.zzd = aVar;
            this.zzc = zzcarVar;
            zzcarVar.zze(N6.b.s1(obj));
            return;
        }
        String canonicalName = Y5.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        W5.p.f(sb.toString());
        throw new RemoteException();
    }

    public final void zzo(l2 l2Var, String str) throws RemoteException {
        zzv(l2Var, str, null);
    }

    public final void zzp() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Y5.a) {
            Y5.w wVar = this.zzi;
            if (wVar == null) {
                W5.p.c("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
            try {
                wVar.showAd((Context) N6.b.r1(this.zzd));
                return;
            } catch (RuntimeException e) {
                zzbtq.zza(this.zzd, e, "adapter.showVideo");
                throw e;
            }
        }
        String canonicalName = Y5.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        W5.p.f(sb.toString());
        throw new RemoteException();
    }

    public final boolean zzq() throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Y5.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.zzc != null;
        }
        String canonicalName = Y5.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        W5.p.f(sb.toString());
        throw new RemoteException();
    }

    public final void zzr(N6.a aVar, l2 l2Var, String str, String str2, zzbtz zzbtzVar, zzbkh zzbkhVar, List list) throws RemoteException {
        Object obj = this.zza;
        boolean z = obj instanceof MediationNativeAdapter;
        if (!z && !(obj instanceof Y5.a)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = Y5.a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            W5.p.f(sb.toString());
            throw new RemoteException();
        }
        W5.p.a("Requesting native ad from adapter.");
        if (z) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                List list2 = l2Var.e;
                Set hashSet = list2 != null ? new HashSet(list2) : null;
                long j = l2Var.b;
                zzbuz zzbuzVar = new zzbuz(j == -1 ? null : new Date(j), l2Var.d, hashSet, l2Var.k, zzX(l2Var), l2Var.g, zzbkhVar, list, l2Var.r, l2Var.t, zzY(str, l2Var));
                Bundle bundle = l2Var.m;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.zzb = new zzbuw(zzbtzVar);
                mediationNativeAdapter.requestNativeAd((Context) N6.b.r1(aVar), this.zzb, zzV(str, l2Var, str2), zzbuzVar, bundle2);
                return;
            } catch (Throwable th) {
                W5.p.d("", th);
                zzbtq.zza(aVar, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        Object obj2 = this.zza;
        if (obj2 instanceof Y5.a) {
            try {
                ((Y5.a) obj2).loadNativeAdMapper(new Y5.u((Context) N6.b.r1(aVar), "", zzV(str, l2Var, str2), zzW(l2Var), zzX(l2Var), l2Var.k, l2Var.g, l2Var.t, zzY(str, l2Var), this.zzl, zzbkhVar), new zzbur(this, zzbtzVar));
            } catch (Throwable th2) {
                W5.p.d("", th2);
                zzbtq.zza(aVar, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    ((Y5.a) this.zza).loadNativeAd(new Y5.u((Context) N6.b.r1(aVar), "", zzV(str, l2Var, str2), zzW(l2Var), zzX(l2Var), l2Var.k, l2Var.g, l2Var.t, zzY(str, l2Var), this.zzl, zzbkhVar), new zzbuq(this, zzbtzVar));
                } catch (Throwable th3) {
                    W5.p.d("", th3);
                    zzbtq.zza(aVar, th3, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    public final Bundle zzs() {
        return new Bundle();
    }

    public final Bundle zzt() {
        return new Bundle();
    }

    public final Bundle zzu() {
        return new Bundle();
    }

    public final void zzv(l2 l2Var, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Y5.a) {
            zzD(this.zzd, l2Var, str, new zzbux((Y5.a) obj, this.zzc));
            return;
        }
        String canonicalName = Y5.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        W5.p.f(sb.toString());
        throw new RemoteException();
    }

    public final void zzw(N6.a aVar) throws RemoteException {
    }

    public final boolean zzx() {
        return false;
    }

    public final void zzy(N6.a aVar, zzcar zzcarVar, List list) throws RemoteException {
        W5.p.f("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    public final zzblm zzz() {
        zzbln zze;
        zzbuw zzbuwVar = this.zzb;
        if (zzbuwVar == null || (zze = zzbuwVar.zze()) == null) {
            return null;
        }
        return zze.zza();
    }

    public zzbuu(Y5.g gVar) {
        this.zza = gVar;
    }

    public final /* synthetic */ void zzR(Y5.z zVar) {
    }

    public final /* synthetic */ void zzT(Y5.p pVar) {
    }
}
