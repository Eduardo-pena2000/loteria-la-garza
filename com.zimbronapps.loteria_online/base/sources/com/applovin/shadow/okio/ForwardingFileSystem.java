package com.applovin.shadow.okio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.P;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class ForwardingFileSystem extends FileSystem {
    private final FileSystem delegate;

    public static final class 1 extends kotlin.jvm.internal.u implements Qa.l {
        public 1() {
            super(1);
        }

        public final Path invoke(Path path) {
            kotlin.jvm.internal.t.g(path, "it");
            return ForwardingFileSystem.this.onPathResult(path, "listRecursively");
        }
    }

    public ForwardingFileSystem(FileSystem fileSystem) {
        kotlin.jvm.internal.t.g(fileSystem, "delegate");
        this.delegate = fileSystem;
    }

    public Sink appendingSink(Path path, boolean z) throws IOException {
        kotlin.jvm.internal.t.g(path, "file");
        return this.delegate.appendingSink(onPathParameter(path, "appendingSink", "file"), z);
    }

    public void atomicMove(Path path, Path path2) throws IOException {
        kotlin.jvm.internal.t.g(path, "source");
        kotlin.jvm.internal.t.g(path2, "target");
        this.delegate.atomicMove(onPathParameter(path, "atomicMove", "source"), onPathParameter(path2, "atomicMove", "target"));
    }

    public Path canonicalize(Path path) throws IOException {
        kotlin.jvm.internal.t.g(path, "path");
        return onPathResult(this.delegate.canonicalize(onPathParameter(path, "canonicalize", "path")), "canonicalize");
    }

    public void createDirectory(Path path, boolean z) throws IOException {
        kotlin.jvm.internal.t.g(path, "dir");
        this.delegate.createDirectory(onPathParameter(path, "createDirectory", "dir"), z);
    }

    public void createSymlink(Path path, Path path2) throws IOException {
        kotlin.jvm.internal.t.g(path, "source");
        kotlin.jvm.internal.t.g(path2, "target");
        this.delegate.createSymlink(onPathParameter(path, "createSymlink", "source"), onPathParameter(path2, "createSymlink", "target"));
    }

    public final FileSystem delegate() {
        return this.delegate;
    }

    public void delete(Path path, boolean z) throws IOException {
        kotlin.jvm.internal.t.g(path, "path");
        this.delegate.delete(onPathParameter(path, "delete", "path"), z);
    }

    public List list(Path path) throws IOException {
        kotlin.jvm.internal.t.g(path, "dir");
        List list = this.delegate.list(onPathParameter(path, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "list"));
        }
        Da.z.B(arrayList);
        return arrayList;
    }

    public List listOrNull(Path path) {
        kotlin.jvm.internal.t.g(path, "dir");
        List listOrNull = this.delegate.listOrNull(onPathParameter(path, "listOrNull", "dir"));
        if (listOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "listOrNull"));
        }
        Da.z.B(arrayList);
        return arrayList;
    }

    public Ya.h listRecursively(Path path, boolean z) {
        kotlin.jvm.internal.t.g(path, "dir");
        return Ya.r.z(this.delegate.listRecursively(onPathParameter(path, "listRecursively", "dir"), z), new 1());
    }

    public FileMetadata metadataOrNull(Path path) throws IOException {
        kotlin.jvm.internal.t.g(path, "path");
        FileMetadata metadataOrNull = this.delegate.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
        if (metadataOrNull == null) {
            return null;
        }
        return metadataOrNull.getSymlinkTarget() == null ? metadataOrNull : FileMetadata.copy$default(metadataOrNull, false, false, onPathResult(metadataOrNull.getSymlinkTarget(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    public Path onPathParameter(Path path, String str, String str2) {
        kotlin.jvm.internal.t.g(path, "path");
        kotlin.jvm.internal.t.g(str, "functionName");
        kotlin.jvm.internal.t.g(str2, "parameterName");
        return path;
    }

    public Path onPathResult(Path path, String str) {
        kotlin.jvm.internal.t.g(path, "path");
        kotlin.jvm.internal.t.g(str, "functionName");
        return path;
    }

    public FileHandle openReadOnly(Path path) throws IOException {
        kotlin.jvm.internal.t.g(path, "file");
        return this.delegate.openReadOnly(onPathParameter(path, "openReadOnly", "file"));
    }

    public FileHandle openReadWrite(Path path, boolean z, boolean z2) throws IOException {
        kotlin.jvm.internal.t.g(path, "file");
        return this.delegate.openReadWrite(onPathParameter(path, "openReadWrite", "file"), z, z2);
    }

    public Sink sink(Path path, boolean z) throws IOException {
        kotlin.jvm.internal.t.g(path, "file");
        return this.delegate.sink(onPathParameter(path, "sink", "file"), z);
    }

    public Source source(Path path) throws IOException {
        kotlin.jvm.internal.t.g(path, "file");
        return this.delegate.source(onPathParameter(path, "source", "file"));
    }

    public String toString() {
        return P.b(getClass()).e() + '(' + this.delegate + ')';
    }
}
