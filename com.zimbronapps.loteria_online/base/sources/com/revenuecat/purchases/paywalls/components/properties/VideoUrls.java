package com.revenuecat.purchases.paywalls.components.properties;

import Ca.A;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.models.Checksum;
import com.revenuecat.purchases.models.Checksum$$serializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import qb.e;
import rb.d;
import sb.H0;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class VideoUrls {
    public static final Companion Companion = new Companion(null);
    private final Checksum checksum;
    private final Checksum checksumLowRes;
    private final int height;
    private final URL url;
    private final URL urlLowRes;
    private final int width;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return VideoUrls$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ VideoUrls(int i, int i2, URL url, Checksum checksum, URL url2, Checksum checksum2, k kVar) {
        this(i, i2, url, checksum, url2, checksum2);
    }

    public static /* synthetic */ void getChecksumLowRes$annotations() {
    }

    public static /* synthetic */ void getUrl$annotations() {
    }

    public static /* synthetic */ void getUrlLowRes$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(VideoUrls videoUrls, d dVar, e eVar) {
        H0 h0 = H0.a;
        dVar.k(eVar, 0, h0, A.a(videoUrls.width));
        dVar.k(eVar, 1, h0, A.a(videoUrls.height));
        URLSerializer uRLSerializer = URLSerializer.INSTANCE;
        dVar.k(eVar, 2, uRLSerializer, videoUrls.url);
        if (dVar.e(eVar, 3) || videoUrls.checksum != null) {
            dVar.j(eVar, 3, Checksum$$serializer.INSTANCE, videoUrls.checksum);
        }
        if (dVar.e(eVar, 4) || videoUrls.urlLowRes != null) {
            dVar.j(eVar, 4, uRLSerializer, videoUrls.urlLowRes);
        }
        if (!dVar.e(eVar, 5) && videoUrls.checksumLowRes == null) {
            return;
        }
        dVar.j(eVar, 5, Checksum$$serializer.INSTANCE, videoUrls.checksumLowRes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoUrls)) {
            return false;
        }
        VideoUrls videoUrls = (VideoUrls) obj;
        return this.width == videoUrls.width && this.height == videoUrls.height && t.c(this.url, videoUrls.url) && t.c(this.checksum, videoUrls.checksum) && t.c(this.urlLowRes, videoUrls.urlLowRes) && t.c(this.checksumLowRes, videoUrls.checksumLowRes);
    }

    public final /* synthetic */ Checksum getChecksum() {
        return this.checksum;
    }

    public final /* synthetic */ Checksum getChecksumLowRes() {
        return this.checksumLowRes;
    }

    public final /* synthetic */ int getHeight-pVg5ArA() {
        return this.height;
    }

    public final /* synthetic */ URL getUrl() {
        return this.url;
    }

    public final /* synthetic */ URL getUrlLowRes() {
        return this.urlLowRes;
    }

    public final /* synthetic */ int getWidth-pVg5ArA() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = ((((this.width * 31) + this.height) * 31) + this.url.hashCode()) * 31;
        Checksum checksum = this.checksum;
        int hashCode2 = (hashCode + (checksum == null ? 0 : checksum.hashCode())) * 31;
        URL url = this.urlLowRes;
        int hashCode3 = (hashCode2 + (url == null ? 0 : url.hashCode())) * 31;
        Checksum checksum2 = this.checksumLowRes;
        return hashCode3 + (checksum2 != null ? checksum2.hashCode() : 0);
    }

    public String toString() {
        return "VideoUrls(width=" + A.e(this.width) + ", height=" + A.e(this.height) + ", url=" + this.url + ", checksum=" + this.checksum + ", urlLowRes=" + this.urlLowRes + ", checksumLowRes=" + this.checksumLowRes + ')';
    }

    @Ca.e
    public /* synthetic */ VideoUrls(int i, A a, A a2, URL url, Checksum checksum, URL url2, Checksum checksum2, t0 t0Var, k kVar) {
        this(i, a, a2, url, checksum, url2, checksum2, t0Var);
    }

    private VideoUrls(int i, int i2, URL url, Checksum checksum, URL url2, Checksum checksum2) {
        t.g(url, "url");
        this.width = i;
        this.height = i2;
        this.url = url;
        this.checksum = checksum;
        this.urlLowRes = url2;
        this.checksumLowRes = checksum2;
    }

    private VideoUrls(int i, A a, A a2, URL url, Checksum checksum, URL url2, Checksum checksum2, t0 t0Var) {
        if (7 != (i & 7)) {
            f0.a(i, 7, VideoUrls$$serializer.INSTANCE.getDescriptor());
        }
        this.width = a.f();
        this.height = a2.f();
        this.url = url;
        if ((i & 8) == 0) {
            this.checksum = null;
        } else {
            this.checksum = checksum;
        }
        if ((i & 16) == 0) {
            this.urlLowRes = null;
        } else {
            this.urlLowRes = url2;
        }
        if ((i & 32) == 0) {
            this.checksumLowRes = null;
        } else {
            this.checksumLowRes = checksum2;
        }
    }

    public /* synthetic */ VideoUrls(int i, int i2, URL url, Checksum checksum, URL url2, Checksum checksum2, int i3, k kVar) {
        this(i, i2, url, (i3 & 8) != 0 ? null : checksum, (i3 & 16) != 0 ? null : url2, (i3 & 32) != 0 ? null : checksum2, null);
    }
}
