package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class UnmodifiableLazyStringList extends AbstractList implements LazyStringList, RandomAccess {
    private final LazyStringList list;

    public class a implements ListIterator {
        public ListIterator a;
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
            this.a = UnmodifiableLazyStringList.access$000(UnmodifiableLazyStringList.this).listIterator(i);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.a.next();
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.a.previous();
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.a.hasNext();
        }

        public boolean hasPrevious() {
            return this.a.hasPrevious();
        }

        public int nextIndex() {
            return this.a.nextIndex();
        }

        public int previousIndex() {
            return this.a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator {
        public Iterator a;

        public b() {
            this.a = UnmodifiableLazyStringList.access$000(UnmodifiableLazyStringList.this).iterator();
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.a.next();
        }

        public boolean hasNext() {
            return this.a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
        this.list = lazyStringList;
    }

    public static /* synthetic */ LazyStringList access$000(UnmodifiableLazyStringList unmodifiableLazyStringList) {
        return unmodifiableLazyStringList.list;
    }

    public void add(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    public boolean addAllByteArray(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean addAllByteString(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public List asByteArrayList() {
        return Collections.unmodifiableList(this.list.asByteArrayList());
    }

    public List asByteStringList() {
        return Collections.unmodifiableList(this.list.asByteStringList());
    }

    public byte[] getByteArray(int i) {
        return this.list.getByteArray(i);
    }

    public ByteString getByteString(int i) {
        return this.list.getByteString(i);
    }

    public Object getRaw(int i) {
        return this.list.getRaw(i);
    }

    public List getUnderlyingElements() {
        return this.list.getUnderlyingElements();
    }

    public LazyStringList getUnmodifiableView() {
        return this;
    }

    public Iterator iterator() {
        return new b();
    }

    public ListIterator listIterator(int i) {
        return new a(i);
    }

    public void mergeFrom(LazyStringList lazyStringList) {
        throw new UnsupportedOperationException();
    }

    public void set(int i, ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.list.size();
    }

    public void add(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public String get(int i) {
        return (String) this.list.get(i);
    }

    public void set(int i, byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
