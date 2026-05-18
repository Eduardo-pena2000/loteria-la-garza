package com.applovin.shadow.okio;

import com.applovin.shadow.okio.Path;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class JvmSystemFileSystem extends FileSystem {
    private final void requireCreate(Path path) {
        if (exists(path)) {
            throw new IOException(path + " already exists.");
        }
    }

    private final void requireExist(Path path) {
        if (exists(path)) {
            return;
        }
        throw new IOException(path + " doesn't exist.");
    }

    public Sink appendingSink(Path path, boolean z) {
        kotlin.jvm.internal.t.g(path, "file");
        if (z) {
            requireExist(path);
        }
        return Okio.sink(path.toFile(), true);
    }

    public void atomicMove(Path path, Path path2) {
        kotlin.jvm.internal.t.g(path, "source");
        kotlin.jvm.internal.t.g(path2, "target");
        if (path.toFile().renameTo(path2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + path + " to " + path2);
    }

    public Path canonicalize(Path path) {
        kotlin.jvm.internal.t.g(path, "path");
        File canonicalFile = path.toFile().getCanonicalFile();
        if (!canonicalFile.exists()) {
            throw new FileNotFoundException("no such file");
        }
        Path.Companion companion = Path.Companion;
        kotlin.jvm.internal.t.d(canonicalFile);
        return Path.Companion.get$default(companion, canonicalFile, false, 1, (Object) null);
    }

    public void createDirectory(Path path, boolean z) {
        kotlin.jvm.internal.t.g(path, "dir");
        if (path.toFile().mkdir()) {
            return;
        }
        FileMetadata metadataOrNull = metadataOrNull(path);
        if (metadataOrNull == null || !metadataOrNull.isDirectory()) {
            throw new IOException("failed to create directory: " + path);
        }
        if (z) {
            throw new IOException(path + " already exists.");
        }
    }

    public void createSymlink(Path path, Path path2) {
        kotlin.jvm.internal.t.g(path, "source");
        kotlin.jvm.internal.t.g(path2, "target");
        throw new IOException("unsupported");
    }

    public void delete(Path path, boolean z) {
        kotlin.jvm.internal.t.g(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (z) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    public List list(Path path) {
        kotlin.jvm.internal.t.g(path, "dir");
        List list = list(path, true);
        kotlin.jvm.internal.t.d(list);
        return list;
    }

    public List listOrNull(Path path) {
        kotlin.jvm.internal.t.g(path, "dir");
        return list(path, false);
    }

    public FileMetadata metadataOrNull(Path path) {
        kotlin.jvm.internal.t.g(path, "path");
        File file = path.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || file.exists()) {
            return new FileMetadata(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null, null, 128, null);
        }
        return null;
    }

    public FileHandle openReadOnly(Path path) {
        kotlin.jvm.internal.t.g(path, "file");
        return new JvmFileHandle(false, new RandomAccessFile(path.toFile(), "r"));
    }

    public FileHandle openReadWrite(Path path, boolean z, boolean z2) {
        kotlin.jvm.internal.t.g(path, "file");
        if (z && z2) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        if (z) {
            requireCreate(path);
        }
        if (z2) {
            requireExist(path);
        }
        return new JvmFileHandle(true, new RandomAccessFile(path.toFile(), "rw"));
    }

    public Sink sink(Path path, boolean z) {
        kotlin.jvm.internal.t.g(path, "file");
        if (z) {
            requireCreate(path);
        }
        return Okio.sink$default(path.toFile(), false, 1, null);
    }

    public Source source(Path path) {
        kotlin.jvm.internal.t.g(path, "file");
        return Okio.source(path.toFile());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    private final List list(Path path, boolean z) {
        File file = path.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                kotlin.jvm.internal.t.d(str);
                arrayList.add(path.resolve(str));
            }
            Da.z.B(arrayList);
            return arrayList;
        }
        if (!z) {
            return null;
        }
        if (file.exists()) {
            throw new IOException("failed to list " + path);
        }
        throw new FileNotFoundException("no such file: " + path);
    }
}
