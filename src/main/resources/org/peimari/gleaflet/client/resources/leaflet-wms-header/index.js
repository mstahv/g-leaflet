/**
 * Minified by jsDelivr using Terser v5.7.1.
 * Original file: /npm/leaflet-wms-header@1.0.13/index.js
 *
 * Do NOT use SRI with dynamically generated files! More information: https://www.jsdelivr.com/using-sri-with-dynamic-files
 */
"use strict";
async function fetchImage(e, t, r, s) {
    let a = {};
    r && r.forEach((e => {
        a[e.header] = e.value
    }));
    const i = new AbortController,
        l = i.signal;
    s && s.subscribe((() => {
        i.abort()
    }));
    const n = await fetch(e, {
        method: "GET",
        headers: a,
        mode: "cors",
        signal: l
    });
    t(await n.blob())
}
L.TileLayer.WMSHeader = L.TileLayer.WMS.extend({
    initialize: function(e, t, r, s, a) {
        L.TileLayer.WMS.prototype.initialize.call(this, e, t), this.headers = r, this.abort = s, this.results = a
    },
    createTile(e, t) {
        const r = this.getTileUrl(e),
            s = document.createElement("img");
        return s.setAttribute("role", "presentation"), self = this, fetchImage(r, (e => {
            const r = new FileReader;
            r.onload = () => {
                s.src = r.result, self.results && self.results.next(r.result)
            }, r.readAsDataURL(e), t(null, s)
        }), this.headers, this.abort), s
    }
}), L.TileLayer.wmsHeader = function(e, t, r, s, a) {
    return new L.TileLayer.WMSHeader(e, t, r, s, a)
};
//# sourceMappingURL=/sm/1ac961a4038fd182ad8aa1661a360abd3483e38f4b86b525cb00eb032a619973.map