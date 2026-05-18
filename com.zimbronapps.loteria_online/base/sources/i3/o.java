package I3;

import P2.z;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class o {

    public static final class a {
        public final UUID a;
        public final int b;
        public final byte[] c;
        public final UUID[] d;

        public a(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
            this.a = uuid;
            this.b = i;
            this.c = bArr;
            this.d = uuidArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    public static a d(byte[] bArr) {
        UUID[] uuidArr;
        z zVar = new z(bArr);
        if (zVar.g() < 32) {
            return null;
        }
        zVar.T(0);
        int a2 = zVar.a();
        int p = zVar.p();
        if (p != a2) {
            P2.o.h("PsshAtomUtil", "Advertised atom size (" + p + ") does not match buffer size: " + a2);
            return null;
        }
        int p2 = zVar.p();
        if (p2 != 1886614376) {
            P2.o.h("PsshAtomUtil", "Atom type is not pssh: " + p2);
            return null;
        }
        int c = I3.a.c(zVar.p());
        if (c > 1) {
            P2.o.h("PsshAtomUtil", "Unsupported pssh version: " + c);
            return null;
        }
        UUID uuid = new UUID(zVar.z(), zVar.z());
        if (c == 1) {
            int K = zVar.K();
            uuidArr = new UUID[K];
            for (int i = 0; i < K; i++) {
                uuidArr[i] = new UUID(zVar.z(), zVar.z());
            }
        } else {
            uuidArr = null;
        }
        int K2 = zVar.K();
        int a3 = zVar.a();
        if (K2 == a3) {
            byte[] bArr2 = new byte[K2];
            zVar.l(bArr2, 0, K2);
            return new a(uuid, c, bArr2, uuidArr);
        }
        P2.o.h("PsshAtomUtil", "Atom data size (" + K2 + ") does not match the bytes left: " + a3);
        return null;
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a d = d(bArr);
        if (d == null) {
            return null;
        }
        if (uuid.equals(d.a)) {
            return d.c;
        }
        P2.o.h("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + d.a + ".");
        return null;
    }

    public static UUID f(byte[] bArr) {
        a d = d(bArr);
        if (d == null) {
            return null;
        }
        return d.a;
    }

    public static int g(byte[] bArr) {
        a d = d(bArr);
        if (d == null) {
            return -1;
        }
        return d.b;
    }
}
