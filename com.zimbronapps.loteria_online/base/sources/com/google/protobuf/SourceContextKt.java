package com.google.protobuf;

import com.google.protobuf.SourceContext;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SourceContextKt {
    public static final SourceContextKt INSTANCE = new SourceContextKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final SourceContext.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(SourceContext.Builder builder) {
                kotlin.jvm.internal.t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(SourceContext.Builder builder, kotlin.jvm.internal.k kVar) {
            this(builder);
        }

        public final /* synthetic */ SourceContext _build() {
            GeneratedMessageLite build = this._builder.build();
            kotlin.jvm.internal.t.f(build, "_builder.build()");
            return (SourceContext) build;
        }

        public final void clearFileName() {
            this._builder.clearFileName();
        }

        public final String getFileName() {
            String fileName = this._builder.getFileName();
            kotlin.jvm.internal.t.f(fileName, "_builder.getFileName()");
            return fileName;
        }

        public final void setFileName(String str) {
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.setFileName(str);
        }

        private Dsl(SourceContext.Builder builder) {
            this._builder = builder;
        }
    }

    private SourceContextKt() {
    }
}
