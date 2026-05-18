package o5;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.InAppMessageResponseListener;
import com.google.android.gms.internal.play_billing.zzc;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class d extends ResultReceiver {
    public final /* synthetic */ InAppMessageResponseListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.android.billingclient.api.a aVar, Handler handler, InAppMessageResponseListener inAppMessageResponseListener) {
        super(handler);
        this.a = inAppMessageResponseListener;
        Objects.requireNonNull(aVar);
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        this.a.onInAppMessageResponse(zzc.zzi(bundle, "BillingClient"));
    }
}
