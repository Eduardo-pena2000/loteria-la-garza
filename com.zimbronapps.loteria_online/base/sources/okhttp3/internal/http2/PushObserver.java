package okhttp3.internal.http2;

import java.util.List;
import kotlin.jvm.internal.t;
import xb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface PushObserver {
    public static final Companion a = Companion.a;
    public static final PushObserver b = new Companion.PushObserverCancel();

    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public static final class PushObserverCancel implements PushObserver {
            public void a(int i, ErrorCode errorCode) {
                t.g(errorCode, "errorCode");
            }

            public boolean b(int i, g source, int i2, boolean z) {
                t.g(source, "source");
                source.skip(i2);
                return true;
            }

            public boolean onHeaders(int i, List responseHeaders, boolean z) {
                t.g(responseHeaders, "responseHeaders");
                return true;
            }

            public boolean onRequest(int i, List requestHeaders) {
                t.g(requestHeaders, "requestHeaders");
                return true;
            }
        }

        private Companion() {
        }
    }

    void a(int i, ErrorCode errorCode);

    boolean b(int i, g gVar, int i2, boolean z);

    boolean onHeaders(int i, List list, boolean z);

    boolean onRequest(int i, List list);
}
