package com.yalantis.ucrop.view.widget;

import G9.b;
import G9.c;
import G9.i;
import H1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.Locale;
import q.B;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class AspectRatioTextView extends B {
    public final float h;
    public final Rect i;
    public Paint j;
    public int k;
    public float l;
    public String m;
    public float n;
    public float o;

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.i);
            Rect rect = this.i;
            float f = (rect.right - rect.left) / 2.0f;
            float f2 = rect.bottom - (rect.top / 2.0f);
            int i = this.k;
            canvas.drawCircle(f, f2 - (i * 1.5f), i / 2.0f, this.j);
        }
    }

    public final void r(int i) {
        Paint paint = this.j;
        if (paint != null) {
            paint.setColor(i);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{16842913}, new int[]{0}}, new int[]{i, a.getColor(getContext(), b.k)}));
    }

    public float s(boolean z) {
        if (z) {
            v();
            u();
        }
        return this.l;
    }

    public void setActiveColor(int i) {
        r(i);
        invalidate();
    }

    public void setAspectRatio(I9.a aVar) {
        this.m = aVar.b();
        this.n = aVar.c();
        float d = aVar.d();
        this.o = d;
        float f = this.n;
        if (f == 0.0f || d == 0.0f) {
            this.l = 0.0f;
        } else {
            this.l = f / d;
        }
        u();
    }

    public final void t(TypedArray typedArray) {
        setGravity(1);
        this.m = typedArray.getString(i.Y);
        this.n = typedArray.getFloat(i.Z, 0.0f);
        float f = typedArray.getFloat(i.a0, 0.0f);
        this.o = f;
        float f2 = this.n;
        if (f2 == 0.0f || f == 0.0f) {
            this.l = 0.0f;
        } else {
            this.l = f2 / f;
        }
        this.k = getContext().getResources().getDimensionPixelSize(c.h);
        Paint paint = new Paint(1);
        this.j = paint;
        paint.setStyle(Paint.Style.FILL);
        u();
        r(getResources().getColor(b.l));
        typedArray.recycle();
    }

    public final void u() {
        if (TextUtils.isEmpty(this.m)) {
            setText(String.format(Locale.US, "%d:%d", new Object[]{Integer.valueOf((int) this.n), Integer.valueOf((int) this.o)}));
        } else {
            setText(this.m);
        }
    }

    public final void v() {
        if (this.l != 0.0f) {
            float f = this.n;
            float f2 = this.o;
            this.n = f2;
            this.o = f;
            this.l = f2 / f;
        }
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = 1.5f;
        this.i = new Rect();
        t(context.obtainStyledAttributes(attributeSet, i.X));
    }
}
