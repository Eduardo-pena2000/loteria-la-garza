package com.google.protobuf;

import com.google.protobuf.Any;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AnyKt {
    public static final AnyKt INSTANCE = new AnyKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Any.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Any.Builder builder) {
                kotlin.jvm.internal.t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Any.Builder builder, kotlin.jvm.internal.k kVar) {
            this(builder);
        }

        public final /* synthetic */ Any _build() {
            GeneratedMessageLite build = this._builder.build();
            kotlin.jvm.internal.t.f(build, "_builder.build()");
            return (Any) build;
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getTypeUrl() {
            String typeUrl = this._builder.getTypeUrl();
            kotlin.jvm.internal.t.f(typeUrl, "_builder.getTypeUrl()");
            return typeUrl;
        }

        public final ByteString getValue() {
            ByteString value = this._builder.getValue();
            kotlin.jvm.internal.t.f(value, "_builder.getValue()");
            return value;
        }

        public final void setTypeUrl(String str) {
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.setTypeUrl(str);
        }

        public final void setValue(ByteString byteString) {
            kotlin.jvm.internal.t.g(byteString, "value");
            this._builder.setValue(byteString);
        }

        private Dsl(Any.Builder builder) {
            this._builder = builder;
        }
    }

    private AnyKt() {
    }
}
