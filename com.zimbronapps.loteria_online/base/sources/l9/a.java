package L9;

import G9.i;
import H9.c;
import I9.d;
import K9.g;
import L9.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class a extends L9.b {
    public Runnable A;
    public float B;
    public float C;
    public int D;
    public int E;
    public long F;
    public final RectF u;
    public final Matrix v;
    public float w;
    public float x;
    public c y;
    public Runnable z;

    public static class a implements Runnable {
        public final WeakReference a;
        public final long b;
        public final long c = System.currentTimeMillis();
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;
        public final float i;
        public final boolean j;

        public a(a aVar, long j, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
            this.a = new WeakReference(aVar);
            this.b = j;
            this.d = f;
            this.e = f2;
            this.f = f3;
            this.g = f4;
            this.h = f5;
            this.i = f6;
            this.j = z;
        }

        public void run() {
            a aVar = (a) this.a.get();
            if (aVar == null) {
                return;
            }
            float min = Math.min(this.b, System.currentTimeMillis() - this.c);
            float b = K9.b.b(min, 0.0f, this.f, this.b);
            float b2 = K9.b.b(min, 0.0f, this.g, this.b);
            float a = K9.b.a(min, 0.0f, this.i, this.b);
            if (min < this.b) {
                float[] fArr = aVar.e;
                aVar.o(b - (fArr[0] - this.d), b2 - (fArr[1] - this.e));
                if (!this.j) {
                    aVar.F(this.h + a, a.r(aVar).centerX(), a.r(aVar).centerY());
                }
                if (aVar.x()) {
                    return;
                }
                aVar.post(this);
            }
        }
    }

    public static class b implements Runnable {
        public final WeakReference a;
        public final long b;
        public final long c = System.currentTimeMillis();
        public final float d;
        public final float e;
        public final float f;
        public final float g;

        public b(a aVar, long j, float f, float f2, float f3, float f4) {
            this.a = new WeakReference(aVar);
            this.b = j;
            this.d = f;
            this.e = f2;
            this.f = f3;
            this.g = f4;
        }

        public void run() {
            a aVar = (a) this.a.get();
            if (aVar == null) {
                return;
            }
            float min = Math.min(this.b, System.currentTimeMillis() - this.c);
            float a = K9.b.a(min, 0.0f, this.e, this.b);
            if (min >= this.b) {
                aVar.B();
            } else {
                aVar.F(this.d + a, this.f, this.g);
                aVar.post(this);
            }
        }
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = new RectF();
        this.v = new Matrix();
        this.x = 10.0f;
        this.A = null;
        this.D = 0;
        this.E = 0;
        this.F = 500L;
    }

    public static /* synthetic */ RectF r(a aVar) {
        return aVar.u;
    }

    public void A(TypedArray typedArray) {
        float abs = Math.abs(typedArray.getFloat(i.c0, 0.0f));
        float abs2 = Math.abs(typedArray.getFloat(i.d0, 0.0f));
        if (abs == 0.0f || abs2 == 0.0f) {
            this.w = 0.0f;
        } else {
            this.w = abs / abs2;
        }
    }

    public void B() {
        setImageToWrapCropBounds(true);
    }

    public final void C(float f, float f2) {
        float width = this.u.width();
        float height = this.u.height();
        float max = Math.max(this.u.width() / f, this.u.height() / f2);
        RectF rectF = this.u;
        float f3 = ((width - (f * max)) / 2.0f) + rectF.left;
        float f4 = ((height - (f2 * max)) / 2.0f) + rectF.top;
        this.g.reset();
        this.g.postScale(max, max);
        this.g.postTranslate(f3, f4);
        setImageMatrix(this.g);
    }

    public void D(float f, float f2, float f3, long j) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        float currentScale = getCurrentScale();
        b bVar = new b(this, j, currentScale, f - currentScale, f2, f3);
        this.A = bVar;
        post(bVar);
    }

    public void E(float f) {
        F(f, this.u.centerX(), this.u.centerY());
    }

    public void F(float f, float f2, float f3) {
        if (f <= getMaxScale()) {
            n(f / getCurrentScale(), f2, f3);
        }
    }

    public void G(float f) {
        H(f, this.u.centerX(), this.u.centerY());
    }

    public void H(float f, float f2, float f3) {
        if (f >= getMinScale()) {
            n(f / getCurrentScale(), f2, f3);
        }
    }

    public c getCropBoundsChangeListener() {
        return this.y;
    }

    public float getMaxScale() {
        return this.B;
    }

    public float getMinScale() {
        return this.C;
    }

    public float getTargetAspectRatio() {
        return this.w;
    }

    public void l() {
        super.l();
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        if (this.w == 0.0f) {
            this.w = intrinsicWidth / intrinsicHeight;
        }
        int i = this.h;
        float f = this.w;
        int i2 = (int) (i / f);
        int i3 = this.i;
        if (i2 > i3) {
            this.u.set((i - ((int) (i3 * f))) / 2, 0.0f, r4 + r2, i3);
        } else {
            this.u.set(0.0f, (i3 - i2) / 2, i, i2 + r6);
        }
        u(intrinsicWidth, intrinsicHeight);
        C(intrinsicWidth, intrinsicHeight);
        c cVar = this.y;
        if (cVar != null) {
            cVar.a(this.w);
        }
        b.b bVar = this.j;
        if (bVar != null) {
            bVar.c(getCurrentScale());
            this.j.d(getCurrentAngle());
        }
    }

    public void n(float f, float f2, float f3) {
        if (f > 1.0f && getCurrentScale() * f <= getMaxScale()) {
            super.n(f, f2, f3);
        } else {
            if (f >= 1.0f || getCurrentScale() * f < getMinScale()) {
                return;
            }
            super.n(f, f2, f3);
        }
    }

    public final float[] s() {
        this.v.reset();
        this.v.setRotate(-getCurrentAngle());
        float[] fArr = this.d;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        float[] b2 = g.b(this.u);
        this.v.mapPoints(copyOf);
        this.v.mapPoints(b2);
        RectF d = g.d(copyOf);
        RectF d2 = g.d(b2);
        float f = d.left - d2.left;
        float f2 = d.top - d2.top;
        float f3 = d.right - d2.right;
        float f4 = d.bottom - d2.bottom;
        if (f <= 0.0f) {
            f = 0.0f;
        }
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        }
        if (f3 >= 0.0f) {
            f3 = 0.0f;
        }
        if (f4 >= 0.0f) {
            f4 = 0.0f;
        }
        float[] fArr2 = {f, f2, f3, f4};
        this.v.reset();
        this.v.setRotate(getCurrentAngle());
        this.v.mapPoints(fArr2);
        return fArr2;
    }

    public void setCropBoundsChangeListener(c cVar) {
        this.y = cVar;
    }

    public void setCropRect(RectF rectF) {
        this.w = rectF.width() / rectF.height();
        this.u.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        t();
        B();
    }

    public void setImageToWrapCropBounds(boolean z) {
        float f;
        float max;
        float f2;
        if (!this.n || x()) {
            return;
        }
        float[] fArr = this.e;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float currentScale = getCurrentScale();
        float centerX = this.u.centerX() - f3;
        float centerY = this.u.centerY() - f4;
        this.v.reset();
        this.v.setTranslate(centerX, centerY);
        float[] fArr2 = this.d;
        float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
        this.v.mapPoints(copyOf);
        boolean y = y(copyOf);
        if (y) {
            float[] s = s();
            float f5 = -(s[0] + s[2]);
            f2 = -(s[1] + s[3]);
            f = f5;
            max = 0.0f;
        } else {
            RectF rectF = new RectF(this.u);
            this.v.reset();
            this.v.setRotate(getCurrentAngle());
            this.v.mapRect(rectF);
            float[] c = g.c(this.d);
            f = centerX;
            max = (Math.max(rectF.width() / c[0], rectF.height() / c[1]) * currentScale) - currentScale;
            f2 = centerY;
        }
        if (z) {
            a aVar = new a(this, this.F, f3, f4, f, f2, currentScale, max, y);
            this.z = aVar;
            post(aVar);
        } else {
            o(f, f2);
            if (y) {
                return;
            }
            F(currentScale + max, this.u.centerX(), this.u.centerY());
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("Animation duration cannot be negative value.");
        }
        this.F = j;
    }

    public void setMaxResultImageSizeX(int i) {
        this.D = i;
    }

    public void setMaxResultImageSizeY(int i) {
        this.E = i;
    }

    public void setMaxScaleMultiplier(float f) {
        this.x = f;
    }

    public void setTargetAspectRatio(float f) {
        if (getDrawable() == null) {
            this.w = f;
            return;
        }
        if (f == 0.0f) {
            this.w = r0.getIntrinsicWidth() / r0.getIntrinsicHeight();
        } else {
            this.w = f;
        }
        c cVar = this.y;
        if (cVar != null) {
            cVar.a(this.w);
        }
    }

    public final void t() {
        if (getDrawable() == null) {
            return;
        }
        u(r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
    }

    public final void u(float f, float f2) {
        float min = Math.min(Math.min(this.u.width() / f, this.u.width() / f2), Math.min(this.u.height() / f2, this.u.height() / f));
        this.C = min;
        this.B = min * this.x;
    }

    public void v() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
    }

    public void w(Bitmap.CompressFormat compressFormat, int i, H9.a aVar) {
        v();
        setImageToWrapCropBounds(false);
        d dVar = new d(this.u, g.d(this.d), getCurrentScale(), getCurrentAngle());
        I9.b bVar = new I9.b(this.D, this.E, compressFormat, i, getImageInputPath(), getImageOutputPath(), getExifInfo());
        bVar.j(getImageInputUri());
        bVar.k(getImageOutputUri());
        new J9.a(getContext(), getViewBitmap(), dVar, bVar, aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public boolean x() {
        return y(this.d);
    }

    public boolean y(float[] fArr) {
        this.v.reset();
        this.v.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        this.v.mapPoints(copyOf);
        float[] b2 = g.b(this.u);
        this.v.mapPoints(b2);
        return g.d(copyOf).contains(g.d(b2));
    }

    public void z(float f) {
        m(f, this.u.centerX(), this.u.centerY());
    }
}
