package com.google.protobuf;

import com.google.protobuf.Option;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OptionKt {
    public static final OptionKt INSTANCE = new OptionKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Option.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Option.Builder builder) {
                kotlin.jvm.internal.t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Option.Builder builder, kotlin.jvm.internal.k kVar) {
            this(builder);
        }

        public final /* synthetic */ Option _build() {
            GeneratedMessageLite build = this._builder.build();
            kotlin.jvm.internal.t.f(build, "_builder.build()");
            return (Option) build;
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getName() {
            String name = this._builder.getName();
            kotlin.jvm.internal.t.f(name, "_builder.getName()");
            return name;
        }

        public final Any getValue() {
            Any value = this._builder.getValue();
            kotlin.jvm.internal.t.f(value, "_builder.getValue()");
            return value;
        }

        public final boolean hasValue() {
            return this._builder.hasValue();
        }

        public final void setName(String str) {
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.setName(str);
        }

        public final void setValue(Any any) {
            kotlin.jvm.internal.t.g(any, "value");
            this._builder.setValue(any);
        }

        private Dsl(Option.Builder builder) {
            this._builder = builder;
        }
    }

    private OptionKt() {
    }
}
