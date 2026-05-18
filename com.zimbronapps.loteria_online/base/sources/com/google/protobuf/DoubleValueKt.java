package com.google.protobuf;

import com.google.protobuf.DoubleValue;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DoubleValueKt {
    public static final DoubleValueKt INSTANCE = new DoubleValueKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DoubleValue.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DoubleValue.Builder builder) {
                kotlin.jvm.internal.t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DoubleValue.Builder builder, kotlin.jvm.internal.k kVar) {
            this(builder);
        }

        public final /* synthetic */ DoubleValue _build() {
            GeneratedMessageLite build = this._builder.build();
            kotlin.jvm.internal.t.f(build, "_builder.build()");
            return (DoubleValue) build;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final double getValue() {
            return this._builder.getValue();
        }

        public final void setValue(double d) {
            this._builder.setValue(d);
        }

        private Dsl(DoubleValue.Builder builder) {
            this._builder = builder;
        }
    }

    private DoubleValueKt() {
    }
}
