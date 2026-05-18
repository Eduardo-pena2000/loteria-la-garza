package com.unity3d.ads.core.data.repository;

import Ga.e;
import com.unity3d.ads.core.data.model.CachedFile;
import org.json.JSONArray;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface CacheRepository {

    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, JSONArray jSONArray, int i, e eVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if ((i2 & 2) != 0) {
                jSONArray = null;
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return cacheRepository.getFile(str, jSONArray, i, eVar);
        }
    }

    Object clearCache(e eVar);

    Object doesFileExist(String str, e eVar);

    Object getCacheSize(e eVar);

    Object getFile(String str, JSONArray jSONArray, int i, e eVar);

    Object getWebviewFile(String str, String str2, e eVar);

    boolean removeFile(CachedFile cachedFile);

    Object retrieveFile(String str, e eVar);
}
