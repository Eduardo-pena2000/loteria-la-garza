package com.unity3d.ads.core.data.datasource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface UnityBootConfigDataSource {
    public static final String BUILD_GUID = "build-guid";
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String BUILD_GUID = "build-guid";

        private Companion() {
        }
    }

    String getValue(String str);
}
