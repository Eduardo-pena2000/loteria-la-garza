package org.apache.tika.renderer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.metadata.TikaPagedText;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class PageBasedRenderResults extends RenderResults {
    Map results;

    public PageBasedRenderResults(TemporaryResources temporaryResources) {
        super(temporaryResources);
        this.results = new HashMap();
    }

    public void add(RenderResult renderResult) {
        Integer num = renderResult.getMetadata().getInt(TikaPagedText.PAGE_NUMBER);
        if (num != null) {
            ArrayList arrayList = (List) this.results.get(num);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.results.put(num, arrayList);
            }
            arrayList.add(renderResult);
        }
        super.add(renderResult);
    }

    public List getPage(int i) {
        return (List) this.results.get(Integer.valueOf(i));
    }
}
