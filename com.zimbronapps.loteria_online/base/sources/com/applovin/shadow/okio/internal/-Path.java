package com.applovin.shadow.okio.internal;

import Da.A;
import Da.D;
import Da.w;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class -Path {
    private static final ByteString ANY_SLASH;
    private static final ByteString BACKSLASH;
    private static final ByteString DOT;
    private static final ByteString DOT_DOT;
    private static final ByteString SLASH;

    static {
        ByteString.Companion companion = ByteString.Companion;
        SLASH = companion.encodeUtf8("/");
        BACKSLASH = companion.encodeUtf8("\\");
        ANY_SLASH = companion.encodeUtf8("/\\");
        DOT = companion.encodeUtf8(".");
        DOT_DOT = companion.encodeUtf8("..");
    }

    public static final /* synthetic */ ByteString access$getBACKSLASH$p() {
        return BACKSLASH;
    }

    public static final /* synthetic */ ByteString access$getDOT$p() {
        return DOT;
    }

    public static final /* synthetic */ ByteString access$getDOT_DOT$p() {
        return DOT_DOT;
    }

    public static final /* synthetic */ int access$getIndexOfLastSlash(Path path) {
        return getIndexOfLastSlash(path);
    }

    public static final /* synthetic */ ByteString access$getSLASH$p() {
        return SLASH;
    }

    public static final /* synthetic */ ByteString access$getSlash(Path path) {
        return getSlash(path);
    }

    public static final /* synthetic */ boolean access$lastSegmentIsDotDot(Path path) {
        return lastSegmentIsDotDot(path);
    }

    public static final /* synthetic */ int access$rootLength(Path path) {
        return rootLength(path);
    }

    public static final /* synthetic */ ByteString access$toSlash(String str) {
        return toSlash(str);
    }

    public static final int commonCompareTo(Path path, Path path2) {
        t.g(path, "<this>");
        t.g(path2, "other");
        return path.getBytes$okio().compareTo(path2.getBytes$okio());
    }

    public static final boolean commonEquals(Path path, Object obj) {
        t.g(path, "<this>");
        return (obj instanceof Path) && t.c(((Path) obj).getBytes$okio(), path.getBytes$okio());
    }

    public static final int commonHashCode(Path path) {
        t.g(path, "<this>");
        return path.getBytes$okio().hashCode();
    }

    public static final boolean commonIsAbsolute(Path path) {
        t.g(path, "<this>");
        return access$rootLength(path) != -1;
    }

    public static final boolean commonIsRelative(Path path) {
        t.g(path, "<this>");
        return access$rootLength(path) == -1;
    }

    public static final boolean commonIsRoot(Path path) {
        t.g(path, "<this>");
        return access$rootLength(path) == path.getBytes$okio().size();
    }

    public static final String commonName(Path path) {
        t.g(path, "<this>");
        return path.nameBytes().utf8();
    }

    public static final ByteString commonNameBytes(Path path) {
        t.g(path, "<this>");
        int access$getIndexOfLastSlash = access$getIndexOfLastSlash(path);
        return access$getIndexOfLastSlash != -1 ? ByteString.substring$default(path.getBytes$okio(), access$getIndexOfLastSlash + 1, 0, 2, null) : (path.volumeLetter() == null || path.getBytes$okio().size() != 2) ? path.getBytes$okio() : ByteString.EMPTY;
    }

    public static final Path commonNormalized(Path path) {
        t.g(path, "<this>");
        return Path.Companion.get(path.toString(), true);
    }

    public static final Path commonParent(Path path) {
        t.g(path, "<this>");
        if (t.c(path.getBytes$okio(), access$getDOT$p()) || t.c(path.getBytes$okio(), access$getSLASH$p()) || t.c(path.getBytes$okio(), access$getBACKSLASH$p()) || access$lastSegmentIsDotDot(path)) {
            return null;
        }
        int access$getIndexOfLastSlash = access$getIndexOfLastSlash(path);
        if (access$getIndexOfLastSlash == 2 && path.volumeLetter() != null) {
            if (path.getBytes$okio().size() == 3) {
                return null;
            }
            return new Path(ByteString.substring$default(path.getBytes$okio(), 0, 3, 1, null));
        }
        if (access$getIndexOfLastSlash == 1 && path.getBytes$okio().startsWith(access$getBACKSLASH$p())) {
            return null;
        }
        if (access$getIndexOfLastSlash != -1 || path.volumeLetter() == null) {
            return access$getIndexOfLastSlash == -1 ? new Path(access$getDOT$p()) : access$getIndexOfLastSlash == 0 ? new Path(ByteString.substring$default(path.getBytes$okio(), 0, 1, 1, null)) : new Path(ByteString.substring$default(path.getBytes$okio(), 0, access$getIndexOfLastSlash, 1, null));
        }
        if (path.getBytes$okio().size() == 2) {
            return null;
        }
        return new Path(ByteString.substring$default(path.getBytes$okio(), 0, 2, 1, null));
    }

    public static final Path commonRelativeTo(Path path, Path path2) {
        t.g(path, "<this>");
        t.g(path2, "other");
        if (!t.c(path.getRoot(), path2.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + path + " and " + path2).toString());
        }
        List segmentsBytes = path.getSegmentsBytes();
        List segmentsBytes2 = path2.getSegmentsBytes();
        int min = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i = 0;
        while (i < min && t.c(segmentsBytes.get(i), segmentsBytes2.get(i))) {
            i++;
        }
        if (i == min && path.getBytes$okio().size() == path2.getBytes$okio().size()) {
            return Path.Companion.get$default(Path.Companion, ".", false, 1, (Object) null);
        }
        if (segmentsBytes2.subList(i, segmentsBytes2.size()).indexOf(access$getDOT_DOT$p()) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + path + " and " + path2).toString());
        }
        Buffer buffer = new Buffer();
        ByteString access$getSlash = access$getSlash(path2);
        if (access$getSlash == null && (access$getSlash = access$getSlash(path)) == null) {
            access$getSlash = access$toSlash(Path.DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        for (int i2 = i; i2 < size; i2++) {
            buffer.write(access$getDOT_DOT$p());
            buffer.write(access$getSlash);
        }
        int size2 = segmentsBytes.size();
        while (i < size2) {
            buffer.write((ByteString) segmentsBytes.get(i));
            buffer.write(access$getSlash);
            i++;
        }
        return toPath(buffer, false);
    }

    public static final Path commonResolve(Path path, String str, boolean z) {
        t.g(path, "<this>");
        t.g(str, "child");
        return commonResolve(path, toPath(new Buffer().writeUtf8(str), false), z);
    }

    public static final Path commonRoot(Path path) {
        t.g(path, "<this>");
        int access$rootLength = access$rootLength(path);
        if (access$rootLength == -1) {
            return null;
        }
        return new Path(path.getBytes$okio().substring(0, access$rootLength));
    }

    public static final List commonSegments(Path path) {
        t.g(path, "<this>");
        ArrayList arrayList = new ArrayList();
        int access$rootLength = access$rootLength(path);
        if (access$rootLength == -1) {
            access$rootLength = 0;
        } else if (access$rootLength < path.getBytes$okio().size() && path.getBytes$okio().getByte(access$rootLength) == 92) {
            access$rootLength++;
        }
        int size = path.getBytes$okio().size();
        int i = access$rootLength;
        while (access$rootLength < size) {
            if (path.getBytes$okio().getByte(access$rootLength) == 47 || path.getBytes$okio().getByte(access$rootLength) == 92) {
                arrayList.add(path.getBytes$okio().substring(i, access$rootLength));
                i = access$rootLength + 1;
            }
            access$rootLength++;
        }
        if (i < path.getBytes$okio().size()) {
            arrayList.add(path.getBytes$okio().substring(i, path.getBytes$okio().size()));
        }
        ArrayList arrayList2 = new ArrayList(w.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ByteString) it.next()).utf8());
        }
        return arrayList2;
    }

    public static final List commonSegmentsBytes(Path path) {
        t.g(path, "<this>");
        ArrayList arrayList = new ArrayList();
        int access$rootLength = access$rootLength(path);
        if (access$rootLength == -1) {
            access$rootLength = 0;
        } else if (access$rootLength < path.getBytes$okio().size() && path.getBytes$okio().getByte(access$rootLength) == 92) {
            access$rootLength++;
        }
        int size = path.getBytes$okio().size();
        int i = access$rootLength;
        while (access$rootLength < size) {
            if (path.getBytes$okio().getByte(access$rootLength) == 47 || path.getBytes$okio().getByte(access$rootLength) == 92) {
                arrayList.add(path.getBytes$okio().substring(i, access$rootLength));
                i = access$rootLength + 1;
            }
            access$rootLength++;
        }
        if (i < path.getBytes$okio().size()) {
            arrayList.add(path.getBytes$okio().substring(i, path.getBytes$okio().size()));
        }
        return arrayList;
    }

    public static final Path commonToPath(String str, boolean z) {
        t.g(str, "<this>");
        return toPath(new Buffer().writeUtf8(str), z);
    }

    public static final String commonToString(Path path) {
        t.g(path, "<this>");
        return path.getBytes$okio().utf8();
    }

    public static final Character commonVolumeLetter(Path path) {
        t.g(path, "<this>");
        if (ByteString.indexOf$default(path.getBytes$okio(), access$getSLASH$p(), 0, 2, (Object) null) != -1 || path.getBytes$okio().size() < 2 || path.getBytes$okio().getByte(1) != 58) {
            return null;
        }
        char c = (char) path.getBytes$okio().getByte(0);
        if (('a' > c || c >= '{') && ('A' > c || c >= '[')) {
            return null;
        }
        return Character.valueOf(c);
    }

    private static /* synthetic */ void getANY_SLASH$annotations() {
    }

    private static /* synthetic */ void getBACKSLASH$annotations() {
    }

    private static /* synthetic */ void getDOT$annotations() {
    }

    private static /* synthetic */ void getDOT_DOT$annotations() {
    }

    private static final int getIndexOfLastSlash(Path path) {
        int lastIndexOf$default = ByteString.lastIndexOf$default(path.getBytes$okio(), SLASH, 0, 2, (Object) null);
        return lastIndexOf$default != -1 ? lastIndexOf$default : ByteString.lastIndexOf$default(path.getBytes$okio(), BACKSLASH, 0, 2, (Object) null);
    }

    private static /* synthetic */ void getSLASH$annotations() {
    }

    private static final ByteString getSlash(Path path) {
        ByteString bytes$okio = path.getBytes$okio();
        ByteString byteString = SLASH;
        if (ByteString.indexOf$default(bytes$okio, byteString, 0, 2, (Object) null) != -1) {
            return byteString;
        }
        ByteString bytes$okio2 = path.getBytes$okio();
        ByteString byteString2 = BACKSLASH;
        if (ByteString.indexOf$default(bytes$okio2, byteString2, 0, 2, (Object) null) != -1) {
            return byteString2;
        }
        return null;
    }

    private static final boolean lastSegmentIsDotDot(Path path) {
        return path.getBytes$okio().endsWith(DOT_DOT) && (path.getBytes$okio().size() == 2 || path.getBytes$okio().rangeEquals(path.getBytes$okio().size() + (-3), SLASH, 0, 1) || path.getBytes$okio().rangeEquals(path.getBytes$okio().size() + (-3), BACKSLASH, 0, 1));
    }

    private static final int rootLength(Path path) {
        if (path.getBytes$okio().size() == 0) {
            return -1;
        }
        if (path.getBytes$okio().getByte(0) == 47) {
            return 1;
        }
        if (path.getBytes$okio().getByte(0) == 92) {
            if (path.getBytes$okio().size() <= 2 || path.getBytes$okio().getByte(1) != 92) {
                return 1;
            }
            int indexOf = path.getBytes$okio().indexOf(BACKSLASH, 2);
            return indexOf == -1 ? path.getBytes$okio().size() : indexOf;
        }
        if (path.getBytes$okio().size() > 2 && path.getBytes$okio().getByte(1) == 58 && path.getBytes$okio().getByte(2) == 92) {
            char c = (char) path.getBytes$okio().getByte(0);
            if ('a' <= c && c < '{') {
                return 3;
            }
            if ('A' <= c && c < '[') {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean startsWithVolumeLetterAndColon(Buffer buffer, ByteString byteString) {
        if (!t.c(byteString, BACKSLASH) || buffer.size() < 2 || buffer.getByte(1L) != 58) {
            return false;
        }
        char c = (char) buffer.getByte(0L);
        return ('a' <= c && c < '{') || ('A' <= c && c < '[');
    }

    public static final Path toPath(Buffer buffer, boolean z) {
        ByteString byteString;
        ByteString readByteString;
        t.g(buffer, "<this>");
        Buffer buffer2 = new Buffer();
        ByteString byteString2 = null;
        int i = 0;
        while (true) {
            if (!buffer.rangeEquals(0L, SLASH)) {
                byteString = BACKSLASH;
                if (!buffer.rangeEquals(0L, byteString)) {
                    break;
                }
            }
            byte readByte = buffer.readByte();
            if (byteString2 == null) {
                byteString2 = toSlash(readByte);
            }
            i++;
        }
        boolean z2 = i >= 2 && t.c(byteString2, byteString);
        if (z2) {
            t.d(byteString2);
            buffer2.write(byteString2);
            buffer2.write(byteString2);
        } else if (i > 0) {
            t.d(byteString2);
            buffer2.write(byteString2);
        } else {
            long indexOfElement = buffer.indexOfElement(ANY_SLASH);
            if (byteString2 == null) {
                byteString2 = indexOfElement == -1 ? toSlash(Path.DIRECTORY_SEPARATOR) : toSlash(buffer.getByte(indexOfElement));
            }
            if (startsWithVolumeLetterAndColon(buffer, byteString2)) {
                if (indexOfElement == 2) {
                    buffer2.write(buffer, 3L);
                } else {
                    buffer2.write(buffer, 2L);
                }
            }
        }
        boolean z3 = buffer2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (!buffer.exhausted()) {
            long indexOfElement2 = buffer.indexOfElement(ANY_SLASH);
            if (indexOfElement2 == -1) {
                readByteString = buffer.readByteString();
            } else {
                readByteString = buffer.readByteString(indexOfElement2);
                buffer.readByte();
            }
            ByteString byteString3 = DOT_DOT;
            if (t.c(readByteString, byteString3)) {
                if (!z3 || !arrayList.isEmpty()) {
                    if (!z || (!z3 && (arrayList.isEmpty() || t.c(D.p0(arrayList), byteString3)))) {
                        arrayList.add(readByteString);
                    } else if (!z2 || arrayList.size() != 1) {
                        A.M(arrayList);
                    }
                }
            } else if (!t.c(readByteString, DOT) && !t.c(readByteString, ByteString.EMPTY)) {
                arrayList.add(readByteString);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                buffer2.write(byteString2);
            }
            buffer2.write((ByteString) arrayList.get(i2));
        }
        if (buffer2.size() == 0) {
            buffer2.write(DOT);
        }
        return new Path(buffer2.readByteString());
    }

    private static final ByteString toSlash(String str) {
        if (t.c(str, "/")) {
            return SLASH;
        }
        if (t.c(str, "\\")) {
            return BACKSLASH;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }

    public static final Path commonResolve(Path path, ByteString byteString, boolean z) {
        t.g(path, "<this>");
        t.g(byteString, "child");
        return commonResolve(path, toPath(new Buffer().write(byteString), false), z);
    }

    private static final ByteString toSlash(byte b) {
        if (b == 47) {
            return SLASH;
        }
        if (b == 92) {
            return BACKSLASH;
        }
        throw new IllegalArgumentException("not a directory separator: " + b);
    }

    public static final Path commonResolve(Path path, Buffer buffer, boolean z) {
        t.g(path, "<this>");
        t.g(buffer, "child");
        return commonResolve(path, toPath(buffer, false), z);
    }

    public static final Path commonResolve(Path path, Path path2, boolean z) {
        t.g(path, "<this>");
        t.g(path2, "child");
        if (path2.isAbsolute() || path2.volumeLetter() != null) {
            return path2;
        }
        ByteString slash = getSlash(path);
        if (slash == null && (slash = getSlash(path2)) == null) {
            slash = toSlash(Path.DIRECTORY_SEPARATOR);
        }
        Buffer buffer = new Buffer();
        buffer.write(path.getBytes$okio());
        if (buffer.size() > 0) {
            buffer.write(slash);
        }
        buffer.write(path2.getBytes$okio());
        return toPath(buffer, z);
    }
}
