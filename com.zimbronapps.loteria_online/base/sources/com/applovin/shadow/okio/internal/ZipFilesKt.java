package com.applovin.shadow.okio.internal;

import Ca.I;
import Ca.q;
import Ca.x;
import Da.D;
import Da.S;
import Na.c;
import Qa.l;
import Qa.p;
import Za.B;
import Za.E;
import Za.a;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.FileHandle;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.ZipFileSystem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class ZipFilesKt {
    private static final int BIT_FLAG_ENCRYPTED = 1;
    private static final int BIT_FLAG_UNSUPPORTED_MASK = 1;
    private static final int CENTRAL_FILE_HEADER_SIGNATURE = 33639248;
    public static final int COMPRESSION_METHOD_DEFLATED = 8;
    public static final int COMPRESSION_METHOD_STORED = 0;
    private static final int END_OF_CENTRAL_DIRECTORY_SIGNATURE = 101010256;
    private static final int HEADER_ID_EXTENDED_TIMESTAMP = 21589;
    private static final int HEADER_ID_ZIP64_EXTENDED_INFO = 1;
    private static final int LOCAL_FILE_HEADER_SIGNATURE = 67324752;
    private static final long MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE = 4294967295L;
    private static final int ZIP64_EOCD_RECORD_SIGNATURE = 101075792;
    private static final int ZIP64_LOCATOR_SIGNATURE = 117853008;

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final Boolean invoke(ZipEntry zipEntry) {
            t.g(zipEntry, "it");
            return Boolean.TRUE;
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ N $compressedSize;
        final /* synthetic */ J $hasZip64Extra;
        final /* synthetic */ N $offset;
        final /* synthetic */ long $requiredZip64ExtraSize;
        final /* synthetic */ N $size;
        final /* synthetic */ BufferedSource $this_readEntry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(J j, long j2, N n, BufferedSource bufferedSource, N n2, N n3) {
            super(2);
            this.$hasZip64Extra = j;
            this.$requiredZip64ExtraSize = j2;
            this.$size = n;
            this.$this_readEntry = bufferedSource;
            this.$compressedSize = n2;
            this.$offset = n3;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
            return I.a;
        }

        public final void invoke(int i, long j) {
            if (i == 1) {
                J j2 = this.$hasZip64Extra;
                if (j2.a) {
                    throw new IOException("bad zip: zip64 extra repeated");
                }
                j2.a = true;
                if (j < this.$requiredZip64ExtraSize) {
                    throw new IOException("bad zip: zip64 extra too short");
                }
                N n = this.$size;
                long j3 = n.a;
                if (j3 == 4294967295L) {
                    j3 = this.$this_readEntry.readLongLe();
                }
                n.a = j3;
                N n2 = this.$compressedSize;
                n2.a = n2.a == 4294967295L ? this.$this_readEntry.readLongLe() : 0L;
                N n3 = this.$offset;
                n3.a = n3.a == 4294967295L ? this.$this_readEntry.readLongLe() : 0L;
            }
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ O $createdAtMillis;
        final /* synthetic */ O $lastAccessedAtMillis;
        final /* synthetic */ O $lastModifiedAtMillis;
        final /* synthetic */ BufferedSource $this_readOrSkipLocalHeader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(BufferedSource bufferedSource, O o, O o2, O o3) {
            super(2);
            this.$this_readOrSkipLocalHeader = bufferedSource;
            this.$lastModifiedAtMillis = o;
            this.$lastAccessedAtMillis = o2;
            this.$createdAtMillis = o3;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
            return I.a;
        }

        public final void invoke(int i, long j) {
            if (i == 21589) {
                if (j < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                byte readByte = this.$this_readOrSkipLocalHeader.readByte();
                boolean z = (readByte & 1) == 1;
                boolean z2 = (readByte & 2) == 2;
                boolean z3 = (readByte & 4) == 4;
                BufferedSource bufferedSource = this.$this_readOrSkipLocalHeader;
                long j2 = z ? 5L : 1L;
                if (z2) {
                    j2 += 4;
                }
                if (z3) {
                    j2 += 4;
                }
                if (j < j2) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z) {
                    this.$lastModifiedAtMillis.a = Long.valueOf(bufferedSource.readIntLe() * 1000);
                }
                if (z2) {
                    this.$lastAccessedAtMillis.a = Long.valueOf(this.$this_readOrSkipLocalHeader.readIntLe() * 1000);
                }
                if (z3) {
                    this.$createdAtMillis.a = Long.valueOf(this.$this_readOrSkipLocalHeader.readIntLe() * 1000);
                }
            }
        }
    }

    private static final Map buildIndex(List list) {
        Path path = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
        Map o = S.o(new q[]{x.a(path, new ZipEntry(path, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null))});
        for (ZipEntry zipEntry : D.C0(list, new ZipFilesKt$buildIndex$$inlined$sortedBy$1())) {
            if (((ZipEntry) o.put(zipEntry.getCanonicalPath(), zipEntry)) == null) {
                while (true) {
                    Path parent = zipEntry.getCanonicalPath().parent();
                    if (parent != null) {
                        ZipEntry zipEntry2 = (ZipEntry) o.get(parent);
                        if (zipEntry2 != null) {
                            zipEntry2.getChildren().add(zipEntry.getCanonicalPath());
                            break;
                        }
                        ZipEntry zipEntry3 = new ZipEntry(parent, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                        o.put(parent, zipEntry3);
                        zipEntry3.getChildren().add(zipEntry.getCanonicalPath());
                        zipEntry = zipEntry3;
                    }
                }
            }
        }
        return o;
    }

    private static final Long dosDateTimeToEpochMillis(int i, int i2) {
        if (i2 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i >> 9) & 127) + 1980, ((i >> 5) & 15) - 1, i & 31, (i2 >> 11) & 31, (i2 >> 5) & 63, (i2 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    private static final String getHex(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        String num = Integer.toString(i, a.a(16));
        t.f(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }

    /* JADX WARN: Finally extract failed */
    public static final ZipFileSystem openZip(Path path, FileSystem fileSystem, l lVar) throws IOException {
        BufferedSource buffer;
        t.g(path, "zipPath");
        t.g(fileSystem, "fileSystem");
        t.g(lVar, "predicate");
        FileHandle openReadOnly = fileSystem.openReadOnly(path);
        try {
            long size = openReadOnly.size() - 22;
            if (size < 0) {
                throw new IOException("not a zip: size=" + openReadOnly.size());
            }
            long max = Math.max(size - 65536, 0L);
            do {
                BufferedSource buffer2 = Okio.buffer(openReadOnly.source(size));
                try {
                    if (buffer2.readIntLe() == 101010256) {
                        EocdRecord readEocdRecord = readEocdRecord(buffer2);
                        String readUtf8 = buffer2.readUtf8(readEocdRecord.getCommentByteCount());
                        buffer2.close();
                        long j = size - 20;
                        if (j > 0) {
                            BufferedSource buffer3 = Okio.buffer(openReadOnly.source(j));
                            try {
                                if (buffer3.readIntLe() == 117853008) {
                                    int readIntLe = buffer3.readIntLe();
                                    long readLongLe = buffer3.readLongLe();
                                    if (buffer3.readIntLe() != 1 || readIntLe != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    buffer = Okio.buffer(openReadOnly.source(readLongLe));
                                    try {
                                        int readIntLe2 = buffer.readIntLe();
                                        if (readIntLe2 != 101075792) {
                                            throw new IOException("bad zip: expected " + getHex(101075792) + " but was " + getHex(readIntLe2));
                                        }
                                        readEocdRecord = readZip64EocdRecord(buffer, readEocdRecord);
                                        I i = I.a;
                                        c.a(buffer, (Throwable) null);
                                    } finally {
                                    }
                                }
                                I i2 = I.a;
                                c.a(buffer3, (Throwable) null);
                            } finally {
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        buffer = Okio.buffer(openReadOnly.source(readEocdRecord.getCentralDirectoryOffset()));
                        try {
                            long entryCount = readEocdRecord.getEntryCount();
                            for (long j2 = 0; j2 < entryCount; j2++) {
                                ZipEntry readEntry = readEntry(buffer);
                                if (readEntry.getOffset() >= readEocdRecord.getCentralDirectoryOffset()) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (((Boolean) lVar.invoke(readEntry)).booleanValue()) {
                                    arrayList.add(readEntry);
                                }
                            }
                            I i3 = I.a;
                            c.a(buffer, (Throwable) null);
                            ZipFileSystem zipFileSystem = new ZipFileSystem(path, fileSystem, buildIndex(arrayList), readUtf8);
                            c.a(openReadOnly, (Throwable) null);
                            return zipFileSystem;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } finally {
                                c.a(buffer, th);
                            }
                        }
                    }
                    buffer2.close();
                    size--;
                } finally {
                    buffer2.close();
                }
            } while (size >= max);
            throw new IOException("not a zip: end of central directory signature not found");
        } finally {
        }
    }

    public static /* synthetic */ ZipFileSystem openZip$default(Path path, FileSystem fileSystem, l lVar, int i, Object obj) throws IOException {
        if ((i & 4) != 0) {
            lVar = 1.INSTANCE;
        }
        return openZip(path, fileSystem, lVar);
    }

    public static final ZipEntry readEntry(BufferedSource bufferedSource) throws IOException {
        t.g(bufferedSource, "<this>");
        int readIntLe = bufferedSource.readIntLe();
        if (readIntLe != 33639248) {
            throw new IOException("bad zip: expected " + getHex(33639248) + " but was " + getHex(readIntLe));
        }
        bufferedSource.skip(4L);
        short readShortLe = bufferedSource.readShortLe();
        int i = readShortLe & 65535;
        if ((readShortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(i));
        }
        int readShortLe2 = bufferedSource.readShortLe() & 65535;
        Long dosDateTimeToEpochMillis = dosDateTimeToEpochMillis(bufferedSource.readShortLe() & 65535, bufferedSource.readShortLe() & 65535);
        long readIntLe2 = bufferedSource.readIntLe() & 4294967295L;
        N n = new N();
        n.a = bufferedSource.readIntLe() & 4294967295L;
        N n2 = new N();
        n2.a = bufferedSource.readIntLe() & 4294967295L;
        int readShortLe3 = bufferedSource.readShortLe() & 65535;
        int readShortLe4 = bufferedSource.readShortLe() & 65535;
        int readShortLe5 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(8L);
        N n3 = new N();
        n3.a = bufferedSource.readIntLe() & 4294967295L;
        String readUtf8 = bufferedSource.readUtf8(readShortLe3);
        if (E.S(readUtf8, (char) 0, false, 2, (Object) null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j = n2.a == 4294967295L ? 8 : 0L;
        long j2 = n.a == 4294967295L ? j + 8 : j;
        if (n3.a == 4294967295L) {
            j2 += 8;
        }
        long j3 = j2;
        J j4 = new J();
        readExtra(bufferedSource, readShortLe4, new 1(j4, j3, n2, bufferedSource, n, n3));
        if (j3 <= 0 || j4.a) {
            return new ZipEntry(Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null).resolve(readUtf8), B.y(readUtf8, "/", false, 2, (Object) null), bufferedSource.readUtf8(readShortLe5), readIntLe2, n.a, n2.a, readShortLe2, dosDateTimeToEpochMillis, n3.a);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    private static final EocdRecord readEocdRecord(BufferedSource bufferedSource) throws IOException {
        int readShortLe = bufferedSource.readShortLe() & 65535;
        int readShortLe2 = bufferedSource.readShortLe() & 65535;
        long readShortLe3 = bufferedSource.readShortLe() & 65535;
        if (readShortLe3 != (bufferedSource.readShortLe() & 65535) || readShortLe != 0 || readShortLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(4L);
        return new EocdRecord(readShortLe3, 4294967295L & bufferedSource.readIntLe(), bufferedSource.readShortLe() & 65535);
    }

    private static final void readExtra(BufferedSource bufferedSource, int i, p pVar) {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int readShortLe = bufferedSource.readShortLe() & 65535;
            long readShortLe2 = bufferedSource.readShortLe() & 65535;
            long j2 = j - 4;
            if (j2 < readShortLe2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            bufferedSource.require(readShortLe2);
            long size = bufferedSource.getBuffer().size();
            pVar.invoke(Integer.valueOf(readShortLe), Long.valueOf(readShortLe2));
            long size2 = (bufferedSource.getBuffer().size() + readShortLe2) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + readShortLe);
            }
            if (size2 > 0) {
                bufferedSource.getBuffer().skip(size2);
            }
            j = j2 - readShortLe2;
        }
    }

    public static final FileMetadata readLocalHeader(BufferedSource bufferedSource, FileMetadata fileMetadata) {
        t.g(bufferedSource, "<this>");
        t.g(fileMetadata, "basicMetadata");
        FileMetadata readOrSkipLocalHeader = readOrSkipLocalHeader(bufferedSource, fileMetadata);
        t.d(readOrSkipLocalHeader);
        return readOrSkipLocalHeader;
    }

    private static final FileMetadata readOrSkipLocalHeader(BufferedSource bufferedSource, FileMetadata fileMetadata) {
        O o = new O();
        o.a = fileMetadata != null ? fileMetadata.getLastModifiedAtMillis() : null;
        O o2 = new O();
        O o3 = new O();
        int readIntLe = bufferedSource.readIntLe();
        if (readIntLe != 67324752) {
            throw new IOException("bad zip: expected " + getHex(67324752) + " but was " + getHex(readIntLe));
        }
        bufferedSource.skip(2L);
        short readShortLe = bufferedSource.readShortLe();
        int i = readShortLe & 65535;
        if ((readShortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(i));
        }
        bufferedSource.skip(18L);
        int readShortLe2 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(bufferedSource.readShortLe() & 65535);
        if (fileMetadata == null) {
            bufferedSource.skip(readShortLe2);
            return null;
        }
        readExtra(bufferedSource, readShortLe2, new 1(bufferedSource, o, o2, o3));
        return new FileMetadata(fileMetadata.isRegularFile(), fileMetadata.isDirectory(), null, fileMetadata.getSize(), (Long) o3.a, (Long) o.a, (Long) o2.a, null, 128, null);
    }

    private static final EocdRecord readZip64EocdRecord(BufferedSource bufferedSource, EocdRecord eocdRecord) throws IOException {
        bufferedSource.skip(12L);
        int readIntLe = bufferedSource.readIntLe();
        int readIntLe2 = bufferedSource.readIntLe();
        long readLongLe = bufferedSource.readLongLe();
        if (readLongLe != bufferedSource.readLongLe() || readIntLe != 0 || readIntLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(8L);
        return new EocdRecord(readLongLe, bufferedSource.readLongLe(), eocdRecord.getCommentByteCount());
    }

    public static final void skipLocalHeader(BufferedSource bufferedSource) {
        t.g(bufferedSource, "<this>");
        readOrSkipLocalHeader(bufferedSource, null);
    }
}
