package o5;

import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ExternalOfferAvailabilityListener;
import com.android.billingclient.api.zzbp;
import com.android.billingclient.api.zzcg;
import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class i extends zzai {
    public final ExternalOfferAvailabilityListener a;
    public final m b;
    public final int c;

    public /* synthetic */ i(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, m mVar, int i, zzbp zzbpVar) {
        this.a = externalOfferAvailabilityListener;
        this.b = mVar;
        this.c = i;
    }

    public final void zza(Bundle bundle) {
        if (bundle == null) {
            m mVar = this.b;
            zzie zzieVar = zzie.zzaD;
            BillingResult billingResult = com.android.billingclient.api.k.h;
            int i = zzcg.zza;
            mVar.k(zzcg.zzb(zzieVar, 23, billingResult, null, zzil.zza), this.c);
            this.a.onExternalOfferAvailabilityResponse(billingResult);
            return;
        }
        int zzb = zzc.zzb(bundle, "BillingClient");
        BillingResult a = com.android.billingclient.api.k.a(zzb, zzc.zzj(bundle, "BillingClient"));
        if (zzb != 0) {
            zzc.zzn("BillingClient", "isExternalOfferAvailableAsync() failed. Response code: " + zzb);
            m mVar2 = this.b;
            zzie zzieVar2 = zzie.zzw;
            int i2 = zzcg.zza;
            mVar2.k(zzcg.zzb(zzieVar2, 23, a, null, zzil.zza), this.c);
        }
        this.a.onExternalOfferAvailabilityResponse(a);
    }
}
