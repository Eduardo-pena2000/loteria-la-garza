package com.unity3d.ads.core.data.datasource;

import Ga.e;
import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface CacheDataSource {

    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheDataSource cacheDataSource, File file, String str, String str2, Integer num, e eVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            String str3 = str2;
            if ((i & 8) != 0) {
                num = Integer.MAX_VALUE;
            }
            return cacheDataSource.getFile(file, str, str3, num, eVar);
        }
    }

    Object getFile(File file, String str, String str2, Integer num, e eVar);
}
