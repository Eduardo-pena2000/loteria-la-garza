package com.google.android.gms.internal.ads;

import V5.F0;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import v.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbwl implements MediationInterstitialAdapter {
    private Activity zza;
    private Y5.t zzb;
    private Uri zzc;

    public final void onDestroy() {
        W5.p.a("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        W5.p.a("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        W5.p.a("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public final void requestInterstitialAd(Context context, Y5.t tVar, Bundle bundle, Y5.f fVar, Bundle bundle2) {
        this.zzb = tVar;
        if (tVar == null) {
            W5.p.f("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            W5.p.f("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
            return;
        }
        if (!zzbif.zza(context)) {
            W5.p.f("Default browser does not support custom tabs. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            W5.p.f("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
        } else {
            this.zza = (Activity) context;
            this.zzc = Uri.parse(string);
            this.zzb.onAdLoaded(this);
        }
    }

    public final void showInterstitial() {
        v.d a = new d.d().a();
        a.a.setData(this.zzc);
        F0.l.post(new zzbwk(this, new AdOverlayInfoParcel(new U5.m(a.a, null), null, new zzbwj(this), null, new W5.a(0, 0, false), null, null, "")));
        R5.t.l().zzd();
    }

    public final /* synthetic */ Activity zza() {
        return this.zza;
    }

    public final /* synthetic */ Y5.t zzb() {
        return this.zzb;
    }
}
