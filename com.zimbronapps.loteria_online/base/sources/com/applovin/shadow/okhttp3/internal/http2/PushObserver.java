package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okio.BufferedSource;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface PushObserver {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public static final class PushObserverCancel implements PushObserver {
            public boolean onData(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
                t.g(bufferedSource, "source");
                bufferedSource.skip(i2);
                return true;
            }

            public boolean onHeaders(int i, List list, boolean z) {
                t.g(list, "responseHeaders");
                return true;
            }

            public boolean onRequest(int i, List list) {
                t.g(list, "requestHeaders");
                return true;
            }

            public void onReset(int i, ErrorCode errorCode) {
                t.g(errorCode, "errorCode");
            }
        }

        private Companion() {
        }
    }

    boolean onData(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException;

    boolean onHeaders(int i, List list, boolean z);

    boolean onRequest(int i, List list);

    void onReset(int i, ErrorCode errorCode);
}
