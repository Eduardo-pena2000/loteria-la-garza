package o5;

import android.os.Bundle;
import com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.zzbp;
import com.android.billingclient.api.zzcg;
import com.google.android.gms.internal.play_billing.zzag;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class h extends zzag {
    public final AlternativeBillingOnlyAvailabilityListener a;
    public final m b;
    public final int c;

    public /* synthetic */ h(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, m mVar, int i, zzbp zzbpVar) {
        this.a = alternativeBillingOnlyAvailabilityListener;
        this.b = mVar;
        this.c = i;
    }

    public final void zza(Bundle bundle) {
        if (bundle == null) {
            m mVar = this.b;
            zzie zzieVar = zzie.zzao;
            BillingResult billingResult = com.android.billingclient.api.k.h;
            int i = zzcg.zza;
            mVar.k(zzcg.zzb(zzieVar, 14, billingResult, null, zzil.zza), this.c);
            this.a.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
            return;
        }
        int zzb = zzc.zzb(bundle, "BillingClient");
        BillingResult a = com.android.billingclient.api.k.a(zzb, zzc.zzj(bundle, "BillingClient"));
        if (zzb != 0) {
            zzc.zzn("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + zzb);
            m mVar2 = this.b;
            zzie zzieVar2 = zzie.zzw;
            int i2 = zzcg.zza;
            mVar2.k(zzcg.zzb(zzieVar2, 14, a, null, zzil.zza), this.c);
        }
        this.a.onAlternativeBillingOnlyAvailabilityResponse(a);
    }
}
