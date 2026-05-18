package P8;

import S8.f;
import S8.h;
import V8.e;
import V8.g;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class c {
    public boolean a;

    public String a() {
        return "1.4.9-Unity3d";
    }

    public void b(Context context) {
        d(context);
        if (e()) {
            return;
        }
        c(true);
        h.d().b(context);
        S8.b.k().b(context);
        V8.a.b(context);
        V8.c.d(context);
        e.c(context);
        f.c().b(context);
        S8.a.a().b(context);
    }

    public void c(boolean z) {
        this.a = z;
    }

    public final void d(Context context) {
        g.d(context, "Application Context cannot be null");
    }

    public boolean e() {
        return this.a;
    }
}
