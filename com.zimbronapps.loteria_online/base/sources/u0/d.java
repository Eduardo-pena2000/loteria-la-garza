package U0;

import Ca.I;
import android.content.res.Resources;
import android.util.TypedValue;
import w.F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d {
    public final F a = new F(0, 1, null);

    public final void a() {
        synchronized (this) {
            this.a.h();
            I i = I.a;
        }
    }

    public final TypedValue b(Resources resources, int i) {
        TypedValue typedValue;
        synchronized (this) {
            typedValue = (TypedValue) this.a.c(i);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                this.a.o(i, typedValue);
            }
        }
        return typedValue;
    }
}
