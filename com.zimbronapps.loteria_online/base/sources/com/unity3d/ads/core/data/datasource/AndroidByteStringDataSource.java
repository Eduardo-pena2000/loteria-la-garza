package com.unity3d.ads.core.data.datasource;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import Qa.q;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import fb.g;
import o2.d;
import o2.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidByteStringDataSource implements ByteStringDataSource {
    private final i dataStore;

    @f(c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$get$2", f = "AndroidByteStringDataSource.kt", l = {18}, m = "invokeSuspend")
    public static final class 2 extends l implements q {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public 2(e eVar) {
            super(3, eVar);
        }

        public final Object invoke(fb.f fVar, Throwable th, e eVar) {
            2 r0 = new 2(eVar);
            r0.L$0 = fVar;
            r0.L$1 = th;
            return r0.invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                fb.f fVar = (fb.f) this.L$0;
                Throwable th = (Throwable) this.L$1;
                if (!(th instanceof d)) {
                    throw th;
                }
                ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.Companion;
                ByteStringStoreOuterClass.ByteStringStore.Builder newBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
                kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
                ByteStringStoreKt.Dsl _create = companion._create(newBuilder);
                ByteString EMPTY = ByteString.EMPTY;
                kotlin.jvm.internal.t.f(EMPTY, "EMPTY");
                _create.setData(EMPTY);
                ByteStringStoreOuterClass.ByteStringStore _build = _create._build();
                this.L$0 = null;
                this.label = 1;
                if (fVar.emit(_build, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$set$2", f = "AndroidByteStringDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ ByteString $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(ByteString byteString, e eVar) {
            super(2, eVar);
            this.$data = byteString;
        }

        public final e create(Object obj, e eVar) {
            2 r0 = new 2(this.$data, eVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(ByteStringStoreOuterClass.ByteStringStore byteStringStore, e eVar) {
            return ((2) create(byteStringStore, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            GeneratedMessageLite build = ((ByteStringStoreOuterClass.ByteStringStore.Builder) ((ByteStringStoreOuterClass.ByteStringStore) this.L$0).toBuilder()).setData(this.$data).build();
            kotlin.jvm.internal.t.f(build, "currentData.toBuilder()\n…\n                .build()");
            return build;
        }
    }

    public AndroidByteStringDataSource(i dataStore) {
        kotlin.jvm.internal.t.g(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    public Object get(e eVar) {
        return g.s(g.f(this.dataStore.getData(), new 2(null)), eVar);
    }

    public Object set(ByteString byteString, e eVar) {
        Object a = this.dataStore.a(new 2(byteString, null), eVar);
        return a == c.f() ? a : I.a;
    }
}
