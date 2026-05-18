package com.unity3d.ads.core.data.model;

import com.unity3d.ads.adplayer.model.ShowStatus;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class ShowEvent {

    public static final class CancelTimeout extends ShowEvent {
        public static final CancelTimeout INSTANCE = new CancelTimeout();

        private CancelTimeout() {
            super(null);
        }
    }

    public static final class Clicked extends ShowEvent {
        public static final Clicked INSTANCE = new Clicked();

        private Clicked() {
            super(null);
        }
    }

    public static final class Completed extends ShowEvent {
        private final String reason;
        private final String reasonDebug;
        private final ShowStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(ShowStatus status, String str, String str2) {
            super(null);
            t.g(status, "status");
            this.status = status;
            this.reason = str;
            this.reasonDebug = str2;
        }

        public static /* synthetic */ Completed copy$default(Completed completed, ShowStatus showStatus, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                showStatus = completed.status;
            }
            if ((i & 2) != 0) {
                str = completed.reason;
            }
            if ((i & 4) != 0) {
                str2 = completed.reasonDebug;
            }
            return completed.copy(showStatus, str, str2);
        }

        public final ShowStatus component1() {
            return this.status;
        }

        public final String component2() {
            return this.reason;
        }

        public final String component3() {
            return this.reasonDebug;
        }

        public final Completed copy(ShowStatus status, String str, String str2) {
            t.g(status, "status");
            return new Completed(status, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) obj;
            return this.status == completed.status && t.c(this.reason, completed.reason) && t.c(this.reasonDebug, completed.reasonDebug);
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        public final ShowStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int hashCode = this.status.hashCode() * 31;
            String str = this.reason;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.reasonDebug;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Completed(status=" + this.status + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
        }

        public /* synthetic */ Completed(ShowStatus showStatus, String str, String str2, int i, k kVar) {
            this(showStatus, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }
    }

    public static final class Error extends ShowEvent {
        private final int errorCode;
        private final String message;
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String message, int i, String reason) {
            super(null);
            t.g(message, "message");
            t.g(reason, "reason");
            this.message = message;
            this.errorCode = i;
            this.reason = reason;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = error.message;
            }
            if ((i2 & 2) != 0) {
                i = error.errorCode;
            }
            if ((i2 & 4) != 0) {
                str2 = error.reason;
            }
            return error.copy(str, i, str2);
        }

        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.errorCode;
        }

        public final String component3() {
            return this.reason;
        }

        public final Error copy(String message, int i, String reason) {
            t.g(message, "message");
            t.g(reason, "reason");
            return new Error(message, i, reason);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return t.c(this.message, error.message) && this.errorCode == error.errorCode && t.c(this.reason, error.reason);
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return (((this.message.hashCode() * 31) + Integer.hashCode(this.errorCode)) * 31) + this.reason.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.message + ", errorCode=" + this.errorCode + ", reason=" + this.reason + ')';
        }
    }

    public static final class LeftApplication extends ShowEvent {
        public static final LeftApplication INSTANCE = new LeftApplication();

        private LeftApplication() {
            super(null);
        }
    }

    public static final class Started extends ShowEvent {
        public static final Started INSTANCE = new Started();

        private Started() {
            super(null);
        }
    }

    public /* synthetic */ ShowEvent(k kVar) {
        this();
    }

    private ShowEvent() {
    }
}
