package s5;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class i implements Closeable {
    public final int a = 1179403647;
    public final FileChannel b;

    public i(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.b = new FileInputStream(file).getChannel();
    }

    public final long a(d dVar, long j, long j2) {
        for (long j3 = 0; j3 < j; j3++) {
            e b = dVar.b(j3);
            if (b.a == 1) {
                long j4 = b.c;
                if (j4 <= j2 && j2 <= b.d + j4) {
                    return (j2 - j4) + b.b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public d b() {
        this.b.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (m(allocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short f = f(allocate, 4L);
        boolean z = f(allocate, 5L) == 2;
        if (f == 1) {
            return new g(z, this);
        }
        if (f == 2) {
            return new h(z, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    public List c() {
        long j;
        c a;
        this.b.position(0L);
        ArrayList arrayList = new ArrayList();
        d b = b();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(b.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = b.f;
        int i = 0;
        if (j2 == 65535) {
            j2 = b.c(0).a;
        }
        long j3 = 0;
        while (true) {
            if (j3 >= j2) {
                j = 0;
                break;
            }
            e b2 = b.b(j3);
            if (b2.a == 2) {
                j = b2.b;
                break;
            }
            j3++;
        }
        if (j == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j4 = 0;
        do {
            a = b.a(j, i);
            long j5 = a.a;
            if (j5 == 1) {
                arrayList2.add(Long.valueOf(a.b));
            } else if (j5 == 5) {
                j4 = a.b;
            }
            i++;
        } while (a.a != 0);
        if (j4 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long a2 = a(b, j2, j4);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(k(allocate, ((Long) it.next()).longValue() + a2));
        }
        return arrayList;
    }

    public void close() {
        this.b.close();
    }

    public void d(ByteBuffer byteBuffer, long j, int i) {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < i) {
            int read = this.b.read(byteBuffer, j + j2);
            if (read == -1) {
                throw new EOFException();
            }
            j2 += read;
        }
        byteBuffer.position(0);
    }

    public short f(ByteBuffer byteBuffer, long j) {
        d(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & 255);
    }

    public int g(ByteBuffer byteBuffer, long j) {
        d(byteBuffer, j, 2);
        return byteBuffer.getShort() & 65535;
    }

    public long h(ByteBuffer byteBuffer, long j) {
        d(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    public String k(ByteBuffer byteBuffer, long j) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short f = f(byteBuffer, j);
            if (f == 0) {
                return sb.toString();
            }
            sb.append((char) f);
            j = j2;
        }
    }

    public long m(ByteBuffer byteBuffer, long j) {
        d(byteBuffer, j, 4);
        return byteBuffer.getInt() & 4294967295L;
    }
}
