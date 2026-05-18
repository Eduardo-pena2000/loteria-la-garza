package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.TimestampsOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimestampsKt {
    public static final TimestampsKt INSTANCE = new TimestampsKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TimestampsOuterClass.Timestamps.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(TimestampsOuterClass.Timestamps.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(TimestampsOuterClass.Timestamps.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ TimestampsOuterClass.Timestamps _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (TimestampsOuterClass.Timestamps) build;
        }

        public final void clearSessionTimestamp() {
            this._builder.clearSessionTimestamp();
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        public final long getSessionTimestamp() {
            return this._builder.getSessionTimestamp();
        }

        public final Timestamp getTimestamp() {
            Timestamp timestamp = this._builder.getTimestamp();
            t.f(timestamp, "_builder.getTimestamp()");
            return timestamp;
        }

        public final boolean hasTimestamp() {
            return this._builder.hasTimestamp();
        }

        public final void setSessionTimestamp(long j) {
            this._builder.setSessionTimestamp(j);
        }

        public final void setTimestamp(Timestamp value) {
            t.g(value, "value");
            this._builder.setTimestamp(value);
        }

        private Dsl(TimestampsOuterClass.Timestamps.Builder builder) {
            this._builder = builder;
        }
    }

    private TimestampsKt() {
    }
}
