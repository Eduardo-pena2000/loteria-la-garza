package A4;

import C4.a;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface f {
    public static final a a = a.a;

    public static final class a {
        public static final boolean b = false;
        public static final /* synthetic */ a a = new a();
        public static final String c = P.b(f.class).e();
        public static final Ca.l d = Ca.m.b(a.a);
        public static g e = b.a;

        public static final class a extends u implements Qa.a {
            public static final a a = new a();

            public a() {
                super(0);
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final B4.a invoke() {
                WindowLayoutComponent g;
                try {
                    ClassLoader classLoader = f.class.getClassLoader();
                    e eVar = classLoader != null ? new e(classLoader, new w4.d(classLoader)) : null;
                    if (eVar == null || (g = eVar.g()) == null) {
                        return null;
                    }
                    a.a aVar = C4.a.a;
                    t.f(classLoader, "loader");
                    return aVar.a(g, new w4.d(classLoader));
                } catch (Throwable unused) {
                    if (!a.a()) {
                        return null;
                    }
                    Log.d(a.b(), "Failed to load WindowExtensions");
                    return null;
                }
            }
        }

        public static final /* synthetic */ boolean a() {
            return b;
        }

        public static final /* synthetic */ String b() {
            return c;
        }

        public final B4.a c() {
            return (B4.a) d.getValue();
        }

        public final f d(Context context) {
            t.g(context, "context");
            B4.a c2 = c();
            if (c2 == null) {
                c2 = androidx.window.layout.adapter.sidecar.b.c.a(context);
            }
            return e.a(new i(n.b, c2));
        }
    }

    fb.e a(Activity activity);

    fb.e b(Context context);
}
