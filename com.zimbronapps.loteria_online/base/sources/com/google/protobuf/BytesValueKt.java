package com.google.protobuf;

import com.google.protobuf.BytesValue;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BytesValueKt {
    public static final BytesValueKt INSTANCE = new BytesValueKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final BytesValue.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(BytesValue.Builder builder) {
                kotlin.jvm.internal.t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(BytesValue.Builder builder, kotlin.jvm.internal.k kVar) {
            this(builder);
        }

        public final /* synthetic */ BytesValue _build() {
            GeneratedMessageLite build = this._builder.build();
            kotlin.jvm.internal.t.f(build, "_builder.build()");
            return (BytesValue) build;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final ByteString getValue() {
            ByteString value = this._builder.getValue();
            kotlin.jvm.internal.t.f(value, "_builder.getValue()");
            return value;
        }

        public final void setValue(ByteString byteString) {
            kotlin.jvm.internal.t.g(byteString, "value");
            this._builder.setValue(byteString);
        }

        private Dsl(BytesValue.Builder builder) {
            this._builder = builder;
        }
    }

    private BytesValueKt() {
    }
}
