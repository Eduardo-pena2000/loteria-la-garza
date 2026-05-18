package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Struct extends GeneratedMessageLite implements StructOrBuilder {
    private static final Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private MapFieldLite fields_ = MapFieldLite.emptyMapField();

    public static final class Builder extends GeneratedMessageLite.Builder implements StructOrBuilder {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder clearFields() {
            copyOnWrite();
            Struct.access$100((Struct) this.instance).clear();
            return this;
        }

        public boolean containsFields(String str) {
            str.getClass();
            return ((Struct) this.instance).getFieldsMap().containsKey(str);
        }

        @Deprecated
        public Map getFields() {
            return getFieldsMap();
        }

        public int getFieldsCount() {
            return ((Struct) this.instance).getFieldsMap().size();
        }

        public Map getFieldsMap() {
            return Collections.unmodifiableMap(((Struct) this.instance).getFieldsMap());
        }

        public Value getFieldsOrDefault(String str, Value value) {
            str.getClass();
            Map fieldsMap = ((Struct) this.instance).getFieldsMap();
            return fieldsMap.containsKey(str) ? (Value) fieldsMap.get(str) : value;
        }

        public Value getFieldsOrThrow(String str) {
            str.getClass();
            Map fieldsMap = ((Struct) this.instance).getFieldsMap();
            if (fieldsMap.containsKey(str)) {
                return (Value) fieldsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllFields(Map map) {
            copyOnWrite();
            Struct.access$100((Struct) this.instance).putAll(map);
            return this;
        }

        public Builder putFields(String str, Value value) {
            str.getClass();
            value.getClass();
            copyOnWrite();
            Struct.access$100((Struct) this.instance).put(str, value);
            return this;
        }

        public Builder removeFields(String str) {
            str.getClass();
            copyOnWrite();
            Struct.access$100((Struct) this.instance).remove(str);
            return this;
        }

        private Builder() {
            super(Struct.access$000());
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b {
        public static final MapEntryLite a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Value.getDefaultInstance());
    }

    static {
        Struct struct = new Struct();
        DEFAULT_INSTANCE = struct;
        GeneratedMessageLite.registerDefaultInstance(Struct.class, struct);
    }

    private Struct() {
    }

    public static /* synthetic */ Struct access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ Map access$100(Struct struct) {
        return struct.getMutableFieldsMap();
    }

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map getMutableFieldsMap() {
        return internalGetMutableFields();
    }

    private MapFieldLite internalGetFields() {
        return this.fields_;
    }

    private MapFieldLite internalGetMutableFields() {
        if (!this.fields_.isMutable()) {
            this.fields_ = this.fields_.mutableCopy();
        }
        return this.fields_;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Struct) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean containsFields(String str) {
        str.getClass();
        return internalGetFields().containsKey(str);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new Struct();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", b.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser == null) {
                    synchronized (Struct.class) {
                        try {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        } finally {
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Deprecated
    public Map getFields() {
        return getFieldsMap();
    }

    public int getFieldsCount() {
        return internalGetFields().size();
    }

    public Map getFieldsMap() {
        return Collections.unmodifiableMap(internalGetFields());
    }

    public Value getFieldsOrDefault(String str, Value value) {
        str.getClass();
        MapFieldLite internalGetFields = internalGetFields();
        return internalGetFields.containsKey(str) ? (Value) internalGetFields.get(str) : value;
    }

    public Value getFieldsOrThrow(String str) {
        str.getClass();
        MapFieldLite internalGetFields = internalGetFields();
        if (internalGetFields.containsKey(str)) {
            return (Value) internalGetFields.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(Struct struct) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(struct);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Struct) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Struct parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Struct parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Struct parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Struct parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Struct parseFrom(InputStream inputStream) throws IOException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Struct parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Struct parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
