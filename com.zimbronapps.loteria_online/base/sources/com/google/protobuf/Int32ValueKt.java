package com.google.protobuf;

import com.google.protobuf.Int32Value;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Int32ValueKt {
    public static final Int32ValueKt INSTANCE = new Int32ValueKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Int32Value.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Int32Value.Builder builder) {
                kotlin.jvm.internal.t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Int32Value.Builder builder, kotlin.jvm.internal.k kVar) {
            this(builder);
        }

        public final /* synthetic */ Int32Value _build() {
            GeneratedMessageLite build = this._builder.build();
            kotlin.jvm.internal.t.f(build, "_builder.build()");
            return (Int32Value) build;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final int getValue() {
            return this._builder.getValue();
        }

        public final void setValue(int i) {
            this._builder.setValue(i);
        }

        private Dsl(Int32Value.Builder builder) {
            this._builder = builder;
        }
    }

    private Int32ValueKt() {
    }
}
