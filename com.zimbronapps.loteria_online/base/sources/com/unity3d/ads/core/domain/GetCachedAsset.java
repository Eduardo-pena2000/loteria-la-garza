package com.unity3d.ads.core.domain;

import Ca.s;
import Za.E;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import cb.i;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class GetCachedAsset {
    private final CacheRepository cacheRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final Context context;

    public GetCachedAsset(CacheRepository cacheRepository, Context context, CacheWebViewAssets cacheWebViewAssets) {
        t.g(cacheRepository, "cacheRepository");
        t.g(context, "context");
        t.g(cacheWebViewAssets, "cacheWebViewAssets");
        this.cacheRepository = cacheRepository;
        this.context = context;
        this.cacheWebViewAssets = cacheWebViewAssets;
    }

    public static final /* synthetic */ CacheRepository access$getCacheRepository$p(GetCachedAsset getCachedAsset) {
        return getCachedAsset.cacheRepository;
    }

    private final WebResourceResponse getBundledAsset(Uri uri) {
        String V0 = E.V0(String.valueOf(uri.getPath()), "/", null, 2, null);
        try {
            InputStream open = this.context.getAssets().open(V0);
            t.f(open, "context.assets.open(fileName)");
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(V0), (String) null, open);
        } catch (Exception unused) {
            return null;
        }
    }

    private final WebResourceResponse getCachedAsset(Uri uri) {
        File file;
        Object b;
        String uri2 = uri.toString();
        t.f(uri2, "uri.toString()");
        CacheResult cacheResult = (CacheResult) i.f(null, new GetCachedAsset$getCachedAsset$result$1(this, E.Z0(uri2, "/", null, 2, null), null), 1, null);
        if (!(cacheResult instanceof CacheResult.Success) || (file = ((CacheResult.Success) cacheResult).getCachedFile().getFile()) == null) {
            return null;
        }
        try {
            s.a aVar = s.b;
            b = s.b(new FileInputStream(file));
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            b = s.b(Ca.t.a(th));
        }
        if (s.g(b)) {
            b = null;
        }
        FileInputStream fileInputStream = (FileInputStream) b;
        if (fileInputStream == null) {
            return null;
        }
        String filePath = file.getAbsolutePath();
        t.f(filePath, "filePath");
        String guessMimeType = StringExtensionsKt.guessMimeType(filePath);
        if (guessMimeType == null || E.h0(guessMimeType)) {
            return null;
        }
        return new WebResourceResponse(guessMimeType, (String) null, fileInputStream);
    }

    public static /* synthetic */ WebResourceResponse invoke$default(GetCachedAsset getCachedAsset, Uri uri, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return getCachedAsset.invoke(uri, str);
    }

    private final WebResourceResponse tryGetWebViewAsset(Uri uri, String str) {
        Object b;
        String guessMimeType;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('/');
        String uri2 = uri.toString();
        t.f(uri2, "uri.toString()");
        sb.append(E.Z0(E.d1(uri2, "?", null, 2, null), "/", null, 2, null));
        String sb2 = sb.toString();
        File file = (File) this.cacheWebViewAssets.getCached().get(sb2);
        if (file == null) {
            return null;
        }
        try {
            s.a aVar = s.b;
            b = s.b(new FileInputStream(file));
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            b = s.b(Ca.t.a(th));
        }
        if (s.g(b)) {
            b = null;
        }
        FileInputStream fileInputStream = (FileInputStream) b;
        if (fileInputStream == null || (guessMimeType = StringExtensionsKt.guessMimeType(sb2)) == null || E.h0(guessMimeType)) {
            return null;
        }
        return new WebResourceResponse(guessMimeType, (String) null, fileInputStream);
    }

    public final WebResourceResponse invoke(Uri uri, String webviewType) {
        t.g(uri, "uri");
        t.g(webviewType, "webviewType");
        String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -1921537799) {
                if (hashCode == -1920242293 && host.equals("unity.ads.cache")) {
                    return getCachedAsset(uri);
                }
            } else if (host.equals("unity.ads.asset")) {
                return getBundledAsset(uri);
            }
        }
        return tryGetWebViewAsset(uri, webviewType);
    }
}
