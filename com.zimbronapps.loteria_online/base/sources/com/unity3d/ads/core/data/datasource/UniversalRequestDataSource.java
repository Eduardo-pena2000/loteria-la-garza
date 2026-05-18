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
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import fb.g;
import o2.d;
import o2.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UniversalRequestDataSource {
    private final i universalRequestStore;

    @f(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2", f = "UniversalRequestDataSource.kt", l = {16}, m = "invokeSuspend")
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
                UniversalRequestStoreOuterClass.UniversalRequestStore defaultInstance = UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance();
                kotlin.jvm.internal.t.f(defaultInstance, "getDefaultInstance()");
                this.L$0 = null;
                this.label = 1;
                if (fVar.emit(defaultInstance, this) == f) {
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

    @f(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2", f = "UniversalRequestDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ String $key;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str, e eVar) {
            super(2, eVar);
            this.$key = str;
        }

        public final e create(Object obj, e eVar) {
            2 r0 = new 2(this.$key, eVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, e eVar) {
            return ((2) create(universalRequestStore, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = (UniversalRequestStoreOuterClass.UniversalRequestStore.Builder) ((UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
            builder.removeUniversalRequestMap(this.$key);
            GeneratedMessageLite build = builder.build();
            kotlin.jvm.internal.t.f(build, "dataBuilder.build()");
            return build;
        }
    }

    @f(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$set$2", f = "UniversalRequestDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ ByteString $data;
        final /* synthetic */ String $key;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str, ByteString byteString, e eVar) {
            super(2, eVar);
            this.$key = str;
            this.$data = byteString;
        }

        public final e create(Object obj, e eVar) {
            2 r0 = new 2(this.$key, this.$data, eVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, e eVar) {
            return ((2) create(universalRequestStore, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = (UniversalRequestStoreOuterClass.UniversalRequestStore.Builder) ((UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
            builder.putUniversalRequestMap(this.$key, this.$data);
            GeneratedMessageLite build = builder.build();
            kotlin.jvm.internal.t.f(build, "dataBuilder.build()");
            return build;
        }
    }

    public UniversalRequestDataSource(i universalRequestStore) {
        kotlin.jvm.internal.t.g(universalRequestStore, "universalRequestStore");
        this.universalRequestStore = universalRequestStore;
    }

    public final Object get(e eVar) {
        return g.s(g.f(this.universalRequestStore.getData(), new 2(null)), eVar);
    }

    public final Object remove(String str, e eVar) {
        Object a = this.universalRequestStore.a(new 2(str, null), eVar);
        return a == c.f() ? a : I.a;
    }

    public final Object set(String str, ByteString byteString, e eVar) {
        Object a = this.universalRequestStore.a(new 2(str, byteString, null), eVar);
        return a == c.f() ? a : I.a;
    }
}
