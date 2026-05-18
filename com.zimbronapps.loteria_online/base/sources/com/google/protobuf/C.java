package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class c {
    public static volatile int a = 100;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public static final class b {
        public int a;
        public long b;
        public Object c;
        public final ExtensionRegistryLite d;
        public int e;

        public b(ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            this.d = extensionRegistryLite;
        }
    }

    public static int A(byte[] bArr, int i, Internal.ProtobufList protobufList, b bVar) {
        s sVar = (s) protobufList;
        int J = J(bArr, i, bVar);
        int i2 = bVar.a + J;
        while (J < i2) {
            J = M(bArr, J, bVar);
            sVar.addLong(bVar.b);
        }
        if (J == i2) {
            return J;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int B(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, b bVar) {
        o oVar = (o) protobufList;
        int J = J(bArr, i2, bVar);
        oVar.addInt(CodedInputStream.decodeZigZag32(bVar.a));
        while (J < i3) {
            int J2 = J(bArr, J, bVar);
            if (i != bVar.a) {
                break;
            }
            J = J(bArr, J2, bVar);
            oVar.addInt(CodedInputStream.decodeZigZag32(bVar.a));
        }
        return J;
    }

    public static int C(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, b bVar) {
        s sVar = (s) protobufList;
        int M = M(bArr, i2, bVar);
        sVar.addLong(CodedInputStream.decodeZigZag64(bVar.b));
        while (M < i3) {
            int J = J(bArr, M, bVar);
            if (i != bVar.a) {
                break;
            }
            M = M(bArr, J, bVar);
            sVar.addLong(CodedInputStream.decodeZigZag64(bVar.b));
        }
        return M;
    }

    public static int D(byte[] bArr, int i, b bVar) {
        int J = J(bArr, i, bVar);
        int i2 = bVar.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            bVar.c = "";
            return J;
        }
        bVar.c = new String(bArr, J, i2, Internal.UTF_8);
        return J + i2;
    }

    public static int E(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, b bVar) {
        int J = J(bArr, i2, bVar);
        int i4 = bVar.a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            protobufList.add("");
        } else {
            protobufList.add(new String(bArr, J, i4, Internal.UTF_8));
            J += i4;
        }
        while (J < i3) {
            int J2 = J(bArr, J, bVar);
            if (i != bVar.a) {
                break;
            }
            J = J(bArr, J2, bVar);
            int i5 = bVar.a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 == 0) {
                protobufList.add("");
            } else {
                protobufList.add(new String(bArr, J, i5, Internal.UTF_8));
                J += i5;
            }
        }
        return J;
    }

    public static int F(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, b bVar) {
        int J = J(bArr, i2, bVar);
        int i4 = bVar.a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            protobufList.add("");
        } else {
            int i5 = J + i4;
            if (!W.u(bArr, J, i5)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            protobufList.add(new String(bArr, J, i4, Internal.UTF_8));
            J = i5;
        }
        while (J < i3) {
            int J2 = J(bArr, J, bVar);
            if (i != bVar.a) {
                break;
            }
            J = J(bArr, J2, bVar);
            int i6 = bVar.a;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i6 == 0) {
                protobufList.add("");
            } else {
                int i7 = J + i6;
                if (!W.u(bArr, J, i7)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                protobufList.add(new String(bArr, J, i6, Internal.UTF_8));
                J = i7;
            }
        }
        return J;
    }

    public static int G(byte[] bArr, int i, b bVar) {
        int J = J(bArr, i, bVar);
        int i2 = bVar.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            bVar.c = "";
            return J;
        }
        bVar.c = W.h(bArr, J, i2);
        return J + i2;
    }

    public static int H(int i, byte[] bArr, int i2, int i3, UnknownFieldSetLite unknownFieldSetLite, b bVar) {
        if (WireFormat.getTagFieldNumber(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            int M = M(bArr, i2, bVar);
            unknownFieldSetLite.storeField(i, Long.valueOf(bVar.b));
            return M;
        }
        if (tagWireType == 1) {
            unknownFieldSetLite.storeField(i, Long.valueOf(k(bArr, i2)));
            return i2 + 8;
        }
        if (tagWireType == 2) {
            int J = J(bArr, i2, bVar);
            int i4 = bVar.a;
            if (i4 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i4 > bArr.length - J) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i4 == 0) {
                unknownFieldSetLite.storeField(i, ByteString.EMPTY);
            } else {
                unknownFieldSetLite.storeField(i, ByteString.copyFrom(bArr, J, i4));
            }
            return J + i4;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            unknownFieldSetLite.storeField(i, Integer.valueOf(i(bArr, i2)));
            return i2 + 4;
        }
        UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
        int i5 = (i & (-8)) | 4;
        int i6 = bVar.e + 1;
        bVar.e = i6;
        a(i6);
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int J2 = J(bArr, i2, bVar);
            int i8 = bVar.a;
            if (i8 == i5) {
                i7 = i8;
                i2 = J2;
                break;
            }
            i7 = i8;
            i2 = H(i8, bArr, J2, i3, newInstance, bVar);
        }
        bVar.e--;
        if (i2 > i3 || i7 != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        unknownFieldSetLite.storeField(i, newInstance);
        return i2;
    }

    public static int I(int i, byte[] bArr, int i2, b bVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            bVar.a = i3 | (b2 << 7);
            return i4;
        }
        int i5 = i3 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            bVar.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            bVar.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            bVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                bVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int J(byte[] bArr, int i, b bVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return I(b2, bArr, i2, bVar);
        }
        bVar.a = b2;
        return i2;
    }

    public static int K(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, b bVar) {
        o oVar = (o) protobufList;
        int J = J(bArr, i2, bVar);
        oVar.addInt(bVar.a);
        while (J < i3) {
            int J2 = J(bArr, J, bVar);
            if (i != bVar.a) {
                break;
            }
            J = J(bArr, J2, bVar);
            oVar.addInt(bVar.a);
        }
        return J;
    }

    public static int L(long j, byte[] bArr, int i, b bVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i3 = 7;
        while (b2 < 0) {
            int i4 = i2 + 1;
            byte b3 = bArr[i2];
            i3 += 7;
            j2 |= (b3 & Byte.MAX_VALUE) << i3;
            i2 = i4;
            b2 = b3;
        }
        bVar.b = j2;
        return i2;
    }

    public static int M(byte[] bArr, int i, b bVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j < 0) {
            return L(j, bArr, i2, bVar);
        }
        bVar.b = j;
        return i2;
    }

    public static int N(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, b bVar) {
        s sVar = (s) protobufList;
        int M = M(bArr, i2, bVar);
        sVar.addLong(bVar.b);
        while (M < i3) {
            int J = J(bArr, M, bVar);
            if (i != bVar.a) {
                break;
            }
            M = M(bArr, J, bVar);
            sVar.addLong(bVar.b);
        }
        return M;
    }

    public static int O(Object obj, N n, byte[] bArr, int i, int i2, int i3, b bVar) {
        A a2 = (A) n;
        int i4 = bVar.e + 1;
        bVar.e = i4;
        a(i4);
        int b0 = a2.b0(obj, bArr, i, i2, i3, bVar);
        bVar.e--;
        bVar.c = obj;
        return b0;
    }

    public static int P(Object obj, N n, byte[] bArr, int i, int i2, b bVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = I(i4, bArr, i3, bVar);
            i4 = bVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i6 = bVar.e + 1;
        bVar.e = i6;
        a(i6);
        int i7 = i4 + i5;
        n.g(obj, bArr, i5, i7, bVar);
        bVar.e--;
        bVar.c = obj;
        return i7;
    }

    public static int Q(int i, byte[] bArr, int i2, int i3, b bVar) {
        if (WireFormat.getTagFieldNumber(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            return M(bArr, i2, bVar);
        }
        if (tagWireType == 1) {
            return i2 + 8;
        }
        if (tagWireType == 2) {
            return J(bArr, i2, bVar) + bVar.a;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = J(bArr, i2, bVar);
            i5 = bVar.a;
            if (i5 == i4) {
                break;
            }
            i2 = Q(i5, bArr, i2, i3, bVar);
        }
        if (i2 > i3 || i5 != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i2;
    }

    public static void a(int i) {
        if (i >= a) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    public static int b(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, b bVar) {
        d dVar = (d) protobufList;
        int M = M(bArr, i2, bVar);
        dVar.addBoolean(bVar.b != 0);
        while (M < i3) {
            int J = J(bArr, M, bVar);
            if (i != bVar.a) {
                break;
            }
            M = M(bArr, J, bVar);
            dVar.addBoolean(bVar.b != 0);
        }
        return M;
    }

    public static int c(byte[] bArr, int i, b bVar) {
        int J = J(bArr, i, bVar);
        int i2 = bVar.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 > bArr.length - J) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i2 == 0) {
            bVar.c = ByteString.EMPTY;
            return J;
        }
        bVar.c = ByteString.copyFrom(bArr, J, i2);
        return J + i2;
    }

    public static int d(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, b bVar) {
        int J = J(bArr, i2, bVar);
        int i4 = bVar.a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 > bArr.length - J) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i4 == 0) {
            protobufList.add(ByteString.EMPTY);
        } else {
            protobufList.add(ByteString.copyFrom(bArr, J, i4));
            J += i4;
        }
        while (J < i3) {
            int J2 = J(bArr, J, bVar);
            if (i != bVar.a) {
                break;
            }
            J = J(bArr, J2, bVar);
            int i5 = bVar.a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 > bArr.length - J) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i5 == 0) {
                protobufList.add(ByteString.EMPTY);
            } else {
                protobufList.add(ByteString.copyFrom(bArr, J, i5));
                J += i5;
            }
        }
        return J;
    }

    public static double e(byte[] bArr, int i) {
        return Double.longBitsToDouble(k(bArr, i));
    }

    public static int f(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, b bVar) {
        h hVar = (h) protobufList;
        hVar.addDouble(e(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int J = J(bArr, i4, bVar);
            if (i != bVar.a) {
                break;
            }
            hVar.addDouble(e(bArr, J));
            i4 = J + 8;
        }
        return i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int g(int i, byte[] bArr, int i2, int i3, GeneratedMessageLite.ExtendableMessage extendableMessage, GeneratedMessageLite.GeneratedExtension generatedExtension, T t, b bVar) {
        FieldSet fieldSet = extendableMessage.extensions;
        int i4 = i >>> 3;
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (a.a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    h hVar = new h();
                    int t2 = t(bArr, i2, hVar, bVar);
                    fieldSet.D(generatedExtension.descriptor, hVar);
                    return t2;
                case 2:
                    m mVar = new m();
                    int w = w(bArr, i2, mVar, bVar);
                    fieldSet.D(generatedExtension.descriptor, mVar);
                    return w;
                case 3:
                case 4:
                    s sVar = new s();
                    int A = A(bArr, i2, sVar, bVar);
                    fieldSet.D(generatedExtension.descriptor, sVar);
                    return A;
                case 5:
                case 6:
                    o oVar = new o();
                    int z = z(bArr, i2, oVar, bVar);
                    fieldSet.D(generatedExtension.descriptor, oVar);
                    return z;
                case 7:
                case 8:
                    s sVar2 = new s();
                    int v = v(bArr, i2, sVar2, bVar);
                    fieldSet.D(generatedExtension.descriptor, sVar2);
                    return v;
                case 9:
                case 10:
                    o oVar2 = new o();
                    int u = u(bArr, i2, oVar2, bVar);
                    fieldSet.D(generatedExtension.descriptor, oVar2);
                    return u;
                case 11:
                    d dVar = new d();
                    int s = s(bArr, i2, dVar, bVar);
                    fieldSet.D(generatedExtension.descriptor, dVar);
                    return s;
                case 12:
                    o oVar3 = new o();
                    int x = x(bArr, i2, oVar3, bVar);
                    fieldSet.D(generatedExtension.descriptor, oVar3);
                    return x;
                case 13:
                    s sVar3 = new s();
                    int y = y(bArr, i2, sVar3, bVar);
                    fieldSet.D(generatedExtension.descriptor, sVar3);
                    return y;
                case 14:
                    o oVar4 = new o();
                    int z2 = z(bArr, i2, oVar4, bVar);
                    P.z(extendableMessage, i4, oVar4, generatedExtension.descriptor.getEnumType(), null, t);
                    fieldSet.D(generatedExtension.descriptor, oVar4);
                    return z2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
        }
        Object obj = null;
        if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
            i2 = J(bArr, i2, bVar);
            if (generatedExtension.descriptor.getEnumType().findValueByNumber(bVar.a) == null) {
                P.J(extendableMessage, i4, bVar.a, null, t);
                return i2;
            }
            obj = Integer.valueOf(bVar.a);
        } else {
            switch (a.a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    obj = Double.valueOf(e(bArr, i2));
                    i2 += 8;
                    break;
                case 2:
                    obj = Float.valueOf(m(bArr, i2));
                    i2 += 4;
                    break;
                case 3:
                case 4:
                    i2 = M(bArr, i2, bVar);
                    obj = Long.valueOf(bVar.b);
                    break;
                case 5:
                case 6:
                    i2 = J(bArr, i2, bVar);
                    obj = Integer.valueOf(bVar.a);
                    break;
                case 7:
                case 8:
                    obj = Long.valueOf(k(bArr, i2));
                    i2 += 8;
                    break;
                case 9:
                case 10:
                    obj = Integer.valueOf(i(bArr, i2));
                    i2 += 4;
                    break;
                case 11:
                    i2 = M(bArr, i2, bVar);
                    obj = Boolean.valueOf(bVar.b != 0);
                    break;
                case 12:
                    i2 = J(bArr, i2, bVar);
                    obj = Integer.valueOf(CodedInputStream.decodeZigZag32(bVar.a));
                    break;
                case 13:
                    i2 = M(bArr, i2, bVar);
                    obj = Long.valueOf(CodedInputStream.decodeZigZag64(bVar.b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i2 = c(bArr, i2, bVar);
                    obj = bVar.c;
                    break;
                case 16:
                    i2 = D(bArr, i2, bVar);
                    obj = bVar.c;
                    break;
                case 17:
                    int i5 = (i4 << 3) | 4;
                    N c = I.a().c(generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int o = o(c, bArr, i2, i3, i5, bVar);
                        fieldSet.a(generatedExtension.descriptor, bVar.c);
                        return o;
                    }
                    Object j = fieldSet.j(generatedExtension.descriptor);
                    if (j == null) {
                        j = c.newInstance();
                        fieldSet.D(generatedExtension.descriptor, j);
                    }
                    return O(j, c, bArr, i2, i3, i5, bVar);
                case 18:
                    N c2 = I.a().c(generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int q = q(c2, bArr, i2, i3, bVar);
                        fieldSet.a(generatedExtension.descriptor, bVar.c);
                        return q;
                    }
                    Object j2 = fieldSet.j(generatedExtension.descriptor);
                    if (j2 == null) {
                        j2 = c2.newInstance();
                        fieldSet.D(generatedExtension.descriptor, j2);
                    }
                    return P(j2, c2, bArr, i2, i3, bVar);
            }
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.a(generatedExtension.descriptor, obj);
        } else {
            fieldSet.D(generatedExtension.descriptor, obj);
        }
        return i2;
    }

    public static int h(int i, byte[] bArr, int i2, int i3, Object obj, MessageLite messageLite, T t, b bVar) {
        GeneratedMessageLite.GeneratedExtension findLiteExtensionByNumber = bVar.d.findLiteExtensionByNumber(messageLite, i >>> 3);
        if (findLiteExtensionByNumber == null) {
            return H(i, bArr, i2, i3, A.u(obj), bVar);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        return g(i, bArr, i2, i3, extendableMessage, findLiteExtensionByNumber, t, bVar);
    }

    public static int i(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int j(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, b bVar) {
        o oVar = (o) protobufList;
        oVar.addInt(i(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int J = J(bArr, i4, bVar);
            if (i != bVar.a) {
                break;
            }
            oVar.addInt(i(bArr, J));
            i4 = J + 4;
        }
        return i4;
    }

    public static long k(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int l(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, b bVar) {
        s sVar = (s) protobufList;
        sVar.addLong(k(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int J = J(bArr, i4, bVar);
            if (i != bVar.a) {
                break;
            }
            sVar.addLong(k(bArr, J));
            i4 = J + 8;
        }
        return i4;
    }

    public static float m(byte[] bArr, int i) {
        return Float.intBitsToFloat(i(bArr, i));
    }

    public static int n(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, b bVar) {
        m mVar = (m) protobufList;
        mVar.addFloat(m(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int J = J(bArr, i4, bVar);
            if (i != bVar.a) {
                break;
            }
            mVar.addFloat(m(bArr, J));
            i4 = J + 4;
        }
        return i4;
    }

    public static int o(N n, byte[] bArr, int i, int i2, int i3, b bVar) {
        Object newInstance = n.newInstance();
        int O = O(newInstance, n, bArr, i, i2, i3, bVar);
        n.b(newInstance);
        bVar.c = newInstance;
        return O;
    }

    public static int p(N n, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, b bVar) {
        int i4 = (i & (-8)) | 4;
        int o = o(n, bArr, i2, i3, i4, bVar);
        protobufList.add(bVar.c);
        while (o < i3) {
            int J = J(bArr, o, bVar);
            if (i != bVar.a) {
                break;
            }
            o = o(n, bArr, J, i3, i4, bVar);
            protobufList.add(bVar.c);
        }
        return o;
    }

    public static int q(N n, byte[] bArr, int i, int i2, b bVar) {
        Object newInstance = n.newInstance();
        int P = P(newInstance, n, bArr, i, i2, bVar);
        n.b(newInstance);
        bVar.c = newInstance;
        return P;
    }

    public static int r(N n, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, b bVar) {
        int q = q(n, bArr, i2, i3, bVar);
        protobufList.add(bVar.c);
        while (q < i3) {
            int J = J(bArr, q, bVar);
            if (i != bVar.a) {
                break;
            }
            q = q(n, bArr, J, i3, bVar);
            protobufList.add(bVar.c);
        }
        return q;
    }

    public static int s(byte[] bArr, int i, Internal.ProtobufList protobufList, b bVar) {
        d dVar = (d) protobufList;
        int J = J(bArr, i, bVar);
        int i2 = bVar.a + J;
        while (J < i2) {
            J = M(bArr, J, bVar);
            dVar.addBoolean(bVar.b != 0);
        }
        if (J == i2) {
            return J;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int t(byte[] bArr, int i, Internal.ProtobufList protobufList, b bVar) {
        h hVar = (h) protobufList;
        int J = J(bArr, i, bVar);
        int i2 = bVar.a + J;
        while (J < i2) {
            hVar.addDouble(e(bArr, J));
            J += 8;
        }
        if (J == i2) {
            return J;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int u(byte[] bArr, int i, Internal.ProtobufList protobufList, b bVar) {
        o oVar = (o) protobufList;
        int J = J(bArr, i, bVar);
        int i2 = bVar.a + J;
        while (J < i2) {
            oVar.addInt(i(bArr, J));
            J += 4;
        }
        if (J == i2) {
            return J;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int v(byte[] bArr, int i, Internal.ProtobufList protobufList, b bVar) {
        s sVar = (s) protobufList;
        int J = J(bArr, i, bVar);
        int i2 = bVar.a + J;
        while (J < i2) {
            sVar.addLong(k(bArr, J));
            J += 8;
        }
        if (J == i2) {
            return J;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int w(byte[] bArr, int i, Internal.ProtobufList protobufList, b bVar) {
        m mVar = (m) protobufList;
        int J = J(bArr, i, bVar);
        int i2 = bVar.a + J;
        while (J < i2) {
            mVar.addFloat(m(bArr, J));
            J += 4;
        }
        if (J == i2) {
            return J;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int x(byte[] bArr, int i, Internal.ProtobufList protobufList, b bVar) {
        o oVar = (o) protobufList;
        int J = J(bArr, i, bVar);
        int i2 = bVar.a + J;
        while (J < i2) {
            J = J(bArr, J, bVar);
            oVar.addInt(CodedInputStream.decodeZigZag32(bVar.a));
        }
        if (J == i2) {
            return J;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int y(byte[] bArr, int i, Internal.ProtobufList protobufList, b bVar) {
        s sVar = (s) protobufList;
        int J = J(bArr, i, bVar);
        int i2 = bVar.a + J;
        while (J < i2) {
            J = M(bArr, J, bVar);
            sVar.addLong(CodedInputStream.decodeZigZag64(bVar.b));
        }
        if (J == i2) {
            return J;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int z(byte[] bArr, int i, Internal.ProtobufList protobufList, b bVar) {
        o oVar = (o) protobufList;
        int J = J(bArr, i, bVar);
        int i2 = bVar.a + J;
        while (J < i2) {
            J = J(bArr, J, bVar);
            oVar.addInt(bVar.a);
        }
        if (J == i2) {
            return J;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}
