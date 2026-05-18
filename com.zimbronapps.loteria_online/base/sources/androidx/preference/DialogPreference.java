package androidx.preference;

import J1.k;
import X3.c;
import X3.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class DialogPreference extends Preference {
    public CharSequence D;
    public CharSequence E;
    public Drawable F;
    public CharSequence G;
    public CharSequence H;
    public int I;

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.i, i, i2);
        String m = k.m(obtainStyledAttributes, g.s, g.j);
        this.D = m;
        if (m == null) {
            this.D = o();
        }
        this.E = k.m(obtainStyledAttributes, g.r, g.k);
        this.F = k.c(obtainStyledAttributes, g.p, g.l);
        this.G = k.m(obtainStyledAttributes, g.u, g.m);
        this.H = k.m(obtainStyledAttributes, g.t, g.n);
        this.I = k.l(obtainStyledAttributes, g.q, g.o, 0);
        obtainStyledAttributes.recycle();
    }

    public void u() {
        l();
        throw null;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.b, 16842897));
    }
}
