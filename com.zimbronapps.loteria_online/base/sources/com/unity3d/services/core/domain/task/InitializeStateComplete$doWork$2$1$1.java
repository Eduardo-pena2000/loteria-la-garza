package com.unity3d.services.core.domain.task;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import com.google.protobuf.GeneratedMessageLite;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2$1$1", f = "InitializeStateComplete.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateComplete$doWork$2$1$1 extends l implements p {
    /* synthetic */ Object L$0;
    int label;

    public InitializeStateComplete$doWork$2$1$1(e eVar) {
        super(2, eVar);
    }

    public final e create(Object obj, e eVar) {
        InitializeStateComplete$doWork$2$1$1 initializeStateComplete$doWork$2$1$1 = new InitializeStateComplete$doWork$2$1$1(eVar);
        initializeStateComplete$doWork$2$1$1.L$0 = obj;
        return initializeStateComplete$doWork$2$1$1;
    }

    public final Object invoke(ByteStringStoreOuterClass.ByteStringStore byteStringStore, e eVar) {
        return ((InitializeStateComplete$doWork$2$1$1) create(byteStringStore, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        GeneratedMessageLite build = ((ByteStringStoreOuterClass.ByteStringStore.Builder) ((ByteStringStoreOuterClass.ByteStringStore.Builder) ((ByteStringStoreOuterClass.ByteStringStore) this.L$0).toBuilder()).clear()).build();
        kotlin.jvm.internal.t.f(build, "it.toBuilder().clear().build()");
        return build;
    }
}
