package com.unity3d.ads.datastore;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UniversalRequestStoreKt {
    public static final UniversalRequestStoreKt INSTANCE = new UniversalRequestStoreKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UniversalRequestStoreOuterClass.UniversalRequestStore.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public static final class UniversalRequestMapProxy extends DslProxy {
            private UniversalRequestMapProxy() {
            }
        }

        public /* synthetic */ Dsl(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ UniversalRequestStoreOuterClass.UniversalRequestStore _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (UniversalRequestStoreOuterClass.UniversalRequestStore) build;
        }

        public final /* synthetic */ void clearUniversalRequestMap(DslMap dslMap) {
            t.g(dslMap, "<this>");
            this._builder.clearUniversalRequestMap();
        }

        public final /* synthetic */ DslMap getUniversalRequestMapMap() {
            Map universalRequestMapMap = this._builder.getUniversalRequestMapMap();
            t.f(universalRequestMapMap, "_builder.getUniversalRequestMapMap()");
            return new DslMap(universalRequestMapMap);
        }

        public final /* synthetic */ void putAllUniversalRequestMap(DslMap dslMap, Map map) {
            t.g(dslMap, "<this>");
            t.g(map, "map");
            this._builder.putAllUniversalRequestMap(map);
        }

        public final void putUniversalRequestMap(DslMap dslMap, String key, ByteString value) {
            t.g(dslMap, "<this>");
            t.g(key, "key");
            t.g(value, "value");
            this._builder.putUniversalRequestMap(key, value);
        }

        public final /* synthetic */ void removeUniversalRequestMap(DslMap dslMap, String key) {
            t.g(dslMap, "<this>");
            t.g(key, "key");
            this._builder.removeUniversalRequestMap(key);
        }

        public final /* synthetic */ void setUniversalRequestMap(DslMap dslMap, String key, ByteString value) {
            t.g(dslMap, "<this>");
            t.g(key, "key");
            t.g(value, "value");
            putUniversalRequestMap(dslMap, key, value);
        }

        private Dsl(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder) {
            this._builder = builder;
        }
    }

    private UniversalRequestStoreKt() {
    }
}
