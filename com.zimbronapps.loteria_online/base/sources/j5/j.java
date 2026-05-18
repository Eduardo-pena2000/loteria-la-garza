package j5;

import Da.D;
import W4.a;
import Z4.b;
import Za.A;
import Za.E;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import f5.c;
import java.io.Closeable;
import java.io.File;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;
import v0.M;
import v0.N;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class j {
    public static final Bitmap.Config[] a;
    public static final Bitmap.Config b;
    public static final Headers c;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[V4.f.values().length];
            try {
                iArr[V4.f.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[V4.f.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[V4.f.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[V4.f.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
            int[] iArr3 = new int[f5.g.values().length];
            try {
                iArr3[f5.g.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[f5.g.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            c = iArr3;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        a = i >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, M.a()} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        b = i >= 26 ? N.a() : Bitmap.Config.ARGB_8888;
        c = new Headers.Builder().e();
    }

    public static final void a(a.b bVar) {
        try {
            bVar.abort();
        } catch (Exception unused) {
        }
    }

    public static final Headers.Builder b(Headers.Builder builder, String str) {
        int e0 = E.e0(str, ':', 0, false, 6, (Object) null);
        if (e0 == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String substring = str.substring(0, e0);
        kotlin.jvm.internal.t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String obj = E.j1(substring).toString();
        String substring2 = str.substring(e0 + 1);
        kotlin.jvm.internal.t.f(substring2, "this as java.lang.String).substring(startIndex)");
        builder.d(obj, substring2);
        return builder;
    }

    public static final int c(Context context, double d) {
        int i;
        try {
            Object systemService = H1.a.getSystemService(context, ActivityManager.class);
            kotlin.jvm.internal.t.d(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            i = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            i = 256;
        }
        double d2 = 1024;
        return (int) (d * i * d2 * d2);
    }

    public static final void d(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final double e(Context context) {
        try {
            Object systemService = H1.a.getSystemService(context, ActivityManager.class);
            kotlin.jvm.internal.t.d(systemService);
            return ((ActivityManager) systemService).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    public static final Bitmap.Config f() {
        return b;
    }

    public static final T4.b g(b.a aVar) {
        return aVar instanceof Z4.c ? ((Z4.c) aVar).e() : T4.b.b;
    }

    public static final String h(Uri uri) {
        return (String) D.h0(uri.getPathSegments());
    }

    public static final int i(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final String j(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || E.h0(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(E.W0(E.Y0(E.g1(E.g1(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', ""));
    }

    public static final int k(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    public static final File l(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            throw new IllegalStateException("cacheDir == null");
        }
        cacheDir.mkdirs();
        return cacheDir;
    }

    public static final f5.g m(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i = scaleType == null ? -1 : a.b[scaleType.ordinal()];
        return (i == 1 || i == 2 || i == 3 || i == 4) ? f5.g.b : f5.g.a;
    }

    public static final Bitmap.Config[] n() {
        return a;
    }

    public static final int o(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final boolean p(Uri uri) {
        return kotlin.jvm.internal.t.c(uri.getScheme(), "file") && kotlin.jvm.internal.t.c(h(uri), "android_asset");
    }

    public static final boolean q() {
        return kotlin.jvm.internal.t.c(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean r(int i) {
        return i == Integer.MIN_VALUE || i == Integer.MAX_VALUE;
    }

    public static final boolean s(b.a aVar) {
        return (aVar instanceof Z4.c) && ((Z4.c) aVar).f();
    }

    public static final boolean t(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof r4.b);
    }

    public static final e5.n u(e5.n nVar) {
        return nVar == null ? e5.n.c : nVar;
    }

    public static final e5.r v(e5.r rVar) {
        return rVar == null ? e5.r.c : rVar;
    }

    public static final Headers w(Headers headers) {
        return headers == null ? c : headers;
    }

    public static final ResponseBody x(Response response) {
        ResponseBody a2 = response.a();
        if (a2 != null) {
            return a2;
        }
        throw new IllegalStateException("response body == null");
    }

    public static final int y(String str, int i) {
        Long r = A.r(str);
        if (r == null) {
            return i;
        }
        long longValue = r.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final int z(f5.c cVar, f5.g gVar) {
        if (cVar instanceof c.a) {
            return ((c.a) cVar).a;
        }
        int i = a.c[gVar.ordinal()];
        if (i == 1) {
            return Integer.MIN_VALUE;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        throw new Ca.o();
    }
}
