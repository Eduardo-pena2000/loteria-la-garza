package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DeveloperConsentOuterClass {

    public static final class DeveloperConsent extends GeneratedMessageLite implements DeveloperConsentOrBuilder {
        private static final DeveloperConsent DEFAULT_INSTANCE;
        public static final int OPTIONS_FIELD_NUMBER = 1;
        private static volatile Parser PARSER;
        private Internal.ProtobufList options_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder implements DeveloperConsentOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder addAllOptions(Iterable iterable) {
                copyOnWrite();
                DeveloperConsent.access$1500((DeveloperConsent) ((GeneratedMessageLite.Builder) this).instance, iterable);
                return this;
            }

            public Builder addOptions(DeveloperConsentOption developerConsentOption) {
                copyOnWrite();
                DeveloperConsent.access$1300((DeveloperConsent) ((GeneratedMessageLite.Builder) this).instance, developerConsentOption);
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                DeveloperConsent.access$1600((DeveloperConsent) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public DeveloperConsentOption getOptions(int i) {
                return ((DeveloperConsent) ((GeneratedMessageLite.Builder) this).instance).getOptions(i);
            }

            public int getOptionsCount() {
                return ((DeveloperConsent) ((GeneratedMessageLite.Builder) this).instance).getOptionsCount();
            }

            public List getOptionsList() {
                return Collections.unmodifiableList(((DeveloperConsent) ((GeneratedMessageLite.Builder) this).instance).getOptionsList());
            }

            public Builder removeOptions(int i) {
                copyOnWrite();
                DeveloperConsent.access$1700((DeveloperConsent) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setOptions(int i, DeveloperConsentOption developerConsentOption) {
                copyOnWrite();
                DeveloperConsent.access$1200((DeveloperConsent) ((GeneratedMessageLite.Builder) this).instance, i, developerConsentOption);
                return this;
            }

            private Builder() {
                super(DeveloperConsent.access$1100());
            }

            public Builder addOptions(int i, DeveloperConsentOption developerConsentOption) {
                copyOnWrite();
                DeveloperConsent.access$1400((DeveloperConsent) ((GeneratedMessageLite.Builder) this).instance, i, developerConsentOption);
                return this;
            }

            public Builder setOptions(int i, DeveloperConsentOption.Builder builder) {
                copyOnWrite();
                DeveloperConsent.access$1200((DeveloperConsent) ((GeneratedMessageLite.Builder) this).instance, i, (DeveloperConsentOption) builder.build());
                return this;
            }

            public Builder addOptions(DeveloperConsentOption.Builder builder) {
                copyOnWrite();
                DeveloperConsent.access$1300((DeveloperConsent) ((GeneratedMessageLite.Builder) this).instance, (DeveloperConsentOption) builder.build());
                return this;
            }

            public Builder addOptions(int i, DeveloperConsentOption.Builder builder) {
                copyOnWrite();
                DeveloperConsent.access$1400((DeveloperConsent) ((GeneratedMessageLite.Builder) this).instance, i, (DeveloperConsentOption) builder.build());
                return this;
            }
        }

        static {
            DeveloperConsent developerConsent = new DeveloperConsent();
            DEFAULT_INSTANCE = developerConsent;
            GeneratedMessageLite.registerDefaultInstance(DeveloperConsent.class, developerConsent);
        }

        private DeveloperConsent() {
        }

        public static /* synthetic */ DeveloperConsent access$1100() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$1200(DeveloperConsent developerConsent, int i, DeveloperConsentOption developerConsentOption) {
            developerConsent.setOptions(i, developerConsentOption);
        }

        public static /* synthetic */ void access$1300(DeveloperConsent developerConsent, DeveloperConsentOption developerConsentOption) {
            developerConsent.addOptions(developerConsentOption);
        }

        public static /* synthetic */ void access$1400(DeveloperConsent developerConsent, int i, DeveloperConsentOption developerConsentOption) {
            developerConsent.addOptions(i, developerConsentOption);
        }

        public static /* synthetic */ void access$1500(DeveloperConsent developerConsent, Iterable iterable) {
            developerConsent.addAllOptions(iterable);
        }

        public static /* synthetic */ void access$1600(DeveloperConsent developerConsent) {
            developerConsent.clearOptions();
        }

        public static /* synthetic */ void access$1700(DeveloperConsent developerConsent, int i) {
            developerConsent.removeOptions(i);
        }

        private void addAllOptions(Iterable iterable) {
            ensureOptionsIsMutable();
            AbstractMessageLite.addAll(iterable, this.options_);
        }

        private void addOptions(DeveloperConsentOption developerConsentOption) {
            developerConsentOption.getClass();
            ensureOptionsIsMutable();
            this.options_.add(developerConsentOption);
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

        public static DeveloperConsent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DeveloperConsent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeveloperConsent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeveloperConsent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeOptions(int i) {
            ensureOptionsIsMutable();
            this.options_.remove(i);
        }

        private void setOptions(int i, DeveloperConsentOption developerConsentOption) {
            developerConsentOption.getClass();
            ensureOptionsIsMutable();
            this.options_.set(i, developerConsentOption);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DeveloperConsent();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"options_", DeveloperConsentOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DeveloperConsent.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } finally {
                            }
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public DeveloperConsentOption getOptions(int i) {
            return (DeveloperConsentOption) this.options_.get(i);
        }

        public int getOptionsCount() {
            return this.options_.size();
        }

        public List getOptionsList() {
            return this.options_;
        }

        public DeveloperConsentOptionOrBuilder getOptionsOrBuilder(int i) {
            return (DeveloperConsentOptionOrBuilder) this.options_.get(i);
        }

        public List getOptionsOrBuilderList() {
            return this.options_;
        }

        public static Builder newBuilder(DeveloperConsent developerConsent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(developerConsent);
        }

        public static DeveloperConsent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeveloperConsent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeveloperConsent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DeveloperConsent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void addOptions(int i, DeveloperConsentOption developerConsentOption) {
            developerConsentOption.getClass();
            ensureOptionsIsMutable();
            this.options_.add(i, developerConsentOption);
        }

        public static DeveloperConsent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DeveloperConsent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeveloperConsent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DeveloperConsent parseFrom(InputStream inputStream) throws IOException {
            return (DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeveloperConsent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeveloperConsent parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DeveloperConsent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public enum DeveloperConsentChoice implements Internal.EnumLite {
        DEVELOPER_CONSENT_CHOICE_UNSPECIFIED(0),
        DEVELOPER_CONSENT_CHOICE_TRUE(1),
        DEVELOPER_CONSENT_CHOICE_FALSE(2),
        UNRECOGNIZED(-1);

        public static final int DEVELOPER_CONSENT_CHOICE_FALSE_VALUE = 2;
        public static final int DEVELOPER_CONSENT_CHOICE_TRUE_VALUE = 1;
        public static final int DEVELOPER_CONSENT_CHOICE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DeveloperConsentChoice findValueByNumber(int i) {
                return DeveloperConsentChoice.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            public boolean isInRange(int i) {
                return DeveloperConsentChoice.forNumber(i) != null;
            }
        }

        DeveloperConsentChoice(int i) {
            this.value = i;
        }

        public static DeveloperConsentChoice forNumber(int i) {
            if (i == 0) {
                return DEVELOPER_CONSENT_CHOICE_UNSPECIFIED;
            }
            if (i == 1) {
                return DEVELOPER_CONSENT_CHOICE_TRUE;
            }
            if (i != 2) {
                return null;
            }
            return DEVELOPER_CONSENT_CHOICE_FALSE;
        }

        public static Internal.EnumLiteMap internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static DeveloperConsentChoice valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class DeveloperConsentOption extends GeneratedMessageLite implements DeveloperConsentOptionOrBuilder {
        public static final int CUSTOM_TYPE_FIELD_NUMBER = 2;
        private static final DeveloperConsentOption DEFAULT_INSTANCE;
        private static volatile Parser PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private String customType_ = "";
        private int type_;
        private int value_;

        public static final class Builder extends GeneratedMessageLite.Builder implements DeveloperConsentOptionOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearCustomType() {
                copyOnWrite();
                DeveloperConsentOption.access$500((DeveloperConsentOption) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                DeveloperConsentOption.access$300((DeveloperConsentOption) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                DeveloperConsentOption.access$900((DeveloperConsentOption) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public String getCustomType() {
                return ((DeveloperConsentOption) ((GeneratedMessageLite.Builder) this).instance).getCustomType();
            }

            public ByteString getCustomTypeBytes() {
                return ((DeveloperConsentOption) ((GeneratedMessageLite.Builder) this).instance).getCustomTypeBytes();
            }

            public DeveloperConsentType getType() {
                return ((DeveloperConsentOption) ((GeneratedMessageLite.Builder) this).instance).getType();
            }

            public int getTypeValue() {
                return ((DeveloperConsentOption) ((GeneratedMessageLite.Builder) this).instance).getTypeValue();
            }

            public DeveloperConsentChoice getValue() {
                return ((DeveloperConsentOption) ((GeneratedMessageLite.Builder) this).instance).getValue();
            }

            public int getValueValue() {
                return ((DeveloperConsentOption) ((GeneratedMessageLite.Builder) this).instance).getValueValue();
            }

            public boolean hasCustomType() {
                return ((DeveloperConsentOption) ((GeneratedMessageLite.Builder) this).instance).hasCustomType();
            }

            public Builder setCustomType(String str) {
                copyOnWrite();
                DeveloperConsentOption.access$400((DeveloperConsentOption) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setCustomTypeBytes(ByteString byteString) {
                copyOnWrite();
                DeveloperConsentOption.access$600((DeveloperConsentOption) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setType(DeveloperConsentType developerConsentType) {
                copyOnWrite();
                DeveloperConsentOption.access$200((DeveloperConsentOption) ((GeneratedMessageLite.Builder) this).instance, developerConsentType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                DeveloperConsentOption.access$100((DeveloperConsentOption) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setValue(DeveloperConsentChoice developerConsentChoice) {
                copyOnWrite();
                DeveloperConsentOption.access$800((DeveloperConsentOption) ((GeneratedMessageLite.Builder) this).instance, developerConsentChoice);
                return this;
            }

            public Builder setValueValue(int i) {
                copyOnWrite();
                DeveloperConsentOption.access$700((DeveloperConsentOption) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            private Builder() {
                super(DeveloperConsentOption.access$000());
            }
        }

        static {
            DeveloperConsentOption developerConsentOption = new DeveloperConsentOption();
            DEFAULT_INSTANCE = developerConsentOption;
            GeneratedMessageLite.registerDefaultInstance(DeveloperConsentOption.class, developerConsentOption);
        }

        private DeveloperConsentOption() {
        }

        public static /* synthetic */ DeveloperConsentOption access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(DeveloperConsentOption developerConsentOption, int i) {
            developerConsentOption.setTypeValue(i);
        }

        public static /* synthetic */ void access$200(DeveloperConsentOption developerConsentOption, DeveloperConsentType developerConsentType) {
            developerConsentOption.setType(developerConsentType);
        }

        public static /* synthetic */ void access$300(DeveloperConsentOption developerConsentOption) {
            developerConsentOption.clearType();
        }

        public static /* synthetic */ void access$400(DeveloperConsentOption developerConsentOption, String str) {
            developerConsentOption.setCustomType(str);
        }

        public static /* synthetic */ void access$500(DeveloperConsentOption developerConsentOption) {
            developerConsentOption.clearCustomType();
        }

        public static /* synthetic */ void access$600(DeveloperConsentOption developerConsentOption, ByteString byteString) {
            developerConsentOption.setCustomTypeBytes(byteString);
        }

        public static /* synthetic */ void access$700(DeveloperConsentOption developerConsentOption, int i) {
            developerConsentOption.setValueValue(i);
        }

        public static /* synthetic */ void access$800(DeveloperConsentOption developerConsentOption, DeveloperConsentChoice developerConsentChoice) {
            developerConsentOption.setValue(developerConsentChoice);
        }

        public static /* synthetic */ void access$900(DeveloperConsentOption developerConsentOption) {
            developerConsentOption.clearValue();
        }

        private void clearCustomType() {
            this.bitField0_ &= -2;
            this.customType_ = getDefaultInstance().getCustomType();
        }

        private void clearType() {
            this.type_ = 0;
        }

        private void clearValue() {
            this.value_ = 0;
        }

        public static DeveloperConsentOption getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DeveloperConsentOption parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeveloperConsentOption parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCustomType(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.customType_ = str;
        }

        private void setCustomTypeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.customType_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setType(DeveloperConsentType developerConsentType) {
            this.type_ = developerConsentType.getNumber();
        }

        private void setTypeValue(int i) {
            this.type_ = i;
        }

        private void setValue(DeveloperConsentChoice developerConsentChoice) {
            this.value_ = developerConsentChoice.getNumber();
        }

        private void setValueValue(int i) {
            this.value_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DeveloperConsentOption();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ለ\u0000\u0003\f", new Object[]{"bitField0_", "type_", "customType_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DeveloperConsentOption.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } finally {
                            }
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getCustomType() {
            return this.customType_;
        }

        public ByteString getCustomTypeBytes() {
            return ByteString.copyFromUtf8(this.customType_);
        }

        public DeveloperConsentType getType() {
            DeveloperConsentType forNumber = DeveloperConsentType.forNumber(this.type_);
            return forNumber == null ? DeveloperConsentType.UNRECOGNIZED : forNumber;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public DeveloperConsentChoice getValue() {
            DeveloperConsentChoice forNumber = DeveloperConsentChoice.forNumber(this.value_);
            return forNumber == null ? DeveloperConsentChoice.UNRECOGNIZED : forNumber;
        }

        public int getValueValue() {
            return this.value_;
        }

        public boolean hasCustomType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(DeveloperConsentOption developerConsentOption) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(developerConsentOption);
        }

        public static DeveloperConsentOption parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeveloperConsentOption parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DeveloperConsentOption parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DeveloperConsentOption parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DeveloperConsentOption parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeveloperConsentOption parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DeveloperConsentOption parseFrom(InputStream inputStream) throws IOException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeveloperConsentOption parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeveloperConsentOption parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DeveloperConsentOption parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface DeveloperConsentOptionOrBuilder extends MessageLiteOrBuilder {
        String getCustomType();

        ByteString getCustomTypeBytes();

        DeveloperConsentType getType();

        int getTypeValue();

        DeveloperConsentChoice getValue();

        int getValueValue();

        boolean hasCustomType();
    }

    public interface DeveloperConsentOrBuilder extends MessageLiteOrBuilder {
        DeveloperConsentOption getOptions(int i);

        int getOptionsCount();

        List getOptionsList();
    }

    public enum DeveloperConsentType implements Internal.EnumLite {
        DEVELOPER_CONSENT_TYPE_UNSPECIFIED(0),
        DEVELOPER_CONSENT_TYPE_CUSTOM(1),
        DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL(2),
        DEVELOPER_CONSENT_TYPE_PIPL_CONSENT(3),
        DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT(4),
        DEVELOPER_CONSENT_TYPE_GDPR_CONSENT(5),
        DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT(6),
        UNRECOGNIZED(-1);

        public static final int DEVELOPER_CONSENT_TYPE_CUSTOM_VALUE = 1;
        public static final int DEVELOPER_CONSENT_TYPE_GDPR_CONSENT_VALUE = 5;
        public static final int DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL_VALUE = 2;
        public static final int DEVELOPER_CONSENT_TYPE_PIPL_CONSENT_VALUE = 3;
        public static final int DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT_VALUE = 4;
        public static final int DEVELOPER_CONSENT_TYPE_UNSPECIFIED_VALUE = 0;
        public static final int DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT_VALUE = 6;
        private static final Internal.EnumLiteMap internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DeveloperConsentType findValueByNumber(int i) {
                return DeveloperConsentType.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            public boolean isInRange(int i) {
                return DeveloperConsentType.forNumber(i) != null;
            }
        }

        DeveloperConsentType(int i) {
            this.value = i;
        }

        public static DeveloperConsentType forNumber(int i) {
            switch (i) {
                case 0:
                    return DEVELOPER_CONSENT_TYPE_UNSPECIFIED;
                case 1:
                    return DEVELOPER_CONSENT_TYPE_CUSTOM;
                case 2:
                    return DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                case 3:
                    return DEVELOPER_CONSENT_TYPE_PIPL_CONSENT;
                case 4:
                    return DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT;
                case 5:
                    return DEVELOPER_CONSENT_TYPE_GDPR_CONSENT;
                case 6:
                    return DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static DeveloperConsentType valueOf(int i) {
            return forNumber(i);
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

    private DeveloperConsentOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
