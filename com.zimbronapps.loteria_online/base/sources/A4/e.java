package A4;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e {
    public final ClassLoader a;
    public final w4.d b;
    public final v4.a c;

    public static final class a extends u implements Qa.a {
        public a() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke() {
            /*
                r5 = this;
                A4.e r0 = A4.e.this
                java.lang.Class r0 = A4.e.b(r0)
                java.lang.String r1 = "getBounds"
                r2 = 0
                java.lang.reflect.Method r1 = r0.getMethod(r1, r2)
                java.lang.String r3 = "getType"
                java.lang.reflect.Method r3 = r0.getMethod(r3, r2)
                java.lang.String r4 = "getState"
                java.lang.reflect.Method r0 = r0.getMethod(r4, r2)
                F4.a r2 = F4.a.a
                java.lang.String r4 = "getBoundsMethod"
                kotlin.jvm.internal.t.f(r1, r4)
                java.lang.Class<android.graphics.Rect> r4 = android.graphics.Rect.class
                Xa.c r4 = kotlin.jvm.internal.P.b(r4)
                boolean r4 = r2.b(r1, r4)
                if (r4 == 0) goto L60
                boolean r1 = r2.d(r1)
                if (r1 == 0) goto L60
                java.lang.String r1 = "getTypeMethod"
                kotlin.jvm.internal.t.f(r3, r1)
                java.lang.Class r1 = java.lang.Integer.TYPE
                Xa.c r4 = kotlin.jvm.internal.P.b(r1)
                boolean r4 = r2.b(r3, r4)
                if (r4 == 0) goto L60
                boolean r3 = r2.d(r3)
                if (r3 == 0) goto L60
                java.lang.String r3 = "getStateMethod"
                kotlin.jvm.internal.t.f(r0, r3)
                Xa.c r1 = kotlin.jvm.internal.P.b(r1)
                boolean r1 = r2.b(r0, r1)
                if (r1 == 0) goto L60
                boolean r0 = r2.d(r0)
                if (r0 == 0) goto L60
                r0 = 1
                goto L61
            L60:
                r0 = 0
            L61:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: A4.e.a.invoke():java.lang.Boolean");
        }
    }

    public static final class b extends u implements Qa.a {
        public b() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke() {
            /*
                r4 = this;
                A4.e r0 = A4.e.this
                w4.d r0 = A4.e.a(r0)
                java.lang.Class r0 = r0.b()
                if (r0 != 0) goto Lf
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
            Lf:
                A4.e r1 = A4.e.this
                java.lang.Class r1 = A4.e.d(r1)
                java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
                java.lang.Class[] r2 = new java.lang.Class[]{r2, r0}
                java.lang.String r3 = "addWindowLayoutInfoListener"
                java.lang.reflect.Method r2 = r1.getMethod(r3, r2)
                java.lang.String r3 = "removeWindowLayoutInfoListener"
                java.lang.Class[] r0 = new java.lang.Class[]{r0}
                java.lang.reflect.Method r0 = r1.getMethod(r3, r0)
                F4.a r1 = F4.a.a
                java.lang.String r3 = "addListenerMethod"
                kotlin.jvm.internal.t.f(r2, r3)
                boolean r2 = r1.d(r2)
                if (r2 == 0) goto L45
                java.lang.String r2 = "removeListenerMethod"
                kotlin.jvm.internal.t.f(r0, r2)
                boolean r0 = r1.d(r0)
                if (r0 == 0) goto L45
                r0 = 1
                goto L46
            L45:
                r0 = 0
            L46:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: A4.e.b.invoke():java.lang.Boolean");
        }
    }

    public static final class c extends u implements Qa.a {
        public c() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke() {
            /*
                r4 = this;
                A4.e r0 = A4.e.this
                java.lang.Class r0 = A4.e.d(r0)
                java.lang.Class<android.content.Context> r1 = android.content.Context.class
                java.lang.Class<androidx.window.extensions.core.util.function.Consumer> r2 = androidx.window.extensions.core.util.function.Consumer.class
                java.lang.Class[] r1 = new java.lang.Class[]{r1, r2}
                java.lang.String r3 = "addWindowLayoutInfoListener"
                java.lang.reflect.Method r1 = r0.getMethod(r3, r1)
                java.lang.String r3 = "removeWindowLayoutInfoListener"
                java.lang.Class[] r2 = new java.lang.Class[]{r2}
                java.lang.reflect.Method r0 = r0.getMethod(r3, r2)
                F4.a r2 = F4.a.a
                java.lang.String r3 = "addListenerMethod"
                kotlin.jvm.internal.t.f(r1, r3)
                boolean r1 = r2.d(r1)
                if (r1 == 0) goto L38
                java.lang.String r1 = "removeListenerMethod"
                kotlin.jvm.internal.t.f(r0, r1)
                boolean r0 = r2.d(r0)
                if (r0 == 0) goto L38
                r0 = 1
                goto L39
            L38:
                r0 = 0
            L39:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: A4.e.c.invoke():java.lang.Boolean");
        }
    }

    public static final class d extends u implements Qa.a {
        public d() {
            super(0);
        }

        public final Boolean invoke() {
            Method method = e.c(e.this).c().getMethod("getWindowLayoutComponent", (Class[]) null);
            Class d = e.d(e.this);
            F4.a aVar = F4.a.a;
            t.f(method, "getWindowLayoutComponentMethod");
            return Boolean.valueOf(aVar.d(method) && aVar.c(method, d));
        }
    }

    public e(ClassLoader classLoader, w4.d dVar) {
        t.g(classLoader, "loader");
        t.g(dVar, "consumerAdapter");
        this.a = classLoader;
        this.b = dVar;
        this.c = new v4.a(classLoader);
    }

    public static final /* synthetic */ w4.d a(e eVar) {
        return eVar.b;
    }

    public static final /* synthetic */ Class b(e eVar) {
        return eVar.f();
    }

    public static final /* synthetic */ v4.a c(e eVar) {
        return eVar.c;
    }

    public static final /* synthetic */ Class d(e eVar) {
        return eVar.h();
    }

    public final boolean e() {
        if (!n()) {
            return false;
        }
        int a2 = w4.e.a.a();
        if (a2 == 1) {
            return i();
        }
        if (2 > a2 || a2 > Integer.MAX_VALUE) {
            return false;
        }
        return j();
    }

    public final Class f() {
        Class loadClass = this.a.loadClass("androidx.window.extensions.layout.FoldingFeature");
        t.f(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
        return loadClass;
    }

    public final WindowLayoutComponent g() {
        if (!e()) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public final Class h() {
        Class loadClass = this.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        t.f(loadClass, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
        return loadClass;
    }

    public final boolean i() {
        return l();
    }

    public final boolean j() {
        return i() && m();
    }

    public final boolean k() {
        return F4.a.e("FoldingFeature class is not valid", new a());
    }

    public final boolean l() {
        return F4.a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new b());
    }

    public final boolean m() {
        return F4.a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new c());
    }

    public final boolean n() {
        return this.c.f() && o() && k();
    }

    public final boolean o() {
        return F4.a.e("WindowExtensions#getWindowLayoutComponent is not valid", new d());
    }
}
