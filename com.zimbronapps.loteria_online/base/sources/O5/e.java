package o5;

import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.zzba;
import com.android.billingclient.api.zzbb;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzp;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class e implements BillingClientStateListener {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ com.android.billingclient.api.a b;

    public e(com.android.billingclient.api.a aVar, zzp zzpVar) {
        this.a = zzpVar;
        Objects.requireNonNull(aVar);
        this.b = aVar;
    }

    public final void onBillingServiceDisconnected() {
        zzc.zzm("BillingClient", "Reconnection attempt failed.");
        try {
            this.a.zzb(com.android.billingclient.api.k.j);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Exception setting completer.", th);
        }
        com.android.billingclient.api.a aVar = this.b;
        if (com.android.billingclient.api.a.S0(aVar) != null) {
            aVar.j0(new zzba(this));
        }
    }

    public final void onBillingSetupFinished(BillingResult billingResult) {
        zzc.zzm("BillingClient", "Reconnection finished with result: " + billingResult.getResponseCode());
        try {
            this.a.zzb(billingResult);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Exception setting completer.", th);
        }
        com.android.billingclient.api.a aVar = this.b;
        if (com.android.billingclient.api.a.S0(aVar) != null) {
            aVar.j0(new zzbb(this, billingResult));
        }
    }
}
