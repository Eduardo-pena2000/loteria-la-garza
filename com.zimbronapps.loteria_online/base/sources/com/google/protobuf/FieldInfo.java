package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FieldInfo implements Comparable {
    public final java.lang.reflect.Field a;
    public final FieldType b;
    public final Class c;
    public final int d;
    public final java.lang.reflect.Field e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final java.lang.reflect.Field i;
    public final Class j;
    public final Object k;
    public final Internal.EnumVerifier l;

    public static final class Builder {
        private java.lang.reflect.Field cachedSizeField;
        private boolean enforceUtf8;
        private Internal.EnumVerifier enumVerifier;
        private java.lang.reflect.Field field;
        private int fieldNumber;
        private Object mapDefaultEntry;
        private G oneof;
        private Class oneofStoredType;
        private java.lang.reflect.Field presenceField;
        private int presenceMask;
        private boolean required;
        private FieldType type;

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public FieldInfo build() {
            Object obj = this.mapDefaultEntry;
            if (obj != null) {
                return FieldInfo.g(this.field, this.fieldNumber, obj, this.enumVerifier);
            }
            java.lang.reflect.Field field = this.presenceField;
            if (field != null) {
                return this.required ? FieldInfo.f(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier) : FieldInfo.c(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
            }
            Internal.EnumVerifier enumVerifier = this.enumVerifier;
            if (enumVerifier != null) {
                java.lang.reflect.Field field2 = this.cachedSizeField;
                return field2 == null ? FieldInfo.e(this.field, this.fieldNumber, this.type, enumVerifier) : FieldInfo.i(this.field, this.fieldNumber, this.type, enumVerifier, field2);
            }
            java.lang.reflect.Field field3 = this.cachedSizeField;
            return field3 == null ? FieldInfo.d(this.field, this.fieldNumber, this.type, this.enforceUtf8) : FieldInfo.h(this.field, this.fieldNumber, this.type, field3);
        }

        public Builder withCachedSizeField(java.lang.reflect.Field field) {
            this.cachedSizeField = field;
            return this;
        }

        public Builder withEnforceUtf8(boolean z) {
            this.enforceUtf8 = z;
            return this;
        }

        public Builder withEnumVerifier(Internal.EnumVerifier enumVerifier) {
            this.enumVerifier = enumVerifier;
            return this;
        }

        public Builder withField(java.lang.reflect.Field field) {
            this.field = field;
            return this;
        }

        public Builder withFieldNumber(int i) {
            this.fieldNumber = i;
            return this;
        }

        public Builder withMapDefaultEntry(Object obj) {
            this.mapDefaultEntry = obj;
            return this;
        }

        public Builder withOneof(G g, Class cls) {
            if (this.field != null || this.presenceField != null) {
                throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.oneofStoredType = cls;
            return this;
        }

        public Builder withPresence(java.lang.reflect.Field field, int i) {
            this.presenceField = (java.lang.reflect.Field) Internal.checkNotNull(field, "presenceField");
            this.presenceMask = i;
            return this;
        }

        public Builder withRequired(boolean z) {
            this.required = z;
            return this;
        }

        public Builder withType(FieldType fieldType) {
            this.type = fieldType;
            return this;
        }

        private Builder() {
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[FieldType.values().length];
            a = iArr;
            try {
                iArr[FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[FieldType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FieldInfo(java.lang.reflect.Field field, int i, FieldType fieldType, Class cls, java.lang.reflect.Field field2, int i2, boolean z, boolean z2, G g, Class cls2, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.a = field;
        this.b = fieldType;
        this.c = cls;
        this.d = i;
        this.e = field2;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.j = cls2;
        this.k = obj;
        this.l = enumVerifier;
        this.i = field3;
    }

    public static void a(int i) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + i);
    }

    public static FieldInfo c(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, Internal.EnumVerifier enumVerifier) {
        a(i);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(field2, "presenceField");
        if (field2 == null || v(i2)) {
            return new FieldInfo(field, i, fieldType, null, field2, i2, false, z, null, null, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
    }

    public static FieldInfo d(java.lang.reflect.Field field, int i, FieldType fieldType, boolean z) {
        a(i);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        if (fieldType == FieldType.MESSAGE_LIST || fieldType == FieldType.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new FieldInfo(field, i, fieldType, null, null, 0, false, z, null, null, null, null, null);
    }

    public static FieldInfo e(java.lang.reflect.Field field, int i, FieldType fieldType, Internal.EnumVerifier enumVerifier) {
        a(i);
        Internal.checkNotNull(field, "field");
        return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, null);
    }

    public static FieldInfo f(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, Internal.EnumVerifier enumVerifier) {
        a(i);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(field2, "presenceField");
        if (field2 == null || v(i2)) {
            return new FieldInfo(field, i, fieldType, null, field2, i2, true, z, null, null, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
    }

    public static FieldInfo g(java.lang.reflect.Field field, int i, Object obj, Internal.EnumVerifier enumVerifier) {
        Internal.checkNotNull(obj, "mapDefaultEntry");
        a(i);
        Internal.checkNotNull(field, "field");
        return new FieldInfo(field, i, FieldType.MAP, null, null, 0, false, true, null, null, obj, enumVerifier, null);
    }

    public static FieldInfo h(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2) {
        a(i);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        if (fieldType == FieldType.MESSAGE_LIST || fieldType == FieldType.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, null, field2);
    }

    public static FieldInfo i(java.lang.reflect.Field field, int i, FieldType fieldType, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field2) {
        a(i);
        Internal.checkNotNull(field, "field");
        return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, field2);
    }

    public static boolean v(int i) {
        return i != 0 && (i & (i + (-1))) == 0;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(FieldInfo fieldInfo) {
        return this.d - fieldInfo.d;
    }

    public java.lang.reflect.Field k() {
        return this.i;
    }

    public Internal.EnumVerifier l() {
        return this.l;
    }

    public java.lang.reflect.Field m() {
        return this.a;
    }

    public int n() {
        return this.d;
    }

    public Object o() {
        return this.k;
    }

    public Class p() {
        int i = a.a[this.b.ordinal()];
        if (i == 1 || i == 2) {
            java.lang.reflect.Field field = this.a;
            return field != null ? field.getType() : this.j;
        }
        if (i == 3 || i == 4) {
            return this.c;
        }
        return null;
    }

    public G q() {
        return null;
    }

    public java.lang.reflect.Field r() {
        return this.e;
    }

    public int s() {
        return this.f;
    }

    public FieldType t() {
        return this.b;
    }

    public boolean u() {
        return this.h;
    }

    public boolean w() {
        return this.g;
    }
}
