package o5;

import android.content.Context;
import com.android.billingclient.api.zzcm;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzji;
import z5.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class o {
    public boolean a;
    public w5.i b;

    public o(Context context) {
        try {
            u.f(context);
            this.b = u.c().g(x5.a.g).a("PLAY_BILLING_LIBRARY", zzji.class, w5.c.b("proto"), new zzcm());
        } catch (Throwable unused) {
            this.a = true;
        }
    }

    public final void a(zzji zzjiVar) {
        if (this.a) {
            zzc.zzn("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.b.b(w5.d.f(zzjiVar));
        } catch (Throwable unused) {
            zzc.zzn("BillingLogger", "logging failed.");
        }
    }
}
