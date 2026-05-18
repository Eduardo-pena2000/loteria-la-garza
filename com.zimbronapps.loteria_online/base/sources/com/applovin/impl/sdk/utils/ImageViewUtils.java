package com.applovin.impl.sdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.StrictMode;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.o0;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.InputStream;
import java.net.URL;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class ImageViewUtils {
    private static /* synthetic */ void a(String str, k kVar, ImageView imageView, Uri uri) {
        try {
            InputStream openStream = new URL(str).openStream();
            try {
                AppLovinSdkUtils.runOnUiThread(new e(kVar, BitmapFactory.decodeStream(openStream), imageView));
                if (openStream != null) {
                    openStream.close();
                }
            } finally {
            }
        } catch (Throwable th) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("ImageViewUtils", "Failed to fetch image: " + uri, th);
            }
            kVar.O().a("ImageViewUtils", th);
            kVar.D().a("ImageViewUtils", "setImageUri", th);
        }
    }

    public static /* synthetic */ void b(ImageView imageView, Bitmap bitmap) {
        a(imageView, bitmap);
    }

    public static /* synthetic */ void c(ImageView imageView, Uri uri) {
        a(imageView, uri);
    }

    public static /* synthetic */ void d(ImageView imageView, Uri uri) {
        b(imageView, uri);
    }

    public static /* synthetic */ void e(String str, k kVar, ImageView imageView, Uri uri) {
        a(str, kVar, imageView, uri);
    }

    public static /* synthetic */ void f(Uri uri, ImageView imageView) {
        a(uri, imageView);
    }

    public static /* synthetic */ void g(k kVar, Bitmap bitmap, ImageView imageView) {
        a(kVar, bitmap, imageView);
    }

    public static void setAndDownscaleBitmap(ImageView imageView, Uri uri) {
        if (uri == null || imageView == null) {
            return;
        }
        k kVar = k.C0;
        if (kVar == null) {
            o.h("ImageViewUtils", "SDK has not been initialized");
        } else {
            kVar.q0().b().execute(new c(uri, imageView));
        }
    }

    public static void setAndDownscaleImageUri(ImageView imageView, Uri uri) {
        if (uri == null || imageView == null) {
            return;
        }
        if (imageView.getHeight() <= 0 || imageView.getWidth() <= 0) {
            imageView.post(new f(imageView, uri));
        } else {
            setAndDownscaleBitmap(imageView, uri);
        }
    }

    public static void setImageUri(ImageView imageView, Uri uri, k kVar) {
        if (imageView == null || uri == null) {
            return;
        }
        String uri2 = uri.toString();
        if (URLUtil.isFileUrl(uri2) || URLUtil.isContentUrl(uri2)) {
            AppLovinSdkUtils.runOnUiThread(new b(imageView, uri));
            return;
        }
        if (kVar == null) {
            return;
        }
        kVar.O();
        if (o.a()) {
            kVar.O().a("ImageViewUtils", "Fetching image: " + uri);
        }
        kVar.q0().b().execute(new a(uri2, kVar, imageView, uri));
    }

    private static /* synthetic */ void b(ImageView imageView, Uri uri) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        imageView.setImageURI(uri);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    private static /* synthetic */ void a(k kVar, Bitmap bitmap, ImageView imageView) {
        kVar.O();
        if (o.a()) {
            kVar.O().a("ImageViewUtils", "Image fetched");
        }
        imageView.setImageDrawable(new BitmapDrawable(k.o().getResources(), bitmap));
    }

    private static /* synthetic */ void a(ImageView imageView, Uri uri) {
        setAndDownscaleBitmap(imageView, uri);
    }

    private static /* synthetic */ void a(Uri uri, ImageView imageView) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(uri.getPath(), options);
        int height = imageView.getHeight();
        int width = imageView.getWidth();
        if (height <= 0 || width <= 0) {
            Point b = o0.b(imageView.getContext());
            height = Math.min(b.x, b.y);
            width = height;
        }
        int i2 = options.outHeight;
        int i3 = options.outWidth;
        if (i2 > height || i3 > width) {
            while (true) {
                int i4 = i * 2;
                if (i2 / i4 < height && i3 / i4 < width) {
                    break;
                } else {
                    i = i4;
                }
            }
        }
        options.inSampleSize = i;
        options.inJustDecodeBounds = false;
        k.C0.O();
        if (o.a()) {
            k.C0.O().a("ImageViewUtils", "Loading image: " + uri.getLastPathSegment() + "...");
        }
        AppLovinSdkUtils.runOnUiThread(new d(imageView, BitmapFactory.decodeFile(uri.getPath(), options)));
    }

    private static /* synthetic */ void a(ImageView imageView, Bitmap bitmap) {
        imageView.setImageBitmap(bitmap);
    }
}
