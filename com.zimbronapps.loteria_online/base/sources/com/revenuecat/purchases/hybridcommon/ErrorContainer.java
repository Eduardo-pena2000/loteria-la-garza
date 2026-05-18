package com.revenuecat.purchases.hybridcommon;

import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ErrorContainer {
    private final int code;
    private final Map info;
    private final String message;

    public ErrorContainer(int i, String str, Map map) {
        t.g(str, "message");
        t.g(map, "info");
        this.code = i;
        this.message = str;
        this.info = map;
    }

    public static /* synthetic */ ErrorContainer copy$default(ErrorContainer errorContainer, int i, String str, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = errorContainer.code;
        }
        if ((i2 & 2) != 0) {
            str = errorContainer.message;
        }
        if ((i2 & 4) != 0) {
            map = errorContainer.info;
        }
        return errorContainer.copy(i, str, map);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final Map component3() {
        return this.info;
    }

    public final ErrorContainer copy(int i, String str, Map map) {
        t.g(str, "message");
        t.g(map, "info");
        return new ErrorContainer(i, str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorContainer)) {
            return false;
        }
        ErrorContainer errorContainer = (ErrorContainer) obj;
        return this.code == errorContainer.code && t.c(this.message, errorContainer.message) && t.c(this.info, errorContainer.info);
    }

    public final int getCode() {
        return this.code;
    }

    public final Map getInfo() {
        return this.info;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.code) * 31) + this.message.hashCode()) * 31) + this.info.hashCode();
    }

    public String toString() {
        return "ErrorContainer(code=" + this.code + ", message=" + this.message + ", info=" + this.info + ')';
    }
}
