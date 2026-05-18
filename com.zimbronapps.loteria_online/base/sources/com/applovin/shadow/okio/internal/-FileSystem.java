package com.applovin.shadow.okio.internal;

import Ca.I;
import Ca.t;
import Da.m;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import Ia.k;
import Qa.p;
import Ya.h;
import Ya.j;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Path;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class -FileSystem {

    @f(c = "com.applovin.shadow.okio.internal.-FileSystem", f = "FileSystem.kt", l = {116, 135, 145}, m = "collectRecursively")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return -FileSystem.collectRecursively(null, null, null, null, false, false, this);
        }
    }

    @f(c = "com.applovin.shadow.okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", l = {96}, m = "invokeSuspend")
    public static final class 1 extends k implements p {
        final /* synthetic */ Path $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ FileSystem $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Path path, FileSystem fileSystem, boolean z, e eVar) {
            super(2, eVar);
            this.$dir = path;
            this.$this_commonListRecursively = fileSystem;
            this.$followSymlinks = z;
        }

        public final e create(Object obj, e eVar) {
            1 r0 = new 1(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, eVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(j jVar, e eVar) {
            return create(jVar, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            j jVar;
            m mVar;
            Iterator it;
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                j jVar2 = (j) this.L$0;
                m mVar2 = new m();
                mVar2.addLast(this.$dir);
                jVar = jVar2;
                mVar = mVar2;
                it = this.$this_commonListRecursively.list(this.$dir).iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                m mVar3 = (m) this.L$1;
                j jVar3 = (j) this.L$0;
                t.b(obj);
                mVar = mVar3;
                jVar = jVar3;
            }
            while (it.hasNext()) {
                Path path = (Path) it.next();
                FileSystem fileSystem = this.$this_commonListRecursively;
                boolean z = this.$followSymlinks;
                this.L$0 = jVar;
                this.L$1 = mVar;
                this.L$2 = it;
                this.label = 1;
                if (-FileSystem.collectRecursively(jVar, fileSystem, mVar, path, z, false, this) == f) {
                    return f;
                }
            }
            return I.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00dd, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00df, code lost:
    
        if (r7 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e1, code lost:
    
        r6.addLast(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e8, code lost:
    
        r7 = r6;
        r6 = r1;
        r1 = r0;
        r0 = r2;
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0123, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0124, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object collectRecursively(Ya.j r15, com.applovin.shadow.okio.FileSystem r16, Da.m r17, com.applovin.shadow.okio.Path r18, boolean r19, boolean r20, Ga.e r21) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.-FileSystem.collectRecursively(Ya.j, com.applovin.shadow.okio.FileSystem, Da.m, com.applovin.shadow.okio.Path, boolean, boolean, Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[Catch: all -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x003a, blocks: (B:3:0x0014, B:9:0x0040, B:20:0x0053, B:33:0x0036, B:30:0x0031, B:5:0x001c), top: B:2:0x0014, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #4 {all -> 0x003a, blocks: (B:3:0x0014, B:9:0x0040, B:20:0x0053, B:33:0x0036, B:30:0x0031, B:5:0x001c), top: B:2:0x0014, inners: #1, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void commonCopy(com.applovin.shadow.okio.FileSystem r4, com.applovin.shadow.okio.Path r5, com.applovin.shadow.okio.Path r6) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.t.g(r4, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.t.g(r5, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.t.g(r6, r0)
            com.applovin.shadow.okio.Source r5 = r4.source(r5)
            r0 = 0
            com.applovin.shadow.okio.Sink r4 = r4.sink(r6)     // Catch: java.lang.Throwable -> L3a
            com.applovin.shadow.okio.BufferedSink r4 = com.applovin.shadow.okio.Okio.buffer(r4)     // Catch: java.lang.Throwable -> L3a
            long r1 = r4.writeAll(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r6 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L2c
            r4.close()     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r4 = move-exception
            goto L3e
        L2c:
            r4 = r0
            goto L3e
        L2e:
            r6 = move-exception
            if (r4 == 0) goto L3c
            r4.close()     // Catch: java.lang.Throwable -> L35
            goto L3c
        L35:
            r4 = move-exception
            Ca.g.a(r6, r4)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r4 = move-exception
            goto L54
        L3c:
            r4 = r6
            r6 = r0
        L3e:
            if (r4 != 0) goto L53
            kotlin.jvm.internal.t.d(r6)     // Catch: java.lang.Throwable -> L3a
            long r1 = r6.longValue()     // Catch: java.lang.Throwable -> L3a
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L61
            r5.close()     // Catch: java.lang.Throwable -> L51
            goto L61
        L51:
            r0 = move-exception
            goto L61
        L53:
            throw r4     // Catch: java.lang.Throwable -> L3a
        L54:
            if (r5 == 0) goto L5e
            r5.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r5 = move-exception
            Ca.g.a(r4, r5)
        L5e:
            r3 = r0
            r0 = r4
            r4 = r3
        L61:
            if (r0 != 0) goto L67
            kotlin.jvm.internal.t.d(r4)
            return
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.-FileSystem.commonCopy(com.applovin.shadow.okio.FileSystem, com.applovin.shadow.okio.Path, com.applovin.shadow.okio.Path):void");
    }

    public static final void commonCreateDirectories(FileSystem fileSystem, Path path, boolean z) throws IOException {
        kotlin.jvm.internal.t.g(fileSystem, "<this>");
        kotlin.jvm.internal.t.g(path, "dir");
        m mVar = new m();
        for (Path path2 = path; path2 != null && !fileSystem.exists(path2); path2 = path2.parent()) {
            mVar.addFirst(path2);
        }
        if (z && mVar.isEmpty()) {
            throw new IOException(path + " already exists.");
        }
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            fileSystem.createDirectory((Path) it.next());
        }
    }

    public static final void commonDeleteRecursively(FileSystem fileSystem, Path path, boolean z) throws IOException {
        kotlin.jvm.internal.t.g(fileSystem, "<this>");
        kotlin.jvm.internal.t.g(path, "fileOrDirectory");
        Iterator it = Ya.k.b(new -FileSystem$commonDeleteRecursively$sequence$1(fileSystem, path, null)).iterator();
        while (it.hasNext()) {
            fileSystem.delete((Path) it.next(), z && !it.hasNext());
        }
    }

    public static final boolean commonExists(FileSystem fileSystem, Path path) throws IOException {
        kotlin.jvm.internal.t.g(fileSystem, "<this>");
        kotlin.jvm.internal.t.g(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    public static final h commonListRecursively(FileSystem fileSystem, Path path, boolean z) throws IOException {
        kotlin.jvm.internal.t.g(fileSystem, "<this>");
        kotlin.jvm.internal.t.g(path, "dir");
        return Ya.k.b(new 1(path, fileSystem, z, null));
    }

    public static final FileMetadata commonMetadata(FileSystem fileSystem, Path path) throws IOException {
        kotlin.jvm.internal.t.g(fileSystem, "<this>");
        kotlin.jvm.internal.t.g(path, "path");
        FileMetadata metadataOrNull = fileSystem.metadataOrNull(path);
        if (metadataOrNull != null) {
            return metadataOrNull;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public static final Path symlinkTarget(FileSystem fileSystem, Path path) throws IOException {
        kotlin.jvm.internal.t.g(fileSystem, "<this>");
        kotlin.jvm.internal.t.g(path, "path");
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path parent = path.parent();
        kotlin.jvm.internal.t.d(parent);
        return parent.resolve(symlinkTarget);
    }
}
