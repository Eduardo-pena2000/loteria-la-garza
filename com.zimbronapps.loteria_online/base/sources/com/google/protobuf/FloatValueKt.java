package com.google.protobuf;

import com.google.protobuf.FloatValue;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FloatValueKt {
    public static final FloatValueKt INSTANCE = new FloatValueKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final FloatValue.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(FloatValue.Builder builder) {
                kotlin.jvm.internal.t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(FloatValue.Builder builder, kotlin.jvm.internal.k kVar) {
            this(builder);
        }

        public final /* synthetic */ FloatValue _build() {
            GeneratedMessageLite build = this._builder.build();
            kotlin.jvm.internal.t.f(build, "_builder.build()");
            return (FloatValue) build;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final float getValue() {
            return this._builder.getValue();
        }

        public final void setValue(float f) {
            this._builder.setValue(f);
        }

        private Dsl(FloatValue.Builder builder) {
            this._builder = builder;
        }
    }

    private FloatValueKt() {
    }
}
