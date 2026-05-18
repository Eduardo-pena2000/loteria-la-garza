package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzbj;
import com.google.android.gms.internal.play_billing.zzie;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class g extends com.google.android.gms.internal.play_billing.zzae {
    public final WeakReference a;
    public final ResultReceiver b;

    public /* synthetic */ g(WeakReference weakReference, ResultReceiver resultReceiver, zzbp zzbpVar) {
        this.a = weakReference;
        this.b = resultReceiver;
    }

    public final void zza(Bundle bundle) {
        if (bundle == null) {
            this.b.send(6, (Bundle) null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Response bundle doesn't contain a response code");
            this.b.send(6, bundle);
            return;
        }
        int zzb = com.google.android.gms.internal.play_billing.zzc.zzb(bundle, "BillingClient");
        if (zzb != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unable to launch intent for external offer dialog" + zzb);
            this.b.send(zzb, bundle);
            return;
        }
        PendingIntent parcelable = bundle.getParcelable("EXTERNAL_PAYMENT_DIALOG_INTENT");
        if (parcelable == null) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "The PendingIntent for the external offer dialog is null");
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            this.b.send(6, bundle2);
            return;
        }
        try {
            Activity activity = (Activity) this.a.get();
            Intent intent = new Intent(activity, ProxyBillingActivityV2.class);
            intent.putExtra("external_payment_dialog_result_receiver", this.b);
            intent.putExtra("external_payment_dialog_pending_intent", parcelable);
            activity.startActivity(intent);
        } catch (RuntimeException e) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Runtime error while launching intent for the external offer dialog.", e);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("RESPONSE_CODE", 6);
            bundle3.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle3.putInt("INTERNAL_LOG_ERROR_REASON", zzie.zzaK.zza());
            bundle3.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("%s: %s", new Object[]{e.getClass().getName(), zzbj.zzb(e.getMessage())}));
            this.b.send(6, bundle3);
        }
    }
}
