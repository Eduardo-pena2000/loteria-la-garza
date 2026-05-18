package J9;

import I9.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import xb.J;
import xb.g;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class b extends AsyncTask {
    public final WeakReference a;
    public Uri b;
    public Uri c;
    public final int d;
    public final int e;
    public final H9.b f;

    public b(Context context, Uri uri, Uri uri2, int i, int i2, H9.b bVar) {
        this.a = new WeakReference(context);
        this.b = uri;
        this.c = uri2;
        this.d = i;
        this.e = i2;
        this.f = bVar;
    }

    public final boolean a(Bitmap bitmap, BitmapFactory.Options options) {
        if ((bitmap != null ? bitmap.getByteCount() : 0) <= 104857600) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    public final void b(Uri uri, Uri uri2) {
        InputStream inputStream;
        Log.d("BitmapWorkerTask", "copyFile");
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot copy image");
        }
        Context context = (Context) this.a.get();
        try {
            inputStream = context.getContentResolver().openInputStream(uri);
            try {
                if (inputStream == null) {
                    throw new NullPointerException("InputStream for given input Uri is null");
                }
                Closeable openOutputStream = e(uri2) ? context.getContentResolver().openOutputStream(uri2) : new FileOutputStream(new File(uri2.getPath()));
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        K9.a.c(openOutputStream);
                        K9.a.c(inputStream);
                        this.b = this.c;
                        return;
                    }
                    openOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th) {
                th = th;
                K9.a.c(null);
                K9.a.c(inputStream);
                this.b = this.c;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a doInBackground(Void... voidArr) {
        InputStream openInputStream;
        Context context = (Context) this.a.get();
        if (context == null) {
            return new a(new NullPointerException("context is null"));
        }
        if (this.b == null) {
            return new a(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            i();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inSampleSize = K9.a.a(options, this.d, this.e);
            boolean z = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmap = null;
            while (!z) {
                try {
                    openInputStream = context.getContentResolver().openInputStream(this.b);
                    try {
                        bitmap = BitmapFactory.decodeStream(openInputStream, (Rect) null, options);
                    } finally {
                        K9.a.c(openInputStream);
                    }
                } catch (OutOfMemoryError e) {
                    Log.e("BitmapWorkerTask", "doInBackground: BitmapFactory.decodeFileDescriptor: ", e);
                    options.inSampleSize *= 2;
                } catch (IOException e2) {
                    Log.e("BitmapWorkerTask", "doInBackground: ImageDecoder.createSource: ", e2);
                    return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.b + "]", e2));
                }
                if (options.outWidth == -1 || options.outHeight == -1) {
                    return new a(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.b + "]"));
                }
                K9.a.c(openInputStream);
                if (!a(bitmap, options)) {
                    z = true;
                }
            }
            if (bitmap == null) {
                return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.b + "]"));
            }
            int g = K9.a.g(context, this.b);
            int e3 = K9.a.e(g);
            int f = K9.a.f(g);
            c cVar = new c(g, e3, f);
            Matrix matrix = new Matrix();
            if (e3 != 0) {
                matrix.preRotate(e3);
            }
            if (f != 1) {
                matrix.postScale(f, 1.0f);
            }
            return !matrix.isIdentity() ? new a(K9.a.i(bitmap, matrix), cVar) : new a(bitmap, cVar);
        } catch (IOException | NullPointerException e4) {
            return new a(e4);
        }
    }

    public final void d(Uri uri, Uri uri2) {
        Closeable closeable;
        Response response;
        g d;
        Log.d("BitmapWorkerTask", "downloadFile");
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot download image");
        }
        Context context = (Context) this.a.get();
        if (context == null) {
            throw new NullPointerException("Context is null");
        }
        OkHttpClient a2 = G9.a.b.a();
        g gVar = null;
        try {
            Response execute = a2.a(new Request.Builder().p(uri.toString()).b()).execute();
            try {
                d = execute.a().d();
            } catch (Throwable th) {
                th = th;
                response = execute;
                closeable = null;
            }
            try {
                OutputStream openOutputStream = e(this.c) ? context.getContentResolver().openOutputStream(uri2) : new FileOutputStream(new File(uri2.getPath()));
                if (openOutputStream == null) {
                    throw new NullPointerException("OutputStream for given output Uri is null");
                }
                J g = x.g(openOutputStream);
                d.m1(g);
                K9.a.c(d);
                K9.a.c(g);
                K9.a.c(execute.a());
                a2.n().a();
                this.b = this.c;
            } catch (Throwable th2) {
                th = th2;
                response = execute;
                closeable = null;
                gVar = d;
                K9.a.c(gVar);
                K9.a.c(closeable);
                if (response != null) {
                    K9.a.c(response.a());
                }
                a2.n().a();
                this.b = this.c;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            response = null;
        }
    }

    public final boolean e(Uri uri) {
        return uri.getScheme().equals("content");
    }

    public final boolean f(Uri uri) {
        String scheme = uri.getScheme();
        return scheme.equals("http") || scheme.equals("https");
    }

    public final boolean g(Uri uri) {
        return uri.getScheme().equals("file");
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(a aVar) {
        Exception exc = aVar.c;
        if (exc == null) {
            this.f.a(aVar.a, aVar.b, this.b, this.c);
        } else {
            this.f.onFailure(exc);
        }
    }

    public final void i() {
        Log.d("BitmapWorkerTask", "Uri scheme: " + this.b.getScheme());
        if (f(this.b)) {
            try {
                d(this.b, this.c);
                return;
            } catch (NullPointerException | IOException e) {
                Log.e("BitmapWorkerTask", "Downloading failed", e);
                throw e;
            }
        }
        if (e(this.b)) {
            try {
                b(this.b, this.c);
                return;
            } catch (IOException | NullPointerException e2) {
                Log.e("BitmapWorkerTask", "Copying failed", e2);
                throw e2;
            }
        }
        if (g(this.b)) {
            return;
        }
        String scheme = this.b.getScheme();
        Log.e("BitmapWorkerTask", "Invalid Uri scheme " + scheme);
        throw new IllegalArgumentException("Invalid Uri scheme" + scheme);
    }

    public static class a {
        public Bitmap a;
        public c b;
        public Exception c;

        public a(Bitmap bitmap, c cVar) {
            this.a = bitmap;
            this.b = cVar;
        }

        public a(Exception exc) {
            this.c = exc;
        }
    }
}
