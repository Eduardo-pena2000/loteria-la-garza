package com.google.protobuf;

import com.google.protobuf.Mixin;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class MixinKt {
    public static final MixinKt INSTANCE = new MixinKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Mixin.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Mixin.Builder builder) {
                kotlin.jvm.internal.t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Mixin.Builder builder, kotlin.jvm.internal.k kVar) {
            this(builder);
        }

        public final /* synthetic */ Mixin _build() {
            GeneratedMessageLite build = this._builder.build();
            kotlin.jvm.internal.t.f(build, "_builder.build()");
            return (Mixin) build;
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearRoot() {
            this._builder.clearRoot();
        }

        public final String getName() {
            String name = this._builder.getName();
            kotlin.jvm.internal.t.f(name, "_builder.getName()");
            return name;
        }

        public final String getRoot() {
            String root = this._builder.getRoot();
            kotlin.jvm.internal.t.f(root, "_builder.getRoot()");
            return root;
        }

        public final void setName(String str) {
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.setName(str);
        }

        public final void setRoot(String str) {
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.setRoot(str);
        }

        private Dsl(Mixin.Builder builder) {
            this._builder = builder;
        }
    }

    private MixinKt() {
    }
}
