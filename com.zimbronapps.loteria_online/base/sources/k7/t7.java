package k7;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class t7 {
    public final q3 a;

    public t7(q3 q3Var) {
        this.a = q3Var;
    }

    public final void a() {
        q3 q3Var = this.a;
        q3Var.b().h();
        if (e()) {
            if (d()) {
                q3Var.x().x.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                q3Var.B().t("auto", "_cmpx", bundle);
            } else {
                String a = q3Var.x().x.a();
                if (TextUtils.isEmpty(a)) {
                    q3Var.a().p().a("Cache still valid but referrer not found");
                } else {
                    long a2 = q3Var.x().y.a() / 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (a2 - 1) * 3600000);
                    Object obj = pair.first;
                    q3Var.B().t(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                q3Var.x().x.b(null);
            }
            q3Var.x().y.b(0L);
        }
    }

    public final void b(String str, Bundle bundle) {
        CharSequence uri;
        q3 q3Var = this.a;
        q3Var.b().h();
        if (q3Var.g()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        q3Var.x().x.b(uri);
        q3Var.x().y.b(q3Var.e().a());
    }

    public final void c() {
        if (e() && d()) {
            this.a.x().x.b(null);
        }
    }

    public final boolean d() {
        if (!e()) {
            return false;
        }
        q3 q3Var = this.a;
        return q3Var.e().a() - q3Var.x().y.a() > q3Var.w().D(null, f2.k0);
    }

    public final boolean e() {
        return this.a.x().y.a() > 0;
    }
}
