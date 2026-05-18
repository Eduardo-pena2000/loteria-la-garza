package com.revenuecat.purchases.hybridcommon.mappers;

import Ca.q;
import Ca.x;
import Da.S;
import Qa.l;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class LogHandlerWithMapping implements LogHandler {
    private final l callback;

    public LogHandlerWithMapping(l lVar) {
        t.g(lVar, "callback");
        this.callback = lVar;
    }

    private final void invokeCallback(LogLevel logLevel, String str) {
        l lVar = this.callback;
        String upperCase = logLevel.name().toUpperCase(Locale.ROOT);
        t.f(upperCase, "toUpperCase(...)");
        lVar.invoke(S.l(new q[]{x.a("logLevel", upperCase), x.a("message", str)}));
    }

    public void d(String str, String str2) {
        t.g(str, "tag");
        t.g(str2, "msg");
        invokeCallback(LogLevel.DEBUG, str2);
    }

    public void e(String str, String str2, Throwable th) {
        t.g(str, "tag");
        t.g(str2, "msg");
        if (th != null) {
            String str3 = str2 + ". Throwable: " + th;
            if (str3 != null) {
                str2 = str3;
            }
        }
        invokeCallback(LogLevel.ERROR, str2);
    }

    public void i(String str, String str2) {
        t.g(str, "tag");
        t.g(str2, "msg");
        invokeCallback(LogLevel.INFO, str2);
    }

    public void v(String str, String str2) {
        t.g(str, "tag");
        t.g(str2, "msg");
        invokeCallback(LogLevel.VERBOSE, str2);
    }

    public void w(String str, String str2) {
        t.g(str, "tag");
        t.g(str2, "msg");
        invokeCallback(LogLevel.WARN, str2);
    }
}
