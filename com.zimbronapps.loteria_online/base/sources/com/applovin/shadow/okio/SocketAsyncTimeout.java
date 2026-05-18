package com.applovin.shadow.okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class SocketAsyncTimeout extends AsyncTimeout {
    private final Socket socket;

    public SocketAsyncTimeout(Socket socket) {
        kotlin.jvm.internal.t.g(socket, "socket");
        this.socket = socket;
    }

    public IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public void timedOut() {
        try {
            this.socket.close();
        } catch (AssertionError e) {
            if (!Okio.isAndroidGetsocknameError(e)) {
                throw e;
            }
            Okio__JvmOkioKt.access$getLogger$p().log(Level.WARNING, "Failed to close timed out socket " + this.socket, e);
        } catch (Exception e2) {
            Okio__JvmOkioKt.access$getLogger$p().log(Level.WARNING, "Failed to close timed out socket " + this.socket, e2);
        }
    }
}
