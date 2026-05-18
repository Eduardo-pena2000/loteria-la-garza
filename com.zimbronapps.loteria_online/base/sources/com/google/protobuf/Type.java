package com.google.protobuf;

import com.google.protobuf.Field;
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
public final class Type extends GeneratedMessageLite implements TypeOrBuilder {
    private static final Type DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 7;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile Parser PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private int bitField0_;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private Internal.ProtobufList fields_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList oneofs_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList options_ = GeneratedMessageLite.emptyProtobufList();
    private String edition_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder implements TypeOrBuilder {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder addAllFields(Iterable iterable) {
            copyOnWrite();
            Type.access$700((Type) this.instance, iterable);
            return this;
        }

        public Builder addAllOneofs(Iterable iterable) {
            copyOnWrite();
            Type.access$1200((Type) this.instance, iterable);
            return this;
        }

        public Builder addAllOptions(Iterable iterable) {
            copyOnWrite();
            Type.access$1800((Type) this.instance, iterable);
            return this;
        }

        public Builder addFields(Field field) {
            copyOnWrite();
            Type.access$500((Type) this.instance, field);
            return this;
        }

        public Builder addOneofs(String str) {
            copyOnWrite();
            Type.access$1100((Type) this.instance, str);
            return this;
        }

        public Builder addOneofsBytes(ByteString byteString) {
            copyOnWrite();
            Type.access$1400((Type) this.instance, byteString);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            Type.access$1600((Type) this.instance, option);
            return this;
        }

        public Builder clearEdition() {
            copyOnWrite();
            Type.access$2800((Type) this.instance);
            return this;
        }

        public Builder clearFields() {
            copyOnWrite();
            Type.access$800((Type) this.instance);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            Type.access$200((Type) this.instance);
            return this;
        }

        public Builder clearOneofs() {
            copyOnWrite();
            Type.access$1300((Type) this.instance);
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            Type.access$1900((Type) this.instance);
            return this;
        }

        public Builder clearSourceContext() {
            copyOnWrite();
            Type.access$2300((Type) this.instance);
            return this;
        }

        public Builder clearSyntax() {
            copyOnWrite();
            Type.access$2600((Type) this.instance);
            return this;
        }

        public String getEdition() {
            return ((Type) this.instance).getEdition();
        }

        public ByteString getEditionBytes() {
            return ((Type) this.instance).getEditionBytes();
        }

        public Field getFields(int i) {
            return ((Type) this.instance).getFields(i);
        }

        public int getFieldsCount() {
            return ((Type) this.instance).getFieldsCount();
        }

        public List getFieldsList() {
            return Collections.unmodifiableList(((Type) this.instance).getFieldsList());
        }

        public String getName() {
            return ((Type) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((Type) this.instance).getNameBytes();
        }

        public String getOneofs(int i) {
            return ((Type) this.instance).getOneofs(i);
        }

        public ByteString getOneofsBytes(int i) {
            return ((Type) this.instance).getOneofsBytes(i);
        }

        public int getOneofsCount() {
            return ((Type) this.instance).getOneofsCount();
        }

        public List getOneofsList() {
            return Collections.unmodifiableList(((Type) this.instance).getOneofsList());
        }

        public Option getOptions(int i) {
            return ((Type) this.instance).getOptions(i);
        }

        public int getOptionsCount() {
            return ((Type) this.instance).getOptionsCount();
        }

        public List getOptionsList() {
            return Collections.unmodifiableList(((Type) this.instance).getOptionsList());
        }

        public SourceContext getSourceContext() {
            return ((Type) this.instance).getSourceContext();
        }

        public Syntax getSyntax() {
            return ((Type) this.instance).getSyntax();
        }

        public int getSyntaxValue() {
            return ((Type) this.instance).getSyntaxValue();
        }

        public boolean hasSourceContext() {
            return ((Type) this.instance).hasSourceContext();
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            Type.access$2200((Type) this.instance, sourceContext);
            return this;
        }

        public Builder removeFields(int i) {
            copyOnWrite();
            Type.access$900((Type) this.instance, i);
            return this;
        }

        public Builder removeOptions(int i) {
            copyOnWrite();
            Type.access$2000((Type) this.instance, i);
            return this;
        }

        public Builder setEdition(String str) {
            copyOnWrite();
            Type.access$2700((Type) this.instance, str);
            return this;
        }

        public Builder setEditionBytes(ByteString byteString) {
            copyOnWrite();
            Type.access$2900((Type) this.instance, byteString);
            return this;
        }

        public Builder setFields(int i, Field field) {
            copyOnWrite();
            Type.access$400((Type) this.instance, i, field);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            Type.access$100((Type) this.instance, str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            Type.access$300((Type) this.instance, byteString);
            return this;
        }

        public Builder setOneofs(int i, String str) {
            copyOnWrite();
            Type.access$1000((Type) this.instance, i, str);
            return this;
        }

        public Builder setOptions(int i, Option option) {
            copyOnWrite();
            Type.access$1500((Type) this.instance, i, option);
            return this;
        }

        public Builder setSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            Type.access$2100((Type) this.instance, sourceContext);
            return this;
        }

        public Builder setSyntax(Syntax syntax) {
            copyOnWrite();
            Type.access$2500((Type) this.instance, syntax);
            return this;
        }

        public Builder setSyntaxValue(int i) {
            copyOnWrite();
            Type.access$2400((Type) this.instance, i);
            return this;
        }

        private Builder() {
            super(Type.access$000());
        }

        public Builder addFields(int i, Field field) {
            copyOnWrite();
            Type.access$600((Type) this.instance, i, field);
            return this;
        }

        public Builder addOptions(int i, Option option) {
            copyOnWrite();
            Type.access$1700((Type) this.instance, i, option);
            return this;
        }

        public Builder setFields(int i, Field.Builder builder) {
            copyOnWrite();
            Type.access$400((Type) this.instance, i, (Field) builder.build());
            return this;
        }

        public Builder setOptions(int i, Option.Builder builder) {
            copyOnWrite();
            Type.access$1500((Type) this.instance, i, (Option) builder.build());
            return this;
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
            copyOnWrite();
            Type.access$2100((Type) this.instance, (SourceContext) builder.build());
            return this;
        }

        public Builder addFields(Field.Builder builder) {
            copyOnWrite();
            Type.access$500((Type) this.instance, (Field) builder.build());
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            Type.access$1600((Type) this.instance, (Option) builder.build());
            return this;
        }

        public Builder addFields(int i, Field.Builder builder) {
            copyOnWrite();
            Type.access$600((Type) this.instance, i, (Field) builder.build());
            return this;
        }

        public Builder addOptions(int i, Option.Builder builder) {
            copyOnWrite();
            Type.access$1700((Type) this.instance, i, (Option) builder.build());
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
        Type type = new Type();
        DEFAULT_INSTANCE = type;
        GeneratedMessageLite.registerDefaultInstance(Type.class, type);
    }

    private Type() {
    }

    public static /* synthetic */ Type access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Type type, String str) {
        type.setName(str);
    }

    public static /* synthetic */ void access$1000(Type type, int i, String str) {
        type.setOneofs(i, str);
    }

    public static /* synthetic */ void access$1100(Type type, String str) {
        type.addOneofs(str);
    }

    public static /* synthetic */ void access$1200(Type type, Iterable iterable) {
        type.addAllOneofs(iterable);
    }

    public static /* synthetic */ void access$1300(Type type) {
        type.clearOneofs();
    }

    public static /* synthetic */ void access$1400(Type type, ByteString byteString) {
        type.addOneofsBytes(byteString);
    }

    public static /* synthetic */ void access$1500(Type type, int i, Option option) {
        type.setOptions(i, option);
    }

    public static /* synthetic */ void access$1600(Type type, Option option) {
        type.addOptions(option);
    }

    public static /* synthetic */ void access$1700(Type type, int i, Option option) {
        type.addOptions(i, option);
    }

    public static /* synthetic */ void access$1800(Type type, Iterable iterable) {
        type.addAllOptions(iterable);
    }

    public static /* synthetic */ void access$1900(Type type) {
        type.clearOptions();
    }

    public static /* synthetic */ void access$200(Type type) {
        type.clearName();
    }

    public static /* synthetic */ void access$2000(Type type, int i) {
        type.removeOptions(i);
    }

    public static /* synthetic */ void access$2100(Type type, SourceContext sourceContext) {
        type.setSourceContext(sourceContext);
    }

    public static /* synthetic */ void access$2200(Type type, SourceContext sourceContext) {
        type.mergeSourceContext(sourceContext);
    }

    public static /* synthetic */ void access$2300(Type type) {
        type.clearSourceContext();
    }

    public static /* synthetic */ void access$2400(Type type, int i) {
        type.setSyntaxValue(i);
    }

    public static /* synthetic */ void access$2500(Type type, Syntax syntax) {
        type.setSyntax(syntax);
    }

    public static /* synthetic */ void access$2600(Type type) {
        type.clearSyntax();
    }

    public static /* synthetic */ void access$2700(Type type, String str) {
        type.setEdition(str);
    }

    public static /* synthetic */ void access$2800(Type type) {
        type.clearEdition();
    }

    public static /* synthetic */ void access$2900(Type type, ByteString byteString) {
        type.setEditionBytes(byteString);
    }

    public static /* synthetic */ void access$300(Type type, ByteString byteString) {
        type.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(Type type, int i, Field field) {
        type.setFields(i, field);
    }

    public static /* synthetic */ void access$500(Type type, Field field) {
        type.addFields(field);
    }

    public static /* synthetic */ void access$600(Type type, int i, Field field) {
        type.addFields(i, field);
    }

    public static /* synthetic */ void access$700(Type type, Iterable iterable) {
        type.addAllFields(iterable);
    }

    public static /* synthetic */ void access$800(Type type) {
        type.clearFields();
    }

    public static /* synthetic */ void access$900(Type type, int i) {
        type.removeFields(i);
    }

    private void addAllFields(Iterable iterable) {
        ensureFieldsIsMutable();
        AbstractMessageLite.addAll(iterable, this.fields_);
    }

    private void addAllOneofs(Iterable iterable) {
        ensureOneofsIsMutable();
        AbstractMessageLite.addAll(iterable, this.oneofs_);
    }

    private void addAllOptions(Iterable iterable) {
        ensureOptionsIsMutable();
        AbstractMessageLite.addAll(iterable, this.options_);
    }

    private void addFields(Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(field);
    }

    private void addOneofs(String str) {
        str.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.add(str);
    }

    private void addOneofsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureOneofsIsMutable();
        this.oneofs_.add(byteString.toStringUtf8());
    }

    private void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    private void clearEdition() {
        this.edition_ = getDefaultInstance().getEdition();
    }

    private void clearFields() {
        this.fields_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    private void clearOneofs() {
        this.oneofs_ = GeneratedMessageLite.emptyProtobufList();
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

    private void ensureFieldsIsMutable() {
        Internal.ProtobufList protobufList = this.fields_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.fields_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureOneofsIsMutable() {
        Internal.ProtobufList protobufList = this.oneofs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.oneofs_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureOptionsIsMutable() {
        Internal.ProtobufList protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Type getDefaultInstance() {
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

    public static Type parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Type) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeFields(int i) {
        ensureFieldsIsMutable();
        this.fields_.remove(i);
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

    private void setFields(int i, Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.set(i, field);
    }

    private void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    private void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    private void setOneofs(int i, String str) {
        str.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.set(i, str);
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
                return new Type();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005ဉ\u0000\u0006\f\u0007Ȉ", new Object[]{"bitField0_", "name_", "fields_", Field.class, "oneofs_", "options_", Option.class, "sourceContext_", "syntax_", "edition_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser == null) {
                    synchronized (Type.class) {
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

    public Field getFields(int i) {
        return (Field) this.fields_.get(i);
    }

    public int getFieldsCount() {
        return this.fields_.size();
    }

    public List getFieldsList() {
        return this.fields_;
    }

    public FieldOrBuilder getFieldsOrBuilder(int i) {
        return (FieldOrBuilder) this.fields_.get(i);
    }

    public List getFieldsOrBuilderList() {
        return this.fields_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public String getOneofs(int i) {
        return (String) this.oneofs_.get(i);
    }

    public ByteString getOneofsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.oneofs_.get(i));
    }

    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    public List getOneofsList() {
        return this.oneofs_;
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

    public static Builder newBuilder(Type type) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(type);
    }

    public static Type parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Type) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Type parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Type parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addFields(int i, Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(i, field);
    }

    private void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    public static Type parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Type parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Type parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Type parseFrom(InputStream inputStream) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Type parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Type parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
