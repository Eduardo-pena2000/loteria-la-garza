package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FieldMask extends GeneratedMessageLite implements FieldMaskOrBuilder {
    private static final FieldMask DEFAULT_INSTANCE;
    private static volatile Parser PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private Internal.ProtobufList paths_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder implements FieldMaskOrBuilder {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder addAllPaths(Iterable iterable) {
            copyOnWrite();
            FieldMask.access$300((FieldMask) this.instance, iterable);
            return this;
        }

        public Builder addPaths(String str) {
            copyOnWrite();
            FieldMask.access$200((FieldMask) this.instance, str);
            return this;
        }

        public Builder addPathsBytes(ByteString byteString) {
            copyOnWrite();
            FieldMask.access$500((FieldMask) this.instance, byteString);
            return this;
        }

        public Builder clearPaths() {
            copyOnWrite();
            FieldMask.access$400((FieldMask) this.instance);
            return this;
        }

        public String getPaths(int i) {
            return ((FieldMask) this.instance).getPaths(i);
        }

        public ByteString getPathsBytes(int i) {
            return ((FieldMask) this.instance).getPathsBytes(i);
        }

        public int getPathsCount() {
            return ((FieldMask) this.instance).getPathsCount();
        }

        public List getPathsList() {
            return Collections.unmodifiableList(((FieldMask) this.instance).getPathsList());
        }

        public Builder setPaths(int i, String str) {
            copyOnWrite();
            FieldMask.access$100((FieldMask) this.instance, i, str);
            return this;
        }

        private Builder() {
            super(FieldMask.access$000());
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

    static {
        FieldMask fieldMask = new FieldMask();
        DEFAULT_INSTANCE = fieldMask;
        GeneratedMessageLite.registerDefaultInstance(FieldMask.class, fieldMask);
    }

    private FieldMask() {
    }

    public static /* synthetic */ FieldMask access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(FieldMask fieldMask, int i, String str) {
        fieldMask.setPaths(i, str);
    }

    public static /* synthetic */ void access$200(FieldMask fieldMask, String str) {
        fieldMask.addPaths(str);
    }

    public static /* synthetic */ void access$300(FieldMask fieldMask, Iterable iterable) {
        fieldMask.addAllPaths(iterable);
    }

    public static /* synthetic */ void access$400(FieldMask fieldMask) {
        fieldMask.clearPaths();
    }

    public static /* synthetic */ void access$500(FieldMask fieldMask, ByteString byteString) {
        fieldMask.addPathsBytes(byteString);
    }

    private void addAllPaths(Iterable iterable) {
        ensurePathsIsMutable();
        AbstractMessageLite.addAll(iterable, this.paths_);
    }

    private void addPaths(String str) {
        str.getClass();
        ensurePathsIsMutable();
        this.paths_.add(str);
    }

    private void addPathsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensurePathsIsMutable();
        this.paths_.add(byteString.toStringUtf8());
    }

    private void clearPaths() {
        this.paths_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePathsIsMutable() {
        Internal.ProtobufList protobufList = this.paths_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.paths_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setPaths(int i, String str) {
        str.getClass();
        ensurePathsIsMutable();
        this.paths_.set(i, str);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new FieldMask();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser == null) {
                    synchronized (FieldMask.class) {
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

    public String getPaths(int i) {
        return (String) this.paths_.get(i);
    }

    public ByteString getPathsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.paths_.get(i));
    }

    public int getPathsCount() {
        return this.paths_.size();
    }

    public List getPathsList() {
        return this.paths_;
    }

    public static Builder newBuilder(FieldMask fieldMask) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fieldMask);
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FieldMask parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FieldMask parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FieldMask parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FieldMask parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FieldMask parseFrom(InputStream inputStream) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FieldMask parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FieldMask parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
