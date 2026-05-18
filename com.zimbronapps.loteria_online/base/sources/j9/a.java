package J9;

import I9.c;
import I9.d;
import K9.e;
import K9.f;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class a extends AsyncTask {
    public final WeakReference a;
    public Bitmap b;
    public final RectF c;
    public final RectF d;
    public float e;
    public float f;
    public final int g;
    public final int h;
    public final Bitmap.CompressFormat i;
    public final int j;
    public final String k;
    public final String l;
    public final Uri m;
    public final Uri n;
    public final c o;
    public final H9.a p;
    public int q;
    public int r;
    public int s;
    public int t;

    public a(Context context, Bitmap bitmap, d dVar, I9.b bVar, H9.a aVar) {
        this.a = new WeakReference(context);
        this.b = bitmap;
        this.c = dVar.a();
        this.d = dVar.c();
        this.e = dVar.d();
        this.f = dVar.b();
        this.g = bVar.h();
        this.h = bVar.i();
        this.i = bVar.a();
        this.j = bVar.b();
        this.k = bVar.f();
        this.l = bVar.g();
        this.m = bVar.c();
        this.n = bVar.d();
        this.o = bVar.e();
        this.p = aVar;
    }

    public final void a(Context context) {
        boolean h = K9.a.h(this.m);
        boolean h2 = K9.a.h(this.n);
        if (h && h2) {
            f.b(context, this.q, this.r, this.m, this.n);
            return;
        }
        if (h) {
            f.c(context, this.q, this.r, this.m, this.l);
        } else if (h2) {
            f.d(context, new w2.a(this.k), this.q, this.r, this.n);
        } else {
            f.e(new w2.a(this.k), this.q, this.r, this.l);
        }
    }

    public final boolean b() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return false;
        }
        if (this.g > 0 && this.h > 0) {
            float width = this.c.width() / this.e;
            float height = this.c.height() / this.e;
            int i = this.g;
            if (width > i || height > this.h) {
                float min = Math.min(i / width, this.h / height);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.b, Math.round(r3.getWidth() * min), Math.round(this.b.getHeight() * min), false);
                Bitmap bitmap = this.b;
                if (bitmap != createScaledBitmap) {
                    bitmap.recycle();
                }
                this.b = createScaledBitmap;
                this.e /= min;
            }
        }
        if (this.f != 0.0f) {
            Matrix matrix = new Matrix();
            matrix.setRotate(this.f, this.b.getWidth() / 2, this.b.getHeight() / 2);
            Bitmap bitmap2 = this.b;
            Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), this.b.getHeight(), matrix, true);
            Bitmap bitmap3 = this.b;
            if (bitmap3 != createBitmap) {
                bitmap3.recycle();
            }
            this.b = createBitmap;
        }
        this.s = Math.round((this.c.left - this.d.left) / this.e);
        this.t = Math.round((this.c.top - this.d.top) / this.e);
        this.q = Math.round(this.c.width() / this.e);
        int round = Math.round(this.c.height() / this.e);
        this.r = round;
        boolean f = f(this.q, round);
        Log.i("BitmapCropTask", "Should crop: " + f);
        if (!f) {
            e.a(context, this.m, this.n);
            return false;
        }
        e(Bitmap.createBitmap(this.b, this.s, this.t, this.q, this.r));
        if (!this.i.equals(Bitmap.CompressFormat.JPEG)) {
            return true;
        }
        a(context);
        return true;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Throwable doInBackground(Void... voidArr) {
        Bitmap bitmap = this.b;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.d.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        if (this.n == null) {
            return new NullPointerException("ImageOutputUri is null");
        }
        try {
            b();
            this.b = null;
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Throwable th) {
        H9.a aVar = this.p;
        if (aVar != null) {
            if (th == null) {
                this.p.a(K9.a.h(this.n) ? this.n : Uri.fromFile(new File(this.l)), this.s, this.t, this.q, this.r);
            } else {
                aVar.b(th);
            }
        }
    }

    public final void e(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        Closeable closeable = null;
        try {
            Closeable openOutputStream = context.getContentResolver().openOutputStream(this.n, "rwt");
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(this.i, this.j, byteArrayOutputStream);
                    openOutputStream.write(byteArrayOutputStream.toByteArray());
                    bitmap.recycle();
                    K9.a.c(openOutputStream);
                } catch (IOException e) {
                    e = e;
                    closeable = openOutputStream;
                    try {
                        Log.e("BitmapCropTask", e.getLocalizedMessage());
                        K9.a.c(closeable);
                        K9.a.c(byteArrayOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        K9.a.c(closeable);
                        K9.a.c(byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable = openOutputStream;
                    K9.a.c(closeable);
                    K9.a.c(byteArrayOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
        } catch (IOException e3) {
            e = e3;
            byteArrayOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
        K9.a.c(byteArrayOutputStream);
    }

    public final boolean f(int i, int i2) {
        int round = Math.round(Math.max(i, i2) / 1000.0f) + 1;
        if (this.g > 0 && this.h > 0) {
            return true;
        }
        float f = round;
        return Math.abs(this.c.left - this.d.left) > f || Math.abs(this.c.top - this.d.top) > f || Math.abs(this.c.bottom - this.d.bottom) > f || Math.abs(this.c.right - this.d.right) > f || this.f != 0.0f;
    }
}
