package k7;

import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class g6 extends M6 {
    public final Map d;
    public final N2 e;
    public final N2 f;
    public final N2 g;
    public final N2 h;
    public final N2 i;
    public final N2 j;

    public g6(b7 b7Var) {
        super(b7Var);
        this.d = new HashMap();
        Q2 x = this.a.x();
        Objects.requireNonNull(x);
        this.e = new N2(x, "last_delete_stale", 0L);
        Q2 x2 = this.a.x();
        Objects.requireNonNull(x2);
        this.f = new N2(x2, "last_delete_stale_batch", 0L);
        Q2 x3 = this.a.x();
        Objects.requireNonNull(x3);
        this.g = new N2(x3, "backoff", 0L);
        Q2 x4 = this.a.x();
        Objects.requireNonNull(x4);
        this.h = new N2(x4, "last_upload", 0L);
        Q2 x5 = this.a.x();
        Objects.requireNonNull(x5);
        this.i = new N2(x5, "last_upload_attempt", 0L);
        Q2 x6 = this.a.x();
        Objects.requireNonNull(x6);
        this.j = new N2(x6, "midnight_offset", 0L);
    }

    public final boolean l() {
        return false;
    }

    public final Pair m(String str, a4 a4Var) {
        return a4Var.o(Z3.AD_STORAGE) ? n(str) : new Pair("", Boolean.FALSE);
    }

    public final Pair n(String str) {
        f6 f6Var;
        AdvertisingIdClient.Info info;
        h();
        q3 q3Var = this.a;
        long b = q3Var.e().b();
        f6 f6Var2 = (f6) this.d.get(str);
        if (f6Var2 != null && b < f6Var2.c) {
            return new Pair(f6Var2.a, Boolean.valueOf(f6Var2.b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long D = q3Var.w().D(str, f2.b) + b;
        try {
            try {
                info = AdvertisingIdClient.getAdvertisingIdInfo(q3Var.d());
            } catch (PackageManager.NameNotFoundException unused) {
                info = null;
                if (f6Var2 != null && b < f6Var2.c + this.a.w().D(str, f2.c)) {
                    return new Pair(f6Var2.a, Boolean.valueOf(f6Var2.b));
                }
            }
        } catch (Exception e) {
            this.a.a().v().b("Unable to get advertising id", e);
            f6Var = new f6("", false, D);
        }
        if (info == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id = info.getId();
        f6Var = id != null ? new f6(id, info.isLimitAdTrackingEnabled(), D) : new f6("", info.isLimitAdTrackingEnabled(), D);
        this.d.put(str, f6Var);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(f6Var.a, Boolean.valueOf(f6Var.b));
    }

    public final String o(String str, boolean z) {
        h();
        String str2 = z ? (String) n(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest C = l7.C();
        if (C == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, C.digest(str2.getBytes()))});
    }
}
