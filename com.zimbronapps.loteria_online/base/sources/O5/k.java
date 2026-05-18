package o5;

import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzcs;
import com.google.android.gms.internal.play_billing.zzie;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class k implements zzcs {
    public final /* synthetic */ S1.b a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ com.android.billingclient.api.j c;
    public final /* synthetic */ int d;

    public k(com.android.billingclient.api.j jVar, int i, S1.b bVar, Runnable runnable) {
        this.d = i;
        this.a = bVar;
        this.b = runnable;
        Objects.requireNonNull(jVar);
        this.c = jVar;
    }

    public final void zza(Throwable th) {
        if (th instanceof TimeoutException) {
            com.android.billingclient.api.j.E1(this.c, zzie.zzaX, 28, com.android.billingclient.api.k.F);
            zzc.zzo("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            com.android.billingclient.api.j.E1(this.c, zzie.zzaQ, 28, com.android.billingclient.api.k.F);
            zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.b.run();
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        com.android.billingclient.api.j jVar = this.c;
        if (!com.android.billingclient.api.j.A1(jVar, intValue)) {
            this.b.run();
        } else {
            this.a.accept(com.android.billingclient.api.j.C1(jVar, this.d, num.intValue()));
        }
    }
}
