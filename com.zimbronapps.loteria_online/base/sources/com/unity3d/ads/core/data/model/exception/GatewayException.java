package com.unity3d.ads.core.data.model.exception;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class GatewayException extends UnityAdsNetworkException {
    public static final Companion Companion = new Companion(null);
    public static final String GATEWAY_RESPONSE_DEPTH_INITIALIZATION = "initialization";
    public static final String GATEWAY_RESPONSE_DEPTH_UNIVERSAL = "universal";
    private final String message;
    private final String reason;
    private final String reasonDebug;
    private final Throwable throwable;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ GatewayException(String str, Throwable th, String str2, String str3, int i, k kVar) {
        this(str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? "gateway" : str2, (i & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ GatewayException copy$default(GatewayException gatewayException, String str, Throwable th, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gatewayException.getMessage();
        }
        if ((i & 2) != 0) {
            th = gatewayException.throwable;
        }
        if ((i & 4) != 0) {
            str2 = gatewayException.reason;
        }
        if ((i & 8) != 0) {
            str3 = gatewayException.reasonDebug;
        }
        return gatewayException.copy(str, th, str2, str3);
    }

    public final String component1() {
        return getMessage();
    }

    public final Throwable component2() {
        return this.throwable;
    }

    public final String component3() {
        return this.reason;
    }

    public final String component4() {
        return this.reasonDebug;
    }

    public final GatewayException copy(String message, Throwable th, String reason, String str) {
        t.g(message, "message");
        t.g(reason, "reason");
        return new GatewayException(message, th, reason, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GatewayException)) {
            return false;
        }
        GatewayException gatewayException = (GatewayException) obj;
        return t.c(getMessage(), gatewayException.getMessage()) && t.c(this.throwable, gatewayException.throwable) && t.c(this.reason, gatewayException.reason) && t.c(this.reasonDebug, gatewayException.reasonDebug);
    }

    public String getMessage() {
        return this.message;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReasonDebug() {
        return this.reasonDebug;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int hashCode = getMessage().hashCode() * 31;
        Throwable th = this.throwable;
        int hashCode2 = (((hashCode + (th == null ? 0 : th.hashCode())) * 31) + this.reason.hashCode()) * 31;
        String str = this.reasonDebug;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "GatewayException(message=" + getMessage() + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GatewayException(String message, Throwable th, String reason, String str) {
        super(message, null, null, null, null, null, null, 126, null);
        t.g(message, "message");
        t.g(reason, "reason");
        this.message = message;
        this.throwable = th;
        this.reason = reason;
        this.reasonDebug = str;
    }
}
