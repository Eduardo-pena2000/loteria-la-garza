package androidx.compose.ui.platform;

import Ca.I;
import O0.o0;
import P0.X0;
import Qa.p;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class j extends View implements o0 {
    public static final c b = new c(null);
    public static final int c = 8;
    public static final p d = b.a;
    public static final ViewOutlineProvider e = new a();
    public static boolean f;
    public final X0 a;

    public static final class a extends ViewOutlineProvider {
        public void getOutline(View view, Outline outline) {
            t.e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline a = j.m((j) view).a();
            t.d(a);
            outline.set(a);
        }
    }

    public static final class b extends u implements p {
        public static final b a = new b();

        public b() {
            super(2);
        }

        public final void a(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, (Matrix) obj2);
            return I.a;
        }
    }

    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final boolean a() {
            return j.n();
        }

        public c() {
        }
    }

    public static final /* synthetic */ X0 m(j jVar) {
        return jVar.a;
    }

    public static final /* synthetic */ boolean n() {
        return f;
    }
}
