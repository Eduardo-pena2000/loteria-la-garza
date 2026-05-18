package o5;

import android.text.TextUtils;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.zzcw;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class c implements Callable {
    public final /* synthetic */ PurchasesResponseListener a;
    public final /* synthetic */ String b;
    public final /* synthetic */ com.android.billingclient.api.a c;

    public c(com.android.billingclient.api.a aVar, PurchasesResponseListener purchasesResponseListener, String str, boolean z) {
        this.a = purchasesResponseListener;
        this.b = str;
        Objects.requireNonNull(aVar);
        this.c = aVar;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        com.android.billingclient.api.a aVar = this.c;
        if (!com.android.billingclient.api.a.k0(aVar, 30000L)) {
            zzie zzieVar = zzie.zzb;
            BillingResult billingResult = com.android.billingclient.api.k.j;
            com.android.billingclient.api.a.n0(aVar, zzieVar, 9, billingResult);
            this.a.onQueryPurchasesResponse(billingResult, zzbt.zzk());
            return null;
        }
        String str = this.b;
        if (TextUtils.isEmpty(str)) {
            zzc.zzn("BillingClient", "Please provide a valid product type.");
            zzie zzieVar2 = zzie.zzX;
            BillingResult billingResult2 = com.android.billingclient.api.k.e;
            com.android.billingclient.api.a.n0(aVar, zzieVar2, 9, billingResult2);
            this.a.onQueryPurchasesResponse(billingResult2, zzbt.zzk());
            return null;
        }
        zzcw m0 = com.android.billingclient.api.a.m0(aVar, str, false, 9);
        if (m0.zzb() != null) {
            this.a.onQueryPurchasesResponse(m0.zza(), m0.zzb());
            return null;
        }
        this.a.onQueryPurchasesResponse(m0.zza(), zzbt.zzk());
        return null;
    }
}
