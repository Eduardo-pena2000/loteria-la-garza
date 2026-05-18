package com.unity3d.ads.core.data.model.exception;

import cb.a1;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializationException extends Exception {
    public static final Companion Companion = new Companion(null);
    private final String message;
    private final String reason;
    private final String reasonDebug;
    private final Throwable throwable;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final InitializationException parseFrom(Exception e) {
            String str;
            t.g(e, "e");
            if (e instanceof a1 ? true : e instanceof NetworkTimeoutException) {
                return new InitializationException("Timeout", e, "timeout", e.getMessage());
            }
            if (e instanceof GatewayException) {
                GatewayException gatewayException = (GatewayException) e;
                return new InitializationException("Initialization failure", gatewayException.getThrowable(), gatewayException.getReason(), gatewayException.getReasonDebug());
            }
            if (!(e instanceof UnityAdsNetworkException)) {
                return e instanceof InitializationException ? (InitializationException) e : new InitializationException("Initialization failure", e, "unknown", e.getMessage());
            }
            UnityAdsNetworkException unityAdsNetworkException = (UnityAdsNetworkException) e;
            if (unityAdsNetworkException.getCode() == null) {
                str = "network";
            } else {
                str = "network." + unityAdsNetworkException.getCode();
            }
            return new InitializationException("Network", e, str, unityAdsNetworkException.getMessage());
        }

        private Companion() {
        }
    }

    public /* synthetic */ InitializationException(String str, Throwable th, String str2, String str3, int i, k kVar) {
        this(str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? "gateway" : str2, (i & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ InitializationException copy$default(InitializationException initializationException, String str, Throwable th, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initializationException.getMessage();
        }
        if ((i & 2) != 0) {
            th = initializationException.throwable;
        }
        if ((i & 4) != 0) {
            str2 = initializationException.reason;
        }
        if ((i & 8) != 0) {
            str3 = initializationException.reasonDebug;
        }
        return initializationException.copy(str, th, str2, str3);
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

    public final InitializationException copy(String message, Throwable th, String reason, String str) {
        t.g(message, "message");
        t.g(reason, "reason");
        return new InitializationException(message, th, reason, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializationException)) {
            return false;
        }
        InitializationException initializationException = (InitializationException) obj;
        return t.c(getMessage(), initializationException.getMessage()) && t.c(this.throwable, initializationException.throwable) && t.c(this.reason, initializationException.reason) && t.c(this.reasonDebug, initializationException.reasonDebug);
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
        return "InitializationException(message=" + getMessage() + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationException(String message, Throwable th, String reason, String str) {
        super(message);
        t.g(message, "message");
        t.g(reason, "reason");
        this.message = message;
        this.throwable = th;
        this.reason = reason;
        this.reasonDebug = str;
    }
}
