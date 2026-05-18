package com.applovin.shadow.okio.internal;

import Ca.I;
import Ca.t;
import Da.m;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.k;
import Qa.p;
import Ya.j;
import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Path;

@f(c = "com.applovin.shadow.okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", l = {75}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class -FileSystem$commonDeleteRecursively$sequence$1 extends k implements p {
    final /* synthetic */ Path $fileOrDirectory;
    final /* synthetic */ FileSystem $this_commonDeleteRecursively;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public -FileSystem$commonDeleteRecursively$sequence$1(FileSystem fileSystem, Path path, e eVar) {
        super(2, eVar);
        this.$this_commonDeleteRecursively = fileSystem;
        this.$fileOrDirectory = path;
    }

    public final e create(Object obj, e eVar) {
        -FileSystem$commonDeleteRecursively$sequence$1 r0 = new -FileSystem$commonDeleteRecursively$sequence$1(this.$this_commonDeleteRecursively, this.$fileOrDirectory, eVar);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invoke(j jVar, e eVar) {
        return create(jVar, eVar).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            j jVar = (j) this.L$0;
            FileSystem fileSystem = this.$this_commonDeleteRecursively;
            m mVar = new m();
            Path path = this.$fileOrDirectory;
            this.label = 1;
            if (-FileSystem.collectRecursively(jVar, fileSystem, mVar, path, false, true, this) == f) {
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
