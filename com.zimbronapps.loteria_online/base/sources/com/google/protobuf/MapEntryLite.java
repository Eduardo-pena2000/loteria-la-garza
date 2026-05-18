package com.google.protobuf;

import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class MapEntryLite {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final Object key;
    private final b metadata;
    private final Object value;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b {
        public final WireFormat.FieldType a;
        public final Object b;
        public final WireFormat.FieldType c;
        public final Object d;

        public b(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
            this.a = fieldType;
            this.b = obj;
            this.c = fieldType2;
            this.d = obj2;
        }
    }

    private MapEntryLite(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
        this.metadata = new b(fieldType, obj, fieldType2, obj2);
        this.key = obj;
        this.value = obj2;
    }

    public static int computeSerializedSize(b bVar, Object obj, Object obj2) {
        return FieldSet.e(bVar.a, 1, obj) + FieldSet.e(bVar.c, 2, obj2);
    }

    public static MapEntryLite newDefaultInstance(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
        return new MapEntryLite(fieldType, obj, fieldType2, obj2);
    }

    public static Object parseField(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WireFormat.FieldType fieldType, Object obj) throws IOException {
        int i = a.a[fieldType.ordinal()];
        if (i == 1) {
            MessageLite.Builder builder = ((MessageLite) obj).toBuilder();
            codedInputStream.readMessage(builder, extensionRegistryLite);
            return builder.buildPartial();
        }
        if (i == 2) {
            return Integer.valueOf(codedInputStream.readEnum());
        }
        if (i != 3) {
            return FieldSet.C(codedInputStream, fieldType, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    public static void writeTo(CodedOutputStream codedOutputStream, b bVar, Object obj, Object obj2) throws IOException {
        FieldSet.G(codedOutputStream, bVar.a, 1, obj);
        FieldSet.G(codedOutputStream, bVar.c, 2, obj2);
    }

    public int computeMessageSize(int i, Object obj, Object obj2) {
        return CodedOutputStream.computeTagSize(i) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, obj, obj2));
    }

    public Object getKey() {
        return this.key;
    }

    public b getMetadata() {
        return this.metadata;
    }

    public Object getValue() {
        return this.value;
    }

    public Map.Entry parseEntry(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return parseEntry(byteString.newCodedInput(), this.metadata, extensionRegistryLite);
    }

    public void parseInto(MapFieldLite mapFieldLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
        b bVar = this.metadata;
        Object obj = bVar.b;
        Object obj2 = bVar.d;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == WireFormat.makeTag(1, this.metadata.a.getWireType())) {
                obj = parseField(codedInputStream, extensionRegistryLite, this.metadata.a, obj);
            } else if (readTag == WireFormat.makeTag(2, this.metadata.c.getWireType())) {
                obj2 = parseField(codedInputStream, extensionRegistryLite, this.metadata.c, obj2);
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(0);
        codedInputStream.popLimit(pushLimit);
        mapFieldLite.put(obj, obj2);
    }

    public void serializeTo(CodedOutputStream codedOutputStream, int i, Object obj, Object obj2) throws IOException {
        codedOutputStream.writeTag(i, 2);
        codedOutputStream.writeUInt32NoTag(computeSerializedSize(this.metadata, obj, obj2));
        writeTo(codedOutputStream, this.metadata, obj, obj2);
    }

    public static Map.Entry parseEntry(CodedInputStream codedInputStream, b bVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        Object obj = bVar.b;
        Object obj2 = bVar.d;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == WireFormat.makeTag(1, bVar.a.getWireType())) {
                obj = parseField(codedInputStream, extensionRegistryLite, bVar.a, obj);
            } else if (readTag == WireFormat.makeTag(2, bVar.c.getWireType())) {
                obj2 = parseField(codedInputStream, extensionRegistryLite, bVar.c, obj2);
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    private MapEntryLite(b bVar, Object obj, Object obj2) {
        this.metadata = bVar;
        this.key = obj;
        this.value = obj2;
    }
}
