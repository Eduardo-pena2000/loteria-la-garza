package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class r {
    public static final r a = new b(null);
    public static final r b = new c(null);

    public static final class b extends r {
        public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public b() {
            super(null);
        }

        public static List f(Object obj, long j) {
            return (List) V.H(obj, j);
        }

        public static List g(Object obj, long j, int i) {
            ArrayList lazyStringArrayList;
            Collection f = f(obj, j);
            if (f.isEmpty()) {
                Internal.ProtobufList lazyStringArrayList2 = f instanceof LazyStringList ? new LazyStringArrayList(i) : ((f instanceof H) && (f instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) f).mutableCopyWithCapacity(i) : new ArrayList(i);
                V.Y(obj, j, lazyStringArrayList2);
                return lazyStringArrayList2;
            }
            if (c.isAssignableFrom(f.getClass())) {
                lazyStringArrayList = new ArrayList(f.size() + i);
                lazyStringArrayList.addAll(f);
                V.Y(obj, j, lazyStringArrayList);
            } else {
                if (!(f instanceof UnmodifiableLazyStringList)) {
                    if (!(f instanceof H) || !(f instanceof Internal.ProtobufList)) {
                        return f;
                    }
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) f;
                    if (protobufList.isModifiable()) {
                        return f;
                    }
                    Internal.ProtobufList mutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(f.size() + i);
                    V.Y(obj, j, mutableCopyWithCapacity);
                    return mutableCopyWithCapacity;
                }
                lazyStringArrayList = new LazyStringArrayList(f.size() + i);
                lazyStringArrayList.addAll((UnmodifiableLazyStringList) f);
                V.Y(obj, j, lazyStringArrayList);
            }
            return lazyStringArrayList;
        }

        public void c(Object obj, long j) {
            Object unmodifiableList;
            List list = (List) V.H(obj, j);
            if (list instanceof LazyStringList) {
                unmodifiableList = ((LazyStringList) list).getUnmodifiableView();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof H) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            V.Y(obj, j, unmodifiableList);
        }

        public void d(Object obj, Object obj2, long j) {
            List f = f(obj2, j);
            List g = g(obj, j, f.size());
            int size = g.size();
            int size2 = f.size();
            if (size > 0 && size2 > 0) {
                g.addAll(f);
            }
            if (size > 0) {
                f = g;
            }
            V.Y(obj, j, f);
        }

        public List e(Object obj, long j) {
            return g(obj, j, 10);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static final class c extends r {
        public c() {
            super(null);
        }

        public static Internal.ProtobufList f(Object obj, long j) {
            return (Internal.ProtobufList) V.H(obj, j);
        }

        public void c(Object obj, long j) {
            f(obj, j).makeImmutable();
        }

        public void d(Object obj, Object obj2, long j) {
            Internal.ProtobufList f = f(obj, j);
            Internal.ProtobufList f2 = f(obj2, j);
            int size = f.size();
            int size2 = f2.size();
            if (size > 0 && size2 > 0) {
                if (!f.isModifiable()) {
                    f = f.mutableCopyWithCapacity(size2 + size);
                }
                f.addAll(f2);
            }
            if (size > 0) {
                f2 = f;
            }
            V.Y(obj, j, f2);
        }

        public List e(Object obj, long j) {
            Internal.ProtobufList f = f(obj, j);
            if (f.isModifiable()) {
                return f;
            }
            int size = f.size();
            Internal.ProtobufList mutableCopyWithCapacity = f.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            V.Y(obj, j, mutableCopyWithCapacity);
            return mutableCopyWithCapacity;
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    public /* synthetic */ r(a aVar) {
        this();
    }

    public static r a() {
        return a;
    }

    public static r b() {
        return b;
    }

    public abstract void c(Object obj, long j);

    public abstract void d(Object obj, Object obj2, long j);

    public abstract List e(Object obj, long j);

    public r() {
    }
}
