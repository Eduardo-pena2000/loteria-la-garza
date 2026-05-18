package com.unity3d.services.core.domain;

import Ca.s;
import com.unity3d.services.core.domain.task.InitializationException;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ResultExtensionsKt {
    public static final /* synthetic */ Exception getCustomExceptionOrNull(Object obj) {
        Exception e = s.e(obj);
        t.l(3, "E");
        if (e instanceof Exception) {
            return e;
        }
        return null;
    }

    public static final /* synthetic */ Exception getCustomExceptionOrThrow(Object obj) {
        Exception e = s.e(obj);
        t.l(3, "E");
        if (e instanceof Exception) {
            return e;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }

    public static final InitializationException getInitializationExceptionOrNull(Object obj) {
        InitializationException e = s.e(obj);
        if (e instanceof InitializationException) {
            return e;
        }
        return null;
    }

    public static final InitializationException getInitializationExceptionOrThrow(Object obj) {
        InitializationException e = s.e(obj);
        if (e instanceof InitializationException) {
            return e;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }
}
