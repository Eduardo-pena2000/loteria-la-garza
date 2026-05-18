package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class LazyStringArrayList extends com.google.protobuf.a implements LazyStringList, RandomAccess {

    @Deprecated
    public static final LazyStringList EMPTY;
    private static final LazyStringArrayList EMPTY_LIST;
    private final List list;

    public static class a extends AbstractList implements RandomAccess {
        public final LazyStringArrayList a;

        public a(LazyStringArrayList lazyStringArrayList) {
            this.a = lazyStringArrayList;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(int i, byte[] bArr) {
            LazyStringArrayList.access$200(this.a, i, bArr);
            ((AbstractList) this).modCount++;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public byte[] get(int i) {
            return this.a.getByteArray(i);
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] remove(int i) {
            String remove = this.a.remove(i);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.access$100(remove);
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public byte[] set(int i, byte[] bArr) {
            Object access$000 = LazyStringArrayList.access$000(this.a, i, bArr);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.access$100(access$000);
        }

        public int size() {
            return this.a.size();
        }
    }

    public static class b extends AbstractList implements RandomAccess {
        public final LazyStringArrayList a;

        public b(LazyStringArrayList lazyStringArrayList) {
            this.a = lazyStringArrayList;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(int i, ByteString byteString) {
            LazyStringArrayList.access$500(this.a, i, byteString);
            ((AbstractList) this).modCount++;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ByteString get(int i) {
            return this.a.getByteString(i);
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public ByteString remove(int i) {
            String remove = this.a.remove(i);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.access$400(remove);
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ByteString set(int i, ByteString byteString) {
            Object access$300 = LazyStringArrayList.access$300(this.a, i, byteString);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.access$400(access$300);
        }

        public int size() {
            return this.a.size();
        }
    }

    static {
        LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(false);
        EMPTY_LIST = lazyStringArrayList;
        EMPTY = lazyStringArrayList;
    }

    public LazyStringArrayList() {
        this(10);
    }

    public static /* synthetic */ Object access$000(LazyStringArrayList lazyStringArrayList, int i, byte[] bArr) {
        return lazyStringArrayList.setAndReturn(i, bArr);
    }

    public static /* synthetic */ byte[] access$100(Object obj) {
        return asByteArray(obj);
    }

    public static /* synthetic */ void access$200(LazyStringArrayList lazyStringArrayList, int i, byte[] bArr) {
        lazyStringArrayList.add(i, bArr);
    }

    public static /* synthetic */ Object access$300(LazyStringArrayList lazyStringArrayList, int i, ByteString byteString) {
        return lazyStringArrayList.setAndReturn(i, byteString);
    }

    public static /* synthetic */ ByteString access$400(Object obj) {
        return asByteString(obj);
    }

    public static /* synthetic */ void access$500(LazyStringArrayList lazyStringArrayList, int i, ByteString byteString) {
        lazyStringArrayList.add(i, byteString);
    }

    private static byte[] asByteArray(Object obj) {
        return obj instanceof byte[] ? (byte[]) obj : obj instanceof String ? Internal.toByteArray((String) obj) : ((ByteString) obj).toByteArray();
    }

    private static ByteString asByteString(Object obj) {
        return obj instanceof ByteString ? (ByteString) obj : obj instanceof String ? ByteString.copyFromUtf8((String) obj) : ByteString.copyFrom((byte[]) obj);
    }

    private static String asString(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof ByteString ? ((ByteString) obj).toStringUtf8() : Internal.toStringUtf8((byte[]) obj);
    }

    public static LazyStringArrayList emptyList() {
        return EMPTY_LIST;
    }

    private Object setAndReturn(int i, ByteString byteString) {
        ensureIsMutable();
        return this.list.set(i, byteString);
    }

    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public boolean addAllByteArray(Collection collection) {
        ensureIsMutable();
        boolean addAll = this.list.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public boolean addAllByteString(Collection collection) {
        ensureIsMutable();
        boolean addAll = this.list.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public List asByteArrayList() {
        return new a(this);
    }

    public List asByteStringList() {
        return new b(this);
    }

    public void clear() {
        ensureIsMutable();
        this.list.clear();
        ((AbstractList) this).modCount++;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public byte[] getByteArray(int i) {
        Object obj = this.list.get(i);
        byte[] asByteArray = asByteArray(obj);
        if (asByteArray != obj) {
            this.list.set(i, asByteArray);
        }
        return asByteArray;
    }

    public ByteString getByteString(int i) {
        Object obj = this.list.get(i);
        ByteString asByteString = asByteString(obj);
        if (asByteString != obj) {
            this.list.set(i, asByteString);
        }
        return asByteString;
    }

    public Object getRaw(int i) {
        return this.list.get(i);
    }

    public List getUnderlyingElements() {
        return Collections.unmodifiableList(this.list);
    }

    public LazyStringList getUnmodifiableView() {
        return isModifiable() ? new UnmodifiableLazyStringList(this) : this;
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    public void mergeFrom(LazyStringList lazyStringList) {
        ensureIsMutable();
        for (Object obj : lazyStringList.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.list.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.list.add(obj);
            }
        }
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public int size() {
        return this.list.size();
    }

    private LazyStringArrayList(boolean z) {
        super(z);
        this.list = Collections.emptyList();
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        ensureIsMutable();
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).getUnderlyingElements();
        }
        boolean addAll = this.list.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public String get(int i) {
        Object obj = this.list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.list.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf82 = Internal.toStringUtf8(bArr);
        if (Internal.isValidUtf8(bArr)) {
            this.list.set(i, stringUtf82);
        }
        return stringUtf82;
    }

    public LazyStringArrayList mutableCopyWithCapacity(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.list);
        return new LazyStringArrayList(arrayList);
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public String set(int i, String str) {
        ensureIsMutable();
        return asString(this.list.set(i, str));
    }

    private Object setAndReturn(int i, byte[] bArr) {
        ensureIsMutable();
        return this.list.set(i, bArr);
    }

    public void add(int i, String str) {
        ensureIsMutable();
        this.list.add(i, str);
        ((AbstractList) this).modCount++;
    }

    public String remove(int i) {
        ensureIsMutable();
        Object remove = this.list.remove(i);
        ((AbstractList) this).modCount++;
        return asString(remove);
    }

    public LazyStringArrayList(int i) {
        this(new ArrayList(i));
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
        this.list = new ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    public void set(int i, ByteString byteString) {
        setAndReturn(i, byteString);
    }

    private void add(int i, ByteString byteString) {
        ensureIsMutable();
        this.list.add(i, byteString);
        ((AbstractList) this).modCount++;
    }

    public void set(int i, byte[] bArr) {
        setAndReturn(i, bArr);
    }

    public LazyStringArrayList(List list) {
        this(new ArrayList(list));
    }

    private LazyStringArrayList(ArrayList arrayList) {
        this.list = arrayList;
    }

    private void add(int i, byte[] bArr) {
        ensureIsMutable();
        this.list.add(i, bArr);
        ((AbstractList) this).modCount++;
    }

    public void add(ByteString byteString) {
        ensureIsMutable();
        this.list.add(byteString);
        ((AbstractList) this).modCount++;
    }

    public void add(byte[] bArr) {
        ensureIsMutable();
        this.list.add(bArr);
        ((AbstractList) this).modCount++;
    }
}
