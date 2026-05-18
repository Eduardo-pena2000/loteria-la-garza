package com.unity3d.ads.adplayer.model;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class LoadEvent {

    public static final class Completed extends LoadEvent {
        public static final Completed INSTANCE = new Completed();

        private Completed() {
            super(null);
        }
    }

    public static final class Error extends LoadEvent {
        private final int errorCode;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String message, int i) {
            super(null);
            t.g(message, "message");
            this.message = message;
            this.errorCode = i;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = error.message;
            }
            if ((i2 & 2) != 0) {
                i = error.errorCode;
            }
            return error.copy(str, i);
        }

        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.errorCode;
        }

        public final Error copy(String message, int i) {
            t.g(message, "message");
            return new Error(message, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return t.c(this.message, error.message) && this.errorCode == error.errorCode;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + Integer.hashCode(this.errorCode);
        }

        public String toString() {
            return "Error(message=" + this.message + ", errorCode=" + this.errorCode + ')';
        }
    }

    public /* synthetic */ LoadEvent(k kVar) {
        this();
    }

    private LoadEvent() {
    }
}
