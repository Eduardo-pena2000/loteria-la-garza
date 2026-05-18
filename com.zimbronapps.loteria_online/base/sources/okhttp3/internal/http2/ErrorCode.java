package okhttp3.internal.http2;

import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public enum ErrorCode {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    public static final Companion b = new Companion(null);
    public final int a;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final ErrorCode a(int i) {
            for (ErrorCode errorCode : ErrorCode.values()) {
                if (errorCode.b() == i) {
                    return errorCode;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    ErrorCode(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }
}
