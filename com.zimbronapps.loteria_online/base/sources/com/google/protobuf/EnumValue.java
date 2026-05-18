package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Option;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class EnumValue extends GeneratedMessageLite implements EnumValueOrBuilder {
    private static final EnumValue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    private int number_;
    private String name_ = "";
    private Internal.ProtobufList options_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder implements EnumValueOrBuilder {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder addAllOptions(Iterable iterable) {
            copyOnWrite();
            EnumValue.access$900((EnumValue) this.instance, iterable);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            EnumValue.access$700((EnumValue) this.instance, option);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            EnumValue.access$200((EnumValue) this.instance);
            return this;
        }

        public Builder clearNumber() {
            copyOnWrite();
            EnumValue.access$500((EnumValue) this.instance);
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            EnumValue.access$1000((EnumValue) this.instance);
            return this;
        }

        public String getName() {
            return ((EnumValue) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((EnumValue) this.instance).getNameBytes();
        }

        public int getNumber() {
            return ((EnumValue) this.instance).getNumber();
        }

        public Option getOptions(int i) {
            return ((EnumValue) this.instance).getOptions(i);
        }

        public int getOptionsCount() {
            return ((EnumValue) this.instance).getOptionsCount();
        }

        public List getOptionsList() {
            return Collections.unmodifiableList(((EnumValue) this.instance).getOptionsList());
        }

        public Builder removeOptions(int i) {
            copyOnWrite();
            EnumValue.access$1100((EnumValue) this.instance, i);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            EnumValue.access$100((EnumValue) this.instance, str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            EnumValue.access$300((EnumValue) this.instance, byteString);
            return this;
        }

        public Builder setNumber(int i) {
            copyOnWrite();
            EnumValue.access$400((EnumValue) this.instance, i);
            return this;
        }

        public Builder setOptions(int i, Option option) {
            copyOnWrite();
            EnumValue.access$600((EnumValue) this.instance, i, option);
            return this;
        }

        private Builder() {
            super(EnumValue.access$000());
        }

        public Builder addOptions(int i, Option option) {
            copyOnWrite();
            EnumValue.access$800((EnumValue) this.instance, i, option);
            return this;
        }

        public Builder setOptions(int i, Option.Builder builder) {
            copyOnWrite();
            EnumValue.access$600((EnumValue) this.instance, i, (Option) builder.build());
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            EnumValue.access$700((EnumValue) this.instance, (Option) builder.build());
            return this;
        }

        public Builder addOptions(int i, Option.Builder builder) {
            copyOnWrite();
            EnumValue.access$800((EnumValue) this.instance, i, (Option) builder.build());
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
        EnumValue enumValue = new EnumValue();
        DEFAULT_INSTANCE = enumValue;
        GeneratedMessageLite.registerDefaultInstance(EnumValue.class, enumValue);
    }

    private EnumValue() {
    }

    public static /* synthetic */ EnumValue access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(EnumValue enumValue, String str) {
        enumValue.setName(str);
    }

    public static /* synthetic */ void access$1000(EnumValue enumValue) {
        enumValue.clearOptions();
    }

    public static /* synthetic */ void access$1100(EnumValue enumValue, int i) {
        enumValue.removeOptions(i);
    }

    public static /* synthetic */ void access$200(EnumValue enumValue) {
        enumValue.clearName();
    }

    public static /* synthetic */ void access$300(EnumValue enumValue, ByteString byteString) {
        enumValue.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(EnumValue enumValue, int i) {
        enumValue.setNumber(i);
    }

    public static /* synthetic */ void access$500(EnumValue enumValue) {
        enumValue.clearNumber();
    }

    public static /* synthetic */ void access$600(EnumValue enumValue, int i, Option option) {
        enumValue.setOptions(i, option);
    }

    public static /* synthetic */ void access$700(EnumValue enumValue, Option option) {
        enumValue.addOptions(option);
    }

    public static /* synthetic */ void access$800(EnumValue enumValue, int i, Option option) {
        enumValue.addOptions(i, option);
    }

    public static /* synthetic */ void access$900(EnumValue enumValue, Iterable iterable) {
        enumValue.addAllOptions(iterable);
    }

    private void addAllOptions(Iterable iterable) {
        ensureOptionsIsMutable();
        AbstractMessageLite.addAll(iterable, this.options_);
    }

    private void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    private void clearNumber() {
        this.number_ = 0;
    }

    private void clearOptions() {
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureOptionsIsMutable() {
        Internal.ProtobufList protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static EnumValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    private void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    private void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    private void setNumber(int i) {
        this.number_ = i;
    }

    private void setOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i, option);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new EnumValue();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", Option.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser == null) {
                    synchronized (EnumValue.class) {
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

    public int getNumber() {
        return this.number_;
    }

    public Option getOptions(int i) {
        return (Option) this.options_.get(i);
    }

    public int getOptionsCount() {
        return this.options_.size();
    }

    public List getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int i) {
        return (OptionOrBuilder) this.options_.get(i);
    }

    public List getOptionsOrBuilderList() {
        return this.options_;
    }

    public static Builder newBuilder(EnumValue enumValue) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(enumValue);
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EnumValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    public static EnumValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EnumValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EnumValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EnumValue parseFrom(InputStream inputStream) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EnumValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EnumValue parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EnumValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
