package D4;

import A4.c;
import A4.d;
import Da.v;
import Qa.l;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import w4.h;
import w4.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a {
    public static final a b = new a(null);
    public static final String c = a.class.getSimpleName();
    public final j a;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final int a(SidecarDeviceState sidecarDeviceState) {
            t.g(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    return sidecarDeviceState.posture;
                } catch (NoSuchFieldError unused) {
                    Object invoke = SidecarDeviceState.class.getMethod("getPosture", (Class[]) null).invoke(sidecarDeviceState, (Object[]) null);
                    t.e(invoke, "null cannot be cast to non-null type kotlin.Int");
                    return ((Integer) invoke).intValue();
                }
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException unused2) {
                return 0;
            }
        }

        public final int b(SidecarDeviceState sidecarDeviceState) {
            t.g(sidecarDeviceState, "sidecarDeviceState");
            int a = a(sidecarDeviceState);
            if (a < 0 || a > 4) {
                return 0;
            }
            return a;
        }

        public final List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            t.g(sidecarWindowLayoutInfo, "info");
            try {
                try {
                    List list = sidecarWindowLayoutInfo.displayFeatures;
                    return list == null ? v.n() : list;
                } catch (NoSuchFieldError unused) {
                    Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", (Class[]) null).invoke(sidecarWindowLayoutInfo, (Object[]) null);
                    t.e(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                    return (List) invoke;
                }
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException unused2) {
                return v.n();
            }
        }

        public final void d(SidecarDeviceState sidecarDeviceState, int i) {
            t.g(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", new Class[]{Integer.TYPE}).invoke(sidecarDeviceState, new Object[]{Integer.valueOf(i)});
                }
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException unused2) {
            }
        }

        public a() {
        }
    }

    public static final class b extends u implements l {
        public static final b a = new b();

        public b() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
            t.g(sidecarDisplayFeature, "$this$require");
            boolean z = true;
            if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class c extends u implements l {
        public static final c a = new c();

        public c() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
            t.g(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
        }
    }

    public static final class d extends u implements l {
        public static final d a = new d();

        public d() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
            t.g(sidecarDisplayFeature, "$this$require");
            boolean z = true;
            if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class e extends u implements l {
        public static final e a = new e();

        public e() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
            t.g(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
        }
    }

    public a(j jVar) {
        t.g(jVar, "verificationMode");
        this.a = jVar;
    }

    public final boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (t.c(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        a aVar = b;
        return aVar.b(sidecarDeviceState) == aVar.b(sidecarDeviceState2);
    }

    public final boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (t.c(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return t.c(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public final boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!b((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (t.c(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        a aVar = b;
        return c(aVar.c(sidecarWindowLayoutInfo), aVar.c(sidecarWindowLayoutInfo2));
    }

    public final A4.k e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        t.g(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new A4.k(v.n());
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        a aVar = b;
        aVar.d(sidecarDeviceState2, aVar.b(sidecarDeviceState));
        return new A4.k(f(aVar.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final List f(List list, SidecarDeviceState sidecarDeviceState) {
        t.g(list, "sidecarDisplayFeatures");
        t.g(sidecarDeviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A4.a g = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (g != null) {
                arrayList.add(g);
            }
        }
        return arrayList;
    }

    public final A4.a g(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        d.b a2;
        c.c cVar;
        t.g(sidecarDisplayFeature, "feature");
        t.g(sidecarDeviceState, "deviceState");
        h.a aVar = h.a;
        String str = c;
        t.f(str, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) h.a.b(aVar, sidecarDisplayFeature, str, this.a, null, 4, null).c("Type must be either TYPE_FOLD or TYPE_HINGE", b.a).c("Feature bounds must not be 0", c.a).c("TYPE_FOLD must have 0 area", d.a).c("Feature be pinned to either left or top", e.a).a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            a2 = d.b.b.a();
        } else {
            if (type != 2) {
                return null;
            }
            a2 = d.b.b.b();
        }
        int b2 = b.b(sidecarDeviceState);
        if (b2 == 0 || b2 == 1) {
            return null;
        }
        if (b2 == 2) {
            cVar = c.c.d;
        } else if (b2 == 3) {
            cVar = c.c.c;
        } else {
            if (b2 == 4) {
                return null;
            }
            cVar = c.c.c;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        t.f(rect, "feature.rect");
        return new A4.d(new w4.b(rect), a2, cVar);
    }

    public /* synthetic */ a(j jVar, int i, k kVar) {
        this((i & 1) != 0 ? j.c : jVar);
    }
}
