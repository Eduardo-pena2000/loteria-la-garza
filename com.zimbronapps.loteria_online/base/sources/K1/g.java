package K1;

import J1.e;
import J1.h;
import Q1.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.List;
import w.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class g {
    public static final m a;
    public static final z b;

    public static class a extends l.c {
        public h.e a;

        public a(h.e eVar) {
            this.a = eVar;
        }

        public void a(int i) {
            h.e eVar = this.a;
            if (eVar != null) {
                eVar.h(i);
            }
        }

        public void b(Typeface typeface) {
            h.e eVar = this.a;
            if (eVar != null) {
                eVar.i(typeface);
            }
        }
    }

    static {
        p4.a.c("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new l();
        } else if (i >= 28) {
            a = new k();
        } else if (i >= 26) {
            a = new j();
        } else if (i.k()) {
            a = new i();
        } else {
            a = new h();
        }
        b = new z(16);
        p4.a.f();
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, l.b[] bVarArr, int i) {
        p4.a.c("TypefaceCompat.createFromFontInfo");
        try {
            return a.b(context, cancellationSignal, bVarArr, i);
        } finally {
            p4.a.f();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i) {
        p4.a.c("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return a.c(context, cancellationSignal, list, i);
        } finally {
            p4.a.f();
        }
    }

    public static Typeface d(Context context, e.b bVar, Resources resources, int i, String str, int i2, int i3, h.e eVar, Handler handler, boolean z) {
        Typeface a2;
        if (bVar instanceof e.e) {
            e.e eVar2 = (e.e) bVar;
            Typeface h = h(eVar2.d());
            if (h != null) {
                if (eVar != null) {
                    eVar.d(h, handler);
                }
                return h;
            }
            a2 = Q1.l.d(context, eVar2.a() != null ? d.a(eVar2.c(), eVar2.a()) : e.a(eVar2.c()), i3, !z ? eVar != null : eVar2.b() != 0, z ? eVar2.e() : -1, h.e.e(handler), new a(eVar));
        } else {
            a2 = a.a(context, (e.c) bVar, resources, i3);
            if (eVar != null) {
                if (a2 != null) {
                    eVar.d(a2, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (a2 != null) {
            b.put(f(resources, i, str, i2, i3), a2);
        }
        return a2;
    }

    public static Typeface e(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface e = a.e(context, resources, i, str, i3);
        if (e != null) {
            b.put(f(resources, i, str, i2, i3), e);
        }
        return e;
    }

    public static String f(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface g(Resources resources, int i, String str, int i2, int i3) {
        return (Typeface) b.get(f(resources, i, str, i2, i3));
    }

    public static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
