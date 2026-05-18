package com.google.protobuf;

import com.google.protobuf.WireFormat;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class f implements L {
    public final CodedInputStream a;
    public int b;
    public int c;
    public int d = 0;

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
                a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public f(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.checkNotNull(codedInputStream, "input");
        this.a = codedInputStream2;
        codedInputStream2.wrapper = this;
    }

    public static f Q(CodedInputStream codedInputStream) {
        f fVar = codedInputStream.wrapper;
        return fVar != null ? fVar : new f(codedInputStream);
    }

    public int A() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.readTag();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.getTagFieldNumber(i2);
    }

    public void B(List list) {
        W(list, false);
    }

    public void C(List list) {
        int readTag;
        int readTag2;
        if (!(list instanceof m)) {
            int tagWireType = WireFormat.getTagWireType(this.b);
            if (tagWireType == 2) {
                int readUInt32 = this.a.readUInt32();
                Z(readUInt32);
                int totalBytesRead = this.a.getTotalBytesRead() + readUInt32;
                do {
                    list.add(Float.valueOf(this.a.readFloat()));
                } while (this.a.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(this.a.readFloat()));
                if (this.a.isAtEnd()) {
                    return;
                } else {
                    readTag = this.a.readTag();
                }
            } while (readTag == this.b);
            this.d = readTag;
            return;
        }
        m mVar = (m) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 2) {
            int readUInt322 = this.a.readUInt32();
            Z(readUInt322);
            int totalBytesRead2 = this.a.getTotalBytesRead() + readUInt322;
            do {
                mVar.addFloat(this.a.readFloat());
            } while (this.a.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            mVar.addFloat(this.a.readFloat());
            if (this.a.isAtEnd()) {
                return;
            } else {
                readTag2 = this.a.readTag();
            }
        } while (readTag2 == this.b);
        this.d = readTag2;
    }

    public boolean D() {
        int i;
        if (this.a.isAtEnd() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.skipField(i);
    }

    public int E() {
        Y(5);
        return this.a.readSFixed32();
    }

    public void F(List list) {
        int readTag;
        if (WireFormat.getTagWireType(this.b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(o());
            if (this.a.isAtEnd()) {
                return;
            } else {
                readTag = this.a.readTag();
            }
        } while (readTag == this.b);
        this.d = readTag;
    }

    public void G(List list) {
        int readTag;
        int readTag2;
        if (!(list instanceof h)) {
            int tagWireType = WireFormat.getTagWireType(this.b);
            if (tagWireType == 1) {
                do {
                    list.add(Double.valueOf(this.a.readDouble()));
                    if (this.a.isAtEnd()) {
                        return;
                    } else {
                        readTag = this.a.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readUInt32 = this.a.readUInt32();
            a0(readUInt32);
            int totalBytesRead = this.a.getTotalBytesRead() + readUInt32;
            do {
                list.add(Double.valueOf(this.a.readDouble()));
            } while (this.a.getTotalBytesRead() < totalBytesRead);
            return;
        }
        h hVar = (h) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 1) {
            do {
                hVar.addDouble(this.a.readDouble());
                if (this.a.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.a.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt322 = this.a.readUInt32();
        a0(readUInt322);
        int totalBytesRead2 = this.a.getTotalBytesRead() + readUInt322;
        do {
            hVar.addDouble(this.a.readDouble());
        } while (this.a.getTotalBytesRead() < totalBytesRead2);
    }

    public long H() {
        Y(0);
        return this.a.readInt64();
    }

    public String I() {
        Y(2);
        return this.a.readStringRequireUtf8();
    }

    public void J(List list, N n, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        if (WireFormat.getTagWireType(this.b) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.b;
        do {
            list.add(U(n, extensionRegistryLite));
            if (this.a.isAtEnd() || this.d != 0) {
                return;
            } else {
                readTag = this.a.readTag();
            }
        } while (readTag == i);
        this.d = readTag;
    }

    public void K(List list, N n, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        if (WireFormat.getTagWireType(this.b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.b;
        do {
            list.add(V(n, extensionRegistryLite));
            if (this.a.isAtEnd() || this.d != 0) {
                return;
            } else {
                readTag = this.a.readTag();
            }
        } while (readTag == i);
        this.d = readTag;
    }

    public Object L(Class cls, ExtensionRegistryLite extensionRegistryLite) {
        Y(3);
        return U(I.a().c(cls), extensionRegistryLite);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        r7.a.popLimit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void M(java.util.Map r8, com.google.protobuf.MapEntryLite.b r9, com.google.protobuf.ExtensionRegistryLite r10) {
        /*
            r7 = this;
            r0 = 2
            r7.Y(r0)
            com.google.protobuf.CodedInputStream r1 = r7.a
            int r1 = r1.readUInt32()
            com.google.protobuf.CodedInputStream r2 = r7.a
            int r1 = r2.pushLimit(r1)
            java.lang.Object r2 = r9.b
            java.lang.Object r3 = r9.d
        L14:
            int r4 = r7.A()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            com.google.protobuf.CodedInputStream r5 = r7.a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.isAtEnd()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.D()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            com.google.protobuf.WireFormat$FieldType r4 = r9.c     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r5 = r9.d     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L49:
            com.google.protobuf.WireFormat$FieldType r4 = r9.a     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r5 = 0
            java.lang.Object r2 = r7.T(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L51:
            boolean r4 = r7.D()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            com.google.protobuf.CodedInputStream r8 = r7.a
            r8.popLimit(r1)
            return
        L67:
            com.google.protobuf.CodedInputStream r9 = r7.a
            r9.popLimit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.M(java.util.Map, com.google.protobuf.MapEntryLite$b, com.google.protobuf.ExtensionRegistryLite):void");
    }

    public Object N(Class cls, ExtensionRegistryLite extensionRegistryLite) {
        Y(2);
        return V(I.a().c(cls), extensionRegistryLite);
    }

    public void O(Object obj, N n, ExtensionRegistryLite extensionRegistryLite) {
        Y(3);
        R(obj, n, extensionRegistryLite);
    }

    public void P(Object obj, N n, ExtensionRegistryLite extensionRegistryLite) {
        Y(2);
        S(obj, n, extensionRegistryLite);
    }

    public final void R(Object obj, N n, ExtensionRegistryLite extensionRegistryLite) {
        int i = this.c;
        this.c = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.b), 4);
        try {
            n.f(obj, this, extensionRegistryLite);
            if (this.b == this.c) {
            } else {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } finally {
            this.c = i;
        }
    }

    public final void S(Object obj, N n, ExtensionRegistryLite extensionRegistryLite) {
        int readUInt32 = this.a.readUInt32();
        CodedInputStream codedInputStream = this.a;
        if (codedInputStream.recursionDepth >= codedInputStream.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int pushLimit = codedInputStream.pushLimit(readUInt32);
        this.a.recursionDepth++;
        n.f(obj, this, extensionRegistryLite);
        this.a.checkLastTagWas(0);
        r5.recursionDepth--;
        this.a.popLimit(pushLimit);
    }

    public final Object T(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) {
        switch (a.a[fieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(d());
            case 2:
                return o();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(j());
            case 5:
                return Integer.valueOf(u());
            case 6:
                return Long.valueOf(a());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(p());
            case 9:
                return Long.valueOf(H());
            case 10:
                return N(cls, extensionRegistryLite);
            case 11:
                return Integer.valueOf(E());
            case 12:
                return Long.valueOf(e());
            case 13:
                return Integer.valueOf(l());
            case 14:
                return Long.valueOf(y());
            case 15:
                return I();
            case 16:
                return Integer.valueOf(g());
            case 17:
                return Long.valueOf(s());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final Object U(N n, ExtensionRegistryLite extensionRegistryLite) {
        Object newInstance = n.newInstance();
        R(newInstance, n, extensionRegistryLite);
        n.b(newInstance);
        return newInstance;
    }

    public final Object V(N n, ExtensionRegistryLite extensionRegistryLite) {
        Object newInstance = n.newInstance();
        S(newInstance, n, extensionRegistryLite);
        n.b(newInstance);
        return newInstance;
    }

    public void W(List list, boolean z) {
        int readTag;
        int readTag2;
        if (WireFormat.getTagWireType(this.b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        if (!(list instanceof LazyStringList) || z) {
            do {
                list.add(z ? I() : z());
                if (this.a.isAtEnd()) {
                    return;
                } else {
                    readTag = this.a.readTag();
                }
            } while (readTag == this.b);
            this.d = readTag;
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        do {
            lazyStringList.add(o());
            if (this.a.isAtEnd()) {
                return;
            } else {
                readTag2 = this.a.readTag();
            }
        } while (readTag2 == this.b);
        this.d = readTag2;
    }

    public final void X(int i) {
        if (this.a.getTotalBytesRead() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final void Y(int i) {
        if (WireFormat.getTagWireType(this.b) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public final void Z(int i) {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public long a() {
        Y(1);
        return this.a.readFixed64();
    }

    public final void a0(int i) {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public void b(List list) {
        int readTag;
        int readTag2;
        if (!(list instanceof o)) {
            int tagWireType = WireFormat.getTagWireType(this.b);
            if (tagWireType == 2) {
                int readUInt32 = this.a.readUInt32();
                Z(readUInt32);
                int totalBytesRead = this.a.getTotalBytesRead() + readUInt32;
                do {
                    list.add(Integer.valueOf(this.a.readSFixed32()));
                } while (this.a.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.a.readSFixed32()));
                if (this.a.isAtEnd()) {
                    return;
                } else {
                    readTag = this.a.readTag();
                }
            } while (readTag == this.b);
            this.d = readTag;
            return;
        }
        o oVar = (o) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 2) {
            int readUInt322 = this.a.readUInt32();
            Z(readUInt322);
            int totalBytesRead2 = this.a.getTotalBytesRead() + readUInt322;
            do {
                oVar.addInt(this.a.readSFixed32());
            } while (this.a.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            oVar.addInt(this.a.readSFixed32());
            if (this.a.isAtEnd()) {
                return;
            } else {
                readTag2 = this.a.readTag();
            }
        } while (readTag2 == this.b);
        this.d = readTag2;
    }

    public void c(List list) {
        int readTag;
        int readTag2;
        if (!(list instanceof s)) {
            int tagWireType = WireFormat.getTagWireType(this.b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(this.a.readSInt64()));
                    if (this.a.isAtEnd()) {
                        return;
                    } else {
                        readTag = this.a.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.a.getTotalBytesRead() + this.a.readUInt32();
            do {
                list.add(Long.valueOf(this.a.readSInt64()));
            } while (this.a.getTotalBytesRead() < totalBytesRead);
            X(totalBytesRead);
            return;
        }
        s sVar = (s) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 0) {
            do {
                sVar.addLong(this.a.readSInt64());
                if (this.a.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.a.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.a.getTotalBytesRead() + this.a.readUInt32();
        do {
            sVar.addLong(this.a.readSInt64());
        } while (this.a.getTotalBytesRead() < totalBytesRead2);
        X(totalBytesRead2);
    }

    public boolean d() {
        Y(0);
        return this.a.readBool();
    }

    public long e() {
        Y(1);
        return this.a.readSFixed64();
    }

    public void f(List list) {
        int readTag;
        int readTag2;
        if (!(list instanceof s)) {
            int tagWireType = WireFormat.getTagWireType(this.b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(this.a.readUInt64()));
                    if (this.a.isAtEnd()) {
                        return;
                    } else {
                        readTag = this.a.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.a.getTotalBytesRead() + this.a.readUInt32();
            do {
                list.add(Long.valueOf(this.a.readUInt64()));
            } while (this.a.getTotalBytesRead() < totalBytesRead);
            X(totalBytesRead);
            return;
        }
        s sVar = (s) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 0) {
            do {
                sVar.addLong(this.a.readUInt64());
                if (this.a.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.a.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.a.getTotalBytesRead() + this.a.readUInt32();
        do {
            sVar.addLong(this.a.readUInt64());
        } while (this.a.getTotalBytesRead() < totalBytesRead2);
        X(totalBytesRead2);
    }

    public int g() {
        Y(0);
        return this.a.readUInt32();
    }

    public void h(List list) {
        int readTag;
        int readTag2;
        if (!(list instanceof s)) {
            int tagWireType = WireFormat.getTagWireType(this.b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(this.a.readInt64()));
                    if (this.a.isAtEnd()) {
                        return;
                    } else {
                        readTag = this.a.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.a.getTotalBytesRead() + this.a.readUInt32();
            do {
                list.add(Long.valueOf(this.a.readInt64()));
            } while (this.a.getTotalBytesRead() < totalBytesRead);
            X(totalBytesRead);
            return;
        }
        s sVar = (s) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 0) {
            do {
                sVar.addLong(this.a.readInt64());
                if (this.a.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.a.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.a.getTotalBytesRead() + this.a.readUInt32();
        do {
            sVar.addLong(this.a.readInt64());
        } while (this.a.getTotalBytesRead() < totalBytesRead2);
        X(totalBytesRead2);
    }

    public void i(List list) {
        int readTag;
        int readTag2;
        if (!(list instanceof o)) {
            int tagWireType = WireFormat.getTagWireType(this.b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(this.a.readEnum()));
                    if (this.a.isAtEnd()) {
                        return;
                    } else {
                        readTag = this.a.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.a.getTotalBytesRead() + this.a.readUInt32();
            do {
                list.add(Integer.valueOf(this.a.readEnum()));
            } while (this.a.getTotalBytesRead() < totalBytesRead);
            X(totalBytesRead);
            return;
        }
        o oVar = (o) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 0) {
            do {
                oVar.addInt(this.a.readEnum());
                if (this.a.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.a.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.a.getTotalBytesRead() + this.a.readUInt32();
        do {
            oVar.addInt(this.a.readEnum());
        } while (this.a.getTotalBytesRead() < totalBytesRead2);
        X(totalBytesRead2);
    }

    public int j() {
        Y(0);
        return this.a.readEnum();
    }

    public int k() {
        return this.b;
    }

    public int l() {
        Y(0);
        return this.a.readSInt32();
    }

    public void m(List list) {
        int readTag;
        int readTag2;
        if (!(list instanceof d)) {
            int tagWireType = WireFormat.getTagWireType(this.b);
            if (tagWireType == 0) {
                do {
                    list.add(Boolean.valueOf(this.a.readBool()));
                    if (this.a.isAtEnd()) {
                        return;
                    } else {
                        readTag = this.a.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.a.getTotalBytesRead() + this.a.readUInt32();
            do {
                list.add(Boolean.valueOf(this.a.readBool()));
            } while (this.a.getTotalBytesRead() < totalBytesRead);
            X(totalBytesRead);
            return;
        }
        d dVar = (d) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 0) {
            do {
                dVar.addBoolean(this.a.readBool());
                if (this.a.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.a.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.a.getTotalBytesRead() + this.a.readUInt32();
        do {
            dVar.addBoolean(this.a.readBool());
        } while (this.a.getTotalBytesRead() < totalBytesRead2);
        X(totalBytesRead2);
    }

    public void n(List list) {
        W(list, true);
    }

    public ByteString o() {
        Y(2);
        return this.a.readBytes();
    }

    public int p() {
        Y(0);
        return this.a.readInt32();
    }

    public void q(List list) {
        int readTag;
        int readTag2;
        if (!(list instanceof s)) {
            int tagWireType = WireFormat.getTagWireType(this.b);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(this.a.readFixed64()));
                    if (this.a.isAtEnd()) {
                        return;
                    } else {
                        readTag = this.a.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readUInt32 = this.a.readUInt32();
            a0(readUInt32);
            int totalBytesRead = this.a.getTotalBytesRead() + readUInt32;
            do {
                list.add(Long.valueOf(this.a.readFixed64()));
            } while (this.a.getTotalBytesRead() < totalBytesRead);
            return;
        }
        s sVar = (s) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 1) {
            do {
                sVar.addLong(this.a.readFixed64());
                if (this.a.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.a.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt322 = this.a.readUInt32();
        a0(readUInt322);
        int totalBytesRead2 = this.a.getTotalBytesRead() + readUInt322;
        do {
            sVar.addLong(this.a.readFixed64());
        } while (this.a.getTotalBytesRead() < totalBytesRead2);
    }

    public void r(List list) {
        int readTag;
        int readTag2;
        if (!(list instanceof o)) {
            int tagWireType = WireFormat.getTagWireType(this.b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(this.a.readSInt32()));
                    if (this.a.isAtEnd()) {
                        return;
                    } else {
                        readTag = this.a.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.a.getTotalBytesRead() + this.a.readUInt32();
            do {
                list.add(Integer.valueOf(this.a.readSInt32()));
            } while (this.a.getTotalBytesRead() < totalBytesRead);
            X(totalBytesRead);
            return;
        }
        o oVar = (o) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 0) {
            do {
                oVar.addInt(this.a.readSInt32());
                if (this.a.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.a.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.a.getTotalBytesRead() + this.a.readUInt32();
        do {
            oVar.addInt(this.a.readSInt32());
        } while (this.a.getTotalBytesRead() < totalBytesRead2);
        X(totalBytesRead2);
    }

    public double readDouble() {
        Y(1);
        return this.a.readDouble();
    }

    public float readFloat() {
        Y(5);
        return this.a.readFloat();
    }

    public long s() {
        Y(0);
        return this.a.readUInt64();
    }

    public void t(List list) {
        int readTag;
        int readTag2;
        if (!(list instanceof o)) {
            int tagWireType = WireFormat.getTagWireType(this.b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(this.a.readUInt32()));
                    if (this.a.isAtEnd()) {
                        return;
                    } else {
                        readTag = this.a.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.a.getTotalBytesRead() + this.a.readUInt32();
            do {
                list.add(Integer.valueOf(this.a.readUInt32()));
            } while (this.a.getTotalBytesRead() < totalBytesRead);
            X(totalBytesRead);
            return;
        }
        o oVar = (o) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 0) {
            do {
                oVar.addInt(this.a.readUInt32());
                if (this.a.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.a.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.a.getTotalBytesRead() + this.a.readUInt32();
        do {
            oVar.addInt(this.a.readUInt32());
        } while (this.a.getTotalBytesRead() < totalBytesRead2);
        X(totalBytesRead2);
    }

    public int u() {
        Y(5);
        return this.a.readFixed32();
    }

    public void v(List list) {
        int readTag;
        int readTag2;
        if (!(list instanceof s)) {
            int tagWireType = WireFormat.getTagWireType(this.b);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(this.a.readSFixed64()));
                    if (this.a.isAtEnd()) {
                        return;
                    } else {
                        readTag = this.a.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readUInt32 = this.a.readUInt32();
            a0(readUInt32);
            int totalBytesRead = this.a.getTotalBytesRead() + readUInt32;
            do {
                list.add(Long.valueOf(this.a.readSFixed64()));
            } while (this.a.getTotalBytesRead() < totalBytesRead);
            return;
        }
        s sVar = (s) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 1) {
            do {
                sVar.addLong(this.a.readSFixed64());
                if (this.a.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.a.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt322 = this.a.readUInt32();
        a0(readUInt322);
        int totalBytesRead2 = this.a.getTotalBytesRead() + readUInt322;
        do {
            sVar.addLong(this.a.readSFixed64());
        } while (this.a.getTotalBytesRead() < totalBytesRead2);
    }

    public void w(List list) {
        int readTag;
        int readTag2;
        if (!(list instanceof o)) {
            int tagWireType = WireFormat.getTagWireType(this.b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(this.a.readInt32()));
                    if (this.a.isAtEnd()) {
                        return;
                    } else {
                        readTag = this.a.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.a.getTotalBytesRead() + this.a.readUInt32();
            do {
                list.add(Integer.valueOf(this.a.readInt32()));
            } while (this.a.getTotalBytesRead() < totalBytesRead);
            X(totalBytesRead);
            return;
        }
        o oVar = (o) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 0) {
            do {
                oVar.addInt(this.a.readInt32());
                if (this.a.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.a.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.a.getTotalBytesRead() + this.a.readUInt32();
        do {
            oVar.addInt(this.a.readInt32());
        } while (this.a.getTotalBytesRead() < totalBytesRead2);
        X(totalBytesRead2);
    }

    public void x(List list) {
        int readTag;
        int readTag2;
        if (!(list instanceof o)) {
            int tagWireType = WireFormat.getTagWireType(this.b);
            if (tagWireType == 2) {
                int readUInt32 = this.a.readUInt32();
                Z(readUInt32);
                int totalBytesRead = this.a.getTotalBytesRead() + readUInt32;
                do {
                    list.add(Integer.valueOf(this.a.readFixed32()));
                } while (this.a.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.a.readFixed32()));
                if (this.a.isAtEnd()) {
                    return;
                } else {
                    readTag = this.a.readTag();
                }
            } while (readTag == this.b);
            this.d = readTag;
            return;
        }
        o oVar = (o) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 2) {
            int readUInt322 = this.a.readUInt32();
            Z(readUInt322);
            int totalBytesRead2 = this.a.getTotalBytesRead() + readUInt322;
            do {
                oVar.addInt(this.a.readFixed32());
            } while (this.a.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            oVar.addInt(this.a.readFixed32());
            if (this.a.isAtEnd()) {
                return;
            } else {
                readTag2 = this.a.readTag();
            }
        } while (readTag2 == this.b);
        this.d = readTag2;
    }

    public long y() {
        Y(0);
        return this.a.readSInt64();
    }

    public String z() {
        Y(2);
        return this.a.readString();
    }
}
