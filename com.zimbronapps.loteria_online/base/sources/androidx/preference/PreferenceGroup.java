package androidx.preference;

import J1.k;
import X3.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import w.i0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final i0 D;
    public final Handler E;
    public final List F;
    public boolean G;
    public int H;
    public boolean I;
    public int J;
    public final Runnable K;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            synchronized (this) {
                PreferenceGroup.this.D.clear();
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.D = new i0();
        this.E = new Handler(Looper.getMainLooper());
        this.G = true;
        this.H = 0;
        this.I = false;
        this.J = Integer.MAX_VALUE;
        this.K = new a();
        this.F = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.v0, i, i2);
        int i3 = g.x0;
        this.G = k.b(obtainStyledAttributes, i3, i3, true);
        if (obtainStyledAttributes.hasValue(g.w0)) {
            int i4 = g.w0;
            I(k.d(obtainStyledAttributes, i4, i4, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    public Preference G(int i) {
        return (Preference) this.F.get(i);
    }

    public int H() {
        return this.F.size();
    }

    public void I(int i) {
        if (i != Integer.MAX_VALUE && !p()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.J = i;
    }

    public void t(boolean z) {
        super.t(z);
        int H = H();
        for (int i = 0; i < H; i++) {
            G(i).x(this, z);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
