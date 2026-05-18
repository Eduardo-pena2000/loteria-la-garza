package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class h extends com.google.android.gms.internal.play_billing.zzan {
    public final WeakReference a;
    public final ResultReceiver b;

    public /* synthetic */ h(WeakReference weakReference, ResultReceiver resultReceiver, zzbp zzbpVar) {
        this.a = weakReference;
        this.b = resultReceiver;
    }

    public final void zza(Bundle bundle) {
        ResultReceiver resultReceiver = this.b;
        if (resultReceiver == null) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, (Bundle) null);
            return;
        }
        Activity activity = (Activity) this.a.get();
        PendingIntent parcelable = bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || parcelable == null) {
            resultReceiver.send(0, (Bundle) null);
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unable to launch intent for in-app messaging");
            return;
        }
        try {
            Intent intent = new Intent(activity, ProxyBillingActivity.class);
            intent.putExtra("in_app_message_result_receiver", resultReceiver);
            intent.putExtra("IN_APP_MESSAGE_INTENT", parcelable);
            activity.startActivity(intent);
        } catch (CancellationException e) {
            this.b.send(0, (Bundle) null);
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception caught while launching intent for in-app messaging.", e);
        }
    }
}
