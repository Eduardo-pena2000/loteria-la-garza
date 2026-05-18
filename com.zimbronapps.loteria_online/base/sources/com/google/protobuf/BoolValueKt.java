package com.google.protobuf;

import com.google.protobuf.BoolValue;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BoolValueKt {
    public static final BoolValueKt INSTANCE = new BoolValueKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final BoolValue.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(BoolValue.Builder builder) {
                kotlin.jvm.internal.t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(BoolValue.Builder builder, kotlin.jvm.internal.k kVar) {
            this(builder);
        }

        public final /* synthetic */ BoolValue _build() {
            GeneratedMessageLite build = this._builder.build();
            kotlin.jvm.internal.t.f(build, "_builder.build()");
            return (BoolValue) build;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final boolean getValue() {
            return this._builder.getValue();
        }

        public final void setValue(boolean z) {
            this._builder.setValue(z);
        }

        private Dsl(BoolValue.Builder builder) {
            this._builder = builder;
        }
    }

    private BoolValueKt() {
    }
}
