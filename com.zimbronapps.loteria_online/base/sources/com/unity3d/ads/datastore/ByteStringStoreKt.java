package com.unity3d.ads.datastore;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ByteStringStoreKt {
    public static final ByteStringStoreKt INSTANCE = new ByteStringStoreKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ByteStringStoreOuterClass.ByteStringStore.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(ByteStringStoreOuterClass.ByteStringStore.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(ByteStringStoreOuterClass.ByteStringStore.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ ByteStringStoreOuterClass.ByteStringStore _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (ByteStringStoreOuterClass.ByteStringStore) build;
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final ByteString getData() {
            ByteString data = this._builder.getData();
            t.f(data, "_builder.getData()");
            return data;
        }

        public final void setData(ByteString value) {
            t.g(value, "value");
            this._builder.setData(value);
        }

        private Dsl(ByteStringStoreOuterClass.ByteStringStore.Builder builder) {
            this._builder = builder;
        }
    }

    private ByteStringStoreKt() {
    }
}
