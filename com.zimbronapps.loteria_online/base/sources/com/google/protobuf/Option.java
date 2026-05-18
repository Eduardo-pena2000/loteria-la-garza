package com.google.protobuf;

import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Option extends GeneratedMessageLite implements OptionOrBuilder {
    private static final Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private Any value_;

    public static final class Builder extends GeneratedMessageLite.Builder implements OptionOrBuilder {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder clearName() {
            copyOnWrite();
            Option.access$200((Option) this.instance);
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            Option.access$600((Option) this.instance);
            return this;
        }

        public String getName() {
            return ((Option) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((Option) this.instance).getNameBytes();
        }

        public Any getValue() {
            return ((Option) this.instance).getValue();
        }

        public boolean hasValue() {
            return ((Option) this.instance).hasValue();
        }

        public Builder mergeValue(Any any) {
            copyOnWrite();
            Option.access$500((Option) this.instance, any);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            Option.access$100((Option) this.instance, str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            Option.access$300((Option) this.instance, byteString);
            return this;
        }

        public Builder setValue(Any any) {
            copyOnWrite();
            Option.access$400((Option) this.instance, any);
            return this;
        }

        private Builder() {
            super(Option.access$000());
        }

        public Builder setValue(Any.Builder builder) {
            copyOnWrite();
            Option.access$400((Option) this.instance, (Any) builder.build());
            return this;
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
        Option option = new Option();
        DEFAULT_INSTANCE = option;
        GeneratedMessageLite.registerDefaultInstance(Option.class, option);
    }

    private Option() {
    }

    public static /* synthetic */ Option access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Option option, String str) {
        option.setName(str);
    }

    public static /* synthetic */ void access$200(Option option) {
        option.clearName();
    }

    public static /* synthetic */ void access$300(Option option, ByteString byteString) {
        option.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(Option option, Any any) {
        option.setValue(any);
    }

    public static /* synthetic */ void access$500(Option option, Any any) {
        option.mergeValue(any);
    }

    public static /* synthetic */ void access$600(Option option) {
        option.clearValue();
    }

    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    private void clearValue() {
        this.value_ = null;
        this.bitField0_ &= -2;
    }

    public static Option getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeValue(Any any) {
        any.getClass();
        Any any2 = this.value_;
        if (any2 == null || any2 == Any.getDefaultInstance()) {
            this.value_ = any;
        } else {
            this.value_ = (Any) ((Any.Builder) Any.newBuilder(this.value_).mergeFrom((GeneratedMessageLite) any)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Option parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Option) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Option parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    private void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    private void setValue(Any any) {
        any.getClass();
        this.value_ = any;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new Option();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser == null) {
                    synchronized (Option.class) {
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

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public Any getValue() {
        Any any = this.value_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(Option option) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(option);
    }

    public static Option parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Option) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Option parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Option parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Option parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Option parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Option parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Option parseFrom(InputStream inputStream) throws IOException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Option parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Option parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Option parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
