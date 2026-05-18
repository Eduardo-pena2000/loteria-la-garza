package o5;

import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ExternalOfferReportingDetails;
import com.android.billingclient.api.ExternalOfferReportingDetailsListener;
import com.android.billingclient.api.zzbp;
import com.android.billingclient.api.zzcg;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import com.google.android.gms.internal.play_billing.zzy;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class g extends zzy {
    public final ExternalOfferReportingDetailsListener a;
    public final m b;
    public final int c;

    public /* synthetic */ g(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, m mVar, int i, zzbp zzbpVar) {
        this.a = externalOfferReportingDetailsListener;
        this.b = mVar;
        this.c = i;
    }

    public final void zza(Bundle bundle) {
        if (bundle == null) {
            m mVar = this.b;
            zzie zzieVar = zzie.zzaG;
            BillingResult billingResult = com.android.billingclient.api.k.h;
            int i = zzcg.zza;
            mVar.k(zzcg.zzb(zzieVar, 24, billingResult, null, zzil.zza), this.c);
            this.a.onExternalOfferReportingDetailsResponse(billingResult, null);
            return;
        }
        int zzb = zzc.zzb(bundle, "BillingClient");
        BillingResult a = com.android.billingclient.api.k.a(zzb, zzc.zzj(bundle, "BillingClient"));
        if (zzb != 0) {
            zzc.zzn("BillingClient", "createExternalOfferReportingDetailsAsync() failed. Response code: " + zzb);
            m mVar2 = this.b;
            zzie zzieVar2 = zzie.zzw;
            int i2 = zzcg.zza;
            mVar2.k(zzcg.zzb(zzieVar2, 24, a, null, zzil.zza), this.c);
            this.a.onExternalOfferReportingDetailsResponse(a, null);
            return;
        }
        try {
            this.a.onExternalOfferReportingDetailsResponse(a, new ExternalOfferReportingDetails(bundle.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));
        } catch (JSONException e) {
            zzc.zzo("BillingClient", "Error when parsing invalid external offer reporting details. \n Exception: ", e);
            m mVar3 = this.b;
            zzie zzieVar3 = zzie.zzaH;
            BillingResult billingResult2 = com.android.billingclient.api.k.h;
            int i3 = zzcg.zza;
            mVar3.k(zzcg.zzb(zzieVar3, 24, billingResult2, null, zzil.zza), this.c);
            this.a.onExternalOfferReportingDetailsResponse(billingResult2, null);
        }
    }
}
