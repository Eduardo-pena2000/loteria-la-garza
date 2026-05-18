package com.google.protobuf;

import com.google.protobuf.FieldMask;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FieldMaskKt {
    public static final FieldMaskKt INSTANCE = new FieldMaskKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final FieldMask.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(FieldMask.Builder builder) {
                kotlin.jvm.internal.t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public static final class PathsProxy extends DslProxy {
            private PathsProxy() {
            }
        }

        public /* synthetic */ Dsl(FieldMask.Builder builder, kotlin.jvm.internal.k kVar) {
            this(builder);
        }

        public final /* synthetic */ FieldMask _build() {
            GeneratedMessageLite build = this._builder.build();
            kotlin.jvm.internal.t.f(build, "_builder.build()");
            return (FieldMask) build;
        }

        public final /* synthetic */ void addAllPaths(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            this._builder.addAllPaths(iterable);
        }

        public final /* synthetic */ void addPaths(DslList dslList, String str) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.addPaths(str);
        }

        public final /* synthetic */ void clearPaths(DslList dslList) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            this._builder.clearPaths();
        }

        public final DslList getPaths() {
            List pathsList = this._builder.getPathsList();
            kotlin.jvm.internal.t.f(pathsList, "_builder.getPathsList()");
            return new DslList(pathsList);
        }

        public final /* synthetic */ void plusAssignAllPaths(DslList dslList, Iterable iterable) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(iterable, "values");
            addAllPaths(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignPaths(DslList dslList, String str) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(str, "value");
            addPaths(dslList, str);
        }

        public final /* synthetic */ void setPaths(DslList dslList, int i, String str) {
            kotlin.jvm.internal.t.g(dslList, "<this>");
            kotlin.jvm.internal.t.g(str, "value");
            this._builder.setPaths(i, str);
        }

        private Dsl(FieldMask.Builder builder) {
            this._builder = builder;
        }
    }

    private FieldMaskKt() {
    }
}
