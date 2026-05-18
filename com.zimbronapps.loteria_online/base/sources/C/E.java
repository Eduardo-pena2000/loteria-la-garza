package C;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.H;
import b0.b1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e {
    public static final b1 a = H.i(a.a);
    public static final d b = new b();

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public static final a a = new a();

        public a() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(b0.E e) {
            return !((Context) e.c(AndroidCompositionLocals_androidKt.g())).getPackageManager().hasSystemFeature("android.software.leanback") ? d.a.b() : e.b();
        }
    }

    public static final class b implements d {
        public final float c;
        public final float b = 0.3f;
        public final z.i d = z.j.j(125, 0, new z.x(0.25f, 0.1f, 0.25f, 1.0f), 2, null);

        public float a(float f, float f2, float f3) {
            float abs = Math.abs((f2 + f) - f);
            boolean z = abs <= f3;
            float f4 = (this.b * f3) - (this.c * abs);
            float f5 = f3 - f4;
            if (z && f5 < abs) {
                f4 = f3 - abs;
            }
            return f - f4;
        }

        public z.i b() {
            return this.d;
        }
    }

    public static final b1 a() {
        return a;
    }

    public static final d b() {
        return b;
    }
}
