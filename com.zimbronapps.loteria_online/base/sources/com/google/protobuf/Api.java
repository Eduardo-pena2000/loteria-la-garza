package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Method;
import com.google.protobuf.Mixin;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Api extends GeneratedMessageLite implements ApiOrBuilder {
    private static final Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private int bitField0_;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private Internal.ProtobufList methods_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList options_ = GeneratedMessageLite.emptyProtobufList();
    private String version_ = "";
    private Internal.ProtobufList mixins_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder implements ApiOrBuilder {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder addAllMethods(Iterable iterable) {
            copyOnWrite();
            Api.access$700((Api) this.instance, iterable);
            return this;
        }

        public Builder addAllMixins(Iterable iterable) {
            copyOnWrite();
            Api.access$2500((Api) this.instance, iterable);
            return this;
        }

        public Builder addAllOptions(Iterable iterable) {
            copyOnWrite();
            Api.access$1300((Api) this.instance, iterable);
            return this;
        }

        public Builder addMethods(Method method) {
            copyOnWrite();
            Api.access$500((Api) this.instance, method);
            return this;
        }

        public Builder addMixins(Mixin mixin) {
            copyOnWrite();
            Api.access$2300((Api) this.instance, mixin);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            Api.access$1100((Api) this.instance, option);
            return this;
        }

        public Builder clearMethods() {
            copyOnWrite();
            Api.access$800((Api) this.instance);
            return this;
        }

        public Builder clearMixins() {
            copyOnWrite();
            Api.access$2600((Api) this.instance);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            Api.access$200((Api) this.instance);
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            Api.access$1400((Api) this.instance);
            return this;
        }

        public Builder clearSourceContext() {
            copyOnWrite();
            Api.access$2100((Api) this.instance);
            return this;
        }

        public Builder clearSyntax() {
            copyOnWrite();
            Api.access$3000((Api) this.instance);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            Api.access$1700((Api) this.instance);
            return this;
        }

        public Method getMethods(int i) {
            return ((Api) this.instance).getMethods(i);
        }

        public int getMethodsCount() {
            return ((Api) this.instance).getMethodsCount();
        }

        public List getMethodsList() {
            return Collections.unmodifiableList(((Api) this.instance).getMethodsList());
        }

        public Mixin getMixins(int i) {
            return ((Api) this.instance).getMixins(i);
        }

        public int getMixinsCount() {
            return ((Api) this.instance).getMixinsCount();
        }

        public List getMixinsList() {
            return Collections.unmodifiableList(((Api) this.instance).getMixinsList());
        }

        public String getName() {
            return ((Api) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((Api) this.instance).getNameBytes();
        }

        public Option getOptions(int i) {
            return ((Api) this.instance).getOptions(i);
        }

        public int getOptionsCount() {
            return ((Api) this.instance).getOptionsCount();
        }

        public List getOptionsList() {
            return Collections.unmodifiableList(((Api) this.instance).getOptionsList());
        }

        public SourceContext getSourceContext() {
            return ((Api) this.instance).getSourceContext();
        }

        public Syntax getSyntax() {
            return ((Api) this.instance).getSyntax();
        }

        public int getSyntaxValue() {
            return ((Api) this.instance).getSyntaxValue();
        }

        public String getVersion() {
            return ((Api) this.instance).getVersion();
        }

        public ByteString getVersionBytes() {
            return ((Api) this.instance).getVersionBytes();
        }

        public boolean hasSourceContext() {
            return ((Api) this.instance).hasSourceContext();
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            Api.access$2000((Api) this.instance, sourceContext);
            return this;
        }

        public Builder removeMethods(int i) {
            copyOnWrite();
            Api.access$900((Api) this.instance, i);
            return this;
        }

        public Builder removeMixins(int i) {
            copyOnWrite();
            Api.access$2700((Api) this.instance, i);
            return this;
        }

        public Builder removeOptions(int i) {
            copyOnWrite();
            Api.access$1500((Api) this.instance, i);
            return this;
        }

        public Builder setMethods(int i, Method method) {
            copyOnWrite();
            Api.access$400((Api) this.instance, i, method);
            return this;
        }

        public Builder setMixins(int i, Mixin mixin) {
            copyOnWrite();
            Api.access$2200((Api) this.instance, i, mixin);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            Api.access$100((Api) this.instance, str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            Api.access$300((Api) this.instance, byteString);
            return this;
        }

        public Builder setOptions(int i, Option option) {
            copyOnWrite();
            Api.access$1000((Api) this.instance, i, option);
            return this;
        }

        public Builder setSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            Api.access$1900((Api) this.instance, sourceContext);
            return this;
        }

        public Builder setSyntax(Syntax syntax) {
            copyOnWrite();
            Api.access$2900((Api) this.instance, syntax);
            return this;
        }

        public Builder setSyntaxValue(int i) {
            copyOnWrite();
            Api.access$2800((Api) this.instance, i);
            return this;
        }

        public Builder setVersion(String str) {
            copyOnWrite();
            Api.access$1600((Api) this.instance, str);
            return this;
        }

        public Builder setVersionBytes(ByteString byteString) {
            copyOnWrite();
            Api.access$1800((Api) this.instance, byteString);
            return this;
        }

        private Builder() {
            super(Api.access$000());
        }

        public Builder addMethods(int i, Method method) {
            copyOnWrite();
            Api.access$600((Api) this.instance, i, method);
            return this;
        }

        public Builder addMixins(int i, Mixin mixin) {
            copyOnWrite();
            Api.access$2400((Api) this.instance, i, mixin);
            return this;
        }

        public Builder addOptions(int i, Option option) {
            copyOnWrite();
            Api.access$1200((Api) this.instance, i, option);
            return this;
        }

        public Builder setMethods(int i, Method.Builder builder) {
            copyOnWrite();
            Api.access$400((Api) this.instance, i, (Method) builder.build());
            return this;
        }

        public Builder setMixins(int i, Mixin.Builder builder) {
            copyOnWrite();
            Api.access$2200((Api) this.instance, i, (Mixin) builder.build());
            return this;
        }

        public Builder setOptions(int i, Option.Builder builder) {
            copyOnWrite();
            Api.access$1000((Api) this.instance, i, (Option) builder.build());
            return this;
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
            copyOnWrite();
            Api.access$1900((Api) this.instance, (SourceContext) builder.build());
            return this;
        }

        public Builder addMethods(Method.Builder builder) {
            copyOnWrite();
            Api.access$500((Api) this.instance, (Method) builder.build());
            return this;
        }

        public Builder addMixins(Mixin.Builder builder) {
            copyOnWrite();
            Api.access$2300((Api) this.instance, (Mixin) builder.build());
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            Api.access$1100((Api) this.instance, (Option) builder.build());
            return this;
        }

        public Builder addMethods(int i, Method.Builder builder) {
            copyOnWrite();
            Api.access$600((Api) this.instance, i, (Method) builder.build());
            return this;
        }

        public Builder addMixins(int i, Mixin.Builder builder) {
            copyOnWrite();
            Api.access$2400((Api) this.instance, i, (Mixin) builder.build());
            return this;
        }

        public Builder addOptions(int i, Option.Builder builder) {
            copyOnWrite();
            Api.access$1200((Api) this.instance, i, (Option) builder.build());
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
        Api api = new Api();
        DEFAULT_INSTANCE = api;
        GeneratedMessageLite.registerDefaultInstance(Api.class, api);
    }

    private Api() {
    }

    public static /* synthetic */ Api access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Api api, String str) {
        api.setName(str);
    }

    public static /* synthetic */ void access$1000(Api api, int i, Option option) {
        api.setOptions(i, option);
    }

    public static /* synthetic */ void access$1100(Api api, Option option) {
        api.addOptions(option);
    }

    public static /* synthetic */ void access$1200(Api api, int i, Option option) {
        api.addOptions(i, option);
    }

    public static /* synthetic */ void access$1300(Api api, Iterable iterable) {
        api.addAllOptions(iterable);
    }

    public static /* synthetic */ void access$1400(Api api) {
        api.clearOptions();
    }

    public static /* synthetic */ void access$1500(Api api, int i) {
        api.removeOptions(i);
    }

    public static /* synthetic */ void access$1600(Api api, String str) {
        api.setVersion(str);
    }

    public static /* synthetic */ void access$1700(Api api) {
        api.clearVersion();
    }

    public static /* synthetic */ void access$1800(Api api, ByteString byteString) {
        api.setVersionBytes(byteString);
    }

    public static /* synthetic */ void access$1900(Api api, SourceContext sourceContext) {
        api.setSourceContext(sourceContext);
    }

    public static /* synthetic */ void access$200(Api api) {
        api.clearName();
    }

    public static /* synthetic */ void access$2000(Api api, SourceContext sourceContext) {
        api.mergeSourceContext(sourceContext);
    }

    public static /* synthetic */ void access$2100(Api api) {
        api.clearSourceContext();
    }

    public static /* synthetic */ void access$2200(Api api, int i, Mixin mixin) {
        api.setMixins(i, mixin);
    }

    public static /* synthetic */ void access$2300(Api api, Mixin mixin) {
        api.addMixins(mixin);
    }

    public static /* synthetic */ void access$2400(Api api, int i, Mixin mixin) {
        api.addMixins(i, mixin);
    }

    public static /* synthetic */ void access$2500(Api api, Iterable iterable) {
        api.addAllMixins(iterable);
    }

    public static /* synthetic */ void access$2600(Api api) {
        api.clearMixins();
    }

    public static /* synthetic */ void access$2700(Api api, int i) {
        api.removeMixins(i);
    }

    public static /* synthetic */ void access$2800(Api api, int i) {
        api.setSyntaxValue(i);
    }

    public static /* synthetic */ void access$2900(Api api, Syntax syntax) {
        api.setSyntax(syntax);
    }

    public static /* synthetic */ void access$300(Api api, ByteString byteString) {
        api.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$3000(Api api) {
        api.clearSyntax();
    }

    public static /* synthetic */ void access$400(Api api, int i, Method method) {
        api.setMethods(i, method);
    }

    public static /* synthetic */ void access$500(Api api, Method method) {
        api.addMethods(method);
    }

    public static /* synthetic */ void access$600(Api api, int i, Method method) {
        api.addMethods(i, method);
    }

    public static /* synthetic */ void access$700(Api api, Iterable iterable) {
        api.addAllMethods(iterable);
    }

    public static /* synthetic */ void access$800(Api api) {
        api.clearMethods();
    }

    public static /* synthetic */ void access$900(Api api, int i) {
        api.removeMethods(i);
    }

    private void addAllMethods(Iterable iterable) {
        ensureMethodsIsMutable();
        AbstractMessageLite.addAll(iterable, this.methods_);
    }

    private void addAllMixins(Iterable iterable) {
        ensureMixinsIsMutable();
        AbstractMessageLite.addAll(iterable, this.mixins_);
    }

    private void addAllOptions(Iterable iterable) {
        ensureOptionsIsMutable();
        AbstractMessageLite.addAll(iterable, this.options_);
    }

    private void addMethods(Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(method);
    }

    private void addMixins(Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(mixin);
    }

    private void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    private void clearMethods() {
        this.methods_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearMixins() {
        this.mixins_ = GeneratedMessageLite.emptyProtobufList();
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

    private void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    private void ensureMethodsIsMutable() {
        Internal.ProtobufList protobufList = this.methods_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.methods_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureMixinsIsMutable() {
        Internal.ProtobufList protobufList = this.mixins_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.mixins_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureOptionsIsMutable() {
        Internal.ProtobufList protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Api getDefaultInstance() {
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

    public static Api parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Api) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Api parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeMethods(int i) {
        ensureMethodsIsMutable();
        this.methods_.remove(i);
    }

    private void removeMixins(int i) {
        ensureMixinsIsMutable();
        this.mixins_.remove(i);
    }

    private void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    private void setMethods(int i, Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.set(i, method);
    }

    private void setMixins(int i, Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.set(i, mixin);
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

    private void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    private void setVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.version_ = byteString.toStringUtf8();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new Api();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005ဉ\u0000\u0006\u001b\u0007\f", new Object[]{"bitField0_", "name_", "methods_", Method.class, "options_", Option.class, "version_", "sourceContext_", "mixins_", Mixin.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser == null) {
                    synchronized (Api.class) {
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

    public Method getMethods(int i) {
        return (Method) this.methods_.get(i);
    }

    public int getMethodsCount() {
        return this.methods_.size();
    }

    public List getMethodsList() {
        return this.methods_;
    }

    public MethodOrBuilder getMethodsOrBuilder(int i) {
        return (MethodOrBuilder) this.methods_.get(i);
    }

    public List getMethodsOrBuilderList() {
        return this.methods_;
    }

    public Mixin getMixins(int i) {
        return (Mixin) this.mixins_.get(i);
    }

    public int getMixinsCount() {
        return this.mixins_.size();
    }

    public List getMixinsList() {
        return this.mixins_;
    }

    public MixinOrBuilder getMixinsOrBuilder(int i) {
        return (MixinOrBuilder) this.mixins_.get(i);
    }

    public List getMixinsOrBuilderList() {
        return this.mixins_;
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

    public String getVersion() {
        return this.version_;
    }

    public ByteString getVersionBytes() {
        return ByteString.copyFromUtf8(this.version_);
    }

    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(Api api) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(api);
    }

    public static Api parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Api) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Api parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Api parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addMethods(int i, Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(i, method);
    }

    private void addMixins(int i, Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(i, mixin);
    }

    private void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    public static Api parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Api parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Api parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Api parseFrom(InputStream inputStream) throws IOException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Api parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Api parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Api parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
