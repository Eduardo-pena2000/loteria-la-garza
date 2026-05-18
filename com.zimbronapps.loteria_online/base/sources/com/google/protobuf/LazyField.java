package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class LazyField extends LazyFieldLite {
    private final MessageLite defaultInstance;

    public static class b implements Map.Entry {
        public Map.Entry a;

        public /* synthetic */ b(Map.Entry entry, a aVar) {
            this(entry);
        }

        public LazyField a() {
            return (LazyField) this.a.getValue();
        }

        public Object getKey() {
            return this.a.getKey();
        }

        public Object getValue() {
            LazyField lazyField = (LazyField) this.a.getValue();
            if (lazyField == null) {
                return null;
            }
            return lazyField.getValue();
        }

        public Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return ((LazyField) this.a.getValue()).setValue((MessageLite) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public b(Map.Entry entry) {
            this.a = entry;
        }
    }

    public static class c implements Iterator {
        public Iterator a;

        public c(Iterator it) {
            this.a = it;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Map.Entry entry = (Map.Entry) this.a.next();
            return entry.getValue() instanceof LazyField ? new b(entry, null) : entry;
        }

        public boolean hasNext() {
            return this.a.hasNext();
        }

        public void remove() {
            this.a.remove();
        }
    }

    public LazyField(MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
        super(extensionRegistryLite, byteString);
        this.defaultInstance = messageLite;
    }

    public boolean containsDefaultInstance() {
        return super.containsDefaultInstance() || this.value == this.defaultInstance;
    }

    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public MessageLite getValue() {
        return getValue(this.defaultInstance);
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}
