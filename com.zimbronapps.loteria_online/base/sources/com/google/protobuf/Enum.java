package com.google.protobuf;

import com.google.protobuf.EnumValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Enum extends GeneratedMessageLite implements EnumOrBuilder {
    private static final Enum DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 6;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private int bitField0_;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private Internal.ProtobufList enumvalue_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList options_ = GeneratedMessageLite.emptyProtobufList();
    private String edition_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder implements EnumOrBuilder {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder addAllEnumvalue(Iterable iterable) {
            copyOnWrite();
            Enum.access$700((Enum) this.instance, iterable);
            return this;
        }

        public Builder addAllOptions(Iterable iterable) {
            copyOnWrite();
            Enum.access$1300((Enum) this.instance, iterable);
            return this;
        }

        public Builder addEnumvalue(EnumValue enumValue) {
            copyOnWrite();
            Enum.access$500((Enum) this.instance, enumValue);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            Enum.access$1100((Enum) this.instance, option);
            return this;
        }

        public Builder clearEdition() {
            copyOnWrite();
            Enum.access$2300((Enum) this.instance);
            return this;
        }

        public Builder clearEnumvalue() {
            copyOnWrite();
            Enum.access$800((Enum) this.instance);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            Enum.access$200((Enum) this.instance);
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            Enum.access$1400((Enum) this.instance);
            return this;
        }

        public Builder clearSourceContext() {
            copyOnWrite();
            Enum.access$1800((Enum) this.instance);
            return this;
        }

        public Builder clearSyntax() {
            copyOnWrite();
            Enum.access$2100((Enum) this.instance);
            return this;
        }

        public String getEdition() {
            return ((Enum) this.instance).getEdition();
        }

        public ByteString getEditionBytes() {
            return ((Enum) this.instance).getEditionBytes();
        }

        public EnumValue getEnumvalue(int i) {
            return ((Enum) this.instance).getEnumvalue(i);
        }

        public int getEnumvalueCount() {
            return ((Enum) this.instance).getEnumvalueCount();
        }

        public List getEnumvalueList() {
            return Collections.unmodifiableList(((Enum) this.instance).getEnumvalueList());
        }

        public String getName() {
            return ((Enum) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((Enum) this.instance).getNameBytes();
        }

        public Option getOptions(int i) {
            return ((Enum) this.instance).getOptions(i);
        }

        public int getOptionsCount() {
            return ((Enum) this.instance).getOptionsCount();
        }

        public List getOptionsList() {
            return Collections.unmodifiableList(((Enum) this.instance).getOptionsList());
        }

        public SourceContext getSourceContext() {
            return ((Enum) this.instance).getSourceContext();
        }

        public Syntax getSyntax() {
            return ((Enum) this.instance).getSyntax();
        }

        public int getSyntaxValue() {
            return ((Enum) this.instance).getSyntaxValue();
        }

        public boolean hasSourceContext() {
            return ((Enum) this.instance).hasSourceContext();
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            Enum.access$1700((Enum) this.instance, sourceContext);
            return this;
        }

        public Builder removeEnumvalue(int i) {
            copyOnWrite();
            Enum.access$900((Enum) this.instance, i);
            return this;
        }

        public Builder removeOptions(int i) {
            copyOnWrite();
            Enum.access$1500((Enum) this.instance, i);
            return this;
        }

        public Builder setEdition(String str) {
            copyOnWrite();
            Enum.access$2200((Enum) this.instance, str);
            return this;
        }

        public Builder setEditionBytes(ByteString byteString) {
            copyOnWrite();
            Enum.access$2400((Enum) this.instance, byteString);
            return this;
        }

        public Builder setEnumvalue(int i, EnumValue enumValue) {
            copyOnWrite();
            Enum.access$400((Enum) this.instance, i, enumValue);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            Enum.access$100((Enum) this.instance, str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            Enum.access$300((Enum) this.instance, byteString);
            return this;
        }

        public Builder setOptions(int i, Option option) {
            copyOnWrite();
            Enum.access$1000((Enum) this.instance, i, option);
            return this;
        }

        public Builder setSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            Enum.access$1600((Enum) this.instance, sourceContext);
            return this;
        }

        public Builder setSyntax(Syntax syntax) {
            copyOnWrite();
            Enum.access$2000((Enum) this.instance, syntax);
            return this;
        }

        public Builder setSyntaxValue(int i) {
            copyOnWrite();
            Enum.access$1900((Enum) this.instance, i);
            return this;
        }

        private Builder() {
            super(Enum.access$000());
        }

        public Builder addEnumvalue(int i, EnumValue enumValue) {
            copyOnWrite();
            Enum.access$600((Enum) this.instance, i, enumValue);
            return this;
        }

        public Builder addOptions(int i, Option option) {
            copyOnWrite();
            Enum.access$1200((Enum) this.instance, i, option);
            return this;
        }

        public Builder setEnumvalue(int i, EnumValue.Builder builder) {
            copyOnWrite();
            Enum.access$400((Enum) this.instance, i, (EnumValue) builder.build());
            return this;
        }

        public Builder setOptions(int i, Option.Builder builder) {
            copyOnWrite();
            Enum.access$1000((Enum) this.instance, i, (Option) builder.build());
            return this;
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
            copyOnWrite();
            Enum.access$1600((Enum) this.instance, (SourceContext) builder.build());
            return this;
        }

        public Builder addEnumvalue(EnumValue.Builder builder) {
            copyOnWrite();
            Enum.access$500((Enum) this.instance, (EnumValue) builder.build());
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            Enum.access$1100((Enum) this.instance, (Option) builder.build());
            return this;
        }

        public Builder addEnumvalue(int i, EnumValue.Builder builder) {
            copyOnWrite();
            Enum.access$600((Enum) this.instance, i, (EnumValue) builder.build());
            return this;
        }

        public Builder addOptions(int i, Option.Builder builder) {
            copyOnWrite();
            Enum.access$1200((Enum) this.instance, i, (Option) builder.build());
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
        Enum r0 = new Enum();
        DEFAULT_INSTANCE = r0;
        GeneratedMessageLite.registerDefaultInstance(Enum.class, r0);
    }

    private Enum() {
    }

    public static /* synthetic */ Enum access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Enum r0, String str) {
        r0.setName(str);
    }

    public static /* synthetic */ void access$1000(Enum r0, int i, Option option) {
        r0.setOptions(i, option);
    }

    public static /* synthetic */ void access$1100(Enum r0, Option option) {
        r0.addOptions(option);
    }

    public static /* synthetic */ void access$1200(Enum r0, int i, Option option) {
        r0.addOptions(i, option);
    }

    public static /* synthetic */ void access$1300(Enum r0, Iterable iterable) {
        r0.addAllOptions(iterable);
    }

    public static /* synthetic */ void access$1400(Enum r0) {
        r0.clearOptions();
    }

    public static /* synthetic */ void access$1500(Enum r0, int i) {
        r0.removeOptions(i);
    }

    public static /* synthetic */ void access$1600(Enum r0, SourceContext sourceContext) {
        r0.setSourceContext(sourceContext);
    }

    public static /* synthetic */ void access$1700(Enum r0, SourceContext sourceContext) {
        r0.mergeSourceContext(sourceContext);
    }

    public static /* synthetic */ void access$1800(Enum r0) {
        r0.clearSourceContext();
    }

    public static /* synthetic */ void access$1900(Enum r0, int i) {
        r0.setSyntaxValue(i);
    }

    public static /* synthetic */ void access$200(Enum r0) {
        r0.clearName();
    }

    public static /* synthetic */ void access$2000(Enum r0, Syntax syntax) {
        r0.setSyntax(syntax);
    }

    public static /* synthetic */ void access$2100(Enum r0) {
        r0.clearSyntax();
    }

    public static /* synthetic */ void access$2200(Enum r0, String str) {
        r0.setEdition(str);
    }

    public static /* synthetic */ void access$2300(Enum r0) {
        r0.clearEdition();
    }

    public static /* synthetic */ void access$2400(Enum r0, ByteString byteString) {
        r0.setEditionBytes(byteString);
    }

    public static /* synthetic */ void access$300(Enum r0, ByteString byteString) {
        r0.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(Enum r0, int i, EnumValue enumValue) {
        r0.setEnumvalue(i, enumValue);
    }

    public static /* synthetic */ void access$500(Enum r0, EnumValue enumValue) {
        r0.addEnumvalue(enumValue);
    }

    public static /* synthetic */ void access$600(Enum r0, int i, EnumValue enumValue) {
        r0.addEnumvalue(i, enumValue);
    }

    public static /* synthetic */ void access$700(Enum r0, Iterable iterable) {
        r0.addAllEnumvalue(iterable);
    }

    public static /* synthetic */ void access$800(Enum r0) {
        r0.clearEnumvalue();
    }

    public static /* synthetic */ void access$900(Enum r0, int i) {
        r0.removeEnumvalue(i);
    }

    private void addAllEnumvalue(Iterable iterable) {
        ensureEnumvalueIsMutable();
        AbstractMessageLite.addAll(iterable, this.enumvalue_);
    }

    private void addAllOptions(Iterable iterable) {
        ensureOptionsIsMutable();
        AbstractMessageLite.addAll(iterable, this.options_);
    }

    private void addEnumvalue(EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(enumValue);
    }

    private void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    private void clearEdition() {
        this.edition_ = getDefaultInstance().getEdition();
    }

    private void clearEnumvalue() {
        this.enumvalue_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    private void clearOptions() {
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearSourceContext() {
        this.sourceContext_ = null;
        this.bitField0_ &= -2;
    }

    private void clearSyntax() {
        this.syntax_ = 0;
    }

    private void ensureEnumvalueIsMutable() {
        Internal.ProtobufList protobufList = this.enumvalue_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.enumvalue_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureOptionsIsMutable() {
        Internal.ProtobufList protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Enum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        SourceContext sourceContext2 = this.sourceContext_;
        if (sourceContext2 == null || sourceContext2 == SourceContext.getDefaultInstance()) {
            this.sourceContext_ = sourceContext;
        } else {
            this.sourceContext_ = (SourceContext) ((SourceContext.Builder) SourceContext.newBuilder(this.sourceContext_).mergeFrom((GeneratedMessageLite) sourceContext)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Enum parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Enum) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeEnumvalue(int i) {
        ensureEnumvalueIsMutable();
        this.enumvalue_.remove(i);
    }

    private void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    private void setEdition(String str) {
        str.getClass();
        this.edition_ = str;
    }

    private void setEditionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.edition_ = byteString.toStringUtf8();
    }

    private void setEnumvalue(int i, EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.set(i, enumValue);
    }

    private void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    private void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    private void setOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i, option);
    }

    private void setSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        this.sourceContext_ = sourceContext;
        this.bitField0_ |= 1;
    }

    private void setSyntax(Syntax syntax) {
        this.syntax_ = syntax.getNumber();
    }

    private void setSyntaxValue(int i) {
        this.syntax_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new Enum();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004ဉ\u0000\u0005\f\u0006Ȉ", new Object[]{"bitField0_", "name_", "enumvalue_", EnumValue.class, "options_", Option.class, "sourceContext_", "syntax_", "edition_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser == null) {
                    synchronized (Enum.class) {
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

    public String getEdition() {
        return this.edition_;
    }

    public ByteString getEditionBytes() {
        return ByteString.copyFromUtf8(this.edition_);
    }

    public EnumValue getEnumvalue(int i) {
        return (EnumValue) this.enumvalue_.get(i);
    }

    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    public List getEnumvalueList() {
        return this.enumvalue_;
    }

    public EnumValueOrBuilder getEnumvalueOrBuilder(int i) {
        return (EnumValueOrBuilder) this.enumvalue_.get(i);
    }

    public List getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
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

    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    public Syntax getSyntax() {
        Syntax forNumber = Syntax.forNumber(this.syntax_);
        return forNumber == null ? Syntax.UNRECOGNIZED : forNumber;
    }

    public int getSyntaxValue() {
        return this.syntax_;
    }

    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(Enum r1) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(r1);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Enum) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Enum parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addEnumvalue(int i, EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(i, enumValue);
    }

    private void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    public static Enum parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Enum parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Enum parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Enum parseFrom(InputStream inputStream) throws IOException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Enum parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Enum parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Enum parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
