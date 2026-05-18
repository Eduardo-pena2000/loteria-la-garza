package com.applovin.impl.sdk.nativeAd;

import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.f2;
import com.applovin.impl.i5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class a extends i5 {
    private final AppLovinNativeAdImpl g;
    private final a h;
    private final String i;

    public interface a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, com.applovin.impl.sdk.k kVar, a aVar) {
        super("TaskCacheNativeAd", kVar);
        this.i = UUID.randomUUID().toString();
        this.g = appLovinNativeAdImpl;
        this.h = aVar;
    }

    private float a(Uri uri) {
        FileInputStream fileInputStream;
        int i;
        int i2;
        File file = new File(uri.getPath());
        if (!file.exists()) {
            return -1.0f;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(fileInputStream, (Rect) null, options);
                i = options.outWidth;
                i2 = options.outHeight;
            } finally {
            }
        } catch (IOException e) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Failed to calculate aspect ratio", e);
            }
        }
        if (i <= 0 || i2 <= 0) {
            fileInputStream.close();
            return -1.0f;
        }
        float f = i / i2;
        fileInputStream.close();
        return f;
    }

    private Uri b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Attempting to cache resource: " + uri);
        }
        String a2 = this.a.G().a(a(), uri.toString(), this.g.getCachePrefix(), Collections.emptyList(), false, false, 1, this.i, f2.a(this.g));
        if (TextUtils.isEmpty(a2)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Unable to cache resource for uri: " + uri);
            }
            return null;
        }
        File a3 = this.a.G().a(a2, a());
        if (a3 != null) {
            Uri fromFile = Uri.fromFile(a3);
            if (fromFile != null) {
                return fromFile;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Unable to extract Uri from image file");
            }
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.b(this.b, "Unable to retrieve File from cached image filename = " + a2);
        }
        return null;
    }

    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Begin caching ad #" + this.g.getAdIdNumber() + "...");
        }
        Uri b = b(this.g.getIconUri());
        if (b != null) {
            this.g.setIconUri(b);
        }
        Uri b2 = b(this.g.getMainImageUri());
        if (b2 != null) {
            this.g.setMainImageUri(b2);
            float a2 = a(b2);
            if (a2 > 0.0f) {
                this.g.setMainImageAspectRatio(a2);
            }
        }
        Uri b3 = b(this.g.getPrivacyIconUri());
        if (b3 != null) {
            this.g.setPrivacyIconUri(b3);
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Finished caching ad #" + this.g.getAdIdNumber());
        }
        this.h.a(this.g);
    }
}
