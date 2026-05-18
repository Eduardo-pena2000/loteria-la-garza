package V5;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class d0 extends B {
    public final Context a;

    public d0(Context context) {
        this.a = context;
    }

    public final void zza() {
        boolean z;
        try {
            z = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.a);
        } catch (v6.i | v6.j | IOException | IllegalStateException e) {
            int i = o0.b;
            W5.p.d("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        W5.m.h(z);
        StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 38);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        String sb2 = sb.toString();
        int i2 = o0.b;
        W5.p.f(sb2);
    }
}
