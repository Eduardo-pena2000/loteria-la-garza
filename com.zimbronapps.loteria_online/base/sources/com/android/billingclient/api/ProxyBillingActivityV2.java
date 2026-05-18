package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzie;
import g.h;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class ProxyBillingActivityV2 extends d.j {
    public g.d a;
    public g.d b;
    public g.d c;
    public ResultReceiver d;
    public ResultReceiver e;
    public ResultReceiver f;

    public final void W(g.a aVar) {
        Intent b = aVar.b();
        int responseCode = com.google.android.gms.internal.play_billing.zzc.zzh(b, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.d;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, b == null ? null : b.getExtras());
        }
        if (aVar.c() != -1 || responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + aVar.c() + " and billing's responseCode: " + responseCode);
        }
        finish();
    }

    public final void X(g.a aVar) {
        Intent b = aVar.b();
        int responseCode = com.google.android.gms.internal.play_billing.zzc.zzh(b, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.e;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, b == null ? null : b.getExtras());
        }
        if (aVar.c() != -1 || responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", new Object[]{Integer.valueOf(aVar.c()), Integer.valueOf(responseCode)}));
        }
        finish();
    }

    public final void Y(g.a aVar) {
        Intent b = aVar.b();
        Bundle extras = b == null ? null : b.getExtras();
        if (aVar.c() != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivityV2", String.format("External offer flow finished with resultCode: %s", new Object[]{Integer.valueOf(aVar.c())}));
            extras.putInt("INTERNAL_LOG_ERROR_REASON", zzie.zzbv.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("External offer flow finished with error resultCode: %s", new Object[]{Integer.valueOf(aVar.c())}));
        }
        int responseCode = com.google.android.gms.internal.play_billing.zzc.zzh(b, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.f;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, extras);
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivityV2", String.format("External offer flow finished with billing responseCode: %s", new Object[]{Integer.valueOf(responseCode)}));
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = registerForActivityResult(new h.i(), new zzct(this));
        this.b = registerForActivityResult(new h.i(), new zzcu(this));
        this.c = registerForActivityResult(new h.i(), new zzcv(this));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.d = bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.e = bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.f = bundle.getParcelable("external_offer_flow_result_receiver");
                return;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzc.zzm("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent parcelableExtra = getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.d = getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.a.a(new h.a(parcelableExtra).a());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent parcelableExtra2 = getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.e = getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.b.a(new h.a(parcelableExtra2).a());
        } else if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent parcelableExtra3 = getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.f = getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            this.c.a(new h.a(parcelableExtra3).a());
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.d;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.e;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
    }
}
