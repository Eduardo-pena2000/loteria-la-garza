package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import o5.m;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class f extends com.google.android.gms.internal.play_billing.zzac {
    public final BillingConfigResponseListener a;
    public final m b;
    public final int c;

    public /* synthetic */ f(BillingConfigResponseListener billingConfigResponseListener, m mVar, int i, zzbp zzbpVar) {
        this.a = billingConfigResponseListener;
        this.b = mVar;
        this.c = i;
    }

    public final void zza(Bundle bundle) {
        if (bundle == null) {
            m mVar = this.b;
            zzie zzieVar = zzie.zzak;
            BillingResult billingResult = k.h;
            int i = zzcg.zza;
            mVar.k(zzcg.zzb(zzieVar, 13, billingResult, null, zzil.zza), this.c);
            this.a.onBillingConfigResponse(billingResult, null);
            return;
        }
        int zzb = com.google.android.gms.internal.play_billing.zzc.zzb(bundle, "BillingClient");
        String zzj = com.google.android.gms.internal.play_billing.zzc.zzj(bundle, "BillingClient");
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(zzb);
        newBuilder.setDebugMessage(zzj);
        if (zzb != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "getBillingConfig() failed. Response code: " + zzb);
            BillingResult build = newBuilder.build();
            m mVar2 = this.b;
            zzie zzieVar2 = zzie.zzw;
            int i2 = zzcg.zza;
            mVar2.k(zzcg.zzb(zzieVar2, 13, build, null, zzil.zza), this.c);
            this.a.onBillingConfigResponse(build, null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            newBuilder.setResponseCode(6);
            BillingResult build2 = newBuilder.build();
            m mVar3 = this.b;
            zzie zzieVar3 = zzie.zzal;
            int i3 = zzcg.zza;
            mVar3.k(zzcg.zzb(zzieVar3, 13, build2, null, zzil.zza), this.c);
            this.a.onBillingConfigResponse(build2, null);
            return;
        }
        try {
            this.a.onBillingConfigResponse(newBuilder.build(), new BillingConfig(bundle.getString("BILLING_CONFIG")));
        } catch (JSONException e) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e);
            m mVar4 = this.b;
            zzie zzieVar4 = zzie.zzam;
            BillingResult billingResult2 = k.h;
            int i4 = zzcg.zza;
            mVar4.k(zzcg.zzb(zzieVar4, 13, billingResult2, null, zzil.zza), this.c);
            this.a.onBillingConfigResponse(billingResult2, null);
        }
    }
}
