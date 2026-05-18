package com.google.protobuf;

import com.google.protobuf.Internal;
import com.google.protobuf.LazyField;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FieldSet {
    public static final FieldSet d = new FieldSet(true);
    public final Q a;
    public boolean b;
    public boolean c;

    public interface FieldDescriptorLite extends Comparable {
        Internal.EnumLiteMap getEnumType();

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public FieldSet() {
        this.a = Q.u(16);
    }

    public static FieldSet B() {
        return new FieldSet();
    }

    public static Object C(CodedInputStream codedInputStream, WireFormat.FieldType fieldType, boolean z) {
        return z ? WireFormat.readPrimitiveField(codedInputStream, fieldType, WireFormat.b.b) : WireFormat.readPrimitiveField(codedInputStream, fieldType, WireFormat.b.a);
    }

    public static void G(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i, p(fieldType, false));
            H(codedOutputStream, fieldType, obj);
        }
    }

    public static void H(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) {
        switch (a.b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                break;
            case 10:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeStringNoTag((String) obj);
                    break;
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    break;
                }
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj).getNumber());
                    break;
                }
        }
    }

    public static void I(FieldDescriptorLite fieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            if (obj instanceof LazyField) {
                G(codedOutputStream, liteType, number, ((LazyField) obj).getValue());
                return;
            } else {
                G(codedOutputStream, liteType, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!fieldDescriptorLite.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                G(codedOutputStream, liteType, number, it.next());
            }
        } else {
            if (list.isEmpty()) {
                return;
            }
            codedOutputStream.writeTag(number, 2);
            Iterator it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                i += f(liteType, it2.next());
            }
            codedOutputStream.writeUInt32NoTag(i);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                H(codedOutputStream, liteType, it3.next());
            }
        }
    }

    public static Object d(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int e(WireFormat.FieldType fieldType, int i, Object obj) {
        int computeTagSize = CodedOutputStream.computeTagSize(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            computeTagSize *= 2;
        }
        return computeTagSize + f(fieldType, obj);
    }

    public static int f(WireFormat.FieldType fieldType, Object obj) {
        switch (a.b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case 10:
                return obj instanceof LazyField ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int g(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            return e(liteType, number, obj);
        }
        List list = (List) obj;
        int i = 0;
        if (!fieldDescriptorLite.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i += e(liteType, number, it.next());
            }
            return i;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i += f(liteType, it2.next());
        }
        return CodedOutputStream.computeTagSize(number) + i + CodedOutputStream.computeUInt32SizeNoTag(i);
    }

    public static FieldSet i() {
        return d;
    }

    public static int p(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    public static boolean u(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (!fieldDescriptorLite.isRepeated()) {
            return v(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!v(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean v(Object obj) {
        if (obj instanceof MessageLiteOrBuilder) {
            return ((MessageLiteOrBuilder) obj).isInitialized();
        }
        if (obj instanceof LazyField) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static boolean w(WireFormat.FieldType fieldType, Object obj) {
        Internal.checkNotNull(obj);
        switch (a.a[fieldType.getJavaType().ordinal()]) {
            case 7:
                if (!(obj instanceof ByteString) && !(obj instanceof byte[])) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof Internal.EnumLite)) {
                    break;
                }
                break;
            case 9:
                if (!(obj instanceof MessageLite) && !(obj instanceof LazyField)) {
                    break;
                }
                break;
        }
        return false;
    }

    public final void A(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        if (fieldDescriptorLite.isRepeated()) {
            Object j = j(fieldDescriptorLite);
            if (j == null) {
                j = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) j).add(d(it.next()));
            }
            this.a.v(fieldDescriptorLite, j);
            return;
        }
        if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            this.a.v(fieldDescriptorLite, d(value));
            return;
        }
        Object j2 = j(fieldDescriptorLite);
        if (j2 == null) {
            this.a.v(fieldDescriptorLite, d(value));
        } else {
            this.a.v(fieldDescriptorLite, fieldDescriptorLite.internalMergeFrom(((MessageLite) j2).toBuilder(), (MessageLite) value).build());
        }
    }

    public void D(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (!fieldDescriptorLite.isRepeated()) {
            F(fieldDescriptorLite, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                F(fieldDescriptorLite, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.c = true;
        }
        this.a.v(fieldDescriptorLite, obj);
    }

    public void E(FieldDescriptorLite fieldDescriptorLite, int i, Object obj) {
        if (!fieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object j = j(fieldDescriptorLite);
        if (j == null) {
            throw new IndexOutOfBoundsException();
        }
        F(fieldDescriptorLite, obj);
        ((List) j).set(i, obj);
    }

    public final void F(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (!w(fieldDescriptorLite.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(fieldDescriptorLite.getNumber()), fieldDescriptorLite.getLiteType().getJavaType(), obj.getClass().getName()}));
        }
    }

    public void a(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        ArrayList arrayList;
        if (!fieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        F(fieldDescriptorLite, obj);
        Object j = j(fieldDescriptorLite);
        if (j == null) {
            arrayList = new ArrayList();
            this.a.v(fieldDescriptorLite, arrayList);
        } else {
            arrayList = (List) j;
        }
        arrayList.add(obj);
    }

    public void b(FieldDescriptorLite fieldDescriptorLite) {
        this.a.remove(fieldDescriptorLite);
        if (this.a.isEmpty()) {
            this.c = false;
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public FieldSet clone() {
        FieldSet B = B();
        for (int i = 0; i < this.a.o(); i++) {
            Map.Entry n = this.a.n(i);
            B.D((FieldDescriptorLite) n.getKey(), n.getValue());
        }
        for (Map.Entry entry : this.a.q()) {
            B.D((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        B.c = this.c;
        return B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FieldSet) {
            return this.a.equals(((FieldSet) obj).a);
        }
        return false;
    }

    public Iterator h() {
        return this.c ? new LazyField.c(this.a.k().iterator()) : this.a.k().iterator();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Object j(FieldDescriptorLite fieldDescriptorLite) {
        Object obj = this.a.get(fieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
    }

    public int k() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.o(); i2++) {
            i += l(this.a.n(i2));
        }
        Iterator it = this.a.q().iterator();
        while (it.hasNext()) {
            i += l((Map.Entry) it.next());
        }
        return i;
    }

    public final int l(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        return (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) ? g(fieldDescriptorLite, value) : value instanceof LazyField ? CodedOutputStream.computeLazyFieldMessageSetExtensionSize(((FieldDescriptorLite) entry.getKey()).getNumber(), (LazyField) value) : CodedOutputStream.computeMessageSetExtensionSize(((FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) value);
    }

    public Object m(FieldDescriptorLite fieldDescriptorLite, int i) {
        if (!fieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object j = j(fieldDescriptorLite);
        if (j != null) {
            return ((List) j).get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int n(FieldDescriptorLite fieldDescriptorLite) {
        if (!fieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object j = j(fieldDescriptorLite);
        if (j == null) {
            return 0;
        }
        return ((List) j).size();
    }

    public int o() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.o(); i2++) {
            Map.Entry n = this.a.n(i2);
            i += g((FieldDescriptorLite) n.getKey(), n.getValue());
        }
        for (Map.Entry entry : this.a.q()) {
            i += g((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return i;
    }

    public boolean q(FieldDescriptorLite fieldDescriptorLite) {
        if (fieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.a.get(fieldDescriptorLite) != null;
    }

    public boolean r() {
        return this.a.isEmpty();
    }

    public boolean s() {
        return this.b;
    }

    public boolean t() {
        for (int i = 0; i < this.a.o(); i++) {
            if (!u(this.a.n(i))) {
                return false;
            }
        }
        Iterator it = this.a.q().iterator();
        while (it.hasNext()) {
            if (!u((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator x() {
        return this.c ? new LazyField.c(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public void y() {
        if (this.b) {
            return;
        }
        for (int i = 0; i < this.a.o(); i++) {
            Map.Entry n = this.a.n(i);
            if (n.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) n.getValue()).makeImmutable();
            }
        }
        this.a.t();
        this.b = true;
    }

    public void z(FieldSet fieldSet) {
        for (int i = 0; i < fieldSet.a.o(); i++) {
            A(fieldSet.a.n(i));
        }
        Iterator it = fieldSet.a.q().iterator();
        while (it.hasNext()) {
            A((Map.Entry) it.next());
        }
    }

    public FieldSet(boolean z) {
        this(Q.u(0));
        y();
    }

    public FieldSet(Q q) {
        this.a = q;
        y();
    }
}
