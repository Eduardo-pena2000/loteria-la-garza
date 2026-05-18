package com.unity3d.ads.core.log;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface Logger {

    public static final class DefaultImpls {
        public static /* synthetic */ void error$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.error(str, th);
        }

        public static /* synthetic */ void trace$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trace");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.trace(str, th);
        }
    }

    void debug(String str);

    void error(String str, Throwable th);

    LogLevel getLogLevel();

    void info(String str);

    void setLogLevel(LogLevel logLevel);

    void trace(String str, Throwable th);
}
