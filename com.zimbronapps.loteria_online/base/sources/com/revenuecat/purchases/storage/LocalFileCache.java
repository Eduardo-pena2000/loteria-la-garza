package com.revenuecat.purchases.storage;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.models.Checksum;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface LocalFileCache {

    public static final class DefaultImpls {
        public static /* synthetic */ URI generateLocalFilesystemURI$default(LocalFileCache localFileCache, URL url, Checksum checksum, int i, Object obj) {
            return LocalFileCache.generateLocalFilesystemURI$default(localFileCache, url, checksum, i, obj);
        }

        public static /* synthetic */ void saveData$default(LocalFileCache localFileCache, InputStream inputStream, URI uri, Checksum checksum, int i, Object obj) {
            LocalFileCache.saveData$default(localFileCache, inputStream, uri, checksum, i, obj);
        }
    }

    static /* synthetic */ URI generateLocalFilesystemURI$default(LocalFileCache localFileCache, URL url, Checksum checksum, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateLocalFilesystemURI");
        }
        if ((i & 2) != 0) {
            checksum = null;
        }
        return localFileCache.generateLocalFilesystemURI(url, checksum);
    }

    static /* synthetic */ void saveData$default(LocalFileCache localFileCache, InputStream inputStream, URI uri, Checksum checksum, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveData");
        }
        if ((i & 4) != 0) {
            checksum = null;
        }
        localFileCache.saveData(inputStream, uri, checksum);
    }

    boolean cachedContentExists(URI uri);

    URI generateLocalFilesystemURI(URL url, Checksum checksum);

    void saveData(InputStream inputStream, URI uri, Checksum checksum);
}
