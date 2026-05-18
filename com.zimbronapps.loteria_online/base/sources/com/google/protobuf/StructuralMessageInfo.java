package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class StructuralMessageInfo implements x {
    public final ProtoSyntax a;
    public final boolean b;
    public final int[] c;
    public final FieldInfo[] d;
    public final MessageLite e;

    public StructuralMessageInfo(ProtoSyntax protoSyntax, boolean z, int[] iArr, FieldInfo[] fieldInfoArr, Object obj) {
        this.a = protoSyntax;
        this.b = z;
        this.c = iArr;
        this.d = fieldInfoArr;
        this.e = (MessageLite) Internal.checkNotNull(obj, "defaultInstance");
    }

    public boolean a() {
        return this.b;
    }

    public MessageLite b() {
        return this.e;
    }

    public int[] c() {
        return this.c;
    }

    public FieldInfo[] d() {
        return this.d;
    }

    public ProtoSyntax getSyntax() {
        return this.a;
    }

    public static final class Builder {
        private int[] checkInitialized;
        private Object defaultInstance;
        private final List fields;
        private boolean messageSetWireFormat;
        private ProtoSyntax syntax;
        private boolean wasBuilt;

        public Builder() {
            this.checkInitialized = null;
            this.fields = new ArrayList();
        }

        public StructuralMessageInfo build() {
            if (this.wasBuilt) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.syntax == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.wasBuilt = true;
            Collections.sort(this.fields);
            return new StructuralMessageInfo(this.syntax, this.messageSetWireFormat, this.checkInitialized, (FieldInfo[]) this.fields.toArray(new FieldInfo[0]), this.defaultInstance);
        }

        public void withCheckInitialized(int[] iArr) {
            this.checkInitialized = iArr;
        }

        public void withDefaultInstance(Object obj) {
            this.defaultInstance = obj;
        }

        public void withField(FieldInfo fieldInfo) {
            if (this.wasBuilt) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.fields.add(fieldInfo);
        }

        public void withMessageSetWireFormat(boolean z) {
            this.messageSetWireFormat = z;
        }

        public void withSyntax(ProtoSyntax protoSyntax) {
            this.syntax = (ProtoSyntax) Internal.checkNotNull(protoSyntax, "syntax");
        }

        public Builder(int i) {
            this.checkInitialized = null;
            this.fields = new ArrayList(i);
        }
    }
}
