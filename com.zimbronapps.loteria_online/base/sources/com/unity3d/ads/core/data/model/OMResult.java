package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class OMResult {

    public static final class Failure extends OMResult {
        private final String reason;
        private final String reasonDebug;

        public /* synthetic */ Failure(String str, String str2, int i, k kVar) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failure.reason;
            }
            if ((i & 2) != 0) {
                str2 = failure.reasonDebug;
            }
            return failure.copy(str, str2);
        }

        public final String component1() {
            return this.reason;
        }

        public final String component2() {
            return this.reasonDebug;
        }

        public final Failure copy(String reason, String str) {
            t.g(reason, "reason");
            return new Failure(reason, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return t.c(this.reason, failure.reason) && t.c(this.reasonDebug, failure.reasonDebug);
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        public int hashCode() {
            int hashCode = this.reason.hashCode() * 31;
            String str = this.reasonDebug;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Failure(reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(String reason, String str) {
            super(null);
            t.g(reason, "reason");
            this.reason = reason;
            this.reasonDebug = str;
        }
    }

    public static final class Success extends OMResult {
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    public /* synthetic */ OMResult(k kVar) {
        this();
    }

    private OMResult() {
    }
}
