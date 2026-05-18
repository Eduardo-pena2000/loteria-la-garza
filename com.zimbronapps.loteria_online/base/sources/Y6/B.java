package y6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class b {

    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            int dataPosition = parcel.dataPosition();
            int dataSize = parcel.dataSize();
            int length = String.valueOf(str).length();
            StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(dataPosition).length() + 6 + String.valueOf(dataSize).length());
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(dataPosition);
            sb.append(" size=");
            sb.append(dataSize);
            super(sb.toString());
        }
    }

    public static Double A(Parcel parcel, int i) {
        int K = K(parcel, i);
        if (K == 0) {
            return null;
        }
        O(parcel, i, K, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float B(Parcel parcel, int i) {
        N(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float C(Parcel parcel, int i) {
        int K = K(parcel, i);
        if (K == 0) {
            return null;
        }
        O(parcel, i, K, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int D(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder E(Parcel parcel, int i) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + K);
        return readStrongBinder;
    }

    public static int F(Parcel parcel, int i) {
        N(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer G(Parcel parcel, int i) {
        int K = K(parcel, i);
        if (K == 0) {
            return null;
        }
        O(parcel, i, K, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long H(Parcel parcel, int i) {
        N(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long I(Parcel parcel, int i) {
        int K = K(parcel, i);
        if (K == 0) {
            return null;
        }
        O(parcel, i, K, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static short J(Parcel parcel, int i) {
        N(parcel, i, 4);
        return (short) parcel.readInt();
    }

    public static int K(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void L(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + K(parcel, i));
    }

    public static int M(Parcel parcel) {
        int D = D(parcel);
        int K = K(parcel, D);
        int w = w(D);
        int dataPosition = parcel.dataPosition();
        if (w != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(D))), parcel);
        }
        int i = K + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i).length());
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new a(sb.toString(), parcel);
    }

    public static void N(Parcel parcel, int i, int i2) {
        int K = K(parcel, i);
        if (K == i2) {
            return;
        }
        String hexString = Integer.toHexString(K);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(K).length() + 4 + String.valueOf(hexString).length() + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(K);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }

    public static void O(Parcel parcel, int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(i2);
        int length = String.valueOf(i3).length();
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(i2).length() + 4 + String.valueOf(hexString).length() + 1);
        sb.append("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(i2);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }

    public static BigDecimal a(Parcel parcel, int i) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + K);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static BigDecimal[] b(Parcel parcel, int i) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + K);
        return bigDecimalArr;
    }

    public static BigInteger c(Parcel parcel, int i) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + K);
        return new BigInteger(createByteArray);
    }

    public static BigInteger[] d(Parcel parcel, int i) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + K);
        return bigIntegerArr;
    }

    public static boolean[] e(Parcel parcel, int i) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + K);
        return createBooleanArray;
    }

    public static Bundle f(Parcel parcel, int i) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + K);
        return readBundle;
    }

    public static byte[] g(Parcel parcel, int i) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + K);
        return createByteArray;
    }

    public static byte[][] h(Parcel parcel, int i) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + K);
        return bArr;
    }

    public static double[] i(Parcel parcel, int i) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + K);
        return createDoubleArray;
    }

    public static float[] j(Parcel parcel, int i) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + K);
        return createFloatArray;
    }

    public static int[] k(Parcel parcel, int i) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + K);
        return createIntArray;
    }

    public static ArrayList l(Parcel parcel, int i) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + K);
        return arrayList;
    }

    public static long[] m(Parcel parcel, int i) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + K);
        return createLongArray;
    }

    public static Parcel n(Parcel parcel, int i) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, K);
        parcel.setDataPosition(dataPosition + K);
        return obtain;
    }

    public static Parcel[] o(Parcel parcel, int i) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + K);
        return parcelArr;
    }

    public static Parcelable p(Parcel parcel, int i, Parcelable.Creator creator) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + K);
        return parcelable;
    }

    public static String q(Parcel parcel, int i) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + K);
        return readString;
    }

    public static String[] r(Parcel parcel, int i) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + K);
        return createStringArray;
    }

    public static ArrayList s(Parcel parcel, int i) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        ArrayList createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + K);
        return createStringArrayList;
    }

    public static Object[] t(Parcel parcel, int i, Parcelable.Creator creator) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + K);
        return createTypedArray;
    }

    public static ArrayList u(Parcel parcel, int i, Parcelable.Creator creator) {
        int K = K(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (K == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + K);
        return createTypedArrayList;
    }

    public static void v(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new a(sb.toString(), parcel);
    }

    public static int w(int i) {
        return (char) i;
    }

    public static boolean x(Parcel parcel, int i) {
        N(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean y(Parcel parcel, int i) {
        int K = K(parcel, i);
        if (K == 0) {
            return null;
        }
        O(parcel, i, K, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static double z(Parcel parcel, int i) {
        N(parcel, i, 8);
        return parcel.readDouble();
    }
}
