package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a extends c {
    public int j;
    public int k;
    public B1.a l;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.l = new B1.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, E1.d.V0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == E1.d.c1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == E1.d.b1) {
                    this.l.C1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == E1.d.d1) {
                    this.l.E1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.d = this.l;
        m();
    }

    public boolean getAllowsGoneWidget() {
        return this.l.x1();
    }

    public int getMargin() {
        return this.l.z1();
    }

    public int getType() {
        return this.j;
    }

    public void h(B1.e eVar, boolean z) {
        n(eVar, this.j, z);
    }

    public final void n(B1.e eVar, int i, boolean z) {
        this.k = i;
        if (z) {
            int i2 = this.j;
            if (i2 == 5) {
                this.k = 1;
            } else if (i2 == 6) {
                this.k = 0;
            }
        } else {
            int i3 = this.j;
            if (i3 == 5) {
                this.k = 0;
            } else if (i3 == 6) {
                this.k = 1;
            }
        }
        if (eVar instanceof B1.a) {
            ((B1.a) eVar).D1(this.k);
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.l.C1(z);
    }

    public void setDpMargin(int i) {
        this.l.E1((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.l.E1(i);
    }

    public void setType(int i) {
        this.j = i;
    }
}
