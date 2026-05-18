package com.applovin.shadow.okio;

import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.internal.-FileSystem;
import com.applovin.shadow.okio.internal.ResourceFileSystem;
import java.io.IOException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class FileSystem {
    public static final Companion Companion = new Companion(null);
    public static final FileSystem RESOURCES;
    public static final FileSystem SYSTEM;
    public static final Path SYSTEM_TEMPORARY_DIRECTORY;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final FileSystem get(java.nio.file.FileSystem fileSystem) {
            kotlin.jvm.internal.t.g(fileSystem, "<this>");
            return new NioFileSystemWrappingFileSystem(fileSystem);
        }

        private Companion() {
        }
    }

    public static /* synthetic */ Object -write$default(FileSystem fileSystem, Path path, boolean z, Qa.l lVar, int i, Object obj) throws IOException {
        Object obj2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        kotlin.jvm.internal.t.g(path, "file");
        kotlin.jvm.internal.t.g(lVar, "writerAction");
        BufferedSink buffer = Okio.buffer(fileSystem.sink(path, z));
        Throwable th = null;
        try {
            obj2 = lVar.invoke(buffer);
            kotlin.jvm.internal.r.b(1);
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            kotlin.jvm.internal.r.a(1);
        } catch (Throwable th3) {
            kotlin.jvm.internal.r.b(1);
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th4) {
                    Ca.g.a(th3, th4);
                }
            }
            kotlin.jvm.internal.r.a(1);
            obj2 = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.t.d(obj2);
        return obj2;
    }

    static {
        FileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        SYSTEM = jvmSystemFileSystem;
        Path.Companion companion = Path.Companion;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.t.f(property, "getProperty(...)");
        SYSTEM_TEMPORARY_DIRECTORY = Path.Companion.get$default(companion, property, false, 1, (Object) null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        kotlin.jvm.internal.t.f(classLoader, "getClassLoader(...)");
        RESOURCES = new ResourceFileSystem(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ Sink appendingSink$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fileSystem.appendingSink(path, z);
    }

    public static /* synthetic */ void createDirectories$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.createDirectories(path, z);
    }

    public static /* synthetic */ void createDirectory$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.createDirectory(path, z);
    }

    public static /* synthetic */ void delete$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.delete(path, z);
    }

    public static /* synthetic */ void deleteRecursively$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.deleteRecursively(path, z);
    }

    public static final FileSystem get(java.nio.file.FileSystem fileSystem) {
        return Companion.get(fileSystem);
    }

    public static /* synthetic */ Ya.h listRecursively$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fileSystem.listRecursively(path, z);
    }

    public static /* synthetic */ FileHandle openReadWrite$default(FileSystem fileSystem, Path path, boolean z, boolean z2, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return fileSystem.openReadWrite(path, z, z2);
    }

    public static /* synthetic */ Sink sink$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fileSystem.sink(path, z);
    }

    public final Object -read(Path path, Qa.l lVar) throws IOException {
        Object obj;
        kotlin.jvm.internal.t.g(path, "file");
        kotlin.jvm.internal.t.g(lVar, "readerAction");
        BufferedSource buffer = Okio.buffer(source(path));
        Throwable th = null;
        try {
            obj = lVar.invoke(buffer);
            kotlin.jvm.internal.r.b(1);
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            kotlin.jvm.internal.r.a(1);
        } catch (Throwable th3) {
            kotlin.jvm.internal.r.b(1);
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th4) {
                    Ca.g.a(th3, th4);
                }
            }
            kotlin.jvm.internal.r.a(1);
            th = th3;
            obj = null;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.t.d(obj);
        return obj;
    }

    public final Object -write(Path path, boolean z, Qa.l lVar) throws IOException {
        Object obj;
        kotlin.jvm.internal.t.g(path, "file");
        kotlin.jvm.internal.t.g(lVar, "writerAction");
        BufferedSink buffer = Okio.buffer(sink(path, z));
        Throwable th = null;
        try {
            obj = lVar.invoke(buffer);
            kotlin.jvm.internal.r.b(1);
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            kotlin.jvm.internal.r.a(1);
        } catch (Throwable th3) {
            kotlin.jvm.internal.r.b(1);
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th4) {
                    Ca.g.a(th3, th4);
                }
            }
            kotlin.jvm.internal.r.a(1);
            th = th3;
            obj = null;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.t.d(obj);
        return obj;
    }

    public final Sink appendingSink(Path path) throws IOException {
        kotlin.jvm.internal.t.g(path, "file");
        return appendingSink(path, false);
    }

    public abstract Sink appendingSink(Path path, boolean z) throws IOException;

    public abstract void atomicMove(Path path, Path path2) throws IOException;

    public abstract Path canonicalize(Path path) throws IOException;

    public void copy(Path path, Path path2) throws IOException {
        kotlin.jvm.internal.t.g(path, "source");
        kotlin.jvm.internal.t.g(path2, "target");
        -FileSystem.commonCopy(this, path, path2);
    }

    public final void createDirectories(Path path, boolean z) throws IOException {
        kotlin.jvm.internal.t.g(path, "dir");
        -FileSystem.commonCreateDirectories(this, path, z);
    }

    public final void createDirectory(Path path) throws IOException {
        kotlin.jvm.internal.t.g(path, "dir");
        createDirectory(path, false);
    }

    public abstract void createDirectory(Path path, boolean z) throws IOException;

    public abstract void createSymlink(Path path, Path path2) throws IOException;

    public final void delete(Path path) throws IOException {
        kotlin.jvm.internal.t.g(path, "path");
        delete(path, false);
    }

    public abstract void delete(Path path, boolean z) throws IOException;

    public void deleteRecursively(Path path, boolean z) throws IOException {
        kotlin.jvm.internal.t.g(path, "fileOrDirectory");
        -FileSystem.commonDeleteRecursively(this, path, z);
    }

    public final boolean exists(Path path) throws IOException {
        kotlin.jvm.internal.t.g(path, "path");
        return -FileSystem.commonExists(this, path);
    }

    public abstract List list(Path path) throws IOException;

    public abstract List listOrNull(Path path);

    public Ya.h listRecursively(Path path, boolean z) {
        kotlin.jvm.internal.t.g(path, "dir");
        return -FileSystem.commonListRecursively(this, path, z);
    }

    public final FileMetadata metadata(Path path) throws IOException {
        kotlin.jvm.internal.t.g(path, "path");
        return -FileSystem.commonMetadata(this, path);
    }

    public abstract FileMetadata metadataOrNull(Path path) throws IOException;

    public abstract FileHandle openReadOnly(Path path) throws IOException;

    public final FileHandle openReadWrite(Path path) throws IOException {
        kotlin.jvm.internal.t.g(path, "file");
        return openReadWrite(path, false, false);
    }

    public abstract FileHandle openReadWrite(Path path, boolean z, boolean z2) throws IOException;

    public final Sink sink(Path path) throws IOException {
        kotlin.jvm.internal.t.g(path, "file");
        return sink(path, false);
    }

    public abstract Sink sink(Path path, boolean z) throws IOException;

    public abstract Source source(Path path) throws IOException;

    public final void createDirectories(Path path) throws IOException {
        kotlin.jvm.internal.t.g(path, "dir");
        createDirectories(path, false);
    }

    public final void deleteRecursively(Path path) throws IOException {
        kotlin.jvm.internal.t.g(path, "fileOrDirectory");
        deleteRecursively(path, false);
    }

    public final Ya.h listRecursively(Path path) {
        kotlin.jvm.internal.t.g(path, "dir");
        return listRecursively(path, false);
    }
}
