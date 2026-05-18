package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class c extends ResultReceiver {
    public final /* synthetic */ ExternalOfferInformationDialogListener a;
    public final /* synthetic */ a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, Handler handler, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        super(handler);
        this.a = externalOfferInformationDialogListener;
        Objects.requireNonNull(aVar);
        this.b = aVar;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(i);
        if (i != 0) {
            if (bundle == null) {
                a.z(this.b, this.a, k.h, zzie.zzaI, null);
                return;
            }
            newBuilder.setDebugMessage(com.google.android.gms.internal.play_billing.zzc.zzj(bundle, "BillingClient"));
            int i2 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
            a aVar = this.b;
            zzie zzb = i2 != 0 ? zzie.zzb(i2) : zzie.zzw;
            BillingResult build = newBuilder.build();
            String string = bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS");
            int i3 = zzcg.zza;
            a.B(aVar, zzcg.zzb(zzb, 25, build, string, zzil.zza));
        }
        this.a.onExternalOfferInformationDialogResponse(newBuilder.build());
    }
}
