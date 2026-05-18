package L5;

import S5.m1;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class a {
    public final m1 a;

    public a() {
        m1 m1Var = new m1();
        this.a = m1Var;
        m1Var.j("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public a a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            StringBuilder sb = new StringBuilder(str2.length() + 108);
            sb.append("Value ");
            sb.append(str2);
            sb.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
            W5.p.f(sb.toString());
        }
        this.a.q(str, str2);
        return e();
    }

    public a b(String str, List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
                    StringBuilder sb = new StringBuilder(str2.length() + 108);
                    sb.append("Value ");
                    sb.append(str2);
                    sb.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
                    W5.p.f(sb.toString());
                }
            }
            this.a.q(str, TextUtils.join(",", list));
        }
        return e();
    }

    public a c(String str) {
        this.a.g(str);
        return e();
    }

    public a d(Class cls, Bundle bundle) {
        m1 m1Var = this.a;
        m1Var.i(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            m1Var.k("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return e();
    }

    public abstract a e();

    public a f(String str) {
        this.a.t(str);
        return e();
    }

    public a g(String str) {
        com.google.android.gms.common.internal.t.m(str, "Content URL must be non-null.");
        com.google.android.gms.common.internal.t.g(str, "Content URL must be non-empty.");
        int length = str.length();
        com.google.android.gms.common.internal.t.c(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
        this.a.l(str);
        return e();
    }

    public a h(int i) {
        this.a.u(i);
        return e();
    }

    public a i(List list) {
        if (list == null) {
            W5.p.f("neighboring content URLs list should not be null");
            return e();
        }
        this.a.m(list);
        return e();
    }

    public a j(String str) {
        this.a.o(str);
        return e();
    }

    public final a k(Bundle bundle) {
        this.a.h(bundle);
        return e();
    }

    public final a l(String str) {
        this.a.j(str);
        return e();
    }

    public final a m(boolean z) {
        this.a.p(z);
        return e();
    }

    public final a n(boolean z) {
        this.a.s(z);
        return e();
    }
}
