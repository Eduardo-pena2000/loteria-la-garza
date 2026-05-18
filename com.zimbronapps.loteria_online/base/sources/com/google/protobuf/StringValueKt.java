package com.google.protobuf;

import com.google.protobuf.StringValue;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class StringValueKt {
    public static final StringValueKt INSTANCE = new StringValueKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final StringValue.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(StringValue.Builder builder) {
                kotlin.jvm.internal.t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(StringValue.Builder builder, kotlin.jvm.internal.k kVar) {
            this(builder);
        }

        public final /* synthetic */ StringValue _build() {
            GeneratedMessageLite build = this._builder.build();
            kotlin.jvm.internal.t.f(build, "_builder.build()");
            return (StringValue) build;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getValue() {
            String value = this._builder.getValue();
            kotlin.jvm.internal.t.f(value, "_builder.getValue()");
            return value;
        }

        public final void setValue(String str) {
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.setValue(str);
        }

        private Dsl(StringValue.Builder builder) {
            this._builder = builder;
        }
    }

    private StringValueKt() {
    }
}
