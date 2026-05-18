package com.unity3d.ads.core.extensions;

import Na.c;
import Ya.r;
import Za.E;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ExceptionExtensionsKt {
    public static final String getShortenedStackTrace(Throwable th, int i) {
        t.g(th, "<this>");
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                PrintWriter printWriter = new PrintWriter(stringWriter);
                try {
                    th.printStackTrace(printWriter);
                    String stringWriter2 = stringWriter.toString();
                    t.f(stringWriter2, "stringWriter.toString()");
                    String y = r.y(r.D(E.n0(E.j1(stringWriter2).toString()), i), "\n", null, null, 0, null, null, 62, null);
                    c.a(printWriter, null);
                    c.a(stringWriter, null);
                    return y;
                } finally {
                }
            } finally {
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    public static /* synthetic */ String getShortenedStackTrace$default(Throwable th, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 15;
        }
        return getShortenedStackTrace(th, i);
    }

    public static final String retrieveUnityCrashValue(Throwable th) {
        StackTraceElement stackTraceElement;
        boolean z;
        String className;
        t.g(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        t.f(stackTrace, "this.stackTrace");
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            stackTraceElement = null;
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement2 = stackTrace[i];
            if (stackTraceElement2 == null || (className = stackTraceElement2.getClassName()) == null) {
                z = false;
            } else {
                t.f(className, "className");
                z = E.T(className, "com.unity3d", false, 2, null);
            }
            if (z) {
                stackTraceElement = stackTraceElement2;
                break;
            }
            i++;
        }
        if (stackTraceElement == null) {
            return "unknown";
        }
        String fileName = stackTraceElement.getFileName();
        if (fileName == null) {
            fileName = "unknown";
        } else {
            t.f(fileName, "it.fileName ?: SDKErrorHandler.UNKNOWN_FILE");
        }
        String str = fileName + '_' + stackTraceElement.getLineNumber();
        return str != null ? str : "unknown";
    }
}
