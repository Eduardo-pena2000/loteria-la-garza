package L9;

import I9.c;
import K9.d;
import K9.g;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import q.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class b extends p {
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public Matrix g;
    public int h;
    public int i;
    public b j;
    public float[] k;
    public float[] l;
    public boolean m;
    public boolean n;
    public int o;
    public String p;
    public String q;
    public Uri r;
    public Uri s;
    public c t;

    public class a implements H9.b {
        public a() {
        }

        public void a(Bitmap bitmap, c cVar, Uri uri, Uri uri2) {
            b.c(b.this, uri);
            b.d(b.this, uri2);
            b.e(b.this, uri.getPath());
            b.f(b.this, uri2 != null ? uri2.getPath() : null);
            b.g(b.this, cVar);
            b bVar = b.this;
            bVar.m = true;
            bVar.setImageBitmap(bitmap);
        }

        public void onFailure(Exception exc) {
            Log.e("TransformImageView", "onFailure: setImageUri", exc);
            b bVar = b.this.j;
            if (bVar != null) {
                bVar.b(exc);
            }
        }
    }

    public interface b {
        void a();

        void b(Exception exc);

        void c(float f);

        void d(float f);
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new float[8];
        this.e = new float[2];
        this.f = new float[9];
        this.g = new Matrix();
        this.m = false;
        this.n = false;
        this.o = 0;
        k();
    }

    public static /* synthetic */ Uri c(b bVar, Uri uri) {
        bVar.r = uri;
        return uri;
    }

    public static /* synthetic */ Uri d(b bVar, Uri uri) {
        bVar.s = uri;
        return uri;
    }

    public static /* synthetic */ String e(b bVar, String str) {
        bVar.p = str;
        return str;
    }

    public static /* synthetic */ String f(b bVar, String str) {
        bVar.q = str;
        return str;
    }

    public static /* synthetic */ c g(b bVar, c cVar) {
        bVar.t = cVar;
        return cVar;
    }

    public float getCurrentAngle() {
        return h(this.g);
    }

    public float getCurrentScale() {
        return i(this.g);
    }

    public c getExifInfo() {
        return this.t;
    }

    public String getImageInputPath() {
        return this.p;
    }

    public Uri getImageInputUri() {
        return this.r;
    }

    public String getImageOutputPath() {
        return this.q;
    }

    public Uri getImageOutputUri() {
        return this.s;
    }

    public int getMaxBitmapSize() {
        if (this.o <= 0) {
            this.o = K9.a.b(getContext());
        }
        return this.o;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof d)) {
            return null;
        }
        return ((d) getDrawable()).a();
    }

    public float h(Matrix matrix) {
        return (float) (-(Math.atan2(j(matrix, 1), j(matrix, 0)) * 57.29577951308232d));
    }

    public float i(Matrix matrix) {
        return (float) Math.sqrt(Math.pow(j(matrix, 0), 2.0d) + Math.pow(j(matrix, 3), 2.0d));
    }

    public float j(Matrix matrix, int i) {
        matrix.getValues(this.f);
        return this.f[i];
    }

    public void k() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void l() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        Log.d("TransformImageView", String.format("Image size: [%d:%d]", new Object[]{Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)}));
        RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        this.k = g.b(rectF);
        this.l = g.a(rectF);
        this.n = true;
        b bVar = this.j;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void m(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.g.postRotate(f, f2, f3);
            setImageMatrix(this.g);
            b bVar = this.j;
            if (bVar != null) {
                bVar.d(h(this.g));
            }
        }
    }

    public void n(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.g.postScale(f, f, f2, f3);
            setImageMatrix(this.g);
            b bVar = this.j;
            if (bVar != null) {
                bVar.c(i(this.g));
            }
        }
    }

    public void o(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            return;
        }
        this.g.postTranslate(f, f2);
        setImageMatrix(this.g);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onLayout(z, i, i2, i3, i4);
        if (z || (this.m && !this.n)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.h = width - paddingLeft;
            this.i = height - paddingTop;
            l();
        }
    }

    public void p(Uri uri, Uri uri2) {
        int maxBitmapSize = getMaxBitmapSize();
        K9.a.d(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new a());
    }

    public final void q() {
        this.g.mapPoints(this.d, this.k);
        this.g.mapPoints(this.e, this.l);
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new d(bitmap));
    }

    public void setImageMatrix(Matrix matrix) {
        super/*android.widget.ImageView*/.setImageMatrix(matrix);
        this.g.set(matrix);
        q();
    }

    public void setMaxBitmapSize(int i) {
        this.o = i;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super/*android.widget.ImageView*/.setScaleType(scaleType);
        } else {
            Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(b bVar) {
        this.j = bVar;
    }
}
