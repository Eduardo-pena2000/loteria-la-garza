package o5;

import android.content.Context;
import android.content.IntentFilter;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.UserChoiceBillingListener;
import com.android.billingclient.api.zzb;
import com.android.billingclient.api.zzco;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class s {
    public final Context a;
    public final PurchasesUpdatedListener b;
    public final zzb c;
    public final UserChoiceBillingListener d;
    public final m e;
    public final r f = new r(this, true);
    public final r g = new r(this, false);
    public boolean h;

    public s(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzco zzcoVar, zzb zzbVar, UserChoiceBillingListener userChoiceBillingListener, m mVar) {
        this.a = context;
        this.b = purchasesUpdatedListener;
        this.c = zzbVar;
        this.d = userChoiceBillingListener;
        this.e = mVar;
    }

    public static /* bridge */ /* synthetic */ zzb a(s sVar) {
        return sVar.c;
    }

    public static /* bridge */ /* synthetic */ m b(s sVar) {
        return sVar.e;
    }

    public static /* bridge */ /* synthetic */ PurchasesUpdatedListener c(s sVar) {
        return sVar.b;
    }

    public static /* bridge */ /* synthetic */ UserChoiceBillingListener e(s sVar) {
        return sVar.d;
    }

    public final PurchasesUpdatedListener d() {
        return this.b;
    }

    public final void f() {
        r rVar = this.f;
        Context context = this.a;
        rVar.c(context);
        this.g.c(context);
    }

    public final void g(boolean z) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.h = z;
        r rVar = this.g;
        Context context = this.a;
        rVar.a(context, intentFilter2);
        if (this.h) {
            this.f.b(context, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f.a(context, intentFilter);
        }
    }
}
