package org.apache.tika.config;

import Wb.e;
import org.apache.tika.exception.TikaConfigException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface InitializableProblemHandler {
    public static final InitializableProblemHandler DEFAULT;
    public static final InitializableProblemHandler IGNORE = new 1();
    public static final InitializableProblemHandler INFO = new 2();
    public static final InitializableProblemHandler THROW;
    public static final InitializableProblemHandler WARN;

    public class 1 implements InitializableProblemHandler {
        public void handleInitializableProblem(String str, String str2) {
        }

        public String toString() {
            return "IGNORE";
        }
    }

    public class 2 implements InitializableProblemHandler {
        public void handleInitializableProblem(String str, String str2) {
            e.m(str).info(str2);
        }

        public String toString() {
            return "INFO";
        }
    }

    public class 3 implements InitializableProblemHandler {
        public void handleInitializableProblem(String str, String str2) {
            e.m(str).w(str2);
        }

        public String toString() {
            return "WARN";
        }
    }

    public class 4 implements InitializableProblemHandler {
        public void handleInitializableProblem(String str, String str2) throws TikaConfigException {
            throw new TikaConfigException(str2);
        }

        public String toString() {
            return "THROW";
        }
    }

    static {
        3 r0 = new 3();
        WARN = r0;
        THROW = new 4();
        DEFAULT = r0;
    }

    void handleInitializableProblem(String str, String str2) throws TikaConfigException;
}
