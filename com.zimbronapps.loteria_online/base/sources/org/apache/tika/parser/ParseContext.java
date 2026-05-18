package org.apache.tika.parser;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ParseContext implements Serializable {
    private static final long serialVersionUID = -5921436862145826534L;
    private final Map context = new HashMap();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.context.equals(((ParseContext) obj).context);
    }

    public Object get(Class cls) {
        return this.context.get(cls.getName());
    }

    public int hashCode() {
        return this.context.hashCode();
    }

    public boolean isEmpty() {
        return this.context.size() == 0;
    }

    public Set keySet() {
        return Collections.unmodifiableSet(this.context.keySet());
    }

    public void set(Class cls, Object obj) {
        if (obj != null) {
            this.context.put(cls.getName(), obj);
        } else {
            this.context.remove(cls.getName());
        }
    }

    public Object get(Class cls, Object obj) {
        Object obj2 = get(cls);
        return obj2 != null ? obj2 : obj;
    }
}
