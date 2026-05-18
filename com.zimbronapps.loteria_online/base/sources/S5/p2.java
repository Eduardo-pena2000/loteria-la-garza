package S5;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class p2 {
    public static final p2 a = new p2();

    public final l2 a(Context context, n1 n1Var) {
        Context context2;
        List list;
        String str;
        String a2 = n1Var.a();
        Set c = n1Var.c();
        if (c.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(c));
            context2 = context;
        }
        boolean g = n1Var.g(context2);
        Bundle d = n1Var.d(AdMobAdapter.class);
        String e = n1Var.e();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            B.a();
            str = W5.g.C(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean l = n1Var.l();
        L5.y t = A1.f().t();
        return new l2(8, -1L, d, -1, list, g, Math.max(n1Var.i(), t.c()), false, e, null, null, a2, n1Var.h(), n1Var.j(), Collections.unmodifiableList(new ArrayList(n1Var.k())), n1Var.f(), str, l, null, t.d(), (String) Collections.max(Arrays.asList(new String[]{null, t.a()}), o2.a), n1Var.b(), n1Var.n(), n1Var.m(), t.b().a(), n1Var.p(), n1Var.q());
    }
}
