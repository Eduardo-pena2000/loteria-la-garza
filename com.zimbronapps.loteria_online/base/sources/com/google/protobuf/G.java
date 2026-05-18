package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class g implements Writer {
    public final CodedOutputStream a;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WireFormat.FieldType.SINT32.ordinal()] = 5;
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
                a[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public g(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.checkNotNull(codedOutputStream, "output");
        this.a = codedOutputStream2;
        codedOutputStream2.wrapper = this;
    }

    public static g Q(CodedOutputStream codedOutputStream) {
        g gVar = codedOutputStream.wrapper;
        return gVar != null ? gVar : new g(codedOutputStream);
    }

    public void A(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.writeBool(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeBoolSizeNoTag(((Boolean) list.get(i4)).booleanValue());
        }
        this.a.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            this.a.writeBoolNoTag(((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    public void B(int i, float f) {
        this.a.writeFloat(i, f);
    }

    public void C(int i) {
        this.a.writeTag(i, 4);
    }

    public void D(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.writeSInt32(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeSInt32SizeNoTag(((Integer) list.get(i4)).intValue());
        }
        this.a.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            this.a.writeSInt32NoTag(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public void E(int i, int i2) {
        this.a.writeEnum(i, i2);
    }

    public void F(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.writeInt64(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeInt64SizeNoTag(((Long) list.get(i4)).longValue());
        }
        this.a.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            this.a.writeInt64NoTag(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public void G(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.writeDouble(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeDoubleSizeNoTag(((Double) list.get(i4)).doubleValue());
        }
        this.a.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            this.a.writeDoubleNoTag(((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    public void H(int i, int i2) {
        this.a.writeSInt32(i, i2);
    }

    public void I(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.writeBytes(i, (ByteString) list.get(i2));
        }
    }

    public void J(int i, List list, N n) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            N(i, list.get(i2), n);
        }
    }

    public void K(int i, Object obj, N n) {
        this.a.writeGroup(i, (MessageLite) obj, n);
    }

    public void L(int i, ByteString byteString) {
        this.a.writeBytes(i, byteString);
    }

    public void M(int i, List list, N n) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            K(i, list.get(i2), n);
        }
    }

    public void N(int i, Object obj, N n) {
        this.a.writeMessage(i, (MessageLite) obj, n);
    }

    public void O(int i, Object obj) {
        this.a.writeMessage(i, (MessageLite) obj);
    }

    public void P(int i, MapEntryLite.b bVar, Map map) {
        if (this.a.isSerializationDeterministic()) {
            U(i, bVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.a.writeTag(i, 2);
            this.a.writeUInt32NoTag(MapEntryLite.computeSerializedSize(bVar, entry.getKey(), entry.getValue()));
            MapEntryLite.writeTo(this.a, bVar, entry.getKey(), entry.getValue());
        }
    }

    public final void R(int i, boolean z, Object obj, MapEntryLite.b bVar) {
        this.a.writeTag(i, 2);
        this.a.writeUInt32NoTag(MapEntryLite.computeSerializedSize(bVar, Boolean.valueOf(z), obj));
        MapEntryLite.writeTo(this.a, bVar, Boolean.valueOf(z), obj);
    }

    public final void S(int i, MapEntryLite.b bVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Integer) it.next()).intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            Object obj = map.get(Integer.valueOf(i4));
            this.a.writeTag(i, 2);
            this.a.writeUInt32NoTag(MapEntryLite.computeSerializedSize(bVar, Integer.valueOf(i4), obj));
            MapEntryLite.writeTo(this.a, bVar, Integer.valueOf(i4), obj);
        }
    }

    public final void T(int i, MapEntryLite.b bVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = ((Long) it.next()).longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            Object obj = map.get(Long.valueOf(j));
            this.a.writeTag(i, 2);
            this.a.writeUInt32NoTag(MapEntryLite.computeSerializedSize(bVar, Long.valueOf(j), obj));
            MapEntryLite.writeTo(this.a, bVar, Long.valueOf(j), obj);
        }
    }

    public final void U(int i, MapEntryLite.b bVar, Map map) {
        switch (a.a[bVar.a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    R(i, false, obj, bVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    R(i, true, obj2, bVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                S(i, bVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                T(i, bVar, map);
                return;
            case 12:
                V(i, bVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + bVar.a);
        }
    }

    public final void V(int i, MapEntryLite.b bVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            strArr[i2] = (String) it.next();
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str = strArr[i3];
            Object obj = map.get(str);
            this.a.writeTag(i, 2);
            this.a.writeUInt32NoTag(MapEntryLite.computeSerializedSize(bVar, str, obj));
            MapEntryLite.writeTo(this.a, bVar, str, obj);
        }
    }

    public final void W(int i, Object obj) {
        if (obj instanceof String) {
            this.a.writeString(i, (String) obj);
        } else {
            this.a.writeBytes(i, (ByteString) obj);
        }
    }

    public void a(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.writeFloat(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeFloatSizeNoTag(((Float) list.get(i4)).floatValue());
        }
        this.a.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            this.a.writeFloatNoTag(((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    public final void b(int i, Object obj) {
        if (obj instanceof ByteString) {
            this.a.writeRawMessageSetExtension(i, (ByteString) obj);
        } else {
            this.a.writeMessageSetExtension(i, (MessageLite) obj);
        }
    }

    public void c(int i, int i2) {
        this.a.writeFixed32(i, i2);
    }

    public void d(int i, List list) {
        int i2 = 0;
        if (!(list instanceof LazyStringList)) {
            while (i2 < list.size()) {
                this.a.writeString(i, (String) list.get(i2));
                i2++;
            }
        } else {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i2 < list.size()) {
                W(i, lazyStringList.getRaw(i2));
                i2++;
            }
        }
    }

    public void e(int i, String str) {
        this.a.writeString(i, str);
    }

    public void f(int i, long j) {
        this.a.writeUInt64(i, j);
    }

    public void g(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.writeInt32(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeInt32SizeNoTag(((Integer) list.get(i4)).intValue());
        }
        this.a.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            this.a.writeInt32NoTag(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public void h(int i, int i2) {
        this.a.writeInt32(i, i2);
    }

    public void i(int i, long j) {
        this.a.writeSFixed64(i, j);
    }

    public void j(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.writeFixed32(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeFixed32SizeNoTag(((Integer) list.get(i4)).intValue());
        }
        this.a.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            this.a.writeFixed32NoTag(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public void k(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.writeUInt32(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeUInt32SizeNoTag(((Integer) list.get(i4)).intValue());
        }
        this.a.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            this.a.writeUInt32NoTag(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public void l(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.writeSInt64(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeSInt64SizeNoTag(((Long) list.get(i4)).longValue());
        }
        this.a.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            this.a.writeSInt64NoTag(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public void m(int i, long j) {
        this.a.writeSInt64(i, j);
    }

    public void n(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.writeEnum(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeEnumSizeNoTag(((Integer) list.get(i4)).intValue());
        }
        this.a.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            this.a.writeEnumNoTag(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public void o(int i, int i2) {
        this.a.writeUInt32(i, i2);
    }

    public void p(int i, double d) {
        this.a.writeDouble(i, d);
    }

    public void q(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.writeSFixed64(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeSFixed64SizeNoTag(((Long) list.get(i4)).longValue());
        }
        this.a.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            this.a.writeSFixed64NoTag(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public void r(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.writeUInt64(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeUInt64SizeNoTag(((Long) list.get(i4)).longValue());
        }
        this.a.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            this.a.writeUInt64NoTag(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public void s(int i, long j) {
        this.a.writeFixed64(i, j);
    }

    public Writer.FieldOrder t() {
        return Writer.FieldOrder.ASCENDING;
    }

    public void u(int i, long j) {
        this.a.writeInt64(i, j);
    }

    public void v(int i, boolean z) {
        this.a.writeBool(i, z);
    }

    public void w(int i, int i2) {
        this.a.writeSFixed32(i, i2);
    }

    public void x(int i) {
        this.a.writeTag(i, 3);
    }

    public void y(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.writeFixed64(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeFixed64SizeNoTag(((Long) list.get(i4)).longValue());
        }
        this.a.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            this.a.writeFixed64NoTag(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public void z(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.writeSFixed32(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeSFixed32SizeNoTag(((Integer) list.get(i4)).intValue());
        }
        this.a.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            this.a.writeSFixed32NoTag(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }
}
