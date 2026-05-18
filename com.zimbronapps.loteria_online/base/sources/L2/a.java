package l2;

import T1.f0;
import android.view.View;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public static final int a = d.b;
    public static final int b = d.a;

    public static final void a(View view, b bVar) {
        t.g(view, "<this>");
        t.g(bVar, "listener");
        b(view).a(bVar);
    }

    public static final c b(View view) {
        int i = a;
        c cVar = (c) view.getTag(i);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        view.setTag(i, cVar2);
        return cVar2;
    }

    public static final boolean c(View view) {
        t.g(view, "<this>");
        Object tag = view.getTag(b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(View view) {
        t.g(view, "<this>");
        for (View view2 : f0.a(view)) {
            if ((view2 instanceof View) && c(view2)) {
                return true;
            }
        }
        return false;
    }

    public static final void e(View view, b bVar) {
        t.g(view, "<this>");
        t.g(bVar, "listener");
        b(view).b(bVar);
    }
}
