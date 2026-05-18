package com.unity3d.services.core.properties;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface Session {
    public static final Default Default = Default.$$INSTANCE;

    public static final class Default implements Session {
        static final /* synthetic */ Default $$INSTANCE = new Default();
        private static final String id = SessionIdReader.INSTANCE.getSessionId();

        private Default() {
        }

        public String getId() {
            return id;
        }
    }

    String getId();
}
