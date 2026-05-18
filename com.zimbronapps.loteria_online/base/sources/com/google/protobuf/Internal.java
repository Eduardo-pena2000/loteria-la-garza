package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Internal {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final ByteBuffer EMPTY_BYTE_BUFFER;
    public static final CodedInputStream EMPTY_CODED_INPUT_STREAM;
    static final Charset US_ASCII = Charset.forName("US-ASCII");
    static final Charset UTF_8 = Charset.forName("UTF-8");
    static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    public interface BooleanList extends ProtobufList {
        void addBoolean(boolean z);

        boolean getBoolean(int i);

        BooleanList mutableCopyWithCapacity(int i);

        boolean setBoolean(int i, boolean z);
    }

    public interface DoubleList extends ProtobufList {
        void addDouble(double d);

        double getDouble(int i);

        DoubleList mutableCopyWithCapacity(int i);

        double setDouble(int i, double d);
    }

    public interface EnumLite {
        int getNumber();
    }

    public interface EnumLiteMap {
        EnumLite findValueByNumber(int i);
    }

    public interface EnumVerifier {
        boolean isInRange(int i);
    }

    public interface FloatList extends ProtobufList {
        void addFloat(float f);

        float getFloat(int i);

        FloatList mutableCopyWithCapacity(int i);

        float setFloat(int i, float f);
    }

    public interface IntList extends ProtobufList {
        void addInt(int i);

        int getInt(int i);

        IntList mutableCopyWithCapacity(int i);

        int setInt(int i, int i2);
    }

    public static class ListAdapter extends AbstractList {
        private final Converter converter;
        private final List fromList;

        public interface Converter {
            Object convert(Object obj);
        }

        public ListAdapter(List list, Converter converter) {
            this.fromList = list;
            this.converter = converter;
        }

        public Object get(int i) {
            return this.converter.convert(this.fromList.get(i));
        }

        public int size() {
            return this.fromList.size();
        }
    }

    public interface LongList extends ProtobufList {
        void addLong(long j);

        long getLong(int i);

        LongList mutableCopyWithCapacity(int i);

        long setLong(int i, long j);
    }

    public static class MapAdapter extends AbstractMap {
        private final Map realMap;
        private final Converter valueConverter;

        public interface Converter {
            Object doBackward(Object obj);

            Object doForward(Object obj);
        }

        public class a implements Converter {
            public final /* synthetic */ EnumLiteMap a;
            public final /* synthetic */ EnumLite b;

            public a(EnumLiteMap enumLiteMap, EnumLite enumLite) {
                this.a = enumLiteMap;
                this.b = enumLite;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer doBackward(EnumLite enumLite) {
                return Integer.valueOf(enumLite.getNumber());
            }

            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public EnumLite doForward(Integer num) {
                EnumLite findValueByNumber = this.a.findValueByNumber(num.intValue());
                return findValueByNumber == null ? this.b : findValueByNumber;
            }
        }

        public class b implements Map.Entry {
            public final Map.Entry a;

            public b(Map.Entry entry) {
                this.a = entry;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Map.Entry) {
                    return getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
                }
                return false;
            }

            public Object getKey() {
                return this.a.getKey();
            }

            public Object getValue() {
                return MapAdapter.access$000(MapAdapter.this).doForward(this.a.getValue());
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public Object setValue(Object obj) {
                Object value = this.a.setValue(MapAdapter.access$000(MapAdapter.this).doBackward(obj));
                if (value == null) {
                    return null;
                }
                return MapAdapter.access$000(MapAdapter.this).doForward(value);
            }
        }

        public class c implements Iterator {
            public final Iterator a;

            public c(Iterator it) {
                this.a = it;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return MapAdapter.this.new b((Map.Entry) this.a.next());
            }

            public boolean hasNext() {
                return this.a.hasNext();
            }

            public void remove() {
                this.a.remove();
            }
        }

        public class d extends AbstractSet {
            public final Set a;

            public d(Set set) {
                this.a = set;
            }

            public Iterator iterator() {
                return MapAdapter.this.new c(this.a.iterator());
            }

            public int size() {
                return this.a.size();
            }
        }

        public MapAdapter(Map map, Converter converter) {
            this.realMap = map;
            this.valueConverter = converter;
        }

        public static /* synthetic */ Converter access$000(MapAdapter mapAdapter) {
            return mapAdapter.valueConverter;
        }

        public static Converter newEnumConverter(EnumLiteMap enumLiteMap, EnumLite enumLite) {
            return new a(enumLiteMap, enumLite);
        }

        public Set entrySet() {
            return new d(this.realMap.entrySet());
        }

        public Object get(Object obj) {
            Object obj2 = this.realMap.get(obj);
            if (obj2 == null) {
                return null;
            }
            return this.valueConverter.doForward(obj2);
        }

        public Object put(Object obj, Object obj2) {
            Object put = this.realMap.put(obj, this.valueConverter.doBackward(obj2));
            if (put == null) {
                return null;
            }
            return this.valueConverter.doForward(put);
        }
    }

    public interface ProtobufList extends List, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        ProtobufList mutableCopyWithCapacity(int i);
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_BYTE_BUFFER = ByteBuffer.wrap(bArr);
        EMPTY_CODED_INPUT_STREAM = CodedInputStream.newInstance(bArr);
    }

    private Internal() {
    }

    public static byte[] byteArrayDefaultValue(String str) {
        return str.getBytes(ISO_8859_1);
    }

    public static ByteBuffer byteBufferDefaultValue(String str) {
        return ByteBuffer.wrap(byteArrayDefaultValue(str));
    }

    public static ByteString bytesDefaultValue(String str) {
        return ByteString.copyFrom(str.getBytes(ISO_8859_1));
    }

    public static Object checkNotNull(Object obj) {
        obj.getClass();
        return obj;
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        ByteBuffer allocate = ByteBuffer.allocate(duplicate.capacity());
        allocate.put(duplicate);
        allocate.clear();
        return allocate;
    }

    public static boolean equals(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer.capacity() != byteBuffer2.capacity()) {
            return false;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        q.a(duplicate);
        ByteBuffer duplicate2 = byteBuffer2.duplicate();
        q.a(duplicate2);
        return duplicate.equals(duplicate2);
    }

    public static MessageLite getDefaultInstance(Class cls) {
        try {
            java.lang.reflect.Method method = cls.getMethod("getDefaultInstance", (Class[]) null);
            return (MessageLite) method.invoke(method, (Object[]) null);
        } catch (Exception e) {
            throw new RuntimeException("Failed to get default instance for " + cls, e);
        }
    }

    public static int hashBoolean(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int hashCode(List list) {
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            i = (i * 31) + hashCode((byte[]) it.next());
        }
        return i;
    }

    public static int hashCodeByteBuffer(List list) {
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            i = (i * 31) + hashCodeByteBuffer((ByteBuffer) it.next());
        }
        return i;
    }

    public static int hashEnum(EnumLite enumLite) {
        return enumLite.getNumber();
    }

    public static int hashEnumList(List list) {
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            i = (i * 31) + hashEnum((EnumLite) it.next());
        }
        return i;
    }

    public static int hashLong(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean isValidUtf8(ByteString byteString) {
        return byteString.isValidUtf8();
    }

    public static Object mergeMessage(Object obj, Object obj2) {
        return ((MessageLite) obj).toBuilder().mergeFrom((MessageLite) obj2).buildPartial();
    }

    public static int partialHash(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static String stringDefaultValue(String str) {
        return new String(str.getBytes(ISO_8859_1), UTF_8);
    }

    public static byte[] toByteArray(String str) {
        return str.getBytes(UTF_8);
    }

    public static String toStringUtf8(byte[] bArr) {
        return new String(bArr, UTF_8);
    }

    public static Object checkNotNull(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return W.t(bArr);
    }

    public static int hashCode(byte[] bArr) {
        return hashCode(bArr, 0, bArr.length);
    }

    public static int hashCodeByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int partialHash = partialHash(byteBuffer.capacity(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            if (partialHash == 0) {
                return 1;
            }
            return partialHash;
        }
        int capacity = byteBuffer.capacity() <= 4096 ? byteBuffer.capacity() : 4096;
        byte[] bArr = new byte[capacity];
        ByteBuffer duplicate = byteBuffer.duplicate();
        q.a(duplicate);
        int capacity2 = byteBuffer.capacity();
        while (duplicate.remaining() > 0) {
            int remaining = duplicate.remaining() <= capacity ? duplicate.remaining() : capacity;
            duplicate.get(bArr, 0, remaining);
            capacity2 = partialHash(capacity2, bArr, 0, remaining);
        }
        if (capacity2 == 0) {
            return 1;
        }
        return capacity2;
    }

    public static int hashCode(byte[] bArr, int i, int i2) {
        int partialHash = partialHash(i2, bArr, i, i2);
        if (partialHash == 0) {
            return 1;
        }
        return partialHash;
    }

    public static boolean equalsByteBuffer(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!equalsByteBuffer((ByteBuffer) list.get(i), (ByteBuffer) list2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
