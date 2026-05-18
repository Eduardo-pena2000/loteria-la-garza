package com.yalantis.ucrop.view;

import G9.b;
import G9.c;
import G9.i;
import H9.d;
import K9.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class OverlayView extends View {
    public d A;
    public boolean B;
    public final RectF a;
    public final RectF b;
    public int c;
    public int d;
    public float[] e;
    public float[] f;
    public int g;
    public int h;
    public float i;
    public float[] j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public Path o;
    public Paint p;
    public Paint q;
    public Paint r;
    public Paint s;
    public int t;
    public float u;
    public float v;
    public int w;
    public int x;
    public int y;
    public int z;

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(Canvas canvas) {
        if (this.l) {
            if (this.j == null && !this.a.isEmpty()) {
                this.j = new float[(this.g * 4) + (this.h * 4)];
                int i = 0;
                for (int i2 = 0; i2 < this.g; i2++) {
                    float[] fArr = this.j;
                    RectF rectF = this.a;
                    fArr[i] = rectF.left;
                    float f = i2 + 1.0f;
                    float height = rectF.height() * (f / (this.g + 1));
                    RectF rectF2 = this.a;
                    fArr[i + 1] = height + rectF2.top;
                    float[] fArr2 = this.j;
                    int i3 = i + 3;
                    fArr2[i + 2] = rectF2.right;
                    i += 4;
                    fArr2[i3] = (rectF2.height() * (f / (this.g + 1))) + this.a.top;
                }
                for (int i4 = 0; i4 < this.h; i4++) {
                    float[] fArr3 = this.j;
                    float f2 = i4 + 1.0f;
                    float width = this.a.width() * (f2 / (this.h + 1));
                    RectF rectF3 = this.a;
                    fArr3[i] = width + rectF3.left;
                    float[] fArr4 = this.j;
                    fArr4[i + 1] = rectF3.top;
                    int i5 = i + 3;
                    float width2 = rectF3.width() * (f2 / (this.h + 1));
                    RectF rectF4 = this.a;
                    fArr4[i + 2] = width2 + rectF4.left;
                    i += 4;
                    this.j[i5] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.j;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.q);
            }
        }
        if (this.k) {
            canvas.drawRect(this.a, this.r);
        }
        if (this.t != 0) {
            canvas.save();
            this.b.set(this.a);
            this.b.inset(this.z, -r1);
            RectF rectF5 = this.b;
            Region.Op op = Region.Op.DIFFERENCE;
            canvas.clipRect(rectF5, op);
            this.b.set(this.a);
            this.b.inset(-r2, this.z);
            canvas.clipRect(this.b, op);
            canvas.drawRect(this.a, this.s);
            canvas.restore();
        }
    }

    public void b(Canvas canvas) {
        canvas.save();
        if (this.m) {
            canvas.clipPath(this.o, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.a, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.n);
        canvas.restore();
        if (this.m) {
            canvas.drawCircle(this.a.centerX(), this.a.centerY(), Math.min(this.a.width(), this.a.height()) / 2.0f, this.p);
        }
    }

    public final int c(float f, float f2) {
        double d = this.x;
        int i = -1;
        for (int i2 = 0; i2 < 8; i2 += 2) {
            double sqrt = Math.sqrt(Math.pow(f - this.e[i2], 2.0d) + Math.pow(f2 - this.e[i2 + 1], 2.0d));
            if (sqrt < d) {
                i = i2 / 2;
                d = sqrt;
            }
        }
        if (this.t == 1 && i < 0 && this.a.contains(f, f2)) {
            return 4;
        }
        return i;
    }

    public void d() {
    }

    public final void e(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(i.h0, getResources().getDimensionPixelSize(c.a));
        int color = typedArray.getColor(i.g0, getResources().getColor(b.c));
        this.r.setStrokeWidth(dimensionPixelSize);
        this.r.setColor(color);
        Paint paint = this.r;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.s.setStrokeWidth(dimensionPixelSize * 3);
        this.s.setColor(color);
        this.s.setStyle(style);
    }

    public final void f(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(i.l0, getResources().getDimensionPixelSize(c.b));
        int color = typedArray.getColor(i.i0, getResources().getColor(b.d));
        this.q.setStrokeWidth(dimensionPixelSize);
        this.q.setColor(color);
        this.g = typedArray.getInt(i.k0, 2);
        this.h = typedArray.getInt(i.j0, 2);
    }

    public void g(TypedArray typedArray) {
        this.m = typedArray.getBoolean(i.e0, false);
        int color = typedArray.getColor(i.f0, getResources().getColor(b.e));
        this.n = color;
        this.p.setColor(color);
        this.p.setStyle(Paint.Style.STROKE);
        this.p.setStrokeWidth(1.0f);
        e(typedArray);
        this.k = typedArray.getBoolean(i.m0, true);
        f(typedArray);
        this.l = typedArray.getBoolean(i.n0, true);
    }

    public RectF getCropViewRect() {
        return this.a;
    }

    public int getFreestyleCropMode() {
        return this.t;
    }

    public d getOverlayViewChangeListener() {
        return this.A;
    }

    public void h() {
        int i = this.c;
        float f = this.i;
        int i2 = (int) (i / f);
        int i3 = this.d;
        if (i2 > i3) {
            int i4 = (i - ((int) (i3 * f))) / 2;
            this.a.set(getPaddingLeft() + i4, getPaddingTop(), getPaddingLeft() + r1 + i4, getPaddingTop() + this.d);
        } else {
            int i5 = (i3 - i2) / 2;
            this.a.set(getPaddingLeft(), getPaddingTop() + i5, getPaddingLeft() + this.c, getPaddingTop() + i2 + i5);
        }
        d dVar = this.A;
        if (dVar != null) {
            dVar.a(this.a);
        }
        j();
    }

    public final void i(float f, float f2) {
        this.b.set(this.a);
        int i = this.w;
        if (i == 0) {
            RectF rectF = this.b;
            RectF rectF2 = this.a;
            rectF.set(f, f2, rectF2.right, rectF2.bottom);
        } else if (i == 1) {
            RectF rectF3 = this.b;
            RectF rectF4 = this.a;
            rectF3.set(rectF4.left, f2, f, rectF4.bottom);
        } else if (i == 2) {
            RectF rectF5 = this.b;
            RectF rectF6 = this.a;
            rectF5.set(rectF6.left, rectF6.top, f, f2);
        } else if (i == 3) {
            RectF rectF7 = this.b;
            RectF rectF8 = this.a;
            rectF7.set(f, rectF8.top, rectF8.right, f2);
        } else if (i == 4) {
            this.b.offset(f - this.u, f2 - this.v);
            if (this.b.left <= getLeft() || this.b.top <= getTop() || this.b.right >= getRight() || this.b.bottom >= getBottom()) {
                return;
            }
            this.a.set(this.b);
            j();
            postInvalidate();
            return;
        }
        boolean z = this.b.height() >= ((float) this.y);
        boolean z2 = this.b.width() >= ((float) this.y);
        RectF rectF9 = this.a;
        rectF9.set(z2 ? this.b.left : rectF9.left, z ? this.b.top : rectF9.top, z2 ? this.b.right : rectF9.right, z ? this.b.bottom : rectF9.bottom);
        if (z || z2) {
            j();
            postInvalidate();
        }
    }

    public final void j() {
        this.e = g.b(this.a);
        this.f = g.a(this.a);
        this.j = null;
        this.o.reset();
        this.o.addCircle(this.a.centerX(), this.a.centerY(), Math.min(this.a.width(), this.a.height()) / 2.0f, Path.Direction.CW);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b(canvas);
        a(canvas);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.c = width - paddingLeft;
            this.d = height - paddingTop;
            if (this.B) {
                this.B = false;
                setTargetAspectRatio(this.i);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.a.isEmpty() && this.t != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int c = c(x, y);
                this.w = c;
                boolean z = c != -1;
                if (!z) {
                    this.u = -1.0f;
                    this.v = -1.0f;
                } else if (this.u < 0.0f) {
                    this.u = x;
                    this.v = y;
                }
                return z;
            }
            if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.w != -1) {
                float min = Math.min(Math.max(x, getPaddingLeft()), getWidth() - getPaddingRight());
                float min2 = Math.min(Math.max(y, getPaddingTop()), getHeight() - getPaddingBottom());
                i(min, min2);
                this.u = min;
                this.v = min2;
                return true;
            }
            if ((motionEvent.getAction() & 255) == 1) {
                this.u = -1.0f;
                this.v = -1.0f;
                this.w = -1;
                d dVar = this.A;
                if (dVar != null) {
                    dVar.a(this.a);
                }
            }
        }
        return false;
    }

    public void setCircleDimmedLayer(boolean z) {
        this.m = z;
    }

    public void setCropFrameColor(int i) {
        this.r.setColor(i);
    }

    public void setCropFrameStrokeWidth(int i) {
        this.r.setStrokeWidth(i);
    }

    public void setCropGridColor(int i) {
        this.q.setColor(i);
    }

    public void setCropGridColumnCount(int i) {
        this.h = i;
        this.j = null;
    }

    public void setCropGridRowCount(int i) {
        this.g = i;
        this.j = null;
    }

    public void setCropGridStrokeWidth(int i) {
        this.q.setStrokeWidth(i);
    }

    public void setDimmedColor(int i) {
        this.n = i;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z) {
        this.t = z ? 1 : 0;
    }

    public void setFreestyleCropMode(int i) {
        this.t = i;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(d dVar) {
        this.A = dVar;
    }

    public void setShowCropFrame(boolean z) {
        this.k = z;
    }

    public void setShowCropGrid(boolean z) {
        this.l = z;
    }

    public void setTargetAspectRatio(float f) {
        this.i = f;
        if (this.c <= 0) {
            this.B = true;
        } else {
            h();
            postInvalidate();
        }
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new RectF();
        this.b = new RectF();
        this.j = null;
        this.o = new Path();
        this.p = new Paint(1);
        this.q = new Paint(1);
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.t = 0;
        this.u = -1.0f;
        this.v = -1.0f;
        this.w = -1;
        this.x = getResources().getDimensionPixelSize(c.d);
        this.y = getResources().getDimensionPixelSize(c.e);
        this.z = getResources().getDimensionPixelSize(c.c);
        d();
    }
}
