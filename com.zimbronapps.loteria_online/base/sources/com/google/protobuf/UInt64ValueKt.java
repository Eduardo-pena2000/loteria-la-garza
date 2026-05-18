package com.google.protobuf;

import com.google.protobuf.UInt64Value;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class UInt64ValueKt {
    public static final UInt64ValueKt INSTANCE = new UInt64ValueKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UInt64Value.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UInt64Value.Builder builder) {
                kotlin.jvm.internal.t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(UInt64Value.Builder builder, kotlin.jvm.internal.k kVar) {
            this(builder);
        }

        public final /* synthetic */ UInt64Value _build() {
            GeneratedMessageLite build = this._builder.build();
            kotlin.jvm.internal.t.f(build, "_builder.build()");
            return (UInt64Value) build;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final long getValue() {
            return this._builder.getValue();
        }

        public final void setValue(long j) {
            this._builder.setValue(j);
        }

        private Dsl(UInt64Value.Builder builder) {
            this._builder = builder;
        }
    }

    private UInt64ValueKt() {
    }
}
