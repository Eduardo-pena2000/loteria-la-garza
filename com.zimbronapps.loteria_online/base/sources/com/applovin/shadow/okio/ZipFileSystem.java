package com.applovin.shadow.okio;

import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.internal.FixedLengthSource;
import com.applovin.shadow.okio.internal.ZipEntry;
import com.applovin.shadow.okio.internal.ZipFilesKt;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class ZipFileSystem extends FileSystem {
    private static final Companion Companion = new Companion(null);
    private static final Path ROOT = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
    private final String comment;
    private final Map entries;
    private final FileSystem fileSystem;
    private final Path zipPath;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final Path getROOT() {
            return ZipFileSystem.access$getROOT$cp();
        }

        private Companion() {
        }
    }

    public ZipFileSystem(Path path, FileSystem fileSystem, Map map, String str) {
        kotlin.jvm.internal.t.g(path, "zipPath");
        kotlin.jvm.internal.t.g(fileSystem, "fileSystem");
        kotlin.jvm.internal.t.g(map, "entries");
        this.zipPath = path;
        this.fileSystem = fileSystem;
        this.entries = map;
        this.comment = str;
    }

    public static final /* synthetic */ Path access$getROOT$cp() {
        return ROOT;
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    public Sink appendingSink(Path path, boolean z) {
        kotlin.jvm.internal.t.g(path, "file");
        throw new IOException("zip file systems are read-only");
    }

    public void atomicMove(Path path, Path path2) {
        kotlin.jvm.internal.t.g(path, "source");
        kotlin.jvm.internal.t.g(path2, "target");
        throw new IOException("zip file systems are read-only");
    }

    public Path canonicalize(Path path) {
        kotlin.jvm.internal.t.g(path, "path");
        Path canonicalizeInternal = canonicalizeInternal(path);
        if (this.entries.containsKey(canonicalizeInternal)) {
            return canonicalizeInternal;
        }
        throw new FileNotFoundException(String.valueOf(path));
    }

    public void createDirectory(Path path, boolean z) {
        kotlin.jvm.internal.t.g(path, "dir");
        throw new IOException("zip file systems are read-only");
    }

    public void createSymlink(Path path, Path path2) {
        kotlin.jvm.internal.t.g(path, "source");
        kotlin.jvm.internal.t.g(path2, "target");
        throw new IOException("zip file systems are read-only");
    }

    public void delete(Path path, boolean z) {
        kotlin.jvm.internal.t.g(path, "path");
        throw new IOException("zip file systems are read-only");
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #4 {all -> 0x007a, blocks: (B:13:0x0054, B:19:0x0080, B:29:0x008b, B:42:0x0076, B:39:0x0071, B:15:0x0060), top: B:12:0x0054, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b A[Catch: all -> 0x007a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007a, blocks: (B:13:0x0054, B:19:0x0080, B:29:0x008b, B:42:0x0076, B:39:0x0071, B:15:0x0060), top: B:12:0x0054, inners: #1, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.applovin.shadow.okio.FileMetadata metadataOrNull(com.applovin.shadow.okio.Path r14) {
        /*
            r13 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.t.g(r14, r0)
            com.applovin.shadow.okio.Path r14 = r13.canonicalizeInternal(r14)
            java.util.Map r0 = r13.entries
            java.lang.Object r14 = r0.get(r14)
            com.applovin.shadow.okio.internal.ZipEntry r14 = (com.applovin.shadow.okio.internal.ZipEntry) r14
            r0 = 0
            if (r14 != 0) goto L15
            return r0
        L15:
            com.applovin.shadow.okio.FileMetadata r12 = new com.applovin.shadow.okio.FileMetadata
            boolean r1 = r14.isDirectory()
            r2 = r1 ^ 1
            boolean r3 = r14.isDirectory()
            boolean r1 = r14.isDirectory()
            if (r1 == 0) goto L29
            r5 = r0
            goto L32
        L29:
            long r4 = r14.getSize()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r5 = r1
        L32:
            java.lang.Long r7 = r14.getLastModifiedAtMillis()
            r10 = 128(0x80, float:1.8E-43)
            r11 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            long r1 = r14.getOffset()
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L4c
            return r12
        L4c:
            com.applovin.shadow.okio.FileSystem r1 = r13.fileSystem
            com.applovin.shadow.okio.Path r2 = r13.zipPath
            com.applovin.shadow.okio.FileHandle r1 = r1.openReadOnly(r2)
            long r2 = r14.getOffset()     // Catch: java.lang.Throwable -> L7a
            com.applovin.shadow.okio.Source r14 = r1.source(r2)     // Catch: java.lang.Throwable -> L7a
            com.applovin.shadow.okio.BufferedSource r14 = com.applovin.shadow.okio.Okio.buffer(r14)     // Catch: java.lang.Throwable -> L7a
            com.applovin.shadow.okio.FileMetadata r2 = com.applovin.shadow.okio.internal.ZipFilesKt.readLocalHeader(r14, r12)     // Catch: java.lang.Throwable -> L6e
            if (r14 == 0) goto L6c
            r14.close()     // Catch: java.lang.Throwable -> L6a
            goto L6c
        L6a:
            r14 = move-exception
            goto L7e
        L6c:
            r14 = r0
            goto L7e
        L6e:
            r2 = move-exception
            if (r14 == 0) goto L7c
            r14.close()     // Catch: java.lang.Throwable -> L75
            goto L7c
        L75:
            r14 = move-exception
            Ca.g.a(r2, r14)     // Catch: java.lang.Throwable -> L7a
            goto L7c
        L7a:
            r14 = move-exception
            goto L8c
        L7c:
            r14 = r2
            r2 = r0
        L7e:
            if (r14 != 0) goto L8b
            kotlin.jvm.internal.t.d(r2)     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L98
            r1.close()     // Catch: java.lang.Throwable -> L89
            goto L98
        L89:
            r0 = move-exception
            goto L98
        L8b:
            throw r14     // Catch: java.lang.Throwable -> L7a
        L8c:
            if (r1 == 0) goto L96
            r1.close()     // Catch: java.lang.Throwable -> L92
            goto L96
        L92:
            r1 = move-exception
            Ca.g.a(r14, r1)
        L96:
            r2 = r0
            r0 = r14
        L98:
            if (r0 != 0) goto L9e
            kotlin.jvm.internal.t.d(r2)
            return r2
        L9e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.ZipFileSystem.metadataOrNull(com.applovin.shadow.okio.Path):com.applovin.shadow.okio.FileMetadata");
    }

    public FileHandle openReadOnly(Path path) {
        kotlin.jvm.internal.t.g(path, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    public FileHandle openReadWrite(Path path, boolean z, boolean z2) {
        kotlin.jvm.internal.t.g(path, "file");
        throw new IOException("zip entries are not writable");
    }

    public Sink sink(Path path, boolean z) {
        kotlin.jvm.internal.t.g(path, "file");
        throw new IOException("zip file systems are read-only");
    }

    public Source source(Path path) throws IOException {
        BufferedSource bufferedSource;
        kotlin.jvm.internal.t.g(path, "file");
        ZipEntry zipEntry = (ZipEntry) this.entries.get(canonicalizeInternal(path));
        if (zipEntry == null) {
            throw new FileNotFoundException("no such file: " + path);
        }
        FileHandle openReadOnly = this.fileSystem.openReadOnly(this.zipPath);
        Throwable th = null;
        try {
            bufferedSource = Okio.buffer(openReadOnly.source(zipEntry.getOffset()));
            if (openReadOnly != null) {
                try {
                    openReadOnly.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (openReadOnly != null) {
                try {
                    openReadOnly.close();
                } catch (Throwable th4) {
                    Ca.g.a(th3, th4);
                }
            }
            bufferedSource = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.t.d(bufferedSource);
        ZipFilesKt.skipLocalHeader(bufferedSource);
        return zipEntry.getCompressionMethod() == 0 ? new FixedLengthSource(bufferedSource, zipEntry.getSize(), true) : new FixedLengthSource(new InflaterSource(new FixedLengthSource(bufferedSource, zipEntry.getCompressedSize(), true), new Inflater(true)), zipEntry.getSize(), false);
    }

    private final List list(Path path, boolean z) {
        ZipEntry zipEntry = (ZipEntry) this.entries.get(canonicalizeInternal(path));
        if (zipEntry != null) {
            return Da.D.L0(zipEntry.getChildren());
        }
        if (!z) {
            return null;
        }
        throw new IOException("not a directory: " + path);
    }
}
