package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Value;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ListValue extends GeneratedMessageLite implements ListValueOrBuilder {
    private static final ListValue DEFAULT_INSTANCE;
    private static volatile Parser PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private Internal.ProtobufList values_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder implements ListValueOrBuilder {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder addAllValues(Iterable iterable) {
            copyOnWrite();
            ListValue.access$400((ListValue) this.instance, iterable);
            return this;
        }

        public Builder addValues(Value value) {
            copyOnWrite();
            ListValue.access$200((ListValue) this.instance, value);
            return this;
        }

        public Builder clearValues() {
            copyOnWrite();
            ListValue.access$500((ListValue) this.instance);
            return this;
        }

        public Value getValues(int i) {
            return ((ListValue) this.instance).getValues(i);
        }

        public int getValuesCount() {
            return ((ListValue) this.instance).getValuesCount();
        }

        public List getValuesList() {
            return Collections.unmodifiableList(((ListValue) this.instance).getValuesList());
        }

        public Builder removeValues(int i) {
            copyOnWrite();
            ListValue.access$600((ListValue) this.instance, i);
            return this;
        }

        public Builder setValues(int i, Value value) {
            copyOnWrite();
            ListValue.access$100((ListValue) this.instance, i, value);
            return this;
        }

        private Builder() {
            super(ListValue.access$000());
        }

        public Builder addValues(int i, Value value) {
            copyOnWrite();
            ListValue.access$300((ListValue) this.instance, i, value);
            return this;
        }

        public Builder setValues(int i, Value.Builder builder) {
            copyOnWrite();
            ListValue.access$100((ListValue) this.instance, i, (Value) builder.build());
            return this;
        }

        public Builder addValues(Value.Builder builder) {
            copyOnWrite();
            ListValue.access$200((ListValue) this.instance, (Value) builder.build());
            return this;
        }

        public Builder addValues(int i, Value.Builder builder) {
            copyOnWrite();
            ListValue.access$300((ListValue) this.instance, i, (Value) builder.build());
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
        ListValue listValue = new ListValue();
        DEFAULT_INSTANCE = listValue;
        GeneratedMessageLite.registerDefaultInstance(ListValue.class, listValue);
    }

    private ListValue() {
    }

    public static /* synthetic */ ListValue access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(ListValue listValue, int i, Value value) {
        listValue.setValues(i, value);
    }

    public static /* synthetic */ void access$200(ListValue listValue, Value value) {
        listValue.addValues(value);
    }

    public static /* synthetic */ void access$300(ListValue listValue, int i, Value value) {
        listValue.addValues(i, value);
    }

    public static /* synthetic */ void access$400(ListValue listValue, Iterable iterable) {
        listValue.addAllValues(iterable);
    }

    public static /* synthetic */ void access$500(ListValue listValue) {
        listValue.clearValues();
    }

    public static /* synthetic */ void access$600(ListValue listValue, int i) {
        listValue.removeValues(i);
    }

    private void addAllValues(Iterable iterable) {
        ensureValuesIsMutable();
        AbstractMessageLite.addAll(iterable, this.values_);
    }

    private void addValues(Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(value);
    }

    private void clearValues() {
        this.values_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureValuesIsMutable() {
        Internal.ProtobufList protobufList = this.values_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.values_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeValues(int i) {
        ensureValuesIsMutable();
        this.values_.remove(i);
    }

    private void setValues(int i, Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.set(i, value);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new ListValue();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser == null) {
                    synchronized (ListValue.class) {
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

    public Value getValues(int i) {
        return (Value) this.values_.get(i);
    }

    public int getValuesCount() {
        return this.values_.size();
    }

    public List getValuesList() {
        return this.values_;
    }

    public ValueOrBuilder getValuesOrBuilder(int i) {
        return (ValueOrBuilder) this.values_.get(i);
    }

    public List getValuesOrBuilderList() {
        return this.values_;
    }

    public static Builder newBuilder(ListValue listValue) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(listValue);
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ListValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addValues(int i, Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(i, value);
    }

    public static ListValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ListValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ListValue parseFrom(InputStream inputStream) throws IOException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListValue parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ListValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
