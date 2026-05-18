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
public final class Method extends GeneratedMessageLite implements MethodOrBuilder {
    private static final Method DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile Parser PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private boolean requestStreaming_;
    private boolean responseStreaming_;
    private int syntax_;
    private String name_ = "";
    private String requestTypeUrl_ = "";
    private String responseTypeUrl_ = "";
    private Internal.ProtobufList options_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder implements MethodOrBuilder {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder addAllOptions(Iterable iterable) {
            copyOnWrite();
            Method.access$1700((Method) this.instance, iterable);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            Method.access$1500((Method) this.instance, option);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            Method.access$200((Method) this.instance);
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            Method.access$1800((Method) this.instance);
            return this;
        }

        public Builder clearRequestStreaming() {
            copyOnWrite();
            Method.access$800((Method) this.instance);
            return this;
        }

        public Builder clearRequestTypeUrl() {
            copyOnWrite();
            Method.access$500((Method) this.instance);
            return this;
        }

        public Builder clearResponseStreaming() {
            copyOnWrite();
            Method.access$1300((Method) this.instance);
            return this;
        }

        public Builder clearResponseTypeUrl() {
            copyOnWrite();
            Method.access$1000((Method) this.instance);
            return this;
        }

        public Builder clearSyntax() {
            copyOnWrite();
            Method.access$2200((Method) this.instance);
            return this;
        }

        public String getName() {
            return ((Method) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((Method) this.instance).getNameBytes();
        }

        public Option getOptions(int i) {
            return ((Method) this.instance).getOptions(i);
        }

        public int getOptionsCount() {
            return ((Method) this.instance).getOptionsCount();
        }

        public List getOptionsList() {
            return Collections.unmodifiableList(((Method) this.instance).getOptionsList());
        }

        public boolean getRequestStreaming() {
            return ((Method) this.instance).getRequestStreaming();
        }

        public String getRequestTypeUrl() {
            return ((Method) this.instance).getRequestTypeUrl();
        }

        public ByteString getRequestTypeUrlBytes() {
            return ((Method) this.instance).getRequestTypeUrlBytes();
        }

        public boolean getResponseStreaming() {
            return ((Method) this.instance).getResponseStreaming();
        }

        public String getResponseTypeUrl() {
            return ((Method) this.instance).getResponseTypeUrl();
        }

        public ByteString getResponseTypeUrlBytes() {
            return ((Method) this.instance).getResponseTypeUrlBytes();
        }

        public Syntax getSyntax() {
            return ((Method) this.instance).getSyntax();
        }

        public int getSyntaxValue() {
            return ((Method) this.instance).getSyntaxValue();
        }

        public Builder removeOptions(int i) {
            copyOnWrite();
            Method.access$1900((Method) this.instance, i);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            Method.access$100((Method) this.instance, str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            Method.access$300((Method) this.instance, byteString);
            return this;
        }

        public Builder setOptions(int i, Option option) {
            copyOnWrite();
            Method.access$1400((Method) this.instance, i, option);
            return this;
        }

        public Builder setRequestStreaming(boolean z) {
            copyOnWrite();
            Method.access$700((Method) this.instance, z);
            return this;
        }

        public Builder setRequestTypeUrl(String str) {
            copyOnWrite();
            Method.access$400((Method) this.instance, str);
            return this;
        }

        public Builder setRequestTypeUrlBytes(ByteString byteString) {
            copyOnWrite();
            Method.access$600((Method) this.instance, byteString);
            return this;
        }

        public Builder setResponseStreaming(boolean z) {
            copyOnWrite();
            Method.access$1200((Method) this.instance, z);
            return this;
        }

        public Builder setResponseTypeUrl(String str) {
            copyOnWrite();
            Method.access$900((Method) this.instance, str);
            return this;
        }

        public Builder setResponseTypeUrlBytes(ByteString byteString) {
            copyOnWrite();
            Method.access$1100((Method) this.instance, byteString);
            return this;
        }

        public Builder setSyntax(Syntax syntax) {
            copyOnWrite();
            Method.access$2100((Method) this.instance, syntax);
            return this;
        }

        public Builder setSyntaxValue(int i) {
            copyOnWrite();
            Method.access$2000((Method) this.instance, i);
            return this;
        }

        private Builder() {
            super(Method.access$000());
        }

        public Builder addOptions(int i, Option option) {
            copyOnWrite();
            Method.access$1600((Method) this.instance, i, option);
            return this;
        }

        public Builder setOptions(int i, Option.Builder builder) {
            copyOnWrite();
            Method.access$1400((Method) this.instance, i, (Option) builder.build());
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            Method.access$1500((Method) this.instance, (Option) builder.build());
            return this;
        }

        public Builder addOptions(int i, Option.Builder builder) {
            copyOnWrite();
            Method.access$1600((Method) this.instance, i, (Option) builder.build());
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
        Method method = new Method();
        DEFAULT_INSTANCE = method;
        GeneratedMessageLite.registerDefaultInstance(Method.class, method);
    }

    private Method() {
    }

    public static /* synthetic */ Method access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Method method, String str) {
        method.setName(str);
    }

    public static /* synthetic */ void access$1000(Method method) {
        method.clearResponseTypeUrl();
    }

    public static /* synthetic */ void access$1100(Method method, ByteString byteString) {
        method.setResponseTypeUrlBytes(byteString);
    }

    public static /* synthetic */ void access$1200(Method method, boolean z) {
        method.setResponseStreaming(z);
    }

    public static /* synthetic */ void access$1300(Method method) {
        method.clearResponseStreaming();
    }

    public static /* synthetic */ void access$1400(Method method, int i, Option option) {
        method.setOptions(i, option);
    }

    public static /* synthetic */ void access$1500(Method method, Option option) {
        method.addOptions(option);
    }

    public static /* synthetic */ void access$1600(Method method, int i, Option option) {
        method.addOptions(i, option);
    }

    public static /* synthetic */ void access$1700(Method method, Iterable iterable) {
        method.addAllOptions(iterable);
    }

    public static /* synthetic */ void access$1800(Method method) {
        method.clearOptions();
    }

    public static /* synthetic */ void access$1900(Method method, int i) {
        method.removeOptions(i);
    }

    public static /* synthetic */ void access$200(Method method) {
        method.clearName();
    }

    public static /* synthetic */ void access$2000(Method method, int i) {
        method.setSyntaxValue(i);
    }

    public static /* synthetic */ void access$2100(Method method, Syntax syntax) {
        method.setSyntax(syntax);
    }

    public static /* synthetic */ void access$2200(Method method) {
        method.clearSyntax();
    }

    public static /* synthetic */ void access$300(Method method, ByteString byteString) {
        method.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(Method method, String str) {
        method.setRequestTypeUrl(str);
    }

    public static /* synthetic */ void access$500(Method method) {
        method.clearRequestTypeUrl();
    }

    public static /* synthetic */ void access$600(Method method, ByteString byteString) {
        method.setRequestTypeUrlBytes(byteString);
    }

    public static /* synthetic */ void access$700(Method method, boolean z) {
        method.setRequestStreaming(z);
    }

    public static /* synthetic */ void access$800(Method method) {
        method.clearRequestStreaming();
    }

    public static /* synthetic */ void access$900(Method method, String str) {
        method.setResponseTypeUrl(str);
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

    private void clearOptions() {
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRequestStreaming() {
        this.requestStreaming_ = false;
    }

    private void clearRequestTypeUrl() {
        this.requestTypeUrl_ = getDefaultInstance().getRequestTypeUrl();
    }

    private void clearResponseStreaming() {
        this.responseStreaming_ = false;
    }

    private void clearResponseTypeUrl() {
        this.responseTypeUrl_ = getDefaultInstance().getResponseTypeUrl();
    }

    private void clearSyntax() {
        this.syntax_ = 0;
    }

    private void ensureOptionsIsMutable() {
        Internal.ProtobufList protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Method getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Method parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Method) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Method parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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

    private void setOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i, option);
    }

    private void setRequestStreaming(boolean z) {
        this.requestStreaming_ = z;
    }

    private void setRequestTypeUrl(String str) {
        str.getClass();
        this.requestTypeUrl_ = str;
    }

    private void setRequestTypeUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.requestTypeUrl_ = byteString.toStringUtf8();
    }

    private void setResponseStreaming(boolean z) {
        this.responseStreaming_ = z;
    }

    private void setResponseTypeUrl(String str) {
        str.getClass();
        this.responseTypeUrl_ = str;
    }

    private void setResponseTypeUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.responseTypeUrl_ = byteString.toStringUtf8();
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
                return new Method();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", Option.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser == null) {
                    synchronized (Method.class) {
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

    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    public String getRequestTypeUrl() {
        return this.requestTypeUrl_;
    }

    public ByteString getRequestTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.requestTypeUrl_);
    }

    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    public String getResponseTypeUrl() {
        return this.responseTypeUrl_;
    }

    public ByteString getResponseTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.responseTypeUrl_);
    }

    public Syntax getSyntax() {
        Syntax forNumber = Syntax.forNumber(this.syntax_);
        return forNumber == null ? Syntax.UNRECOGNIZED : forNumber;
    }

    public int getSyntaxValue() {
        return this.syntax_;
    }

    public static Builder newBuilder(Method method) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(method);
    }

    public static Method parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Method) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Method parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Method parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    public static Method parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Method parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Method parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Method parseFrom(InputStream inputStream) throws IOException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Method parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Method parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Method parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
