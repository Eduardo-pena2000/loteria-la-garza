package com.revenuecat.purchases.paywalls.components.properties;

import Ca.A;
import Ca.e;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.H0;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ImageUrls {
    public static final Companion Companion = new Companion(null);
    private final int height;
    private final URL original;
    private final URL webp;
    private final URL webpLowRes;
    private final int width;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return ImageUrls$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ ImageUrls(int i, URL url, URL url2, URL url3, A a, A a2, t0 t0Var, k kVar) {
        this(i, url, url2, url3, a, a2, t0Var);
    }

    public static /* synthetic */ void getOriginal$annotations() {
    }

    public static /* synthetic */ void getWebp$annotations() {
    }

    public static /* synthetic */ void getWebpLowRes$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ImageUrls imageUrls, d dVar, qb.e eVar) {
        URLSerializer uRLSerializer = URLSerializer.INSTANCE;
        dVar.k(eVar, 0, uRLSerializer, imageUrls.original);
        dVar.k(eVar, 1, uRLSerializer, imageUrls.webp);
        dVar.k(eVar, 2, uRLSerializer, imageUrls.webpLowRes);
        H0 h0 = H0.a;
        dVar.k(eVar, 3, h0, A.a(imageUrls.width));
        dVar.k(eVar, 4, h0, A.a(imageUrls.height));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageUrls)) {
            return false;
        }
        ImageUrls imageUrls = (ImageUrls) obj;
        return t.c(this.original, imageUrls.original) && t.c(this.webp, imageUrls.webp) && t.c(this.webpLowRes, imageUrls.webpLowRes) && this.width == imageUrls.width && this.height == imageUrls.height;
    }

    public final /* synthetic */ int getHeight-pVg5ArA() {
        return this.height;
    }

    public final /* synthetic */ URL getOriginal() {
        return this.original;
    }

    public final /* synthetic */ URL getWebp() {
        return this.webp;
    }

    public final /* synthetic */ URL getWebpLowRes() {
        return this.webpLowRes;
    }

    public final /* synthetic */ int getWidth-pVg5ArA() {
        return this.width;
    }

    public int hashCode() {
        return (((((((this.original.hashCode() * 31) + this.webp.hashCode()) * 31) + this.webpLowRes.hashCode()) * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        return "ImageUrls(original=" + this.original + ", webp=" + this.webp + ", webpLowRes=" + this.webpLowRes + ", width=" + A.e(this.width) + ", height=" + A.e(this.height) + ')';
    }

    public /* synthetic */ ImageUrls(URL url, URL url2, URL url3, int i, int i2, k kVar) {
        this(url, url2, url3, i, i2);
    }

    private ImageUrls(int i, URL url, URL url2, URL url3, A a, A a2, t0 t0Var) {
        if (31 != (i & 31)) {
            f0.a(i, 31, ImageUrls$$serializer.INSTANCE.getDescriptor());
        }
        this.original = url;
        this.webp = url2;
        this.webpLowRes = url3;
        this.width = a.f();
        this.height = a2.f();
    }

    private ImageUrls(URL url, URL url2, URL url3, int i, int i2) {
        t.g(url, "original");
        t.g(url2, "webp");
        t.g(url3, "webpLowRes");
        this.original = url;
        this.webp = url2;
        this.webpLowRes = url3;
        this.width = i;
        this.height = i2;
    }
}
