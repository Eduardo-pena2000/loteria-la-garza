package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.FieldSet;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class GeneratedMessageLite extends AbstractMessageLite {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected UnknownFieldSetLite unknownFields = UnknownFieldSetLite.getDefaultInstance();

    public static abstract class Builder extends AbstractMessageLite.Builder {
        private final GeneratedMessageLite defaultInstance;
        protected GeneratedMessageLite instance;

        public Builder(GeneratedMessageLite generatedMessageLite) {
            this.defaultInstance = generatedMessageLite;
            if (generatedMessageLite.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = newMutableInstance();
        }

        private static void mergeFromInstance(Object obj, Object obj2) {
            I.a().d(obj).a(obj, obj2);
        }

        private GeneratedMessageLite newMutableInstance() {
            return this.defaultInstance.newMutableInstance();
        }

        public final void copyOnWrite() {
            if (this.instance.isMutable()) {
                return;
            }
            copyOnWriteInternal();
        }

        public void copyOnWriteInternal() {
            GeneratedMessageLite newMutableInstance = newMutableInstance();
            mergeFromInstance(newMutableInstance, this.instance);
            this.instance = newMutableInstance;
        }

        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        public final GeneratedMessageLite build() {
            GeneratedMessageLite buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
        }

        public GeneratedMessageLite buildPartial() {
            if (!this.instance.isMutable()) {
                return this.instance;
            }
            this.instance.makeImmutable();
            return this.instance;
        }

        public final Builder clear() {
            if (this.defaultInstance.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = newMutableInstance();
            return this;
        }

        public GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public Builder internalMergeFrom(GeneratedMessageLite generatedMessageLite) {
            return mergeFrom(generatedMessageLite);
        }

        public Builder clone() {
            Builder newBuilderForType = getDefaultInstanceForType().newBuilderForType();
            newBuilderForType.instance = buildPartial();
            return newBuilderForType;
        }

        public Builder mergeFrom(GeneratedMessageLite generatedMessageLite) {
            if (getDefaultInstanceForType().equals(generatedMessageLite)) {
                return this;
            }
            copyOnWrite();
            mergeFromInstance(this.instance, generatedMessageLite);
            return this;
        }

        public Builder mergeFrom(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            copyOnWrite();
            try {
                I.a().d(this.instance).g(this.instance, bArr, i, i + i2, new c.b(extensionRegistryLite));
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public Builder mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            return mergeFrom(bArr, i, i2, ExtensionRegistryLite.getEmptyRegistry());
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            copyOnWrite();
            try {
                I.a().d(this.instance).f(this.instance, f.Q(codedInputStream), extensionRegistryLite);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw e.getCause();
                }
                throw e;
            }
        }
    }

    public static abstract class ExtendableBuilder extends Builder implements ExtendableMessageOrBuilder {
        public ExtendableBuilder(ExtendableMessage extendableMessage) {
            super(extendableMessage);
        }

        private FieldSet ensureExtensionsAreMutable() {
            FieldSet fieldSet = ((ExtendableMessage) this.instance).extensions;
            if (!fieldSet.s()) {
                return fieldSet;
            }
            FieldSet clone = fieldSet.clone();
            ((ExtendableMessage) this.instance).extensions = clone;
            return clone;
        }

        private void verifyExtensionContainingType(GeneratedExtension generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final ExtendableBuilder addExtension(ExtensionLite extensionLite, Object obj) {
            GeneratedExtension access$000 = GeneratedMessageLite.access$000(extensionLite);
            verifyExtensionContainingType(access$000);
            copyOnWrite();
            ensureExtensionsAreMutable().a(access$000.descriptor, access$000.singularToFieldSetType(obj));
            return this;
        }

        public final ExtendableBuilder clearExtension(ExtensionLite extensionLite) {
            GeneratedExtension access$000 = GeneratedMessageLite.access$000(extensionLite);
            verifyExtensionContainingType(access$000);
            copyOnWrite();
            ensureExtensionsAreMutable().b(access$000.descriptor);
            return this;
        }

        public void copyOnWriteInternal() {
            super.copyOnWriteInternal();
            if (((ExtendableMessage) this.instance).extensions != FieldSet.i()) {
                GeneratedMessageLite generatedMessageLite = this.instance;
                ((ExtendableMessage) generatedMessageLite).extensions = ((ExtendableMessage) generatedMessageLite).extensions.clone();
            }
        }

        public final Object getExtension(ExtensionLite extensionLite) {
            return ((ExtendableMessage) this.instance).getExtension(extensionLite);
        }

        public final int getExtensionCount(ExtensionLite extensionLite) {
            return ((ExtendableMessage) this.instance).getExtensionCount(extensionLite);
        }

        public final boolean hasExtension(ExtensionLite extensionLite) {
            return ((ExtendableMessage) this.instance).hasExtension(extensionLite);
        }

        public void internalSetExtensionSet(FieldSet fieldSet) {
            copyOnWrite();
            ((ExtendableMessage) this.instance).extensions = fieldSet;
        }

        public final ExtendableBuilder setExtension(ExtensionLite extensionLite, Object obj) {
            GeneratedExtension access$000 = GeneratedMessageLite.access$000(extensionLite);
            verifyExtensionContainingType(access$000);
            copyOnWrite();
            ensureExtensionsAreMutable().D(access$000.descriptor, access$000.toFieldSetType(obj));
            return this;
        }

        public final Object getExtension(ExtensionLite extensionLite, int i) {
            return ((ExtendableMessage) this.instance).getExtension(extensionLite, i);
        }

        public final ExtendableMessage buildPartial() {
            if (!((ExtendableMessage) this.instance).isMutable()) {
                return (ExtendableMessage) this.instance;
            }
            ((ExtendableMessage) this.instance).extensions.y();
            return (ExtendableMessage) super.buildPartial();
        }

        public final ExtendableBuilder setExtension(ExtensionLite extensionLite, int i, Object obj) {
            GeneratedExtension access$000 = GeneratedMessageLite.access$000(extensionLite);
            verifyExtensionContainingType(access$000);
            copyOnWrite();
            ensureExtensionsAreMutable().E(access$000.descriptor, i, access$000.singularToFieldSetType(obj));
            return this;
        }
    }

    public interface ExtendableMessageOrBuilder extends MessageLiteOrBuilder {
        Object getExtension(ExtensionLite extensionLite);

        Object getExtension(ExtensionLite extensionLite, int i);

        int getExtensionCount(ExtensionLite extensionLite);

        boolean hasExtension(ExtensionLite extensionLite);
    }

    public static class GeneratedExtension extends ExtensionLite {
        final MessageLite containingTypeDefaultInstance;
        final Object defaultValue;
        final b descriptor;
        final MessageLite messageDefaultInstance;

        public GeneratedExtension(MessageLite messageLite, Object obj, MessageLite messageLite2, b bVar, Class cls) {
            if (messageLite == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (bVar.getLiteType() == WireFormat.FieldType.MESSAGE && messageLite2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.containingTypeDefaultInstance = messageLite;
            this.defaultValue = obj;
            this.messageDefaultInstance = messageLite2;
            this.descriptor = bVar;
        }

        public Object fromFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularFromFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(singularFromFieldSetType(it.next()));
            }
            return arrayList;
        }

        public MessageLite getContainingTypeDefaultInstance() {
            return this.containingTypeDefaultInstance;
        }

        public Object getDefaultValue() {
            return this.defaultValue;
        }

        public WireFormat.FieldType getLiteType() {
            return this.descriptor.getLiteType();
        }

        public MessageLite getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        public int getNumber() {
            return this.descriptor.getNumber();
        }

        public boolean isRepeated() {
            return this.descriptor.d;
        }

        public Object singularFromFieldSetType(Object obj) {
            return this.descriptor.getLiteJavaType() == WireFormat.JavaType.ENUM ? this.descriptor.a.findValueByNumber(((Integer) obj).intValue()) : obj;
        }

        public Object singularToFieldSetType(Object obj) {
            return this.descriptor.getLiteJavaType() == WireFormat.JavaType.ENUM ? Integer.valueOf(((Internal.EnumLite) obj).getNumber()) : obj;
        }

        public Object toFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularToFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(singularToFieldSetType(it.next()));
            }
            return arrayList;
        }
    }

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final Class messageClass;
        private final String messageClassName;

        public SerializedForm(MessageLite messageLite) {
            this.messageClass = messageLite.getClass();
            this.messageClassName = messageLite.getClass().getName();
            this.asBytes = messageLite.toByteArray();
        }

        public static SerializedForm of(MessageLite messageLite) {
            return new SerializedForm(messageLite);
        }

        @Deprecated
        private Object readResolveFallback() throws ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get((Object) null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException("Unable to understand proto buffer", e);
            } catch (SecurityException e2) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.messageClassName, e2);
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e3);
            } catch (NoSuchFieldException e4) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.messageClassName, e4);
            } catch (IllegalAccessException e5) {
                throw new RuntimeException("Unable to call parsePartialFrom", e5);
            }
        }

        private Class resolveMessageClass() throws ClassNotFoundException {
            Class cls = this.messageClass;
            return cls != null ? cls : Class.forName(this.messageClassName);
        }

        public Object readResolve() throws ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get((Object) null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (SecurityException e) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.messageClassName, e);
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e2);
            } catch (NoSuchFieldException unused) {
                return readResolveFallback();
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (InvalidProtocolBufferException e4) {
                throw new RuntimeException("Unable to understand proto buffer", e4);
            }
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class b implements FieldSet.FieldDescriptorLite {
        public final Internal.EnumLiteMap a;
        public final int b;
        public final WireFormat.FieldType c;
        public final boolean d;
        public final boolean e;

        public b(Internal.EnumLiteMap enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.a = enumLiteMap;
            this.b = i;
            this.c = fieldType;
            this.d = z;
            this.e = z2;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return this.b - bVar.b;
        }

        public Internal.EnumLiteMap getEnumType() {
            return this.a;
        }

        public WireFormat.JavaType getLiteJavaType() {
            return this.c.getJavaType();
        }

        public WireFormat.FieldType getLiteType() {
            return this.c;
        }

        public int getNumber() {
            return this.b;
        }

        public MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mergeFrom((GeneratedMessageLite) messageLite);
        }

        public boolean isPacked() {
            return this.e;
        }

        public boolean isRepeated() {
            return this.d;
        }
    }

    public static /* synthetic */ GeneratedExtension access$000(ExtensionLite extensionLite) {
        return checkIsLite(extensionLite);
    }

    public static /* synthetic */ GeneratedMessageLite access$200(GeneratedMessageLite generatedMessageLite, byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return parsePartialFrom(generatedMessageLite, bArr, i, i2, extensionRegistryLite);
    }

    private static GeneratedExtension checkIsLite(ExtensionLite extensionLite) {
        if (extensionLite.isLite()) {
            return (GeneratedExtension) extensionLite;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    private static GeneratedMessageLite checkMessageInitialized(GeneratedMessageLite generatedMessageLite) throws InvalidProtocolBufferException {
        if (generatedMessageLite == null || generatedMessageLite.isInitialized()) {
            return generatedMessageLite;
        }
        throw generatedMessageLite.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(generatedMessageLite);
    }

    private int computeSerializedSize(N n) {
        return n == null ? I.a().d(this).d(this) : n.d(this);
    }

    public static Internal.BooleanList emptyBooleanList() {
        return d.e();
    }

    public static Internal.DoubleList emptyDoubleList() {
        return h.e();
    }

    public static Internal.FloatList emptyFloatList() {
        return m.e();
    }

    public static Internal.IntList emptyIntList() {
        return o.e();
    }

    public static Internal.LongList emptyLongList() {
        return s.e();
    }

    public static Internal.ProtobufList emptyProtobufList() {
        return J.b();
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = UnknownFieldSetLite.newInstance();
        }
    }

    public static GeneratedMessageLite getDefaultInstance(Class cls) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = (GeneratedMessageLite) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (generatedMessageLite == null) {
            generatedMessageLite = ((GeneratedMessageLite) V.l(cls)).getDefaultInstanceForType();
            if (generatedMessageLite == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return generatedMessageLite;
    }

    public static java.lang.reflect.Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (InvocationTargetException e) {
            Error cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw cause;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        }
    }

    public static Internal.IntList mutableCopy(Internal.IntList intList) {
        int size = intList.size();
        return intList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        return new K(messageLite, str, objArr);
    }

    public static GeneratedExtension newRepeatedGeneratedExtension(MessageLite messageLite, MessageLite messageLite2, Internal.EnumLiteMap enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new GeneratedExtension(messageLite, Collections.emptyList(), messageLite2, new b(enumLiteMap, i, fieldType, true, z), cls);
    }

    public static GeneratedExtension newSingularGeneratedExtension(MessageLite messageLite, Object obj, MessageLite messageLite2, Internal.EnumLiteMap enumLiteMap, int i, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension(messageLite, obj, messageLite2, new b(enumLiteMap, i, fieldType, false, false), cls);
    }

    public static GeneratedMessageLite parseDelimitedFrom(GeneratedMessageLite generatedMessageLite, InputStream inputStream) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialDelimitedFrom(generatedMessageLite, inputStream, ExtensionRegistryLite.getEmptyRegistry()));
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parseFrom(generatedMessageLite, CodedInputStream.newInstance(byteBuffer), extensionRegistryLite));
    }

    private static GeneratedMessageLite parsePartialDelimitedFrom(GeneratedMessageLite generatedMessageLite, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            CodedInputStream newInstance = CodedInputStream.newInstance((InputStream) new AbstractMessageLite.Builder.a(inputStream, CodedInputStream.readRawVarint32(read, inputStream)));
            GeneratedMessageLite parsePartialFrom = parsePartialFrom(generatedMessageLite, newInstance, extensionRegistryLite);
            try {
                newInstance.checkLastTagWas(0);
                return parsePartialFrom;
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(parsePartialFrom);
            }
        } catch (InvalidProtocolBufferException e2) {
            if (e2.getThrownFromInputStream()) {
                throw new InvalidProtocolBufferException(e2);
            }
            throw e2;
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3);
        }
    }

    public static GeneratedMessageLite parsePartialFrom(GeneratedMessageLite generatedMessageLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        GeneratedMessageLite newMutableInstance = generatedMessageLite.newMutableInstance();
        try {
            N d = I.a().d(newMutableInstance);
            d.f(newMutableInstance, f.Q(codedInputStream), extensionRegistryLite);
            d.b(newMutableInstance);
            return newMutableInstance;
        } catch (IOException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw e.getCause();
            }
            throw new InvalidProtocolBufferException(e).setUnfinishedMessage(newMutableInstance);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw e2.getCause();
            }
            throw e2;
        } catch (InvalidProtocolBufferException e3) {
            e = e3;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.setUnfinishedMessage(newMutableInstance);
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(newMutableInstance);
        }
    }

    public static void registerDefaultInstance(Class cls, GeneratedMessageLite generatedMessageLite) {
        generatedMessageLite.markImmutable();
        defaultInstanceMap.put(cls, generatedMessageLite);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        return I.a().d(this).hashCode(this);
    }

    public final Builder createBuilder() {
        return (Builder) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj) {
        return dynamicMethod(methodToInvoke, obj, null);
    }

    public abstract Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return I.a().d(this).equals(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public final Parser getParserForType() {
        return (Parser) dynamicMethod(MethodToInvoke.GET_PARSER);
    }

    public int getSerializedSize(N n) {
        if (!isMutable()) {
            if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
                return getMemoizedSerializedSize();
            }
            int computeSerializedSize = computeSerializedSize(n);
            setMemoizedSerializedSize(computeSerializedSize);
            return computeSerializedSize;
        }
        int computeSerializedSize2 = computeSerializedSize(n);
        if (computeSerializedSize2 >= 0) {
            return computeSerializedSize2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + computeSerializedSize2);
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public void makeImmutable() {
        I.a().d(this).b(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i, ByteString byteString) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeLengthDelimitedField(i, byteString);
    }

    public final void mergeUnknownFields(UnknownFieldSetLite unknownFieldSetLite) {
        this.unknownFields = UnknownFieldSetLite.mutableCopyOf(this.unknownFields, unknownFieldSetLite);
    }

    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeVarintField(i, i2);
    }

    public GeneratedMessageLite newMutableInstance() {
        return (GeneratedMessageLite) dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    public boolean parseUnknownField(int i, CodedInputStream codedInputStream) throws IOException {
        if (WireFormat.getTagWireType(i) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mergeFieldFrom(i, codedInputStream);
    }

    public void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    public void setMemoizedSerializedSize(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
    }

    public String toString() {
        return z.f(this, super.toString());
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        I.a().d(this).e(this, g.Q(codedOutputStream));
    }

    public static final boolean isInitialized(GeneratedMessageLite generatedMessageLite, boolean z) {
        byte byteValue = ((Byte) generatedMessageLite.dynamicMethod(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c = I.a().d(generatedMessageLite).c(generatedMessageLite);
        if (z) {
            generatedMessageLite.dynamicMethod(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, c ? generatedMessageLite : null);
        }
        return c;
    }

    public final Builder createBuilder(GeneratedMessageLite generatedMessageLite) {
        return createBuilder().mergeFrom(generatedMessageLite);
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, null, null);
    }

    public final GeneratedMessageLite getDefaultInstanceForType() {
        return (GeneratedMessageLite) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    public final Builder newBuilderForType() {
        return (Builder) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    public final Builder toBuilder() {
        return ((Builder) dynamicMethod(MethodToInvoke.NEW_BUILDER)).mergeFrom(this);
    }

    public static class DefaultInstanceBasedParser extends AbstractParser {
        private final GeneratedMessageLite defaultInstance;

        public DefaultInstanceBasedParser(GeneratedMessageLite generatedMessageLite) {
            this.defaultInstance = generatedMessageLite;
        }

        public GeneratedMessageLite parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parsePartialFrom(this.defaultInstance, codedInputStream, extensionRegistryLite);
        }

        public GeneratedMessageLite parsePartialFrom(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.access$200(this.defaultInstance, bArr, i, i2, extensionRegistryLite);
        }
    }

    public static Internal.LongList mutableCopy(Internal.LongList longList) {
        int size = longList.size();
        return longList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return parseFrom(generatedMessageLite, byteBuffer, ExtensionRegistryLite.getEmptyRegistry());
    }

    public static GeneratedMessageLite parseDelimitedFrom(GeneratedMessageLite generatedMessageLite, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialDelimitedFrom(generatedMessageLite, inputStream, extensionRegistryLite));
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, ByteString byteString) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parseFrom(generatedMessageLite, byteString, ExtensionRegistryLite.getEmptyRegistry()));
    }

    public static abstract class ExtendableMessage extends GeneratedMessageLite implements ExtendableMessageOrBuilder {
        protected FieldSet extensions = FieldSet.i();

        public class ExtensionWriter {
            private final Iterator iter;
            private final boolean messageSetWireFormat;
            private Map.Entry next;

            public /* synthetic */ ExtensionWriter(ExtendableMessage extendableMessage, boolean z, a aVar) {
                this(z);
            }

            public void writeUntil(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry entry = this.next;
                    if (entry == null || ((b) entry.getKey()).getNumber() >= i) {
                        return;
                    }
                    b bVar = (b) this.next.getKey();
                    if (this.messageSetWireFormat && bVar.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !bVar.isRepeated()) {
                        codedOutputStream.writeMessageSetExtension(bVar.getNumber(), (MessageLite) this.next.getValue());
                    } else {
                        FieldSet.I(bVar, this.next.getValue(), codedOutputStream);
                    }
                    if (this.iter.hasNext()) {
                        this.next = (Map.Entry) this.iter.next();
                    } else {
                        this.next = null;
                    }
                }
            }

            private ExtensionWriter(boolean z) {
                Iterator x = ExtendableMessage.this.extensions.x();
                this.iter = x;
                if (x.hasNext()) {
                    this.next = (Map.Entry) x.next();
                }
                this.messageSetWireFormat = z;
            }
        }

        private void eagerlyMergeMessageSetExtension(CodedInputStream codedInputStream, GeneratedExtension generatedExtension, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
            parseExtension(codedInputStream, extensionRegistryLite, generatedExtension, WireFormat.makeTag(i, 2), i);
        }

        private void mergeMessageSetExtensionFromBytes(ByteString byteString, ExtensionRegistryLite extensionRegistryLite, GeneratedExtension generatedExtension) throws IOException {
            MessageLite messageLite = (MessageLite) this.extensions.j(generatedExtension.descriptor);
            MessageLite.Builder builder = messageLite != null ? messageLite.toBuilder() : null;
            if (builder == null) {
                builder = generatedExtension.getMessageDefaultInstance().newBuilderForType();
            }
            builder.mergeFrom(byteString, extensionRegistryLite);
            ensureExtensionsAreMutable().D(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(builder.build()));
        }

        private void mergeMessageSetExtensionFromCodedStream(MessageLite messageLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i = 0;
            ByteString byteString = null;
            GeneratedExtension generatedExtension = null;
            while (true) {
                int readTag = codedInputStream.readTag();
                if (readTag == 0) {
                    break;
                }
                if (readTag == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                    i = codedInputStream.readUInt32();
                    if (i != 0) {
                        generatedExtension = extensionRegistryLite.findLiteExtensionByNumber(messageLite, i);
                    }
                } else if (readTag == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                    if (i == 0 || generatedExtension == null) {
                        byteString = codedInputStream.readBytes();
                    } else {
                        eagerlyMergeMessageSetExtension(codedInputStream, generatedExtension, extensionRegistryLite, i);
                        byteString = null;
                    }
                } else if (!codedInputStream.skipField(readTag)) {
                    break;
                }
            }
            codedInputStream.checkLastTagWas(WireFormat.MESSAGE_SET_ITEM_END_TAG);
            if (byteString == null || i == 0) {
                return;
            }
            if (generatedExtension != null) {
                mergeMessageSetExtensionFromBytes(byteString, extensionRegistryLite, generatedExtension);
            } else {
                mergeLengthDelimitedField(i, byteString);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:3:0x0008  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private boolean parseExtension(com.google.protobuf.CodedInputStream r6, com.google.protobuf.ExtensionRegistryLite r7, com.google.protobuf.GeneratedMessageLite.GeneratedExtension r8, int r9, int r10) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 293
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite.ExtendableMessage.parseExtension(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite, com.google.protobuf.GeneratedMessageLite$GeneratedExtension, int, int):boolean");
        }

        private void verifyExtensionContainingType(GeneratedExtension generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public FieldSet ensureExtensionsAreMutable() {
            if (this.extensions.s()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.t();
        }

        public int extensionsSerializedSize() {
            return this.extensions.o();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.k();
        }

        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        public final Object getExtension(ExtensionLite extensionLite) {
            GeneratedExtension access$000 = GeneratedMessageLite.access$000(extensionLite);
            verifyExtensionContainingType(access$000);
            Object j = this.extensions.j(access$000.descriptor);
            return j == null ? access$000.defaultValue : access$000.fromFieldSetType(j);
        }

        public final int getExtensionCount(ExtensionLite extensionLite) {
            GeneratedExtension access$000 = GeneratedMessageLite.access$000(extensionLite);
            verifyExtensionContainingType(access$000);
            return this.extensions.n(access$000.descriptor);
        }

        public final boolean hasExtension(ExtensionLite extensionLite) {
            GeneratedExtension access$000 = GeneratedMessageLite.access$000(extensionLite);
            verifyExtensionContainingType(access$000);
            return this.extensions.q(access$000.descriptor);
        }

        public final void mergeExtensionFields(ExtendableMessage extendableMessage) {
            if (this.extensions.s()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.z(extendableMessage.extensions);
        }

        public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
            return super.newBuilderForType();
        }

        public ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(this, false, null);
        }

        public ExtensionWriter newMessageSetExtensionWriter() {
            return new ExtensionWriter(this, true, null);
        }

        public boolean parseUnknownField(MessageLite messageLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
            int tagFieldNumber = WireFormat.getTagFieldNumber(i);
            return parseExtension(codedInputStream, extensionRegistryLite, extensionRegistryLite.findLiteExtensionByNumber(messageLite, tagFieldNumber), i, tagFieldNumber);
        }

        public boolean parseUnknownFieldAsMessageSet(MessageLite messageLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
            if (i != WireFormat.MESSAGE_SET_ITEM_TAG) {
                return WireFormat.getTagWireType(i) == 2 ? parseUnknownField(messageLite, codedInputStream, extensionRegistryLite, i) : codedInputStream.skipField(i);
            }
            mergeMessageSetExtensionFromCodedStream(messageLite, codedInputStream, extensionRegistryLite);
            return true;
        }

        public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
            return super.toBuilder();
        }

        public final Object getExtension(ExtensionLite extensionLite, int i) {
            GeneratedExtension access$000 = GeneratedMessageLite.access$000(extensionLite);
            verifyExtensionContainingType(access$000);
            return access$000.singularFromFieldSetType(this.extensions.m(access$000.descriptor, i));
        }
    }

    public static Internal.FloatList mutableCopy(Internal.FloatList floatList) {
        int size = floatList.size();
        return floatList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(generatedMessageLite, byteString, extensionRegistryLite));
    }

    public static Internal.DoubleList mutableCopy(Internal.DoubleList doubleList) {
        int size = doubleList.size();
        return doubleList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, byte[] bArr) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(generatedMessageLite, bArr, 0, bArr.length, ExtensionRegistryLite.getEmptyRegistry()));
    }

    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static Internal.BooleanList mutableCopy(Internal.BooleanList booleanList) {
        int size = booleanList.size();
        return booleanList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(generatedMessageLite, bArr, 0, bArr.length, extensionRegistryLite));
    }

    public static Internal.ProtobufList mutableCopy(Internal.ProtobufList protobufList) {
        int size = protobufList.size();
        return protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, InputStream inputStream) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(generatedMessageLite, CodedInputStream.newInstance(inputStream), ExtensionRegistryLite.getEmptyRegistry()));
    }

    private static GeneratedMessageLite parsePartialFrom(GeneratedMessageLite generatedMessageLite, byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        GeneratedMessageLite newMutableInstance = generatedMessageLite.newMutableInstance();
        try {
            N d = I.a().d(newMutableInstance);
            d.g(newMutableInstance, bArr, i, i + i2, new c.b(extensionRegistryLite));
            d.b(newMutableInstance);
            return newMutableInstance;
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.setUnfinishedMessage(newMutableInstance);
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newMutableInstance);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(newMutableInstance);
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw e3.getCause();
            }
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newMutableInstance);
        }
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(generatedMessageLite, CodedInputStream.newInstance(inputStream), extensionRegistryLite));
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return parseFrom(generatedMessageLite, codedInputStream, ExtensionRegistryLite.getEmptyRegistry());
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(generatedMessageLite, codedInputStream, extensionRegistryLite));
    }

    public static GeneratedMessageLite parsePartialFrom(GeneratedMessageLite generatedMessageLite, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return parsePartialFrom(generatedMessageLite, codedInputStream, ExtensionRegistryLite.getEmptyRegistry());
    }

    private static GeneratedMessageLite parsePartialFrom(GeneratedMessageLite generatedMessageLite, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream newCodedInput = byteString.newCodedInput();
        GeneratedMessageLite parsePartialFrom = parsePartialFrom(generatedMessageLite, newCodedInput, extensionRegistryLite);
        try {
            newCodedInput.checkLastTagWas(0);
            return parsePartialFrom;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(parsePartialFrom);
        }
    }
}
