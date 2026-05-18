package org.apache.tika.config;

import Wb.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface LoadErrorHandler {
    public static final LoadErrorHandler IGNORE = new 1();
    public static final LoadErrorHandler WARN = new 2();
    public static final LoadErrorHandler THROW = new 3();

    public class 1 implements LoadErrorHandler {
        public void handleLoadError(String str, Throwable th) {
        }

        public String toString() {
            return "IGNORE";
        }
    }

    public class 2 implements LoadErrorHandler {
        public void handleLoadError(String str, Throwable th) {
            e.m(str).g("Unable to load {}", str, th);
        }

        public String toString() {
            return "WARN";
        }
    }

    public class 3 implements LoadErrorHandler {
        public void handleLoadError(String str, Throwable th) {
            throw new RuntimeException("Unable to load " + str, th);
        }

        public String toString() {
            return "THROW";
        }
    }

    void handleLoadError(String str, Throwable th);
}
