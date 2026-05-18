package com.revenuecat.purchases.common.networking;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public enum ConnectionErrorReason {
    TIMEOUT,
    NO_NETWORK,
    OTHER;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final ConnectionErrorReason fromIOException(IOException iOException) {
            t.g(iOException, "ioException");
            if (iOException instanceof SocketTimeoutException) {
                return ConnectionErrorReason.TIMEOUT;
            }
            return iOException instanceof ConnectException ? true : iOException instanceof UnknownHostException ? ConnectionErrorReason.NO_NETWORK : ConnectionErrorReason.OTHER;
        }

        private Companion() {
        }
    }
}
