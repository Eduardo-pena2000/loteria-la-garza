package org.apache.tika.fork;

import java.io.Serializable;
import java.util.Map;
import org.apache.tika.exception.TikaException;
import org.apache.tika.parser.ParserFactory;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ParserFactoryFactory implements Serializable {
    private static final long serialVersionUID = 4710974869988895410L;
    private final Map args;
    private final String className;

    public ParserFactoryFactory(String str, Map map) {
        this.className = str;
        this.args = map;
    }

    public ParserFactory build() throws TikaException {
        try {
            return (ParserFactory) Class.forName(this.className).getConstructor(new Class[]{Map.class}).newInstance(new Object[]{this.args});
        } catch (ReflectiveOperationException | IllegalStateException e) {
            throw new TikaException("Couldn't create factory", e);
        }
    }
}
