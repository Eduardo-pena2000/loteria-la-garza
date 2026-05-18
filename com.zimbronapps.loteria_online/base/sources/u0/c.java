package U0;

import B0.r;
import U0.b;
import Za.E;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.m;
import b0.w;
import kotlin.jvm.internal.t;
import v0.b1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c {
    public static final b1 a(CharSequence charSequence, Resources resources, int i) {
        try {
            return a.a(b1.a, resources, i);
        } catch (Exception e) {
            throw new e("Error attempting to load resource: " + charSequence, e);
        }
    }

    public static final B0.d b(Resources.Theme theme, Resources resources, int i, int i2, m mVar, int i3) {
        if (w.L()) {
            w.U(21855625, i3, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:87)");
        }
        b bVar = (b) mVar.x(AndroidCompositionLocals_androidKt.h());
        b.b bVar2 = new b.b(theme, i);
        b.a b = bVar.b(bVar2);
        if (b == null) {
            XmlResourceParser xml = resources.getXml(i);
            if (!t.c(C0.c.j(xml).getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            b = g.a(theme, resources, xml, i2);
            bVar.d(bVar2, b);
        }
        B0.d b2 = b.b();
        if (w.L()) {
            w.T();
        }
        return b2;
    }

    public static final A0.c c(int i, m mVar, int i2) {
        A0.c aVar;
        if (w.L()) {
            w.U(473971343, i2, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) mVar.x(AndroidCompositionLocals_androidKt.g());
        Resources resources = (Resources) mVar.x(AndroidCompositionLocals_androidKt.j());
        TypedValue b = ((d) mVar.x(AndroidCompositionLocals_androidKt.i())).b(resources, i);
        CharSequence charSequence = b.string;
        boolean z = true;
        if (charSequence == null || !E.X(charSequence, ".xml", false, 2, (Object) null)) {
            mVar.V(-1771631096);
            Object theme = context.getTheme();
            boolean U = mVar.U(charSequence);
            if ((((i2 & 14) ^ 6) <= 4 || !mVar.d(i)) && (i2 & 6) != 4) {
                z = false;
            }
            boolean U2 = U | z | mVar.U(theme);
            Object C = mVar.C();
            if (U2 || C == m.a.a()) {
                C = a(charSequence, resources, i);
                mVar.t(C);
            }
            aVar = new A0.a((b1) C, 0L, 0L, 6, null);
            mVar.P();
        } else {
            mVar.V(-1771786530);
            aVar = r.g(b(context.getTheme(), resources, i, b.changingConfigurations, mVar, (i2 << 6) & 896), mVar, 0);
            mVar.P();
        }
        if (w.L()) {
            w.T();
        }
        return aVar;
    }
}
