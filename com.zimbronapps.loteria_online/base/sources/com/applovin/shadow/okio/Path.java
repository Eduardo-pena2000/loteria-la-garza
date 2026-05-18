package com.applovin.shadow.okio;

import com.applovin.shadow.okio.internal.-Path;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Path implements Comparable {
    public static final Companion Companion = new Companion(null);
    public static final String DIRECTORY_SEPARATOR;
    private final ByteString bytes;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ Path get$default(Companion companion, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.get(str, z);
        }

        public final Path get(File file) {
            kotlin.jvm.internal.t.g(file, "<this>");
            return get$default(this, file, false, 1, (Object) null);
        }

        private Companion() {
        }

        public static /* synthetic */ Path get$default(Companion companion, File file, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.get(file, z);
        }

        public final Path get(String str) {
            kotlin.jvm.internal.t.g(str, "<this>");
            return get$default(this, str, false, 1, (Object) null);
        }

        public static /* synthetic */ Path get$default(Companion companion, java.nio.file.Path path, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.get(path, z);
        }

        public final Path get(java.nio.file.Path path) {
            kotlin.jvm.internal.t.g(path, "<this>");
            return get$default(this, path, false, 1, (Object) null);
        }

        public final Path get(String str, boolean z) {
            kotlin.jvm.internal.t.g(str, "<this>");
            return -Path.commonToPath(str, z);
        }

        public final Path get(File file, boolean z) {
            kotlin.jvm.internal.t.g(file, "<this>");
            String file2 = file.toString();
            kotlin.jvm.internal.t.f(file2, "toString(...)");
            return get(file2, z);
        }

        public final Path get(java.nio.file.Path path, boolean z) {
            kotlin.jvm.internal.t.g(path, "<this>");
            return get(path.toString(), z);
        }
    }

    static {
        String str = File.separator;
        kotlin.jvm.internal.t.f(str, "separator");
        DIRECTORY_SEPARATOR = str;
    }

    public Path(ByteString byteString) {
        kotlin.jvm.internal.t.g(byteString, "bytes");
        this.bytes = byteString;
    }

    public static final Path get(File file) {
        return Companion.get(file);
    }

    public static /* synthetic */ Path resolve$default(Path path, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return path.resolve(str, z);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Path) && kotlin.jvm.internal.t.c(((Path) obj).getBytes$okio(), getBytes$okio());
    }

    public final ByteString getBytes$okio() {
        return this.bytes;
    }

    public final Path getRoot() {
        int access$rootLength = -Path.access$rootLength(this);
        if (access$rootLength == -1) {
            return null;
        }
        return new Path(getBytes$okio().substring(0, access$rootLength));
    }

    public final List getSegments() {
        ArrayList arrayList = new ArrayList();
        int access$rootLength = -Path.access$rootLength(this);
        if (access$rootLength == -1) {
            access$rootLength = 0;
        } else if (access$rootLength < getBytes$okio().size() && getBytes$okio().getByte(access$rootLength) == 92) {
            access$rootLength++;
        }
        int size = getBytes$okio().size();
        int i = access$rootLength;
        while (access$rootLength < size) {
            if (getBytes$okio().getByte(access$rootLength) == 47 || getBytes$okio().getByte(access$rootLength) == 92) {
                arrayList.add(getBytes$okio().substring(i, access$rootLength));
                i = access$rootLength + 1;
            }
            access$rootLength++;
        }
        if (i < getBytes$okio().size()) {
            arrayList.add(getBytes$okio().substring(i, getBytes$okio().size()));
        }
        ArrayList arrayList2 = new ArrayList(Da.w.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ByteString) it.next()).utf8());
        }
        return arrayList2;
    }

    public final List getSegmentsBytes() {
        ArrayList arrayList = new ArrayList();
        int access$rootLength = -Path.access$rootLength(this);
        if (access$rootLength == -1) {
            access$rootLength = 0;
        } else if (access$rootLength < getBytes$okio().size() && getBytes$okio().getByte(access$rootLength) == 92) {
            access$rootLength++;
        }
        int size = getBytes$okio().size();
        int i = access$rootLength;
        while (access$rootLength < size) {
            if (getBytes$okio().getByte(access$rootLength) == 47 || getBytes$okio().getByte(access$rootLength) == 92) {
                arrayList.add(getBytes$okio().substring(i, access$rootLength));
                i = access$rootLength + 1;
            }
            access$rootLength++;
        }
        if (i < getBytes$okio().size()) {
            arrayList.add(getBytes$okio().substring(i, getBytes$okio().size()));
        }
        return arrayList;
    }

    public int hashCode() {
        return getBytes$okio().hashCode();
    }

    public final boolean isAbsolute() {
        return -Path.access$rootLength(this) != -1;
    }

    public final boolean isRelative() {
        return -Path.access$rootLength(this) == -1;
    }

    public final boolean isRoot() {
        return -Path.access$rootLength(this) == getBytes$okio().size();
    }

    public final String name() {
        return nameBytes().utf8();
    }

    public final ByteString nameBytes() {
        int access$getIndexOfLastSlash = -Path.access$getIndexOfLastSlash(this);
        return access$getIndexOfLastSlash != -1 ? ByteString.substring$default(getBytes$okio(), access$getIndexOfLastSlash + 1, 0, 2, null) : (volumeLetter() == null || getBytes$okio().size() != 2) ? getBytes$okio() : ByteString.EMPTY;
    }

    public final Path normalized() {
        return Companion.get(toString(), true);
    }

    public final Path parent() {
        Path path;
        if (kotlin.jvm.internal.t.c(getBytes$okio(), -Path.access$getDOT$p()) || kotlin.jvm.internal.t.c(getBytes$okio(), -Path.access$getSLASH$p()) || kotlin.jvm.internal.t.c(getBytes$okio(), -Path.access$getBACKSLASH$p()) || -Path.access$lastSegmentIsDotDot(this)) {
            return null;
        }
        int access$getIndexOfLastSlash = -Path.access$getIndexOfLastSlash(this);
        if (access$getIndexOfLastSlash != 2 || volumeLetter() == null) {
            if (access$getIndexOfLastSlash == 1 && getBytes$okio().startsWith(-Path.access$getBACKSLASH$p())) {
                return null;
            }
            if (access$getIndexOfLastSlash != -1 || volumeLetter() == null) {
                if (access$getIndexOfLastSlash == -1) {
                    return new Path(-Path.access$getDOT$p());
                }
                if (access$getIndexOfLastSlash != 0) {
                    return new Path(ByteString.substring$default(getBytes$okio(), 0, access$getIndexOfLastSlash, 1, null));
                }
                path = new Path(ByteString.substring$default(getBytes$okio(), 0, 1, 1, null));
            } else {
                if (getBytes$okio().size() == 2) {
                    return null;
                }
                path = new Path(ByteString.substring$default(getBytes$okio(), 0, 2, 1, null));
            }
        } else {
            if (getBytes$okio().size() == 3) {
                return null;
            }
            path = new Path(ByteString.substring$default(getBytes$okio(), 0, 3, 1, null));
        }
        return path;
    }

    public final Path relativeTo(Path path) {
        kotlin.jvm.internal.t.g(path, "other");
        if (!kotlin.jvm.internal.t.c(getRoot(), path.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + path).toString());
        }
        List segmentsBytes = getSegmentsBytes();
        List segmentsBytes2 = path.getSegmentsBytes();
        int min = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i = 0;
        while (i < min && kotlin.jvm.internal.t.c(segmentsBytes.get(i), segmentsBytes2.get(i))) {
            i++;
        }
        if (i == min && getBytes$okio().size() == path.getBytes$okio().size()) {
            return Companion.get$default(Companion, ".", false, 1, (Object) null);
        }
        if (segmentsBytes2.subList(i, segmentsBytes2.size()).indexOf(-Path.access$getDOT_DOT$p()) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + path).toString());
        }
        Buffer buffer = new Buffer();
        ByteString access$getSlash = -Path.access$getSlash(path);
        if (access$getSlash == null && (access$getSlash = -Path.access$getSlash(this)) == null) {
            access$getSlash = -Path.access$toSlash(DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        for (int i2 = i; i2 < size; i2++) {
            buffer.write(-Path.access$getDOT_DOT$p());
            buffer.write(access$getSlash);
        }
        int size2 = segmentsBytes.size();
        while (i < size2) {
            buffer.write((ByteString) segmentsBytes.get(i));
            buffer.write(access$getSlash);
            i++;
        }
        return -Path.toPath(buffer, false);
    }

    public final Path resolve(Path path) {
        kotlin.jvm.internal.t.g(path, "child");
        return -Path.commonResolve(this, path, false);
    }

    public final File toFile() {
        return new File(toString());
    }

    public final java.nio.file.Path toNioPath() {
        java.nio.file.Path a = F.a(toString(), new String[0]);
        kotlin.jvm.internal.t.f(a, "get(...)");
        return a;
    }

    public String toString() {
        return getBytes$okio().utf8();
    }

    public final Character volumeLetter() {
        if (ByteString.indexOf$default(getBytes$okio(), -Path.access$getSLASH$p(), 0, 2, (Object) null) != -1 || getBytes$okio().size() < 2 || getBytes$okio().getByte(1) != 58) {
            return null;
        }
        char c = (char) getBytes$okio().getByte(0);
        if (('a' > c || c >= '{') && ('A' > c || c >= '[')) {
            return null;
        }
        return Character.valueOf(c);
    }

    public static final Path get(File file, boolean z) {
        return Companion.get(file, z);
    }

    public static /* synthetic */ Path resolve$default(Path path, ByteString byteString, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return path.resolve(byteString, z);
    }

    public int compareTo(Path path) {
        kotlin.jvm.internal.t.g(path, "other");
        return getBytes$okio().compareTo(path.getBytes$okio());
    }

    public final Path resolve(Path path, boolean z) {
        kotlin.jvm.internal.t.g(path, "child");
        return -Path.commonResolve(this, path, z);
    }

    public static final Path get(String str) {
        return Companion.get(str);
    }

    public static /* synthetic */ Path resolve$default(Path path, Path path2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return path.resolve(path2, z);
    }

    public final Path resolve(String str) {
        kotlin.jvm.internal.t.g(str, "child");
        return -Path.commonResolve(this, -Path.toPath(new Buffer().writeUtf8(str), false), false);
    }

    public static final Path get(String str, boolean z) {
        return Companion.get(str, z);
    }

    public static final Path get(java.nio.file.Path path) {
        return Companion.get(path);
    }

    public final Path resolve(ByteString byteString) {
        kotlin.jvm.internal.t.g(byteString, "child");
        return -Path.commonResolve(this, -Path.toPath(new Buffer().write(byteString), false), false);
    }

    public static final Path get(java.nio.file.Path path, boolean z) {
        return Companion.get(path, z);
    }

    public final Path resolve(String str, boolean z) {
        kotlin.jvm.internal.t.g(str, "child");
        return -Path.commonResolve(this, -Path.toPath(new Buffer().writeUtf8(str), false), z);
    }

    public final Path resolve(ByteString byteString, boolean z) {
        kotlin.jvm.internal.t.g(byteString, "child");
        return -Path.commonResolve(this, -Path.toPath(new Buffer().write(byteString), false), z);
    }
}
