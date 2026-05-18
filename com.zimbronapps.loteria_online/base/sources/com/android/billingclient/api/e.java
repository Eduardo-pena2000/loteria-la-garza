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
public final class e extends com.google.android.gms.internal.play_billing.zzaa {
    public final WeakReference a;
    public final ResultReceiver b;

    public /* synthetic */ e(WeakReference weakReference, ResultReceiver resultReceiver, zzbp zzbpVar) {
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
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unable to launch intent for alternative billing only dialog" + zzb);
            this.b.send(zzb, bundle);
            return;
        }
        PendingIntent parcelable = bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
        if (parcelable == null) {
            com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "User has acknowledged the alternative billing only dialog before.");
            this.b.send(0, bundle);
            return;
        }
        try {
            Activity activity = (Activity) this.a.get();
            Intent intent = new Intent(activity, ProxyBillingActivityV2.class);
            intent.putExtra("alternative_billing_only_dialog_result_receiver", this.b);
            intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", parcelable);
            activity.startActivity(intent);
        } catch (RuntimeException e) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Runtime error while launching intent for alternative billing only dialog.", e);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", zzie.zzax.zza());
            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("%s: %s", new Object[]{e.getClass().getName(), zzbj.zzb(e.getMessage())}));
            this.b.send(6, bundle2);
        }
    }
}
