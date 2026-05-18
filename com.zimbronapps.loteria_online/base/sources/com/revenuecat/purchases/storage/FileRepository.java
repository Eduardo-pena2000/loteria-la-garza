package com.revenuecat.purchases.storage;

import Ga.e;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.models.Checksum;
import java.net.URI;
import java.net.URL;
import java.util.List;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface FileRepository {

    public static final class DefaultImpls {
        public static /* synthetic */ Object generateOrGetCachedFileURL$default(FileRepository fileRepository, URL url, Checksum checksum, e eVar, int i, Object obj) {
            return FileRepository.generateOrGetCachedFileURL$default(fileRepository, url, checksum, eVar, i, obj);
        }

        public static /* synthetic */ URI getFile$default(FileRepository fileRepository, URL url, Checksum checksum, int i, Object obj) {
            return FileRepository.getFile$default(fileRepository, url, checksum, i, obj);
        }
    }

    static /* synthetic */ Object generateOrGetCachedFileURL$default(FileRepository fileRepository, URL url, Checksum checksum, e eVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateOrGetCachedFileURL");
        }
        if ((i & 2) != 0) {
            checksum = null;
        }
        return fileRepository.generateOrGetCachedFileURL(url, checksum, eVar);
    }

    static /* synthetic */ URI getFile$default(FileRepository fileRepository, URL url, Checksum checksum, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
        }
        if ((i & 2) != 0) {
            checksum = null;
        }
        return fileRepository.getFile(url, checksum);
    }

    Object generateOrGetCachedFileURL(URL url, Checksum checksum, e eVar);

    URI getFile(URL url, Checksum checksum);

    void prefetch(List list);
}
