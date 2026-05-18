package com.applovin.shadow.okio.internal;

import Ca.l;
import Ca.m;
import Ca.q;
import Ca.x;
import Da.A;
import Da.D;
import Da.w;
import Za.B;
import Za.E;
import com.applovin.shadow.okio.FileHandle;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class ResourceFileSystem extends FileSystem {
    private static final Companion Companion = new Companion(null);
    private static final Path ROOT = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
    private final ClassLoader classLoader;
    private final l roots$delegate;
    private final FileSystem systemFileSystem;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static final /* synthetic */ boolean access$keepPath(Companion companion, Path path) {
            return companion.keepPath(path);
        }

        private final boolean keepPath(Path path) {
            return !B.x(path.name(), ".class", true);
        }

        public final Path getROOT() {
            return ResourceFileSystem.access$getROOT$cp();
        }

        public final Path removeBase(Path path, Path path2) {
            t.g(path, "<this>");
            t.g(path2, "base");
            return getROOT().resolve(B.G(E.B0(path.toString(), path2.toString()), '\\', '/', false, 4, (Object) null));
        }

        private Companion() {
        }
    }

    public /* synthetic */ ResourceFileSystem(ClassLoader classLoader, boolean z, FileSystem fileSystem, int i, k kVar) {
        this(classLoader, z, (i & 4) != 0 ? FileSystem.SYSTEM : fileSystem);
    }

    public static final /* synthetic */ ClassLoader access$getClassLoader$p(ResourceFileSystem resourceFileSystem) {
        return resourceFileSystem.classLoader;
    }

    public static final /* synthetic */ Companion access$getCompanion$p() {
        return Companion;
    }

    public static final /* synthetic */ Path access$getROOT$cp() {
        return ROOT;
    }

    public static final /* synthetic */ List access$toClasspathRoots(ResourceFileSystem resourceFileSystem, ClassLoader classLoader) {
        return resourceFileSystem.toClasspathRoots(classLoader);
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    private final List getRoots() {
        return (List) this.roots$delegate.getValue();
    }

    private final List toClasspathRoots(ClassLoader classLoader) {
        Enumeration resources = classLoader.getResources("");
        t.f(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        t.f(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            t.d(url);
            q fileRoot = toFileRoot(url);
            if (fileRoot != null) {
                arrayList.add(fileRoot);
            }
        }
        Enumeration resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        t.f(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        t.f(list2, "list(this)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            t.d(url2);
            q jarRoot = toJarRoot(url2);
            if (jarRoot != null) {
                arrayList2.add(jarRoot);
            }
        }
        return D.v0(arrayList, arrayList2);
    }

    private final q toFileRoot(URL url) {
        if (t.c(url.getProtocol(), "file")) {
            return x.a(this.systemFileSystem, Path.Companion.get$default(Path.Companion, new File(url.toURI()), false, 1, (Object) null));
        }
        return null;
    }

    private final q toJarRoot(URL url) {
        int l0;
        String url2 = url.toString();
        t.f(url2, "toString(...)");
        if (!B.N(url2, "jar:file:", false, 2, (Object) null) || (l0 = E.l0(url2, "!", 0, false, 6, (Object) null)) == -1) {
            return null;
        }
        Path.Companion companion = Path.Companion;
        String substring = url2.substring(4, l0);
        t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return x.a(ZipFilesKt.openZip(Path.Companion.get$default(companion, new File(URI.create(substring)), false, 1, (Object) null), this.systemFileSystem, ResourceFileSystem$toJarRoot$zip$1.INSTANCE), ROOT);
    }

    private final String toRelativePath(Path path) {
        return canonicalizeInternal(path).relativeTo(ROOT).toString();
    }

    public Sink appendingSink(Path path, boolean z) {
        t.g(path, "file");
        throw new IOException(this + " is read-only");
    }

    public void atomicMove(Path path, Path path2) {
        t.g(path, "source");
        t.g(path2, "target");
        throw new IOException(this + " is read-only");
    }

    public Path canonicalize(Path path) {
        t.g(path, "path");
        return canonicalizeInternal(path);
    }

    public void createDirectory(Path path, boolean z) {
        t.g(path, "dir");
        throw new IOException(this + " is read-only");
    }

    public void createSymlink(Path path, Path path2) {
        t.g(path, "source");
        t.g(path2, "target");
        throw new IOException(this + " is read-only");
    }

    public void delete(Path path, boolean z) {
        t.g(path, "path");
        throw new IOException(this + " is read-only");
    }

    public List list(Path path) {
        t.g(path, "dir");
        String relativePath = toRelativePath(path);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (q qVar : getRoots()) {
            FileSystem fileSystem = (FileSystem) qVar.a();
            Path path2 = (Path) qVar.b();
            try {
                List list = fileSystem.list(path2.resolve(relativePath));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Companion.access$keepPath(Companion, (Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(w.y(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Companion.removeBase((Path) it.next(), path2));
                }
                A.D(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return D.L0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + path);
    }

    public List listOrNull(Path path) {
        t.g(path, "dir");
        String relativePath = toRelativePath(path);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = getRoots().iterator();
        boolean z = false;
        while (true) {
            Iterable iterable = null;
            if (!it.hasNext()) {
                break;
            }
            q qVar = (q) it.next();
            FileSystem fileSystem = (FileSystem) qVar.a();
            Path path2 = (Path) qVar.b();
            List listOrNull = fileSystem.listOrNull(path2.resolve(relativePath));
            if (listOrNull != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listOrNull) {
                    if (Companion.access$keepPath(Companion, (Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                Iterable arrayList2 = new ArrayList(w.y(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Companion.removeBase((Path) it2.next(), path2));
                }
                iterable = arrayList2;
            }
            if (iterable != null) {
                A.D(linkedHashSet, iterable);
                z = true;
            }
        }
        if (z) {
            return D.L0(linkedHashSet);
        }
        return null;
    }

    public FileMetadata metadataOrNull(Path path) {
        t.g(path, "path");
        if (!Companion.access$keepPath(Companion, path)) {
            return null;
        }
        String relativePath = toRelativePath(path);
        for (q qVar : getRoots()) {
            FileMetadata metadataOrNull = ((FileSystem) qVar.a()).metadataOrNull(((Path) qVar.b()).resolve(relativePath));
            if (metadataOrNull != null) {
                return metadataOrNull;
            }
        }
        return null;
    }

    public FileHandle openReadOnly(Path path) {
        t.g(path, "file");
        if (!Companion.access$keepPath(Companion, path)) {
            throw new FileNotFoundException("file not found: " + path);
        }
        String relativePath = toRelativePath(path);
        for (q qVar : getRoots()) {
            try {
                return ((FileSystem) qVar.a()).openReadOnly(((Path) qVar.b()).resolve(relativePath));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + path);
    }

    public FileHandle openReadWrite(Path path, boolean z, boolean z2) {
        t.g(path, "file");
        throw new IOException("resources are not writable");
    }

    public Sink sink(Path path, boolean z) {
        t.g(path, "file");
        throw new IOException(this + " is read-only");
    }

    public Source source(Path path) {
        Source source;
        t.g(path, "file");
        if (!Companion.access$keepPath(Companion, path)) {
            throw new FileNotFoundException("file not found: " + path);
        }
        Path path2 = ROOT;
        InputStream resourceAsStream = this.classLoader.getResourceAsStream(Path.resolve$default(path2, path, false, 2, (Object) null).relativeTo(path2).toString());
        if (resourceAsStream != null && (source = Okio.source(resourceAsStream)) != null) {
            return source;
        }
        throw new FileNotFoundException("file not found: " + path);
    }

    public ResourceFileSystem(ClassLoader classLoader, boolean z, FileSystem fileSystem) {
        t.g(classLoader, "classLoader");
        t.g(fileSystem, "systemFileSystem");
        this.classLoader = classLoader;
        this.systemFileSystem = fileSystem;
        this.roots$delegate = m.b(new ResourceFileSystem$roots$2(this));
        if (z) {
            getRoots().size();
        }
    }
}
