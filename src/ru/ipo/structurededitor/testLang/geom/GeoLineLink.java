package ru.ipo.structurededitor.testLang.geom;

import geogebra.kernel.GeoLine;
import ru.ipo.structurededitor.model.Cell;
import ru.ipo.structurededitor.model.DSLBeanParams;
import ru.ipo.structurededitor.model.FieldCell;

/**
 * Created by IntelliJ IDEA.
 * User: oleg
 * Date: 18.03.11
 * Time: 14:18
 * To change this template use File | Settings | File Templates.
 */
@DSLBeanParams(shortcut = "Ссылка", description = "Прямая с чертежа")
public class GeoLineLink extends AbstractGeoLine{
     public GeoLine getGeo() {
        return geo;
    }

    public void setGeo(GeoLine geo) {
        this.geo = geo;
    }

    GeoLine geo;
    public Cell getLayout(){
      return new FieldCell("geo");
    }
}
