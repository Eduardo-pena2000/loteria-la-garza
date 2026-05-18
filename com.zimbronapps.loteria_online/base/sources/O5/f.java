package o5;

import android.os.Bundle;
import com.android.billingclient.api.AlternativeBillingOnlyReportingDetails;
import com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.zzbp;
import com.android.billingclient.api.zzcg;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import com.google.android.gms.internal.play_billing.zzw;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class f extends zzw {
    public final AlternativeBillingOnlyReportingDetailsListener a;
    public final m b;
    public final int c;

    public /* synthetic */ f(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, m mVar, int i, zzbp zzbpVar) {
        this.a = alternativeBillingOnlyReportingDetailsListener;
        this.b = mVar;
        this.c = i;
    }

    public final void zza(Bundle bundle) {
        if (bundle == null) {
            m mVar = this.b;
            zzie zzieVar = zzie.zzas;
            BillingResult billingResult = com.android.billingclient.api.k.h;
            int i = zzcg.zza;
            mVar.k(zzcg.zzb(zzieVar, 15, billingResult, null, zzil.zza), this.c);
            this.a.onAlternativeBillingOnlyTokenResponse(billingResult, null);
            return;
        }
        int zzb = zzc.zzb(bundle, "BillingClient");
        BillingResult a = com.android.billingclient.api.k.a(zzb, zzc.zzj(bundle, "BillingClient"));
        if (zzb != 0) {
            zzc.zzn("BillingClient", "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: " + zzb);
            m mVar2 = this.b;
            zzie zzieVar2 = zzie.zzw;
            int i2 = zzcg.zza;
            mVar2.k(zzcg.zzb(zzieVar2, 15, a, null, zzil.zza), this.c);
            this.a.onAlternativeBillingOnlyTokenResponse(a, null);
            return;
        }
        try {
            this.a.onAlternativeBillingOnlyTokenResponse(a, new AlternativeBillingOnlyReportingDetails(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")));
        } catch (JSONException e) {
            zzc.zzo("BillingClient", "Error when parsing invalid alternative billing only reporting details. \n Exception: ", e);
            m mVar3 = this.b;
            zzie zzieVar3 = zzie.zzat;
            BillingResult billingResult2 = com.android.billingclient.api.k.h;
            int i3 = zzcg.zza;
            mVar3.k(zzcg.zzb(zzieVar3, 15, billingResult2, null, zzil.zza), this.c);
            this.a.onAlternativeBillingOnlyTokenResponse(billingResult2, null);
        }
    }
}
